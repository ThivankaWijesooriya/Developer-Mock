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
    </style>

    







</head>

<body>



    <div class="ui top attached demo menu inverted segment">


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
                
                <a class="item " href="${pageContext.request.contextPath}/pms/roommgmt" id="checkoutid">
                    <b>Room Management</b>
                </a>
                
                <%-- <a class="item" href="${pageContext.request.contextPath}/pms/customize" id="checkoutid">
                    <b>Customize</b>
                </a> --%>





            </div>


        </div>
    </div>


    <div class="ui grid">
        <div class="four wide column">
            <div class="ui vertical fluid menu">

                <a class="teal item">
                    <div class="ui primary button fluid" id="compose">
                        <b>Compose</b>
                    </div>
                </a>

                <a class="teal item">
                    <b>Inbox</b>
                    <div class="ui teal left pointing label">1</div>
                </a>
                <a class="item active">
                    <b>Spam</b>
                    <div class="ui label">51</div>
                </a>
                <a class="item">
                    <b>Updates</b>
                    <div class="ui label">1</div>
                </a>
                <div class="item">
                    <div class="ui transparent icon input">
                        <input type="text" placeholder="Search mail...">
                        <i class="search icon"></i>
                    </div>
                </div>
            </div>
        </div>
        <div class="twelve wide stretched column">
            <div class="ui segment">

                <h1 style="margin-left: 14px;">Interact</h1>
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

                            <table class="ui single line table" id="tblemails"></table>



                        </div>
                    </div>

                </div>




            </div>
        </div>
    </div>



    <div class="ui modal">

        <div class="header" style="background-color:black;color:white;">New Message</div>
        <div class="content">

            <div class="ui form">


                <div class="field">

                    <label for=""><b>To</b></label>
                    <input type="text" id="Tomessage" value="">
                </div>

            

                <div class="field">

                    <label for=""><b>Subject</b></label>
                    <input type="text" id="Subject" value="">
                </div>

                <div class="field">


                    <textarea name="" id="Message" value="" rowspan="3"></textarea>
                </div>

                <div class="two fields">

                    <div class="field">

                        <div class="ui primary button fluid" id="testmail">Send</div>
                    </div>

                    <div class="field">

                        <div class="ui button fluid">Discard</div>
                    </div>
                </div>

            </div>

        </div>
    </div>





    <script>
    
   /*  var AcademicPartners = JSON.parse('${listRule1}'); */
    
   $(document).ready(function(){
   
	   $("#compose").click(function() {

           $('.ui.modal').modal('show');


       }); 
	   
	   
	   
	   
       $('#tblemails').DataTable({

           "paging": true,
           "ordering": true,
           "info": true,
           "search": false,


           columns: [{
                   title: ""
               },
               {
                   title: "To"
               },

               {
                   title: "Subject"
               },
               {
                   title: "Message"
               },

               {
                   title: "Date"
               },

               {
                   title: "Action"
               }


           ]



       });

       $('#tblemails_filter').hide();
       
       
       $("#testmail").click(function(){
     	   
        	 var recepient = $('#Tomessage').val().trim();
        	 var subject = $('#Subject').val().trim();
        	 var message = $('#Message').val().trim();
        	 
        	var today = new Date();
      	var dd = today.getDate();
      	var mm = today.getMonth()+1; //January is 0!

      	var yyyy = today.getFullYear();
      	if(dd<10){
      	    dd='0'+dd;
      	} 
      	if(mm<10){
      	    mm='0'+mm;
      	} 
      	var today = dd+'/'+mm+'/'+yyyy;
      	
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
      	multiaction += "                <div class=\"ui button modifypartner\">Modify <\/div>";
      	multiaction += "                <div class=\"ui floating dropdown icon button\">";
      	multiaction += "                    <i class=\"dropdown icon\"><\/i>";
      	multiaction += "                    <div class=\"menu\">";
      	multiaction += "";
      	multiaction += "                        <div class=\"item viewpartner\"><i class=\"delete icon\"><\/i> View<\/div>";
      	multiaction += "						 <div class=\"item Approvepartner\"><i class=\"delete icon\"><\/i> Approve<\/div>";
      	multiaction += "						  <div class=\"item Declinepartner\"><i class=\"delete icon\"><\/i> Decline<\/div>";
      	multiaction += "";
      	multiaction += "                    <\/div>";
      	multiaction += "                <\/div>";
      	multiaction += "            <\/div>";
      	multiaction += "					";
        	 
        	 
        	 
        	 console.log(recepient);
        	   
        	   $.ajax({
       			type : "POST",
       			accept : "text/html",
       			//contentType: "application/json; charset=utf-8",
       			dataType : "html",
       			url : "${pageContext.request.contextPath}/pms/interact/add",
       			
       			data : ({
       				"recepient" :recepient,"subject" :subject,"message":message

       			}),
       			
       			  success: function(){
       				  
       				 $('#tblemails').DataTable().row.add([checkbox,recepient,subject,message,today,multiaction]).draw();
       				$('.ui.modal').modal('hide');
       				
       			 $('.ui.dropdown')
                 .dropdown();
       				  
       			}
       			
       		});
        	    
        	});
       
       
          
         
	   
	   
});
   
   
   
   
        

        
   
        


        
        
        
        
    </script>


</body>

</html>
