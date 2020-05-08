package com.onezero.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
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

import com.onezero.model.File;
import com.onezero.service.DBconnect;

@Controller
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);
		
	
		
	}
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Message(Model model) {
		
		model.addAttribute("mapfile", new File());
		
		/*String ls =new DBconnect().Retrieve();
		model.addAttribute("pic",ls);*/
		return "home";
	}
	
	
	@RequestMapping(value="/Submit", method=RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("mapfile")File file , BindingResult br) {
		
		/*System.out.println(file.getPicture().length);*/
		
		/*System.out.println(file.getMessage());*/
		
		
		
		if(file.getPicture().isEmpty() != true) {
			
			
			try {
				
				
				byte [] img = file.getPicture().getBytes();
				
				file.setProfilepic(img);
			    
			     new DBconnect(img);
			    
			    
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		

		
		if(br.hasErrors())
		{
			return "home";
		}
		else {
			
		
			return "home";
		}
		
		
	}

}
