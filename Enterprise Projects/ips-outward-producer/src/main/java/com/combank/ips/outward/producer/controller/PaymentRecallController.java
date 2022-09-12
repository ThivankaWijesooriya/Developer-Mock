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
public class PaymentRecallController {

	// camt.029
	@RequestMapping(value = "/v1/resolution-of-investigation", method = RequestMethod.POST)
	public ResponseEntity<?> resolutionOfInvestigation(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
	// camt.056
	@RequestMapping(value = "/v1/payment-cancellation-request", method = RequestMethod.POST)
	public ResponseEntity<?> paymentCancellationRequest(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
	// pacs.004
	@RequestMapping(value = "/v1/payment-return", method = RequestMethod.POST)
	public ResponseEntity<?> paymentReturn(@RequestBody Document document, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
