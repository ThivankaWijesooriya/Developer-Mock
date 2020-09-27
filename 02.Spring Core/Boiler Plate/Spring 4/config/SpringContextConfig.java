package com.onezero.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.onezero.*")
@Import({SpringSecurityConfig.class})
public class SpringContextConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		registry.viewResolver(resolver);
		
	}

// Enable this when using Form based Authentication
	
//	  @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//		
//        registry.addViewController("/login").setViewName("login");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        
//    }
	
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
        registry
        .addResourceHandler("/resources/**")
        .addResourceLocations("/resources/"); 
          
    }

}