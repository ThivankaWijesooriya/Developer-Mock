package com.test.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicManagementResponse;
import com.test.util.AgoraPushUtil;

import java.util.List;

@RestController
public class AgoraPushController {

	@Autowired
	private AgoraPushUtil agoraPushUtil;

	@RequestMapping(value = { "/agora/call" }, method = RequestMethod.POST)
	public ResponseEntity<?> callInitiator() {

			try {

				// Get token from DB based on Username
				String registrationToken = "dJ2xqRS-wP86KT0puP8FHB:APA91bFkyj5AmFYDGphkL4JnTzo-9Y8SDTzGdIJImWgX4RbO8sjdFIUgSGelvH32AdiBf6xEHKL5jW0fPY_5qs2jxb2jLJY12nYOR_rUaGSh48e7HC-CCtmDFu2TJOTue3fLUq3SuzYX";

				agoraPushUtil.sendToToken(registrationToken);

				return new ResponseEntity<>(HttpStatus.OK);

			} catch (Exception e) {

				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

	}

	@RequestMapping(value = { "/subscribe" }, method = RequestMethod.GET)
	public void subscribeToNotification() throws Exception {

		String topic = "highScores";

		// [START subscribe]
		// These registration tokens come from the client FCM SDKs.
		List<String> registrationTokens = Arrays.asList("YOUR_REGISTRATION_TOKEN_1",
				// ...
				"YOUR_REGISTRATION_TOKEN_n");

		// Subscribe the devices corresponding to the registration tokens to the
		// topic.
		TopicManagementResponse response = FirebaseMessaging.getInstance()
				.subscribeToTopicAsync(registrationTokens, topic).get();

		// See the TopicManagementResponse reference documentation
		// for the contents of response.
		System.out.println(response.getSuccessCount() + " tokens were subscribed successfully");
		// [END subscribe]

	}

	@RequestMapping(value = { "/unsubscribe" }, method = RequestMethod.GET)
	public void unSubscribeToNotification() throws Exception {

		String topic = "highScores";

		// [START unsubscribe]
		// These registration tokens come from the client FCM SDKs.
		List<String> registrationTokens = Arrays.asList("YOUR_REGISTRATION_TOKEN_1",
				// ...
				"YOUR_REGISTRATION_TOKEN_n");

		// Unsubscribe the devices corresponding to the registration tokens from
		// the topic.
		TopicManagementResponse response = FirebaseMessaging.getInstance()
				.unsubscribeFromTopicAsync(registrationTokens, topic).get();

		// See the TopicManagementResponse reference documentation
		// for the contents of response.
		System.out.println(response.getSuccessCount() + " tokens were unsubscribed successfully");
		// [END unsubscribe]

	}

}
