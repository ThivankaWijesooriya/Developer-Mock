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
public class PaymentInitiationController {

	// pain.001
	@RequestMapping(value = "/v1/payment-initiation", method = RequestMethod.POST)
	public ResponseEntity<?> paymentInitiation(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
	// pain.002
	@RequestMapping(value = "/v1/payment-initiation-status-report", method = RequestMethod.POST)
	public ResponseEntity<?> paymentInitiationStatusReport(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
