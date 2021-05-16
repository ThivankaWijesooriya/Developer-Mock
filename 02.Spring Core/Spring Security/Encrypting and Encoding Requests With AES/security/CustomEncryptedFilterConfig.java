package com.synapsys.gp.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.synapsys.gp.filter.CustomEncryptedFilter;

@Configuration
public class CustomEncryptedFilterConfig {

	@Bean
	public FilterRegistrationBean<CustomEncryptedFilter> customFilter() {
		FilterRegistrationBean<CustomEncryptedFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new CustomEncryptedFilter());
		registrationBean.addUrlPatterns("/api/mobc/*");
		return registrationBean;
	}

}
