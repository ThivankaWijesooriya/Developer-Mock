package com.ONEzero.service;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.model.Pages;

public class Runner {

	
    public static void main(String[] args) throws Exception {


    	
    	/*AES_Service service = new AES_Service();
    	
    	String encryptedString ="z6Sp2I+j0Y4nx6UhbCTaWg==";
		
		String decryptedString = service.decrypt(encryptedString);
		
        System.out.println("After decryption - " + decryptedString);
              
        System.out.println(service.encrypt("abc123"));*/ // Encrypt String
    	
          new IouDAOImpl().MailSchedule();

    }

	

}
