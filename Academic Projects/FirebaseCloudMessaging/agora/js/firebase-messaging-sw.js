// Give the service worker access to Firebase Messaging.
// Note that you can only use Firebase Messaging here. Other Firebase libraries
// are not available in the service worker.

importScripts("https://www.gstatic.com/firebasejs/8.1.2/firebase-app.js");
importScripts("https://www.gstatic.com/firebasejs/8.1.2/firebase-messaging.js");

// Initialize the Firebase app in the service worker by passing in
// your app's Firebase config object.
// https://firebase.google.com/docs/web/setup#config-object

var Config = {
	apiKey: "AIzaSyDpIVTgIcj57I3YLdjp1UtzlTr8Dl9QckQ",
	authDomain: "premier-go-push.firebaseapp.com",
	projectId: "premier-go-push",
	storageBucket: "premier-go-push.appspot.com",
	messagingSenderId: "588795123084",
	appId: "1:588795123084:web:2ce08dc59d1b392cf572a9",
	measurementId: "G-K9SLCQYP7M",
};

// Initialize Firebase
firebase.initializeApp(Config);

// Retrieve an instance of Firebase Messaging so that it can handle background messages.
const messaging = firebase.messaging();

messaging.onBackgroundMessage(function(payload) {

	console.log('[firebase-messaging-sw.js] Received background message ', payload);

	// Customize notification here
	const notificationTitle = 'Background Message Title';
	const notificationOptions = {
		body: 'Background Message body.',
		icon: '/firebase-logo.png'
	};

	self.registration.showNotification(notificationTitle, notificationOptions);

});


