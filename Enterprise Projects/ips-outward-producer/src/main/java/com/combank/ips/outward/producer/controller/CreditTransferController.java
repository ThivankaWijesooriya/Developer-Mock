package com.combank.ips.outward.producer.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.combank.ips.outward.producer.constant.QueueDetail;
import com.combank.ips.outward.producer.model.pacs_008_001.Document;
import com.combank.ips.outward.producer.model.pacs_008_001.ObjectFactory;
import com.combank.ips.outward.producer.service.CreditTransferService;
import com.combank.ips.outward.producer.service.QueueService;

@RestController
public class CreditTransferController {

	@Autowired
	private CreditTransferService creditTransferService;
	
	@Autowired
	private QueueService queueService;

	// pacs.008
	@RequestMapping(value = "/v1/credit-transfer", method = RequestMethod.POST)
	public ResponseEntity<?> creditTransfer(@RequestBody Document document, HttpServletRequest request) {

		// Check whether message recorded in backend logs
		boolean insertLogStatus = creditTransferService.createCreditTransfer(document);

		System.out.println("Insert log status : " + insertLogStatus);

		if (insertLogStatus == true) {

			// Check whether message successfully added to queue
			boolean queueStatus = queueService.addToQueue(QueueDetail.EXCHANGE.getValue(),
			QueueDetail.ROUTING_KEY.getValue(), new ObjectFactory().createDocument(document));

			System.out.println("Added to queue : " + queueStatus);

			// Update backend logs to 'QUEUED' status (q)
			boolean updateLogStatus = creditTransferService.updateCreditTransfer(document);

			System.out.println("Update log status : " + updateLogStatus);

			// Add message to queue
			if (queueStatus == true && updateLogStatus == true) {
				return ResponseEntity.status(HttpStatus.OK).body(document);
			}

		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
}
