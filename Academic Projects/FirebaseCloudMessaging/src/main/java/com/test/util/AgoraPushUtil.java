package com.test.util;

import org.springframework.stereotype.Component;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;

@Component
public class AgoraPushUtil {
	

	public void sendToToken(String registrationToken) throws Exception {
		
        // [START send_to_token]
        // This registration token comes from the client FCM SDKs.
		
        //String registrationToken = "dJ2xqRS-wP86KT0puP8FHB:APA91bH3BFiZU9i6sYbPyKUFrSRhFSN3h8__jivc1L5AJTVyeDOYHNgzKtG9jDPxMh6fyBirrc6ZU4yOyU5Hirt8Tjg7J3miCZ4Qgd-L2nDK0HnSbTg5XSNS6aG7wP0hnT1OLUEraoD7";
        // See documentation on defining a message payload.
       
        Message message = Message.builder()
            .putData("score", "850")
            .putData("time", "2:45")
            .setToken(registrationToken)
            .build();
        // Send a message to the device corresponding to the provided
        // registration token.
        
        String response = FirebaseMessaging.getInstance().sendAsync(message).get();
        // Response is a message ID string.
        System.out.println("Successfully sent message: " + response);
        // [END send_to_token]

    }

}
