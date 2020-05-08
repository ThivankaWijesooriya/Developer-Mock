<!-- index.html -->
<!DOCTYPE html>
<html>

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
    <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.13/components/icon.min.css'>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.0/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

    <style>
        .ui.grid>.row>.stretched.column,
        .ui.grid>.stretched.column:not(.row),
        .ui.grid>.stretched.row>.column,
        .ui.stretched.grid>.column,
        .ui.stretched.grid>.row>.column {
            height: -webkit-fill-available;
        }
        
        .ui.menu.fluid,
        .ui.vertical.menu.fluid {
            height: -webkit-fill-available;
        }
        
        .ui.grid {
            margin: 0px;
        }
        
        .ui.selection.dropdown {
            padding: px;
        }
        
        
         .ui.attached.menu:not(.tabular) {
            background-color: #6435c9;
        }
        
        .ui.inverted.segment,
        .ui.primary.inverted.segment {
            background: rgba(34, 36, 38, .15);
        }
        
        
         .ui.segment {
            background-color: ghostwhite;
        }
        
        
         .ui.secondary.inverted.pointing.menu {
            border-width: 0px;
        }
        
        
        .ui.vertical.menu{
        
        background:#6435c9;
        }
    </style>

    







</head>

<body style="background:#00b5ad;">



    <div class="ui top attached demo menu inverted segment">


        <div class="ui inverted segment">
            <div class="ui inverted secondary pointing menu" style="padding-right:800px;">
               
 <a class="item" href="${pageContext.request.contextPath}/pms/dashboard" id="reserveid">
                    <b>Dashboard</b>
                </a>
                <a class="item " href="${pageContext.request.contextPath}/pms/reservation" id="reserveid">
                    <b>Reservations</b>
                </a>

                <a class="item " href="${pageContext.request.contextPath}/pms/checkin" id="checkinid">
                    <b> Check In</b>
                </a>
                <a class="item active" href="${pageContext.request.contextPath}/pms/checkout" id="checkoutid">
                    <b>Check Out</b>
                </a>
                
                <a class="item" href="${pageContext.request.contextPath}/pms/roommgmt" id="checkoutid">
                    <b>Room Management</b>
                </a>
                
                <%--  <a class="item" href="${pageContext.request.contextPath}/pms/customize" id="checkoutid">
                    <b>Customize</b>
                </a> --%>





            </div>


        </div>
    </div>


    <div class="ui grid">
        <div class="four wide column">
            <div class="ui vertical fluid menu">

 
            </div>
        </div>
        <div class="twelve wide stretched column">
            <div class="ui segment">

                <h1 style="margin-left: 14px;">CheckOut</h1>
                <div class="ui grid">



                    <div class="row">

                        <div class="eight wide column"></div>

                        <div class="eight wide column" style="text-align: right;">

                            <div class="ui action input">
                                <input type="text" placeholder="Search...">
                                <select class="ui compact selection dropdown">
    <option value="all">All</option>
    <option selected="" value="articles">Articles</option>
    <option value="products">Products</option>
  </select>
                                <div type="submit" class="ui button primary">Search</div>
                            </div>

                        </div>
                    </div>

                    <div class="row">

                        <div class="sixteen wide column">

                            <table class="ui single line table" id="tblcheckout"></table>



                        </div>
                    </div>

                </div>




            </div>
        </div>
    </div>



    <div class="ui modal checkOUTmodal">

        <div class="header" style="background-color:black;color:white;">Check Out</div>
        <div class="content">

            <div class="ui form">

              

                 <div class="field">

                    <label for=""><b>Guest ID</b></label>
                    <input type="text" id="Tomessage" value="">
                    
                </div>
                

                <div class="field">

                    <label for=""><b>Guest Name</b></label>
                    <input type="text" id="Tomessage" value="">
                </div>

            

                <div class="field">

                    <label for=""><b>Room Number</b></label>
                    <input type="text" id="Subject" value="">
                </div>

                <div class="field">

                    <label for=""><b>Room Type</b></label>
                    <input type="text" id="Subject" value="">
                    
                </div>
                
                 <div class="field">

                    <label for=""><b>Arrival</b></label>
                    <input type="date" id="Subject" value="">
                    
                </div>
                
                
                 <div class="field">

                    <label for=""><b>Departure</b></label>
                    <input type="date" id="Subject" value="">
                    
                </div>
                
                
                        <div class="two fields">

                    <div class="field">
                         <br>
                        <div class="ui primary button fluid" >Add Basic</div>
                    </div>

                   
                </div>
  

                  
                <table class="ui single line table" id="tbltest"></table>
                    

<br> <br>
 <div class="two fields">
<br> <br> 
                    <div class="field">

                        <div class="ui green button fluid" id="checkmodalBtnn">Next</div>
                    </div>
                    
                     <div class="field">

                        <div class="ui red button fluid" >Discard</div>
                    </div>

                   
                </div>

               

   

            </div>

        </div>
    </div>

    <div class="ui modal checkOUTmodal2">

        <div class="header" style="background-color:black;color:white;">Check Out</div>
        <div class="content">

              <div class="ui form">
              
              <div class="field">
              
              <h3>Posts Payments</h3>
              
              </div>
              
              
              <div class="two fields">
              
              <div class="field">
              <label>Description</label>
              <input type="text">
              
              </div>
              <div class="field">
              <label>Amount</label>
               <input type="text">
              
              
              </div>
              
              </div>
              
              <div class="two fields">
                    <div class="field">
              <div class="ui button fluid"> Add</div>
              
              
              </div>
              
                    <div class="field">
              
              
              
              </div>
              
              
              </div>
              
            
              
               <table class="ui single line table" id="tbltest2"></table>
               
               <br> <br>
                <div class="two fields">
              
              <div class="field">
              
               <div class="ui green button fluid"  id="modal3rigg">Next</div>
              </div>
              <div class="field">

               <div class="ui red button fluid" >Discard</div>
              </div>
              
              </div>
              
              </div>

           
               
                    
 

        </div>
    </div>
    
    
        <div class="ui modal checkOUTmodal3">

        <div class="header" style="background-color:black;color:white;">Check Out</div>
        <div class="content">

              <div class="ui form">
              
              <div class="field">
              
              <h3>Total Payments</h3>
              
              </div>
            
               <table class="ui single line table" id="tbltest3"></table>
               
               <br> <br>
               
                <div class="two fields">
              
              <div class="field" style="text-align:right;padding-top:3px;">
              
               <h2>GRAND TOTAL :</h2> 
              </div>
              <div class="field">

               <label style="font-size:25px;">10000</label>
              </div>
              
              </div>
               
                <div class="two fields">
              
              <div class="field">
              
               <div class="ui green button fluid" id="checkoutbtnaction">CheckOut</div>
              </div>
              <div class="field">

               <div class="ui red button fluid" >Discard</div>
              </div>
              
              </div>
              
              </div>

           
               
                    
 

        </div>
    </div>







    <script>
    
   /*  var AcademicPartners = JSON.parse('${listRule1}'); */
    
   $(document).ready(function(){
	   
	   var reservenum="";
	   var k2="";
	   var roomnumberdata="";
	   var roomk1="";
	   var roomk2="";
   
	   $("#compose").click(function() {

           $('.ui.modal').modal('show');


       }); 
	   
	   
	   $("#checkoutbtnaction").click(function() {

		   var reservedetail = JSON.parse('${reservedetails}');
	       
	            $.each(reservedetail, function(key20, value20){
	    	   
                  
	    		   
	    		   
	    	   });
	    	   
	   	   
	    		   
	    		 
	    		   
	    	  
	       });
	       
	       

		   
 


      
	   
	   
	   
	   
       $('#tblcheckout').DataTable({

           "paging": true,
           "ordering": true,
           "info": true,
           "search": false,


           columns: [{
                   title: ""
               },
               {
                   title: "Key"
               },

               {
                   title: "Name"
               },
               {
                   title: "Room Number"
               },

               {
                   title: "Room Type"
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

       $('#tblcheckout_filter').hide();
       
       
       $('#tbltest').DataTable({

           "paging": false,
           "ordering": false,
           "info": false,
           "search": false,


           columns: [
               {
                   title: "Payment ID"
               },

               {
                   title: "Description"
               },
               {
                   title: "Total"
               }

              


           ]



       });

       $('#tbltest_filter').hide();
       
       
       
       $('#tbltest2').DataTable({

           "paging": false,
           "ordering": false,
           "info": false,
           "search": false,


           columns: [
               {
                   title: "Payment ID"
               },

               {
                   title: "Description"
               },
               {
                   title: "Total"
               }

              


           ]



       });

       $('#tbltest2_filter').hide();
       
       
       $('#tbltest3').DataTable({

           "paging": false,
           "ordering": false,
           "info": false,
           "search": false,


           columns: [
               {
                   title: "Payment ID"
               },

               {
                   title: "Description"
               },
               {
                   title: "Total"
               }

              


           ]



       });

       $('#tbltest3_filter').hide();
       
       var reservedetail = JSON.parse('${reservedetails}');
       
       $.each(reservedetail, function(key, value){
    	   
    	   
    	   
    	   
    	   $.each(value, function(key2, value2){
    		   
    		  if(value2.Status=="Checked In"){
    			  
    			  var checkbox="";
    	         	checkbox += "<td>";
    	         	checkbox += "";
    	         	checkbox += "							<div class=\"ui checkbox\">";
    	         	checkbox += "								<input type=\"checkbox\" name=\"example\"> <label><\/label>";
    	         	checkbox += "							<\/div>";
    	         	checkbox += "";
    	         	checkbox += "						<\/td>";
    	         	
    	         	
    	         	var strVar="";
    	         	strVar += "<div class=\"ui green checkoutmodal button\">";
    	         	strVar += "  Check Out";
    	         	strVar += "<\/div>";

  
    	         	
    	         	
    	         	var fname=value2.FirstName;
    	         	var sname=value2.LastName;
    	         	var name= fname.concat("<br>"+sname)
    	         	$('#tblcheckout').DataTable().row.add([checkbox,key,name,value2.RoomNumber,value2.RoomType,value2.Arrival,value2.Departure,strVar]).draw(); 	
    			  
    			  
    		  }
    	   });
    	   
    	   
    	   
    	   
    	 
         	
         	
   
    	   
    	   
         	
    	   
       });
       
       
       
       $(".checkoutmodal").click(function(){
     	   
        	$('.checkOUTmodal').modal('show');
        	
        	
        	var table = $('#tblcheckout').DataTable();
			 
 		   $('#tblcheckout tbody').on( 'click', 'tr', function (){
 			  
 			   reservenum  = ( table.row( this ).data()[1] );
 				 
 			   
 		   });
        	 
/*         	var today = new Date();
      	var dd = today.getDate();
      	var mm = today.getMonth()+1; //January is 0!

      	var yyyy = today.getFullYear();
      	if(dd<10){
      	    dd='0'+dd;
      	} 
      	if(mm<10){
      	    mm='0'+mm;
      	} 
      	var today = dd+'/'+mm+'/'+yyyy; */
      	
      	
      	
      	
      	
        	 
        	 
        	 
        	
        	   

        	    
        	});
       
       
       $("#checkmodalBtnn").click(function(){
     	   
       	$('.checkOUTmodal2').modal('show');
       	 

       	    
       	});
       
       
       $("#modal3rigg").click(function(){
     	   
          	$('.checkOUTmodal3').modal('show');
          	 

          	    
          	});
       
       
       $('.ui.dropdown')
       .dropdown();
         
	   
       

       
       
       
	   
});
   
   
   
   
        

        
   
        


        
        
        
        
    </script>


</body>

</html>
