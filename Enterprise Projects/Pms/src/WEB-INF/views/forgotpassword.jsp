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



            $("#forgettrigger").click(function() {


                var checkemail = document.getElementById('Emailtext').value;
                var email = checkemail;


                firebase.auth().sendPasswordResetEmail(email).then(function() {
                    window.alert("Password Resetted successfully please check your email");


                }).catch(function(error) {
                    // Handle Errors here.
                    var errorCode = error.code;
                    var errorMessage = error.message;
                    alert("blahhh");
                    // ...
                });
            });







        });
    </script>
    <!-- //Meta-Tags -->

    <!-- Custom-Styleheet-Links -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" type="text/css" media="all">
    <link rel="stylesheet" href="<c:url value="/resources/css/animate-custom.css" />" type="text/css" media="all">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- //Custom-Styleheet-Links -->

    <!-- Fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" type="text/css" media="all">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Montserrat:400,700" type="text/css" media="all">
    <!-- //Fonts -->

    <style>
        div#login {
            padding: 131px;
        }
    </style>

</head>
<!-- //Head -->



<!-- Body -->

<body>

    <!---728x90--->

    <h1 class="w3layouts agileits" style="color: azure;">Property Management System</h1>

    <!---728x90--->

    <div class="container w3layouts agileits">

        <div class="content-left w3layouts agileits">
            <!--<img src="images/background.jpg" alt="W3layouts Agileits">-->
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


                    <div id="wrapper">
                        <div id="login" class="animate w3layouts agileits form">
                            <h2 class="w3layouts agileits" style="color: cadetblue;">Forgot Password?</h2>
                            <p style="color: aliceblue">Please Enter your Email Address, We'll email instructions on how to reset your password.</p>
                            <form action="#" autocomplete="on" method="post">

                                <input type="text" Name="Userame" id="Emailtext" required="" placeholder="E-mail" value="">

                                <button type="button" id="forgettrigger" class="btn btn-primary active btn-block " style="max-width: 89%;">RESET</button>

                                <p class="change_link w3layouts agileits">
                                    Or else proceed to <a href="${pageContext.request.contextPath}" class="to_register">Sign-Up</a>
                                </p>
                                <div class="clear"></div>
                            </form>


                        </div>



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
