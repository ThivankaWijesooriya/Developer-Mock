<!-- index.html -->
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
    <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/components/icon.min.css'>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">

    <!-- FontAwesome Styles-->
    <link href="<c:url value="/resources/assets/css/font-awesome.css"/>" rel="stylesheet" />


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
        /*.ui.selection.dropdown {
            padding: 0px;
        }*/
        
        .ui.vertical.icon.menu {
            width: 100px;
        }
        
        .ui.inverted.icon.menu .item {
            color: lawngreen;
        }
        
    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>








</head>

<body>



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

                <a class="item active" href="${pageContext.request.contextPath}/pms/checkin" id="checkinid">
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
                





            </div>


        </div>
    </div>


    <div class="ui bottom attached segment">
        <div class="ui inverted labeled icon left inline vertical demo sidebar  menu">
                    <a class="item" href="${pageContext.request.contextPath}/pms/checkin">
                <i class="home icon"></i> Home
            </a>
            <%-- <a class="item" href="${pageContext.request.contextPath}/pms/events">
                <i class="block layout icon"></i> Events
            </a>
            <a class="item" href="${pageContext.request.contextPath}/pms/reports">
                <i class="book icon"></i> Report
            </a> --%>
            <a class="item" href="${pageContext.request.contextPath}/pms/interact">
                <i class="smile icon"></i> Interact
            </a>
        </div>
        <div class="pusher">
            <div class="ui basic segment ">

                <div class="ui grid" style="margin-top: 1%;">


                    <div class="row">
                        <div class="sixteen wide column">

                            <h1 style="color: blueviolet;">Check-In Details</h1>
                        </div>
                    </div>

                    <div class="row">


                        <div class="six wide column">

                            <!--  <div class="ui primary button addpartnerbtnnn" id="triggeraddreserve"><i class="fa fa-plus" aria-hidden="true"></i> &nbsp;Add Reservation
                            </div>-->





                        </div>
                        <div class="four wide column"></div>
                        <div class="six wide column" style="text-align: right;">


                            <div class="ui action input">
                                <input type="text" placeholder="Search " id="searchkey" value=""> <select class="ui compact selection dropdown searchoption">


					<option value="Partner_Name">Partner Name</option>
					<option value="Country">Country</option>

				</select>
                                <div type="submit" class="ui button" id="searchtrigger">Search</div>
                            </div>




                        </div>
                    </div>

                    <div class="row">


                        <div class="sixteen wide column">

                            <table class="ui single line table" id="tblcheckin"></table>


                        </div>

                    </div>



                </div>


              

                <footer>
                    <p>All right reserved. by: <a href="http://webthemez.com/">Thivanka Wijesooriya</a></p>
                </footer>

            </div>
        </div>
    </div>


    <div class="ui modal Checkinmodal">
        <div class="header">Room Assignment</div>

        <div class="content">


            <div class="ui form">


                
                
                <div class="two fields">

                    <div class="field">
                        <label>Front Office Status</label>
                        	<select class="ui dropdown fo" >
  			  <option value="">Select Status</option>
  			  <option>Vacant</option>
  			  <option>Occupied</option>
  			</select>
                    </div>
                    <div class="field">
                        <label>HK Status</label>
                        	<select class="ui dropdown hk" >
  			  <option value="">Select Status</option>
  			  <option value="0">Clean</option>
  			  <option value="1">Dirty</option>
  			  <option value="2">Out of Order</option>
  			  <option value="3">Out of Service</option>
  			</select>
                    </div>


                </div>
                
           <div class="two fields">

                    <div class="field">
                        <label>Reservation Status</label>
                        	<select class="ui dropdown rev" >
  			  <option value="">Select Status</option>
  			  <option value="1">Reserved</option>
  			  <option value="0">Not Reserved</option>
  			</select>
                    </div>
                    <div class="field">
                        <label>Room Type</label>
                        	<select class="ui dropdown rt" >
  			  <option value="">Select Status</option>
  			  <option value="1">Deluxe Suite</option>
  			  <option value="0">Executive Suite</option>
  			  <option value="2">Presidential Suite</option>
  			</select>
                    </div>


                </div>



<div class="two fields">

                    <div class="field">
                    
                    <div class="ui primary button fluid" id="testme">
  Save
</div>
       
                    </div>
                    <div class="field">
                    
                    <div class="ui button fluid">
  Discard
</div>
      
                    </div>


                </div>

         





            </div>



        </div>
    </div>
    
    
        <div class="ui modal testmodal">
        <div class="header">Check In</div>

        <div class="content">


            <div class="ui form">

  
                    
                <div class="two fields">

                    <div class="field">
                        <label>First Name</label>
                        <input type="text" name="first-name" placeholder="First Name" id="Fname">
                    </div>
                    <div class="field">
                        <label>Last Name</label>
                        <input type="text" name="last-name" placeholder="Last Name" id="Lname">
                    </div>


                </div>
                
                  <div class="field">
                        <label>Search Room</label>
                        <div class="ui loading fluid single search selection roomdrop dropdown">
  <input type="hidden" name="country" value="kp">
  <i class="dropdown icon"></i>
  <input class="search Room">
  <div class="default text">Search...</div>
  <div class="menu" id="targetroominfo">
    
  </div>
</div>
                    </div>
                  
   <div class="two fields">

                    <div class="field">
                        
                        <div class="ui primary button fluid" id="checkinpost">
  Check In
</div>
                        
                    </div>
                    <div class="field">
                        
                      <div class="ui button fluid" id="discardcheck">
  Cancel
</div>  
                        
                    </div>


                </div>








            </div>



        </div>
    </div>





    <script src="https://www.gstatic.com/firebasejs/4.6.2/firebase.js"></script>
    <script>
        var config = {

            apiKey: "AIzaSyCHVZ65egswhlQXbdkWHAROLMc0gPWV57k",
            authDomain: "hoteldb - 187318. firebaseapp.com",
            databaseURL: "https://hoteldb-187318.firebaseio.com",

        };
        firebase.initializeApp(config);



        /*    $("#tester").click(function() {

                var firebaseRef = firebase.database().ref();
                firebaseRef.child("Text").set("somevalue");
            });*/

        /*************** Initial side and navbar js *******************/

        $('.ui.sidebar').sidebar({
                context: $('.bottom.segment')
            })
            .sidebar('attach events', '.menu .iconitem');


        

        /******************** Initial side and navbar js ***************/




        $(document).ready(function() {


            $('#tblcheckin').DataTable({

                "paging": true,
                "ordering": false,
                "info": false,
                "search": false,


                columns: [{
                        title: ""
                    },
                    {
                        title: "keys"
                    },

                    {
                        title: "Name"
                    },
                    {
                        title: "Status"
                    },
                    
                    {
                        title: "RoomNumber"
                    },

                    {
                        title: "Arrival"
                    },

                    {
                        title: "Departure"
                    },

                    {
                        title: "Action"
                    }


                ]



            });

            $('#tblcheckin_filter').hide();





     


            var reserve = JSON.parse('${reservedetails}');
            
            $.each(reserve, function(key5, value5){
            	
            	$.each(value5, function(key6, value6){
            		
            	    var checkbox="";
                	checkbox += "<td>";
                	checkbox += "";
                	checkbox += "							<div class=\"ui checkbox\">";
                	checkbox += "								<input type=\"checkbox\" name=\"example\"> <label><\/label>";
                	checkbox += "							<\/div>";
                	checkbox += "";
                	checkbox += "						<\/td>"; 
                	
                	
                	var multiaction="";
                	multiaction += "		            <div class=\"ui teal buttons\">";
                	multiaction += "                <div class=\"ui button checkin\">Check In <\/div>";
                	multiaction += "                <div class=\"ui floating dropdown icon button\">";
                	multiaction += "                    <i class=\"dropdown icon\"><\/i>";
                	multiaction += "                    <div class=\"menu\">";
                	multiaction += "";
                	multiaction += "                        <div class=\"item viewreserve\"><i class=\"delete icon\"><\/i> Modify<\/div>";
                	multiaction += "                        <div class=\"item viewreserve\"><i class=\"delete icon\"><\/i> View<\/div>";
                	multiaction += "";
                	multiaction += "                    <\/div>";
                	multiaction += "                <\/div>";
                	multiaction += "            <\/div>";
                	multiaction += "					";
                	
                	
                	var fname = value6.FirstName;
                	var sname = value6.LastName;
                	
                    var name = fname.concat("&nbsp;"+sname);
            		
            $('#tblcheckin').DataTable().row.add([checkbox,key5,name,value6.Status,value6.RoomNumber,value6.Arrival,value6.Departure,multiaction]).draw(); 
            		
            	});
	
            });

            
            
            
        var fostat="";
        var hkstat="";
        var revstat="";
        var rtstat="";  
        var reservenum;
        
        
        
        
        $(".checkin").click(function() {

            	
            	$('.Checkinmodal')
                .modal('show');
            	
            
            	
         
            	var table = $('#tblcheckin').DataTable();
				 
  				$('#tblcheckin tbody').on( 'click', 'tr', function (){
  					
  					reservenum  = ( table.row( this ).data()[1] );
  					
  					var reserve = JSON.parse('${reservedetails}');
  					
  					 $.each(reserve, function(key7, value7){
  						 
  						 if(reservenum==key7){
  							 
  							$.each(value7, function(key8, value8){
  								
  								var fname = value8.FirstName;
  								var lname = value8.LastName;
  								
  								$('#Fname').val(fname);
  								$('#Lname').val(lname);
  								
  							});
  						 }
  						 
  					 });
  					
  					
  				});
  				
  				
  				$( ".ui.dropdown.fo" ).change(function() {
  					
  					
  				  
  		        	fostat =$('.ui.dropdown.fo').dropdown('get text');
  		        	console.log("firstmodal fostat"+fostat);
  					
  					
  				});
  									
  					
  					$( ".ui.dropdown.hk" ).change(function() {
  						
  						
  						
  						hkstat =$('.ui.dropdown.hk').dropdown('get text');
  						console.log(hkstat);
  						
  					  
  					});
  					
  					$( ".ui.dropdown.rev" ).change(function() {
  						
  						
  						
  						revstat =$('.ui.dropdown.rev').dropdown('get text');
  					  
  					});
  					
  					$( ".ui.dropdown.rt" ).change(function() {
  						
  						
  						
  						rtstat =$('.ui.dropdown.rt').dropdown('get text');
  					  
  					});

  					console.log("firstmodal fostat latter"+fostat);
            });
        
        console.log("global fostat"+fostat);
        
        
        
        var list="";
        var FName="";
        var firstkey="";
        var secondkey="";
        $("#testme").click(function(){
           $('.ui.modal.testmodal').modal('show');
           
           FName = $('#Fname').val().trim();
           
           
           var roomDetail = JSON.parse('${roomdetails}');
           
           $.each(roomDetail, function(key9, value9){
        	   
        	   $.each(value9, function(key10, value10){
        		   
        		   
        		   
        		   $.each(value10, function(key11, value11){
        			   
        			 
        			   
        			   
        			   
        			   if(((fostat==value11.FOstat)&&(hkstat==value11.RoomStat))&&((revstat==value11.Rstat)&&(rtstat==value11.RoomType))){
        				   
        				  
        				   
        				   
        				   list = list +("<div class=\"item\">"+key11+"<\/div>");
        				   
        							
        				   
        			   }
        			   
        		   });
        		   
        		   
        	   });
        	   
        	   
           });
           
           $("#targetroominfo").empty().append(list);
           
           
           var reserve = JSON.parse('${reservedetails}');
           
           $.each(reserve, function(key12, value12){
        	   
        	   $.each(value12, function(key13, value13){
        		   
        		    if(FName==value13.FirstName){
				   
				    firstkey = key12;
				    secondkey = key13;
			   } 
        		   
        		   
        	   });
        	   
           });
           
           
           
        });
            
        
        
        var roomkey1="";
        var roomkey2="";
        $("#checkinpost").click(function(){
            
        	
        	
			var roomnum = $('.roomdrop').dropdown('get text');
			 var roomtype = $('.rt').dropdown('get text'); 
			 
			 var roomDetail = JSON.parse('${roomdetails}');
			 
			 $.each(roomDetail, function(key15, value15){
				 
				 $.each(value15, function(key16, value16){
					 
					 $.each(value16, function(key17, value17){
						 
						 if(roomnum==key17){
							 
							 roomkey1 = key15;
							 roomkey2 = key16;
						 }
						 
					 });
					 
				 });
				 
			 });
        	
			 var data = {
						
						"RoomNumber" : roomnum,
						"RoomType" : roomtype,
						"Status" : "Checked In"
						
					

					};
			 
			 var data22 ={
					 
					"FOstat":"Occupied" 
					 
					 
			 };
			 
			 data = JSON.stringify(data);
			 data22 = JSON.stringify(data22);
			 
				$.ajax({
					type : "POST",
					accept : "text/html",
					//contentType: "application/json; charset=utf-8",
					dataType : "html",
					url : "${pageContext.request.contextPath}/pms/checkin/add",
					
					data : ({
						"data" : data,"key1":firstkey,"key2":secondkey,"data22":data22,"roomkey1":roomkey1,"roomkey2":roomkey2,"roomnumber":roomnum

					}),
					
					  success: function(){
						  
						  location.reload(true);
						  
					}
					
				});
			 
			 
        	
        	
        });
        
     $("#discardcheck").click(function(){
            
        	
        	
    	 location.reload(true);
        	
        	
        	
        	
        });
       

        
        
        
        
        
        
            
            $('.ui.dropdown')
                .dropdown();


        });
    </script>


</body>

</html>
