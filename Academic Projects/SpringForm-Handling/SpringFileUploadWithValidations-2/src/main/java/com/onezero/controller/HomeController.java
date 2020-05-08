package com.onezero.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.onezero.model.File;
import com.onezero.service.CustomFileValidator;

@Controller
public class HomeController {

	

	@Autowired
	private CustomFileValidator customFileValidator;

	@InitBinder
	public void initBinder(WebDataBinder databinder) {

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Message(Model model) {

		model.addAttribute("mapfile", new File());

	
		return "home";
	}

	@RequestMapping(value = "/Submit", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("mapfile") File file, BindingResult br) {

		// file handling to upload it in the server path
		MultipartFile picture = file.getPicture();
		customFileValidator.validate(file, br);

		if (br.hasErrors()) {
			return "home";
		} else {

			return "home";
		}

	}

}
