package com.ONEzero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ONEzero.model.Student;

@Controller
public class HomeController {
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String index(ModelMap map){
	        
		Student stobj = new Student(1,"Thivanka","thivz");
		
		map.addAttribute("stu",stobj);
		   
		   
	       return "index";
	 }

}
