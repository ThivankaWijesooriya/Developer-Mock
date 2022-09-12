package com.combank.ips.outward.producer.controller;

import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

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
import com.combank.ips.outward.producer.service.QueueService;

@RestController
public class TestController {

	@Autowired
	private QueueService queueService;

	@RequestMapping(value = "/test/queue", method = RequestMethod.POST)
	public ResponseEntity<?> testQueue(@RequestBody Document document, HttpServletRequest request)
	throws JAXBException {

		StringWriter sw = new StringWriter();
		Object message = new ObjectFactory().createDocument(document);
		JAXB.marshal(message, sw);
		String xmlString = sw.toString();

		System.out.println(xmlString);

		boolean queueStatus = queueService.addToQueue(QueueDetail.EXCHANGE.getValue(),
		QueueDetail.ROUTING_KEY.getValue(), new ObjectFactory().createDocument(document));

		System.out.println("Added to queue : " + queueStatus);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(document);

	}

}
