package com.test.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Student;

@Controller
public class HomeController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);
		
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomePage(Model model) {
		
		model.addAttribute("student", new Student());
		return "home";
	}
	
	@RequestMapping(value="/Form/Submit", method=RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("student") Student student,BindingResult br,Model model) {
		
		
		if(br.hasErrors()) {
			
			System.out.println("Errors Exist");
			
			return "home";
		}
		
		else {
			
			System.out.println(" Errors Don't Exist ");
			return "home";
		}
		
	}

}
