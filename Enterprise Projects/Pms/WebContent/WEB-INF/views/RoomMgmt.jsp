<!-- index.html -->
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
    <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/components/icon.min.css'>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.5.0/css/buttons.dataTables.min.css">
    

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
            background: black;
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
        .ui.selection.dropdown{
        
        min-width:5em;
        min-height:0cm;
        
        
        }
        
        .ui.vertical.icon.menu {
            width: 100px;
        }
        
        .ui.inverted.icon.menu .item {
            color: lawngreen;
        }
        
        .ui.labeled.icon.button, .ui.labeled.icon.buttons .button{
        
       padding-left:1em!important;
       width:-webkit-fill-available;
        
        }
        
        button.dt-button, div.dt-button, a.dt-button{
        
        background-color:#2185d0;
        color:#fff;
        font-size:1rem;
        background-image:none;
        width:100px;
        
        }
        
       button.dt-button:hover:not(.disabled), div.dt-button:hover:not(.disabled), a.dt-button:hover:not(.disabled){
         background-color:#2185d0;
       
       }
        
    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.0/js/dataTables.buttons.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.0/js/buttons.print.min.js"></script>








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

                <a class="item " href="${pageContext.request.contextPath}/pms/checkin" id="checkinid">
                    <b> Check In</b>
                </a>
                <a class="item" href="${pageContext.request.contextPath}/pms/checkout" id="checkoutid">
                    <b>Check Out</b>
                </a>
                
                <a class="item active" href="${pageContext.request.contextPath}/pms/roommgmt" id="checkoutid">
                    <b>Room Management</b>
                </a>
                
               <%--  <a class="item" href="${pageContext.request.contextPath}/pms/customize" id="checkoutid">
                    <b>Customize</b>
                </a> --%>
                





            </div>


        </div>
    </div>


    <div class="ui bottom attached segment">
        <div class="ui inverted labeled icon left inline vertical demo sidebar  menu">
            <a class="item">
                <i class="home icon"></i> Home
            </a>
     <!--        <a class="item">
                <i class="block layout icon"></i> Events
            </a>
            <a class="item">
                <i class="smile icon"></i> Report
            </a>
            <a class="item">
                <i class="calendar icon"></i> Log
            </a> -->
        </div>
        <div class="pusher">
            <div class="ui basic segment ">

                <div class="ui grid" style="margin-top: 1%;">


                    <div class="row">
                        <div class="sixteen wide column">

                            <h1 style="color: blueviolet;">Room Management</h1>
                        </div>
                    </div>

                    <div class="row">


                        <div class="six wide column">

                  

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

                            <table class="ui single line table" id="tblrooms"></table>


                        </div>

                    </div>
                    
                     <div class="row">
                        <div class="sixteen wide column">

                            <h1 style="color: blueviolet;">Room Status Information</h1>
                        </div>
                    </div>
                    
                    
                                   <div class="row">


                        <div class="six wide column">

                      

                       

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

                            <table class="ui single line table" id="tblroomsUpdate"></table>


                        </div>
                        

                    </div>
                    
                    
               

                   
                </div>

                   <br> <br>
                    <div>
                    <a class="ui green label">Clean</a>
                    <a class="ui red label">Dirty</a>
                    <a class="ui grey label">Out of Order</a>
                    <a class="ui blue label">Out of Service</a>
                    
                    
                    
                    </div> 

                <br>

                <footer>
                    <p>All right reserved. by: <a href="http://webthemez.com/">Thivanka Wijesooriya</a></p>
                </footer>

            </div>
        </div>
    </div>








    
    <script>
        

      


        $(document).ready(function() {

        	
        	  $('.ui.sidebar').sidebar({
                  context: $('.bottom.segment')
              })
              .sidebar('attach events', '.menu .iconitem');

            $('#tblrooms').DataTable({

                "paging": true,
                "ordering": false,
                "info": false,
                "search": false,
                "responsive": true,


                columns: [
                    {
                        title: "Room"
                    },

                    {
                        title: "RoomType"
                    },
                    {
                        title: "RoomStatus"
                    },

                    {
                        title: "FO Status"
                    },

                    {
                        title: "Reservation Status"
                    },

                    {
                        title: "Features"
                    },
                    
                    {
                        title: "Action"
                    }


                ]



            });

            $('#tblrooms_filter').hide();
            
            $('#tblroomsUpdate').DataTable({

                "paging": false,
                "ordering": false,
                "info": false,
                "search": false,
                


                columns: [
                    {
                        title: "Room"
                    },

                    {
                        title: "RoomType"
                    },
                    {
                        title: "RoomStatus"
                    },

                    {
                        title: "FO Status"
                    },

                    {
                        title: "Reservation Status"
                    },
                    
                    {
                        title: "Action"
                    }


                ]



            });

            $('#tblroomsUpdate_filter').hide();
            
            
            
            

            localStorage.setItem("RoomCount",5);
            
            var Rstat;
            var FOstat;
            var Roomstat;
            var Roomtype;
            
            
           
            	
            	if (localStorage.getItem("RoomCount") != null) {
            		



            		var chkbx="";
            		chkbx += "<select class=\"ui dropdown roomstat\">";
            		chkbx += "  <option >Clean<\/option>";
            		chkbx += "  <option >Dirty<\/option>";
            		chkbx += "  <option >Out of Order<\/option>";
            		chkbx += "  <option >Out of Service<\/option>";
            		chkbx += "<\/select>";
            		
        




            		
            		var strVar1="";
            		strVar1 += "<select class=\"ui dropdown roomtype\">";
            		strVar1 += "  <option >Deluxe Suite<\/option>";
            		strVar1 += "  <option >Executive Suite<\/option>";
            		strVar1 += "  <option >Presidential Suite<\/option>";
            		strVar1 += "<\/select>";



            		
            		var strVar2="";
            		strVar2 += "<select class=\"ui dropdown fostat\">";
            		strVar2 += "  <option >Vacant<\/option>";
            		strVar2 += "  <option >Occupied<\/option>";
            		strVar2 += "  ";
            		strVar2 += "<\/select>";



            		var strVar3="";
            		strVar3 += "<select class=\"ui dropdown rstat\">";
            		strVar3 += "  <option >Reserved<\/option>";
            		strVar3 += "  <option >Not Reserved<\/option>";
            		strVar3 += "  ";
            		strVar3 += "<\/select>";

            
            		
            		var tester="";
            		tester += "<button class=\"ui primary button triggerroom\">";
            		tester += "  Save";
            		tester += "<\/button>";

            		
            		var count= localStorage.getItem("RoomCount");
            		
            		
            		
            		for (i = 0; i < count; i++) { 
                		
                		$('#tblrooms').DataTable().row.add(["Room"+(i+1)+"",strVar1,chkbx,strVar2,strVar3,"good",tester]).draw(); 
                	   
                	}
            		
            		 
            		}
            	
            	else{
            		
            		console.log("do nothing");
            	}
            	


            
       $(".roomtype").on("change", function(){
                    
                   
                	
                   Roomtype = $(this).val();
                    
                    
                 
  
                   
                });
                
                
       $(".roomstat").on("change", function(){
                    
                   
                	
                    Roomstat = $(this).val();
                    
                    
          
  
                   
                });
            
            
               
                
                $(".fostat").on("change", function(){
                    
                   
                	
                   FOstat = $(this).val();
                    

  
                   
                });
                
                
                
                $(".rstat").on("change", function(){
                    
                   
                	
                   Rstat = $(this).val();
                    

  
                   
                });
            	
            	
            	 $('.ui.dropdown')
                 .dropdown();
            	
 
            
             $(".triggerroom").click(function(){
            	
            var Room="";
           	 var table = $('#tblrooms').DataTable();
				 
				$('#tblrooms tbody').on( 'click', 'tr', function () {
				  roomnum= ( table.row( this ).data()[0] );

				    Room = roomnum;
				    console.log(roomnum);
				    
				    
		           	var data = {
							
						    [Room] : {
						    	
						    	"RoomType":Roomtype,
						    	"RoomStat":Roomstat,
						    	"FOstat":FOstat,
						    	"Rstat":Rstat
						    	
						    }

						};
		           	
		   			data = JSON.stringify(data);
					
			
					console.log(data);

						
							$.ajax({
								type : "POST",
								accept : "text/html",
								//contentType: "application/json; charset=utf-8",
								dataType : "html",
								url : "${pageContext.request.contextPath}/pms/roommgmt/add",
								
								data : ({
									"data" : data

								}),
								
								  success: function(){
									  
									  alert("Data saved");
									  location.reload(true);
									  
								}
								
							}); 	
		           		           	
				   
				    
				});
               
	
            	
            }); 
            	
            
             var roomDetail = JSON.parse('${roomdetails}');
             
             $.each(roomDetail, function(key, value1){
            	 
            	 $.each(value1, function(key2, value2){
            		 
            		 $.each(value2, function(key3, value3){
            			 
            			 var statflag="";
            			 if(value3.RoomStat=="Clean"){
            				 
            				 
            				 statflag += " <a class=\"ui green label\">Clean<\/a>";
            				 
            			 }
            			 
            		
            			 
            			 else if(value3.RoomStat=="Dirty"){
            				 
            				
            				 statflag += " <a class=\"ui red label\">Dirty<\/a>";
            				 
            			 }
            			 
            			 else if(value3.RoomStat=="Out of Order"){
            				
            				
            				 statflag += " <a class=\"ui grey label\">Out of Order<\/a>";
            				 
            			 }
            			 
            			 else if(value3.RoomStat=="Out of Service"){
             				
             				
            				
            				 statflag += "<a class=\"ui blue label\">Out of Service<\/a>";
            				 
            			 }
            			 
            			 
            			 var roomaction="";
            			 roomaction += "<div class=\"ui teal buttons\">";
            			 roomaction += "  <div class=\"ui button\">Clean<\/div>";
            			 roomaction += "  <div class=\"ui floating dropdown icon button\">";
            			 roomaction += "    <i class=\"dropdown icon\"><\/i>";
            			 roomaction += "    <div class=\"menu\">";
            			 roomaction += "      <div class=\"item\"><i class=\"edit icon\"><\/i> Dirty<\/div>";
            			 roomaction += "      <div class=\"item\"><i class=\"delete icon\"><\/i> Out of Order<\/div>";
            			 roomaction += "      <div class=\"item\"><i class=\"hide icon\"><\/i> Out of Service<\/div>";
            			 roomaction += "    <\/div>";
            			 roomaction += "  <\/div>";
            			 roomaction += "<\/div>";



            			

            			 $('#tblroomsUpdate').DataTable().row.add([key3,value3.RoomType,statflag,value3.FOstat,value3.Rstat,roomaction]).draw();
            			 $('.ui.dropdown')
                         .dropdown();
 
            			 
            		 });
            		 
            	 });
            	 
             });
       	
          
             $('#tblroomsUpdate').DataTable( {
        		 
        		 destroy: true,
        		 "paging": false,
                 "ordering": false,
                 "info": false,
                 "search": false,
                 
        		    
        	        dom: 'Bfrtip',
        	        buttons: [
        	            'print'
        	        ]
        	        
        	    } );
        
             $('#tblroomsUpdate_filter').hide();
            
            
            });

  
  
       	 
      	 
      	   
       
   
   
    </script>


</body>

</html>
