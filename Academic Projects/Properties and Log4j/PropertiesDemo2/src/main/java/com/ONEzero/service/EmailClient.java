package com.ONEzero.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.mail.*;
import org.apache.log4j.Logger;
import org.python.parser.ast.listcompType;

public class EmailClient {

	private static String resources = "EmailConfig.properties";
	private static String username = null;
	private static String password = null;
	private static int portnumber = 0;
	private static String hostname = null;
	private static String sender = null;
	private static String receiver = null;
	private static String subject = null;
	private static String message = null;
	private static Logger logger = Logger.getLogger(EmailClient.class);
	private static List<String> addresses;

	public static void main(String[] args) {

		addresses = new ArrayList<>(); // Store Multiple Email Addresses
		addresses.add("thivankawijesooriya@gmail.com");
		addresses.add("thivankaw@onezero.lk");

		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties prop = new Properties();

		try {

			// Loading EmailConfig.properties through ClassLoader
			InputStream rs = loader.getResourceAsStream(resources);
			prop.load(rs);

			logger.info("Property File loaded");

			username = prop.getProperty("Email.username");
			password = prop.getProperty("Email.password");
			portnumber = Integer.parseInt(prop.getProperty("Email.portnumber"));
			hostname = prop.getProperty("Email.hostname");
			sender = prop.getProperty("Email.sender");
			subject = prop.getProperty("Email.subject");
			message = prop.getProperty("Email.message");
			receiver = prop.getProperty("Email.receiver");

			// Email Configuration 

			Email email = new SimpleEmail();
			email.setSmtpPort(portnumber);
			email.setAuthenticator(new DefaultAuthenticator(username, password));
			email.setDebug(false);
			email.setHostName(hostname);
			email.setFrom(sender);
			email.setSubject(subject);
			email.setMsg(message);

			

			/* email.addTo(receiver); */  // Sending Mail to Single Recipient
			

			// Sending Mail to Multiple Recipients

			if (addresses.isEmpty() == false) {

				for (String obj : addresses) {

					email.addTo(obj);

				}
			}

			
			
			/* email.setTLS(true); */

			email.send();

			logger.info("Mail sent Successfully");

		} catch (Exception e) {

			logger.error(e);
		}

	}

}
