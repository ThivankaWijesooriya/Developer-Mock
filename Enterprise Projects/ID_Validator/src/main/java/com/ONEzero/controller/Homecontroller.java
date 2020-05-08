package com.ONEzero.controller;







import java.beans.PropertyEditor;

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


import com.ONEzero.modal.User;
import com.ONEzero.service.MyCustomNumberEditor;

@Controller
public class Homecontroller {
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);
		databinder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
		
		
		
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String MainPage(Model model) {
		
		model.addAttribute("user", new User());
		model.addAttribute("IDmsg", "Generated ID");
		
		return "ID_validator";
	}
	
	@RequestMapping(value="/Form/Submit",method=RequestMethod.POST)
	public String MainPageValidate(@Valid @ModelAttribute("user")User Userobj,BindingResult br, Model model) {
		
		System.out.println("ID: |"+Userobj.getCustomerId()+"|");

		if(br.hasErrors())
		{
			return "ID_validator";
		}
		else {
			
			String Number =String.valueOf(Userobj.getCustomerId());
			String finalmsg;
			int size =Number.length();
			System.out.println(size);
		    if(size==12) {
		    	
		    	String FirstSet = Number.substring(2, 7);
		    	String SecondSet = Number.substring(8, 12);
		    	int MiddleNumber=Integer.parseInt(Number.substring(7, 8));
		    	
		    	if(MiddleNumber==0) {
		    		
		    		 finalmsg="Search existing CIF's without typing V or X at the end"
		    		 		+ " of the given NIC number";
		    	}
		    	else {
		    		
		    		finalmsg="Appearing NIC may differ from the Old NIC number, please"
		    				+ " verify with the customer";
		    	}
		    	String Oldid = FirstSet+SecondSet;
		    	System.out.println(Oldid);
		    	
		    	model.addAttribute("IDmsg", "Old ID");
		    	model.addAttribute("msg",Oldid);
		    	model.addAttribute("finalmsg",finalmsg);
		    	System.out.println(finalmsg);
		    	
		    	return "ID_validator";
		    	
		    }
		    else if(size==9) {
		    	String FirstSet= Number.substring(0,5);
		    	String SecondSet = Number.substring(5, 9);
		    	String prefix ="19";
		    	String suffix ="0";
		    	String Newid = prefix+FirstSet+suffix+SecondSet;
		    	model.addAttribute("IDmsg", "New ID");
		    	System.out.println(Newid);
		    	model.addAttribute("msg",Newid);
		    	return "ID_validator";
		    }
		    else {
		    	
		    	model.addAttribute("msg","Enter valid input");
		    	return "ID_validator";
		    }
	
		}
		
	}
	

}
