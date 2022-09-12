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
public class LiquidityMgmtController {

	// camt.025
	@RequestMapping(value = "/v1/receipt", method = RequestMethod.POST)
	public ResponseEntity<?> receipt(@RequestBody Document document, HttpServletRequest request) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

	// camt.052
	@RequestMapping(value = "/v1/account-report", method = RequestMethod.POST)
	public ResponseEntity<?> accountReport(@RequestBody Document document, HttpServletRequest request) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

	// camt.053
	@RequestMapping(value = "/v1/account-statement", method = RequestMethod.POST)
	public ResponseEntity<?> accountStatement(@RequestBody Document document, HttpServletRequest request) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

	// camt.054
	@RequestMapping(value = "/v1/debit-credit-notification", method = RequestMethod.POST)
	public ResponseEntity<?> debitCreditNotification(@RequestBody Document document, HttpServletRequest request) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
