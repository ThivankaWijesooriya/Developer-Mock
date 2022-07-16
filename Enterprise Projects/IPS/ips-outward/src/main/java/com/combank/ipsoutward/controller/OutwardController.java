package com.combank.ipsoutward.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.combank.ipsoutward.model.pacs002.FIToFIPmtStsRpt;
import com.combank.ipsoutward.model.pacs008.FIToFICstmrCdtTrf;
import com.combank.ipsoutward.service.HostService;

@RestController
@RequestMapping("/outward")
public class OutwardController {

	@Autowired
	private HostService hostService;

	@RequestMapping(value = "/v1/payment-status-report", method = RequestMethod.POST, 
	produces = MediaType.APPLICATION_XML_VALUE, 
	consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<?> Message(@RequestBody FIToFIPmtStsRpt fIToFIPmtStsRpt, HttpServletRequest request) {
		
		Object resultSet = hostService.postToHost(fIToFIPmtStsRpt);
		return ResponseEntity.status(HttpStatus.OK).body(resultSet);
		
	}

	@RequestMapping(value = "/v1/credit-transfer", method = RequestMethod.POST,
	produces = MediaType.APPLICATION_XML_VALUE,
	consumes = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<?> Message(@RequestBody FIToFICstmrCdtTrf fIToFICstmrCdtTrf, HttpServletRequest request) {

		Object resultSet = hostService.postToHost(fIToFICstmrCdtTrf);
		return ResponseEntity.status(HttpStatus.OK).body(resultSet);

	}

}
