package com.onezero.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;

import com.onezero.config.AuthenticationEntryPoint;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@PropertySource("classpath:ldap.properties")
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Environment env;

	@Bean
	public AuthenticationEntryPoint customAuthenticationEntry() throws Exception {
	  return new AuthenticationEntryPoint();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		   .antMatchers("/welcome","/atm/**","/**","/survey/**").authenticated()
	       .and()
	       .httpBasic()
	       .authenticationEntryPoint(customAuthenticationEntry())
	       .and()
	       .exceptionHandling()
	       .and()
	       .csrf().disable()
	       .sessionManagement()
	       .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	       	      				        
	}
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(activeDirectoryLdapAuthenticationProvider());
	}

	@Bean
	public AuthenticationManager authenticationManager() {
		return new ProviderManager(Arrays.asList(activeDirectoryLdapAuthenticationProvider()));
	}

	@Bean
	public AuthenticationProvider activeDirectoryLdapAuthenticationProvider() {
		ActiveDirectoryLdapAuthenticationProvider provider = new ActiveDirectoryLdapAuthenticationProvider(

				env.getProperty("ad.domain"), env.getProperty("ad.url"));

		provider.setConvertSubErrorCodesToExceptions(true);
		provider.setUseAuthenticationRequestCredentials(true);

		return provider;
	}

}
