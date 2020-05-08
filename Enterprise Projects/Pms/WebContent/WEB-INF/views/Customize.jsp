<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
    <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/components/icon.min.css'>

    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />


    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

    <style>
        .ui[class*="top attached"].menu {
            margin-top: 0;
        }
        
        .ui.segment {
            margin: 0;
        }
        
        .pushable {
            height: inherit;
        }
        
        .ui.segment {
            background-color: ghostwhite;
        }
        
        .ui.inverted.menu {
            background: #db2828;
        }
        
        .ui.attached.menu:not(.tabular) {
            background-color: #6435c9;
        }
        
        .ui.secondary.inverted.pointing.menu {
            border-width: 0px;
        }
        
        .ui.secondary.pointing.menu {
            border-bottom: 0px;
        }
        
        .ui.inverted.segment,
        .ui.primary.inverted.segment {
            background: rgba(34, 36, 38, .15);
        }
        
        .ui.selection.dropdown {
            padding: 0px;
        }
        
        .ui.vertical.icon.menu {
            width: 100px;
        }

    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>








</head>

<body >



    <div class="ui top attached demo menu inverted segment">
        <a class="item iconitem">
            <i class="sidebar icon"></i> Menu
        </a>

        <div class="ui inverted segment">
            <div class="ui inverted secondary pointing menu" style="padding-right:800px;">
                <a class="item" href="${pageContext.request.contextPath}/pms/dashboard" id="reserveid">
                    <b>Dashboard</b>
                </a>
                <a class="item" href="${pageContext.request.contextPath}/pms/reservation" id="reserveid">
                    <b>Reservations</b>
                </a>

                <a class="item " href="${pageContext.request.contextPath}/pms/checkin" id="checkinid">
                    <b> Check In</b>
                </a>
                <a class="item" href="${pageContext.request.contextPath}/pms/checkout" id="checkoutid">
                    <b>Check Out</b>
                </a>
                
                <a class="item " href="${pageContext.request.contextPath}/pms/roommgmt" id="checkoutid">
                    <b>Room Management</b>
                </a>
                
                <a class="item active" href="${pageContext.request.contextPath}/pms/customize" id="checkoutid">
                    <b>Customize</b>
                </a>





            </div>


        </div>
    </div>


    <div class="ui bottom attached segment">
        <div class="ui inverted labeled icon left inline vertical demo sidebar  menu">
            <a class="item">
                <i class="home icon"></i> Home
            </a>
            <a class="item">
                <i class="block layout icon"></i> Topics
            </a>
            <a class="item">
                <i class="smile icon"></i> Friends
            </a>
            <a class="item">
                <i class="calendar icon"></i> History
            </a>
        </div>
        <div class="pusher" style="background-color: cadetblue;">
            <div class="ui basic segment ">



                  <div class="ui grid" >






        <div class="row">

            <div class="one wide column"></div>

            <div class="fourteen wide column"> </div>


            <div class="one wide column"></div>

        </div>

         
        <div class="row">
          

            <div class="one wide column"></div>
              
             
            <div class="fourteen wide column">

                  <br> <br> <br> <br> 
                <div class="ui styled accordion fluid">
                    <div class="active title">
                        <i class="dropdown icon"></i> Customize Theme
                    </div>
                    <div class="active content">
                        
                        <div class="ui form">
                            
                            
                            
                            

                                
                                 <div class="field">
                                    
                                     <label for="">Sidebar Colour</label>
                                     
                                     <select class="ui dropdown">
  <option value="">Colour</option>
  <option value="1">Red</option>
  <option value="0">Blue</option>
</select>
                                     
                                 </div>
                                 
                                 
                                 
                                                                  <div class="field">
                                    
                                     <label for="">Menubar Colour</label>
                                     
                                     <select class="ui dropdown">
  <option value="">Colour</option>
  <option value="1">Red</option>
  <option value="0">Blue</option>
</select>
                                     
                                 </div>
                           
                           
                            
                            
                        </div>
                        
                        
                    </div>
                    <div class="title">
                        <i class="dropdown icon"></i> Customize DashBoard
                    </div>
                    <div class="content">
                       
                       <div class="ui form">
                           
                           
                           
                       </div>
                       
                       
                    </div>
                    <div class="title">
                        <i class="dropdown icon"></i> Language Preference
                    </div>
                    <div class="content">
                       
                       <div class="ui form">
                           
                           
                           
                           
                           
                       </div>
                       
                    </div>
                </div>


            </div>


            <div class="one wide column"></div>


        </div>






    </div>





                <!--<footer>
                    <p>All right reserved. by: <a href="http://webthemez.com/">Thivanka Wijesooriya</a></p>
                </footer>-->

            </div>
        </div>
    </div>





   
    <script>
      


       

        $('.ui.sidebar').sidebar({
                context: $('.bottom.segment')
            })
            .sidebar('attach events', '.menu .iconitem');


       $('.ui.accordion')
  .accordion()
;

        /******************** Initial side and navbar js ***************/

        

    </script>


</body>

</html>
