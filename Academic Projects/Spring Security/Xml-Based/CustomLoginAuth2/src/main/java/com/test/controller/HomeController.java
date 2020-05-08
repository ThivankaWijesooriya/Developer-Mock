package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping("/services")
	public String goServices(){
		
		return "services";
	}
	
	
	@RequestMapping("/schedule")
	public String goSchedule(){
		return "schedule";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/defaultpage", method=RequestMethod.GET)
	public String defaultpage() {
		
		return "defaultpage";
	}
	
	
	
}
