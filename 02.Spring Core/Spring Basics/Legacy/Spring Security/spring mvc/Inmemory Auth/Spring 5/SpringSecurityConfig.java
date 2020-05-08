package com.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		auth.inMemoryAuthentication()
		.withUser("thivanka").password("{noop}abc123").roles("user")
		.and()
		.withUser("lahiru").password("{noop}123abc").roles("admin");
		
//		Prior to Spring Security 5.0 the default PasswordEncoder 
//              was NoOpPasswordEncoder 
//		which required plain text passwords. 
//		
//		In Spring Security 5, the default is DelegatingPasswordEncoder, 
//		which required Password Storage Format.
//		
//		Add password storage format, for plain text, add {noop}
		
		
	}
	
	
}
