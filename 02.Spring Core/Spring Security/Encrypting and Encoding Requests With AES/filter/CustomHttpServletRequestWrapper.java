package com.synapsys.gp.filter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;

import com.synapsys.gp.security.enc.AESEncrytion;

public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper {

	private static final Logger logger = LogManager.getLogger(CustomHttpServletRequestWrapper.class.getName());

	private byte[] cachedBody;
	private final Map<String, String[]> params = new HashMap<>();
	

	public CustomHttpServletRequestWrapper(HttpServletRequest request, byte[] decryptedString) {
		super(request);
		try {	
			if(decryptedString != null && decryptedString.length > 0) {
				ByteArrayInputStream requestBody = new ByteArrayInputStream(decryptedString);
				this.cachedBody = StreamUtils.copyToByteArray(requestBody);
			}
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
	}

	
	@Override
	public String getHeader(String headerName) {
		String headerValue = super.getHeader(headerName);
		if ("Accept".equalsIgnoreCase(headerName)) {
			return headerValue.replaceAll(MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE);
		} else if ("Content-Type".equalsIgnoreCase(headerName)) {
			return headerValue.replaceAll(MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE);
		}
		return headerValue;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration getHeaderNames() {

		HttpServletRequest request = (HttpServletRequest) getRequest();

		List list = new ArrayList();
		Enumeration e = request.getHeaderNames();
		
		while (e.hasMoreElements()) {

			String headerName = (String) e.nextElement();
			String headerValue = request.getHeader(headerName);

			if ("Accept".equalsIgnoreCase(headerName)) {
				headerValue.replaceAll(MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE);
			} else if ("Content-Type".equalsIgnoreCase(headerName)) {
				headerValue.replaceAll(MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE);
			}
			list.add(headerName);
		}
		return Collections.enumeration(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration getHeaders(final String headerName) {

		HttpServletRequest request = (HttpServletRequest) getRequest();

		List list = new ArrayList();
		Enumeration e = request.getHeaders(headerName);

		while (e.hasMoreElements()) {

			String header = e.nextElement().toString();

			if (header.equalsIgnoreCase(MediaType.TEXT_PLAIN_VALUE)) {
				header = MediaType.APPLICATION_JSON_VALUE;
			}

			list.add(header);
		}
		return Collections.enumeration(list);
	}

	@Override
	public String getContentType() {
		String contentTypeValue = super.getContentType();
		if (MediaType.TEXT_PLAIN_VALUE.equalsIgnoreCase(contentTypeValue)) {
			return MediaType.APPLICATION_JSON_VALUE;
		}
		return contentTypeValue;
	}

	
	@Override
	public ServletInputStream getInputStream() throws IOException {
		return new CachedBodyServletInputStream(this.cachedBody);
	}
	
	@Override
	public BufferedReader getReader() throws IOException {
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.cachedBody);
		return new BufferedReader(new InputStreamReader(byteArrayInputStream));
	}
	
	
	@Override
	public String getQueryString() {
		
	    String baseQuery = super.getQueryString();
		if(baseQuery != null && baseQuery.length() > 0) {					
			try {				
			baseQuery = new AESEncrytion().decrypt(URLDecoder.decode(baseQuery,"UTF-8"));
			return baseQuery;			
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		else {
		  return baseQuery;
		}
		return baseQuery;
	}

	
	@Override
	public StringBuffer getRequestURL() {
		StringBuffer requestURL = new StringBuffer(super.getRequestURL().toString());
		String queryString = getQueryString();
	    if (queryString == null) {
	        return requestURL;
	    } else {
	        return requestURL.append('?').append(queryString);
	    }
	}
	
	@Override
    public String getParameter(final String name) {
		if (params.containsKey(name)) {
            String[] strings = getParameterMap().get(name);
            if (strings == null || strings.length == 0) {
                return null;
            }
            else {
                return strings[0];
            }
        }
        else {
            return super.getParameter(name);
        }
    }

    @Override
    public Map<String, String[]> getParameterMap() {
    	Map<String, String[]> allParameters = new HashMap<>();
        allParameters.putAll(super.getParameterMap());
        try {
		allParameters.putAll(mutableMap(getQueryString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return Collections.unmodifiableMap(allParameters);
    }

    @Override
    public Enumeration<String> getParameterNames() {
    	return Collections.enumeration(getParameterMap().keySet());
    }

    @Override
    public String[] getParameterValues(final String name) {
    	String[] value = getParameterMap().get(name);
        if (value == null) {
            return super.getParameterValues(name);
        }
        else {
            return value;
        }
    }
    
    public Map<String, String[]> mutableMap(String queryString) throws Exception
    {
        final String[] arrParameters = queryString.split("&");
        for (final String tempParameterString : arrParameters) {

            final String[] arrTempParameter = tempParameterString.split("=");
                    
            if (arrTempParameter.length >= 2) {
                final String parameterKey = arrTempParameter[0];
                final String parameterValue = arrTempParameter[1];
                params.put(parameterKey, new String[] {parameterValue});
            } else {
                final String parameterKey = arrTempParameter[0];
                params.put(parameterKey, new String[] {""});
            }
            
        }
        return params;
    }
	
}
