package com.ONEzero.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private HttpSession session;
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(HttpServletRequest request){
	       
		  session = request.getSession();
		  session.setAttribute("name", "Thivanka");
		   		   
	       return "index";
	 }
	 
	 @RequestMapping(value = "/Add/{a}/{b}", method = RequestMethod.GET)
	    public String index(@PathVariable("a") int a, @PathVariable("b")int b,
	    		HttpServletRequest request, Model model){
		 
		 
	        session = request.getSession();
	        String name = (String) session.getAttribute("name");
	        int addition = a+b;
	        
	        model.addAttribute("name",name);
	        model.addAttribute("addition",addition);
	        
		   
	       return "AddNumbers";
	 }

}
