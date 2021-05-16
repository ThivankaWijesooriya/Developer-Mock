package com.synapsys.gp.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.synapsys.gp.message.request.LoginForm;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/mobc")
public class HomeController {
	
	private static final Logger logger = LogManager.getLogger(HomeController.class.getName());
	
	@RequestMapping(value="/me", method=RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody LoginForm loginForm,HttpServletRequest request) {		
		return ResponseEntity.status(HttpStatus.OK).body(loginForm);
	}
	
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public ResponseEntity<?> queryMessage(@RequestParam(value = "name") String name,
	@RequestParam(value = "school") String school,HttpServletRequest request) {	
		logger.info("Name is   : "+name);	
		logger.info("School is : "+school);	
		return ResponseEntity.status(HttpStatus.OK).body(name+" "+school);
	}
	
	@RequestMapping(value="/message/path/{office}",method=RequestMethod.GET)
	public ResponseEntity<?> pathMessage(@PathVariable(value = "office") String office,
	HttpServletRequest request) {	
		logger.info("Office is   : "+office);	
		return ResponseEntity.status(HttpStatus.OK).body(office);
	}

}
