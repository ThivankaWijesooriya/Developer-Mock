package com.combank.ipsinward.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.combank.ipsinward.model.pacs002.FIToFIPmtStsRpt;
import com.combank.ipsinward.model.pacs008.FIToFICstmrCdtTrf;

@RestController
@RequestMapping("/inward")
public class InwardController {

	@RequestMapping(value = "/v1/payment-status-report", method = RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody FIToFIPmtStsRpt fIToFIPmtStsRpt, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(fIToFIPmtStsRpt);
	}

	@RequestMapping(value = "/v1/credit-transfer", method = RequestMethod.POST)
	public ResponseEntity<?> Message(@RequestBody FIToFICstmrCdtTrf fIToFICstmrCdtTrf, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(fIToFICstmrCdtTrf);
	}

}
