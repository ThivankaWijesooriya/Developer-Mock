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

const messaging = firebase.messaging();


if (!("Notification" in window)) {
  console.log("This browser does not support desktop notification");
} else {

if('serviceWorker' in navigator) { 

  navigator.serviceWorker.register('resources/js/firebase-messaging-sw.js').then(function(registration) {
  messaging.useServiceWorker(registration); 
  console.log("Service Worker Registered");
  requestNotificationPermission(); 
  
  }); 
}

}

function requestNotificationPermission() {
  Notification.requestPermission(function (result) {
    console.log("Current permission", result);
    if (result !== "granted") {
      console.log("No notification permission granted");
    } else {
      displayConfirmNotification();
    }
  });
}

function displayConfirmNotification() {

  var options = {
    body: "Subscribed to notification service",
  };

  new Notification("Successfully subscribed", options);
  generateToken();

}

// Get registration token. Initially this makes a network call, once retrieved
// subsequent calls to getToken will return from cache.

function generateToken() {
  messaging
    .getToken({
      vapidKey:
        "BOcrbncKb2c_9pw25UizEGPbXb-ExxXjTjJF8oP1w36aAchktby7C1-I43eYfvBOju1PEYEXAJ4bDb9dzbLjeSM",
    })
    .then((currentToken) => {
      if (currentToken) {
      
        //sendTokenToServer(currentToken);
        //updateUIForPushEnabled(currentToken);
        console.log(currentToken);
        localStorage.setItem("key", currentToken);
        
      } else {
      
        // Show permission request.
        console.log(
          "No registration token available. Request permission to generate one."
        );

        // Show permission UI.
        //updateUIForPushPermissionRequired();
        requestNotificationPermission();
        //setTokenSentToServer(false);
      }
    })
    .catch((err) => {
      console.log("An error occurred while retrieving token. ", err);
      //showToken("Error retrieving registration token. ", err);
      //setTokenSentToServer(false);
    });
}

// Handle incoming messages. Called when:
// - a message is received while the app has focus
// - the user clicks on an app notification created by a service worker
// `messaging.setBackgroundMessageHandler` handler.

messaging.onMessage((payload) => {
  console.log("Message received. ", payload);
});


$('.tiny.modal')
  .modal({
    centered: false,
    observeChanges: true,
    transition: 'shake',
    closable: false,
    duration: 2000
  })
  .modal('show')
  .transition('set looping')
;


