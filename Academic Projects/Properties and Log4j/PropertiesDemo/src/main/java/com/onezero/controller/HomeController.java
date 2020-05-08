package com.onezero.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@PropertySource("classpath:DBconfig.properties")
public class HomeController {
	
	@Value("${DB_url}")
	private String url;
	
	@Value("${DB_username}")
	private String username;
	
	@Value("${DB_password}")
	private String password;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Message(Model mp) {
		
		mp.addAttribute("url",url);
		mp.addAttribute("username",username);
		mp.addAttribute("password",password);
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	
		return "home";
	}

}
