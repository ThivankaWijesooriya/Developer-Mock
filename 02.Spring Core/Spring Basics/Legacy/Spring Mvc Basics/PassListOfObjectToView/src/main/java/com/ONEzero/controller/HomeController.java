package com.ONEzero.controller;

import java.util.ArrayList;
import java.util.List;

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
		 
		List<Student> stlist = new ArrayList<>();
	        
		Student stobj = new Student(1,"Thivanka","thivz");
		Student stobj2 = new Student(2,"Lahiru","thivz");
		Student stobj3 = new Student(3,"Kushan","thivz");
		
		stlist.add(stobj);
		stlist.add(stobj2);
		stlist.add(stobj3);
		
		map.addAttribute("stu",stlist);
		   
		   
	       return "index";
	 }

}
