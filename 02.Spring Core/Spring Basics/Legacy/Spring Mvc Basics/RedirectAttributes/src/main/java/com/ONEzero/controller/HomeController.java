package com.ONEzero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(){
	        
   
	       return "index";
	 }
	 
	 @RequestMapping(value = "/Test", method = RequestMethod.POST)
	    public String Tester(RedirectAttributes ra){
	        
           ra.addFlashAttribute("name","Thivanka");
	       return "redirect:/Redirect";
	 }
	 
	 @RequestMapping(value = "/Redirect", method = RequestMethod.GET)
	    public String RedirectPage(){
	        

	       return "welcome";
	 }

}
