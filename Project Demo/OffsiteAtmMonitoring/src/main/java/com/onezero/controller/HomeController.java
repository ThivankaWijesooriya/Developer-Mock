package com.onezero.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.onezero.model.User;
import com.onezero.service.UserService;


@Controller
public class HomeController {
	
		
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/welcome","/"}, method = RequestMethod.GET)
	public String welcomePage(Locale locale, Model model,Authentication authentication) {

		
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is welcome page!");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		
		User user = userService.getUserByName(userDetails.getUsername());
		
		model.addAttribute("user",user.getName());
		
		
		System.out.println();
		
		return "home";

	}
	
	
}
