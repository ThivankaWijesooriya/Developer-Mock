package com.ONEzero.service;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.apache.log4j.Logger;

public class EmailClient {

	private String resources = "Email.properties";
	private String username = null;
	private String password = null;
	private int portnumber = 0;
	private String hostname = null;
	private String sender = null;
	private String receiver = null;
	private String subject = null;
	private String message = null;
	private Logger logger = Logger.getLogger(EmailClient.class);
	
	
	

	public EmailClient() {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties prop = new Properties();

		try {

			logger.info("Property File Pre-Loading");

			// Loading EmailConfig.properties through ClassLoader
			InputStream rs = loader.getResourceAsStream(resources);
			prop.load(rs);

			logger.info("Property File loaded Successfully");

			username = prop.getProperty("Email.username");
			password = prop.getProperty("Email.password");
			portnumber = Integer.parseInt(prop.getProperty("Email.portnumber"));
			hostname = prop.getProperty("Email.hostname");
			sender = prop.getProperty("Email.sender");
			subject = prop.getProperty("Email.subject");
			message = prop.getProperty("Email.message");
			receiver = prop.getProperty("Email.receiver");



			

		} catch (Exception e) {

			logger.error(e);
		}
	}
	
	
	
	public void sendmail() {
		
		
		try {
			
			
			// Email Configuration

			Email email = new SimpleEmail();
			email.setSmtpPort(portnumber);
			email.setAuthenticator(new DefaultAuthenticator(username, password));
			email.setDebug(false);
			email.setHostName(hostname);
			email.setFrom(sender);
			email.setSubject(subject);
			email.setMsg(message);

			// Sending Mail to Single Recipient

			email.addTo(receiver);
			
           
			/*email.setStartTLSEnabled(true);
			email.setStartTLSRequired(true);
			email.setTLS(true);*/
			
			

			email.send();
			logger.info("Mail sent Successfully ");
			
			
			
		} catch (Exception e2) {
			
			logger.info("Mail Not sent ");
			e2.printStackTrace();
			
		}
		
		
	}

}
