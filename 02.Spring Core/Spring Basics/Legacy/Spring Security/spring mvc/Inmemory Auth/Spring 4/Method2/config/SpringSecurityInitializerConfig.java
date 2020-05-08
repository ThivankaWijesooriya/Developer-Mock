package com.testapp.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInitializerConfig extends AbstractSecurityWebApplicationInitializer {

	public SpringSecurityInitializerConfig() {
		
		super(SpringSecurityConfig.class);
		
	}
	
}
