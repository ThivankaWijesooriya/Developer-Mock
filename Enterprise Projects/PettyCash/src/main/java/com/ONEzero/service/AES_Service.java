package com.ONEzero.service;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;



public class AES_Service {
	
	private static final String key = "aesEncryptionKey";
	private static final String initVector = "encryptionIntVec";
	

	public AES_Service() {};
	

	public String encrypt(String value) {
		
		String encryptedString = null;
		
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			if(value != null) {
				
				byte[] encrypted = cipher.doFinal(value.getBytes());
				
				Base64 encoder = new Base64();
				
				/*String encryptedString = Base64.getEncoder().encodeToString(encrypted);*/
				
				encryptedString = encoder.encodeAsString(encrypted);
				
			}
			
			return encryptedString;
			/*return Base64.encodeBase64String(encrypted);*/
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
		
		
       }
	
	
	public  String decrypt(String encrypted) {
		
		byte[] original = null;
		
		try {
			
			
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			
			Base64 decoder = new Base64();
			
			if(encrypted != null) {
				
				
				 original = cipher.doFinal(decoder.decode(encrypted));
				
			}
			
			/*byte[] original = cipher.doFinal(decoder.decode(encrypted));*/

			return new String(original);
			
			
		} catch (Exception ex) {
			
			
			ex.printStackTrace();
			
			
		}

		return null;
		
		
}
	


}
