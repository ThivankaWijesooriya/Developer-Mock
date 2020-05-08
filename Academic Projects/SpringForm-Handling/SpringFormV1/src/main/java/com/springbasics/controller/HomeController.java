package com.springbasics.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springbasics.model.Student;
import com.springbasics.model.Teacher;

@Controller
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(true);
	    databinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
	}
	

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String DisplayStudentForm(Model model) {
		
		model.addAttribute("Student",new Student());
		return "StudentForm";
	}
	
	@RequestMapping(value="/StudentForm/Submit",method=RequestMethod.POST)
	public String SubmitStudentForm(@Valid @ModelAttribute("Student")Student studentObject,BindingResult br) {
		
		System.out.println("Name: |"+studentObject.getName()+"|");
		System.out.println("date : |"+studentObject.getEnrollment()+"|");
		System.out.println("date : |"+studentObject.getGraduation()+"|");
		
		System.out.println(studentObject.getLicense().getNumber());
		
		List<Teacher> list =studentObject.getTeacherlist();
		 for(Teacher adlist : list) {

			  System.out.println(adlist.getTeachername());     
		}
		
		
		if(br.hasErrors())
		{
			return "StudentForm";
		}
		else {
			
		
			return "StudentForm";
		}
	}

}
