<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
<link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/components/icon.min.css'>
  <link href="<c:url value="/resources/assets/css/bootstrap.css" /> " rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="<c:url value="/resources/assets/css/font-awesome.css" />" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href=" <c:url value="/resources/assets/js/morris/morris-0.4.3.min.css" />" rel="stylesheet" />
    
        <!-- Custom Styles-->
    <link href="<c:url value="/resources/assets/css/custom-styles.css" /> " rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

<style>
    
    .ui[class*="top attached"].menu{
        margin-top: 0;
    }
    
    .ui.segment{
        
        margin: 0;
    }
    
    h1:last-child, h2:last-child, h3:last-child, h4:last-child, h5:last-child, p:last-child{
        
        
        margin-bottom: 30px;
    }
    
    .ui.menu{
        
        font-size: 14px;
    }
    
    .ui.button, .ui.buttons .button, .ui.buttons .or{
        
        font-size: 14px;
    }
    
    .pushable{
        
        height: auto;
    }
    
    .ui.segment{
        
        background-color: #fff;
    }
    
    .ui.inverted.menu{
        
        background:#db2828;
    }
    
    .ui.attached.menu:not(.tabular){
        
        background-color: #6435c9;
    }
    
    .ui.secondary.inverted.pointing.menu{
        
        border-width: 0px;
    }
    
    .ui.secondary.pointing.menu{
        
        border-bottom: 0px;
    }
    
    .ui.inverted.segment, .ui.primary.inverted.segment{
        
        background: rgba(34,36,38,.15);
    }
    
    .ui.vertical.icon.menu {
            width: 100px;
        }
    
    </style>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
 
  
   
    <!-- Bootstrap Js -->
    <script src="<c:url value="/resources/assets/js/bootstrap.min.js" />"></script>
    <!-- Metis Menu Js -->
    <script src="<c:url value="/resources/assets/js/jquery.metisMenu.js" />"></script>
    <!-- Morris Chart Js -->
    <script src="<c:url value="/resources/assets/js/morris/raphael-2.1.0.min.js" />"></script>
    <script src="<c:url value="/resources/assets/js/morris/morris.js" />"></script>
    <!-- Custom Js -->
    <script src="<c:url value="/resources/assets/js/custom-scripts.js" />"></script>




</head>
<body>



<div class="ui top attached demo menu inverted segment" >
  <a class="item iconitem" >
    <i class="sidebar icon"></i> Menu
  </a>
  
  <div class="ui inverted segment" >
  <div class="ui inverted secondary pointing menu" style="padding-right: 100px;" >
  
  
   <a class="item active" href="${pageContext.request.contextPath}/pms/dashboard" id="reserveid">
                    <b>Dashboard</b>
                </a>
  
 <a class="item " href="${pageContext.request.contextPath}/pms/reservation" id="reserveid">
                    <b>Reservations</b>
                </a>

                <a class="item " href="${pageContext.request.contextPath}/pms/checkin" id="checkinid">
                    <b> Check In</b>
                </a>
                <a class="item" href="${pageContext.request.contextPath}/pms/checkout" id="checkoutid">
                    <b>Check Out</b>
                </a>
                
                <a class="item" href="${pageContext.request.contextPath}/pms/roommgmt" id="checkoutid">
                    <b>Room Management</b>
                </a>
                
                 <%-- <a class="item" href="${pageContext.request.contextPath}/pms/customize" id="checkoutid">
                    <b>Customize</b>
                </a> --%>
    
    
     <div class="right menu" style="padding-left:670px;">
   
    
  
  </div>
    

    
  </div>
  
  
</div>
</div>


<div class="ui bottom attached segment" >
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
  <div class="pusher" >
    <div class="ui basic segment " >
     
      
                 <div id="page-inner">


                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header" style="color: white">
                            Dashboard 
                        </h1>
                    </div>
                </div>
                <!-- /. ROW  -->

                <div class="row">
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-green">
                            <div class="panel-body">
                                <i class="fa fa-bell  fa-5x"></i>
                                <h3>8,457</h3>
                            </div>
                            <div class="panel-footer back-footer-green">
                                Arrivals

                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-blue">
                            <div class="panel-body">
                                <i class="fa fa-sign-out fa-5x"></i>
                                <h3>52,160 </h3>
                            </div>
                            <div class="panel-footer back-footer-blue">
                                Departures

                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-red">
                            <div class="panel-body">
                                <i class="fa fa-home fa-5x"></i>
                                <h3>15,823 </h3>
                            </div>
                            <div class="panel-footer back-footer-red">
                                Rooms

                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-primary text-center no-boder bg-color-brown">
                            <div class="panel-body">
                                <i class="fa fa-suitcase fa-5x"></i>
                                <h3>36,752 </h3>
                            </div>
                            <div class="panel-footer back-footer-brown">
                               Check In

                            </div>
                        </div>
                    </div>
                </div>


                <div class="row" id="particles-js">


                  
                    <div class="col-md-9 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Bar Chart Example
                            </div>
                            <div class="panel-body">
                                <div id="morris-bar-chart"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Donut Chart Example
                            </div>
                            <div class="panel-body">
                                <div id="morris-donut-chart"></div>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /. ROW  -->

                <div class="row">
                    <div class="col-md-4 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Tasks Panel
                            </div>
                            <div class="panel-body">
                                <div class="list-group">

                                    <a href="#" class="list-group-item">
                                        <span class="badge">7 minutes ago</span>
                                        <i class="fa fa-fw fa-comment"></i> Commented on a post
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">16 minutes ago</span>
                                        <i class="fa fa-fw fa-truck"></i> Order 392 shipped
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">36 minutes ago</span>
                                        <i class="fa fa-fw fa-globe"></i> Invoice 653 has paid
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">1 hour ago</span>
                                        <i class="fa fa-fw fa-user"></i> A new user has been added
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">1.23 hour ago</span>
                                        <i class="fa fa-fw fa-user"></i> A new user has added
                                    </a>
                                    <a href="#" class="list-group-item">
                                        <span class="badge">yesterday</span>
                                        <i class="fa fa-fw fa-globe"></i> Saved the world
                                    </a>
                                </div>
                                <div class="text-right">
                                    <a href="#">More Tasks <i class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="col-md-8 col-sm-12 col-xs-12">

                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Responsive Table Example
                            </div> 
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>S No.</th>
                                                <th>First Name</th>
                                                <th>Last Name</th>
                                                <th>User Name</th>
                                                <th>Email ID.</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>John</td>
                                                <td>Doe</td>
                                                <td>John15482</td>
                                                <td>name@site.com</td>
                                            </tr>
                                            <tr>
                                                <td>2</td>
                                                <td>Kimsila</td>
                                                <td>Marriye</td>
                                                <td>Kim1425</td>
                                                <td>name@site.com</td>
                                            </tr>
                                            <tr>
                                                <td>3</td>
                                                <td>Rossye</td>
                                                <td>Nermal</td>
                                                <td>Rossy1245</td>
                                                <td>name@site.com</td>
                                            </tr>
                                            <tr>
                                                <td>4</td>
                                                <td>Richard</td>
                                                <td>Orieal</td>
                                                <td>Rich5685</td>
                                                <td>name@site.com</td>
                                            </tr>
                                            <tr>
                                                <td>5</td>
                                                <td>Jacob</td>
                                                <td>Hielsar</td>
                                                <td>Jac4587</td>
                                                <td>name@site.com</td>
                                            </tr>
                                            <tr>
                                                <td>6</td>
                                                <td>Wrapel</td>
                                                <td>Dere</td>
                                                <td>Wrap4585</td>
                                                <td>name@site.com</td>
                                            </tr>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <!-- /. ROW  -->
				<footer><p>All right reserved. by: <a href="http://webthemez.com/">Thivanka Wijesooriya</a></p></footer>
            </div>
      
      
      
      
      
      
    </div>
  </div>
</div>


  <script>

      
      $('.ui.sidebar').sidebar({
    context: $('.bottom.segment')
  })
  .sidebar('attach events', '.menu .iconitem');
      
      
       $('.ui .item').on('click', function() {
        $('.ui .item').removeClass('active');
        $(this).addClass('active');
    });
      
    
      particlesJS.load('particles-js', 'assets/particles.json', function() {
  console.log('loaded particle');
});
      
      
      
  </script>


</body>
</html>