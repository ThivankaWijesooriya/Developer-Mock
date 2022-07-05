package com.combank.ipsinward.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.combank.ipsinward.model.acmt023.Acmt023;
import com.combank.ipsinward.model.pacs002.Pacs002;
import com.combank.ipsinward.model.pacs008.Pacs008;

@RestController
@RequestMapping("/inward")
public class InwardController {

	@RequestMapping(value = "/v1/verification-request", method = RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody Acmt023 acmt023, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(acmt023);
	}

	@RequestMapping(value = "/v1/payment-status-report", method = RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody Pacs002 pacs002, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(pacs002);
	}

	@RequestMapping(value = "/v1/credit-transfer", method = RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody Pacs008 pacs008, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(pacs008);
	}

}
