package com.combank.ips.outward.producer.util;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import org.springframework.stereotype.Component;

@Component
public class XmlFormatter {

	public String beautify(Object message) {
		try {

			StringWriter sw = new StringWriter();
			JAXB.marshal(message, sw);
			String xmlString = sw.toString();

			return xmlString;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
