<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script src="//cdn.datatables.net/plug-ins/1.10.19/api/sum().js"></script>	

<script src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
        
<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.html5.min.js"></script>	

</head>
<body>


	<table id="test"> </table>
	
	<input type="date" id="dy" >
	
	<div id="clickme" class="btn btn-primary">Add</div>



	<script type="text/javascript">
	
	
       var tblinfo = {
    		   
    		"paging" : false,
   			"ordering" : false,
   			"info" : false,
   			"searching":false,
   			   			   			
   			columns : [

   			{
   				title : "Item"
   			},
   			
   			{
   				title : "Column2"
   			},
   			
   			{
   				title : "Column3"
   			}

   			],
   			
   			dom: 'Bfrtip',
   			buttons: [
   			        
   				{ 
   				  extend: 'pdfHtml5', 
   				  messageTop: 'The information in this table '
   				 
   				}
   			      
   			]

   			   		   
       }
       
       
       
		var table,tblinfo2;
        table = $('#test').DataTable(tblinfo);


       $( "#clickme" ).click(function() {
    	  
    	  var day = $('#dy').val(); 
    	  
          tblinfo2 = {
       		  
           		    "paging" : false,
          			"ordering" : false,
          			"info" : false,
          			"searching":false,
          			   			   			
          			columns : [

          			{
          				title : "Item"
          			},
          			
          			{
          				title : "Column2"
          			},
          			
          			{
          				title : "Column3"
          			}

          			],
          			
          			dom: 'Bfrtip',
          			buttons: [
          			        
          				{ 
          				  extend: 'pdfHtml5', 
          				  messageTop: day
          				 
          				}
          			      
          			]

          			   		   
           }
    	     	   
    	   table.destroy();
    	   table = $('#test').DataTable(tblinfo2);
    	   table.clear().draw();
    	   table.row.add(["blah","blah","blah"]).draw();
    	   

    	   
        });
		


		


		
	</script>


</body>
</html>