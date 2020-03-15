package com.onezero.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.onezero.model.Survey;
import com.onezero.service.SurveyService;


@RestController
@CrossOrigin
public class SurveyRestController {
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value = "/survey/submit", method = RequestMethod.POST,consumes=MimeTypeUtils.APPLICATION_JSON_VALUE , produces=MimeTypeUtils.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<String> getLogin(@RequestBody Survey survey) 
	
	{
		try {
			
			
			surveyService.createSurvey(survey);
			
			//Sending Server Response upon Auth Success
			JsonObject json = new JsonObject();
			
			json.addProperty("status", "success");
			
			String response = new Gson().toJson(json);

			return new ResponseEntity<String>(response,HttpStatus.OK);
			

		} catch (Exception e) {

			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}

	}


}
