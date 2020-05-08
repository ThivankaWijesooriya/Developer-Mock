<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>



<html>


<head>

    <title>Generalized PMS system</title>

    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="icon" href="<c:url value="/resources/images/hash.png" />" type="image/gif" sizes="16x16">
    <script src="https://code.jquery.com/jquery-3.2.1.js" integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" crossorigin="anonymous"></script>
    <script src="https://www.gstatic.com/firebasejs/4.6.2/firebase.js"></script>

    <script type="application/x-javascript">
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }

        var config = {

            apiKey: "AIzaSyCHVZ65egswhlQXbdkWHAROLMc0gPWV57k",
            authDomain: "hoteldb - 187318. firebaseapp.com",
            databaseURL: "https://hoteldb-187318.firebaseio.com",

        };
        firebase.initializeApp(config);




        $(document).ready(function() {
            $("#triggersignup").click(function() {


                var se = document.getElementById('SignupEmail').value;
                var sp = document.getElementById('SignupPassword').value;

                var sem = se;
                var spass = sp;

                firebase.auth().createUserWithEmailAndPassword(sem, spass)
                    .then(function() {
                        window.alert("Login Successful");
                       

                    }).catch(function(error) {
                        // Handle Errors here.
                        var errorCode = error.code;
                        var errorMessage = error.message;
                        if (errorCode == 'auth/weak-password') {
                            alert('The password is too weak.');
                        } else {
                            alert(errorMessage);
                        }
                        console.log(error);
                    });

                return false;

            });


            $("#triggersignin").click(function() {


                var e = document.getElementById('signinemail').value;
                var p = document.getElementById('signinpassword').value;

                var email = e;
                var password = p;
                firebase.auth().signInWithEmailAndPassword(email,
                    password).then(function() {
                    
                    	 window.location.href = "${pageContext.request.contextPath}/pms/dashboard";

                }).catch(function(error) {

                    window.alert("Invalid password or Email");
                });

                return false;
            });



        });

    </script>
    <!-- //Meta-Tags -->

    <!-- Custom-Styleheet-Links -->
     <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
      <link href="<c:url value="/resources/css/animate-custom.css" />" rel="stylesheet">
   
    <!-- //Custom-Styleheet-Links -->

    <!-- Fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" type="text/css" media="all">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Montserrat:400,700" type="text/css" media="all">
    <!-- //Fonts -->


    <style>
        div#register {
            padding: 57px;
        }

    </style>
</head>
<!-- //Head -->



<!-- Body -->

<body>

    <!---728x90--->

    <h1 class="w3layouts agileits">Property Management System</h1>

    <!---728x90--->

    <div class="container w3layouts agileits">

        <div class="content-left w3layouts agileits">
            
            <img src="<c:url value="/resources/images/frontback.png" />" alt="W3layouts Agileits">
            <!--<p>Plan your next dream trip. Select your destination and leave the rest to us.</p>-->

            <div class="list w3layouts agileits">
                <ul class="w3layouts agileits">

                </ul>
            </div>
        </div>

        <div class="content-right w3layouts agileits">
            <section>
                <div id="container_demo">
                    <a class="hiddenanchor w3layouts agileits" id="tologin"></a>
                    <a class="hiddenanchor w3layouts agileits" id="toregister"></a>

                    <div id="wrapper">
                        <div id="login" class="animate w3layouts agileits form">
                            <h2 class="w3layouts agileits">Sign In</h2>
                            <form action="#" autocomplete="on" method="post">
                                <label>E-mail</label>
                                <input type="text" Name="Userame" required="" id="signinemail" value="">
                                <label>Password</label>
                                <input type="password" Name="Password" required="" id="signinpassword" value="">
                                <div class="send-button w3layouts agileits">
                                    <p><a href="${pageContext.request.contextPath}/pms/forgotpass">Forgot Password?</a></p>
                                    <form>
                                        <input type="submit" value="SIGN IN" id="triggersignin">
                                    </form>
                                    <div class="clear"></div>
                                </div>
                                <p class="change_link w3layouts agileits">
                                    Don't have an account? <a href="#toregister" class="to_register">Sign Up!</a>
                                </p>
                                <div class="clear"></div>
                            </form>
                            <div class="social-icons w3layouts agileits">
                                <p>OR USE YOUR SOCIAL ACCOUNTS</p>
                                <ul>
                                    <li class="fb w3ls w3layouts agileits"><a href="https://www.facebook.com/hashrecursiveofficial/" target="_blank"><span class="icons w3layouts agileits"></span><span class="text w3layouts agileits">Facebook</span></a></li>
                                    <li class="twt w3ls w3layouts agileits"><a href="https://twitter.com/HashRecursive" target="_blank"><span class="icons w3layouts agileits"></span><span class="text w3layouts agileits">Twitter</span></a></li>
                                    <div class="clear"></div>
                                </ul>
                            </div>
                            <div class="clear"></div>
                        </div>
                        <div id="register" class="animate w3layouts agileits form">
                            <h2>Sign up</h2>
                            <form action="#" autocomplete="on" method="post">
                                <form action="#" method="post">
                                    <label>Name</label>
                                    <input type="text" class="name w3layouts agileits" Name="Name" required="">
                                    <label>Phone Number</label>
                                    <input type="text" class="phone w3layouts agileits" Name="Phone Number" required="">
                                    <label>E-mail</label>
                                    <input type="text" Name="Email" required="" id="SignupEmail" value="">
                                    <label>Password</label>
                                    <input type="password" Name="Password" required="" id="SignupPassword" value="">
                                    <div class="send-button w3layouts agileits">
                                        <form action="#" method="post">
                                            <input type="submit" value="SIGN UP" id="triggersignup">
                                        </form>
                                    </div>
                                </form>
                                <p class="change_link w3layouts agileits">
                                    Already a member? <a href="#tologin" class="to_register">Sign In</a>
                                </p>
                                <div class="clear"></div>
                            </form>
                        </div>
                        <div class="clear"></div>






                    </div>
                </div>
            </section>
        </div>
        <div class="clear"></div>

    </div>

    <div class="footer w3layouts agileits">
        <p> &copy; 2017 Hotel Management System. All Rights Reserved | by <a href="https://www.facebook.com/thivanka.wijesooriya" target="_blank">Thivanka Wijesooriya <span style="color: crimson;">(Hash Recursive) </span></a></p>
    </div>



</body>




</html>
