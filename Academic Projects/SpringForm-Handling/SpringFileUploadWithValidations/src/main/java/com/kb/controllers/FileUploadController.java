package com.kb.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;


import com.kb.model.FileUploadModel;
import com.kb.validator.CustomFileValidator;

@Controller
public class FileUploadController  {

	

	@Autowired
	CustomFileValidator customFileValidator;

	@RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
	public String uploadFileFormDisplay(Model model) {
		model.addAttribute("fileUploadModel", new FileUploadModel());
		return "uploadFile";

	}

	// Handle the single file upload

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFileHandler(Model model,@ModelAttribute FileUploadModel fileUploadModel, BindingResult bindingResult) {

		// file handling to upload it in the server path
		MultipartFile file = fileUploadModel.getFile();
		customFileValidator.validate(fileUploadModel, bindingResult);
		if (bindingResult.hasErrors()) {
			return "uploadFile";
		}

		
		else {
			
			return "uploadFile";
		}

	}

	

}
