package test;


import org.apache.commons.codec.*;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES_runner {
	
	private static final String key = "aesEncryptionKey";
	private static final String initVector = "encryptionIntVec";

	public static void main(String[] args) {
		
		String originalString = "password";
		System.out.println("Original String to encrypt - " + originalString);
		String encryptedString = encrypt(originalString);
		System.out.println("Encrypted String - " + encryptedString);
		String decryptedString = decrypt(encryptedString);
		System.out.println("After decryption - " + decryptedString);

	}
	
	

	public static String encrypt(String value) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());
			
			String encryptedString = Base64.getEncoder().encodeToString(encrypted);
			
			return encryptedString;
			/*return Base64.encodeBase64String(encrypted);*/
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	
	public static String decrypt(String encrypted) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

			return new String(original);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
