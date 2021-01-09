package com.test.config;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;

@Configuration
public class FirebaseConfig {

	@Bean
	public FirebaseMessaging firebaseMessaging() {
		FirebaseMessaging firebase = FirebaseMessaging.getInstance();
		return firebase;
	}

	@PostConstruct
	public void init() {

		try (FileInputStream serviceAccount = new FileInputStream(
				ResourceUtils.getFile("classpath:ServiceAccount.json"));) {

			@SuppressWarnings("deprecation")
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
			if (FirebaseApp.getApps().isEmpty()) {
				FirebaseApp.initializeApp(options);
			}

			System.out.println("#####Firebase Initialized#####");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
