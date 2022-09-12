package com.combank.ips.outward.producer.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.combank.ips.outward.producer.model.pacs_008_001.Document;

@RestController
public class MessageRejectController {
	
	// admi.002
	@RequestMapping(value = "/v1/message-reject", method = RequestMethod.POST)
	public ResponseEntity<?> messageReject(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
