package com.synapsys.gp.filter;


import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;
import com.synapsys.gp.security.enc.AESEncrytion;

@Component
@Order(0)
public class CustomEncryptedFilter implements Filter {

	private static final Logger logger = LogManager.getLogger(CustomEncryptedFilter.class.getName());
	
	RequestMatcher customFilterUrl = new AntPathRequestMatcher("/api/mobc/**");
   
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
	    
		if(customFilterUrl.matches(httpServletRequest)) {
			
			logger.info("************** Encryption | Encoding Filter - START ***********************");
			
			AESEncrytion aes = new AESEncrytion();
			String encryptedRequestBody = IOUtils.toString(request.getInputStream());
			byte[] decryptedRequestBody = aes.decrypt(encryptedRequestBody).getBytes();

			CustomHttpServletRequestWrapper requestWrapper = new CustomHttpServletRequestWrapper(httpServletRequest,decryptedRequestBody);
			ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(httpServletResponse);
				    				
			chain.doFilter(requestWrapper, responseWrapper);
		
			String encryptedResponseBody = aes.encrypt(getResponseBody(responseWrapper));
			responseWrapper.resetBuffer();
			responseWrapper.getWriter().write(encryptedResponseBody);
			responseWrapper.copyBodyToResponse();
			responseWrapper.flushBuffer();
		
			logger.info("************** Encryption | Encoding Filter - END ***********************");
			
		}
		else {
			chain.doFilter(request,response);
		}			
	}

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	
	private String getResponseBody(ContentCachingResponseWrapper response) {
        ContentCachingResponseWrapper wrapper = WebUtils.getNativeResponse(response, ContentCachingResponseWrapper.class);
        if(wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if(buf.length > 0) {
                String payload;
                try {
                    payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException e) {
                    payload = "[unknown]";
                }
                return payload;
            }
        }
        return "";
    }
	
}
