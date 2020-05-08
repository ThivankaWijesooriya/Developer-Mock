package com.ONEzero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(Model model,ModelMap map){
	        
		   model.addAttribute("firstname","Thivanka");
		   // Using Model interface
		   
		   map.addAttribute("lastname","Wijesooriya");
		   // Using ModelMap class
		   
		   
	       return "index";
	 }

}
