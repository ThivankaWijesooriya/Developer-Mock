package com.onezero.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.onezero.model.User;
import com.onezero.service.UserService;

@RestController
@CrossOrigin
public class LoginRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login/submit", method = RequestMethod.POST, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)

	public ResponseEntity<String> getLogin(HttpServletRequest request, Authentication authentication)

	{
		
		UserDetails userDetails = null;
		
		try {

			userDetails = (UserDetails) authentication.getPrincipal();
			System.out.println("User has authorities: " + userDetails.getUsername());
			
			JsonObject json = new JsonObject();
			String response = null;

			if (userService.getUserByName(userDetails.getUsername()) != null) {

				User user = userService.getUserByName(userDetails.getUsername());
								
				json.addProperty("status", "success");
				json.addProperty("name", user.getName());
				json.addProperty("username", userDetails.getUsername());
				json.addProperty("firstname", user.getFirstname());
				json.addProperty("lastname", user.getName().split("\\s")[0]);

				response = new Gson().toJson(json);

				return new ResponseEntity<String>(response, HttpStatus.OK);

			}

			else {
				

				json.addProperty("status", "unauthorized");
				
				response = new Gson().toJson(json);
				
				return new ResponseEntity<String>(response,HttpStatus.UNAUTHORIZED);
			}

		} catch (Exception e) {

			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			
		}

	}

}
