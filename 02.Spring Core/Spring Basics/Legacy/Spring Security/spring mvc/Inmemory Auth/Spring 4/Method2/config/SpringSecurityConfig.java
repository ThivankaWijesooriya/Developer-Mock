package com.testapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        
	auth.inMemoryAuthentication()
        .withUser("thivanka").password("test").roles("USER")
        .and().withUser("lahiru").password("test").roles("USER");    
                               
    }
	
	
}
