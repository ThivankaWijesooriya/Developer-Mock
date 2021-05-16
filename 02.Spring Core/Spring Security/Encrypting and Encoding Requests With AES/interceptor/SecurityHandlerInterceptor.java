package com.synapsys.gp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SecurityHandlerInterceptor implements HandlerInterceptor {

	private static final Logger logger = LogManager.getLogger(SecurityHandlerInterceptor.class.getName());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception {
		
		logger.info("************** PreHandle Interceptor - START ***********************");
		logger.info("Method       : {}", request.getMethod());
		logger.info("URL          : {}", request.getRequestURL());
		logger.info("Query String : {}", request.getQueryString());
		logger.info("************** PreHandle Interceptor - END   ***********************");
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
			
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	ModelAndView modelAndView) throws Exception {
		
		logger.info("************** PostHandle Interceptor - START ***********************");
		logger.info("Method: {}", request.getMethod());
		logger.info("URL: {}", request.getRequestURL());
		logger.info("Query String : {}", request.getQueryString());
		logger.info("************** PostHandle Interceptor - END   ***********************");

		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

	}

	

}
