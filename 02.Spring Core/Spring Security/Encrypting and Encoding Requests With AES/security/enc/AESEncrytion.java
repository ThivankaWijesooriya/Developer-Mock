package com.synapsys.gp.security.enc;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

@Component("aes")
public class AESEncrytion {

	private static final String key = "abv3eksuGZM8r/x/bXFdmz++b1AIj97x0ui90orQdHM=";
	private static final String initVector = "u/JWlbtAPL/fx7ipyZc3oQ==";
	private static final byte[] base64key = Base64.getDecoder().decode(key);
	private static final byte[] base64InitVector = Base64.getDecoder().decode(initVector);


	public String encrypt(String value) {
		try {
			
			IvParameterSpec iv = new IvParameterSpec(base64InitVector);
			SecretKeySpec skeySpec = new SecretKeySpec(base64key, "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());

			String encryptedString = Base64.getEncoder().encodeToString(encrypted);

			System.out.println("Original String  - " + value);
			System.out.println("Encrypted String - " + encryptedString);

			return encryptedString;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}

	public String decrypt(String encrypted) {
		try {
			
			IvParameterSpec iv = new IvParameterSpec(base64InitVector);
			SecretKeySpec skeySpec = new SecretKeySpec(base64key, "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] byteArr = cipher.doFinal(Base64.getDecoder().decode(encrypted));
			
			String decryptedString = new String(byteArr);
			
			System.out.println("encrypted String - " + encrypted);
			System.out.println("Original String  - " + decryptedString);

			return decryptedString;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
