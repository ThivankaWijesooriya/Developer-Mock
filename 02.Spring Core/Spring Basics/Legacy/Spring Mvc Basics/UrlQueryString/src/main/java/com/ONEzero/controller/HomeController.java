package com.ONEzero.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private HttpSession session;
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(HttpServletRequest request){
	       
		   		   
	       return "index";
	 }
	 
	 @RequestMapping(value = "/Add", method = RequestMethod.GET)
	    public String index(@RequestParam("a")int a,@RequestParam("b")int b,
	    Model model) {
		 
           int add = a+b;
	   model.addAttribute("add",add);     
		   
	       return "AddNumbers";
	 }
	 
	 
	 @RequestMapping(value = "/Name", method = RequestMethod.GET)
	    public String index(@RequestParam("name")String name,
	    Model model) {
		 
   
	    model.addAttribute("name",name);     
		   
	       return "Name";
	 }

}
