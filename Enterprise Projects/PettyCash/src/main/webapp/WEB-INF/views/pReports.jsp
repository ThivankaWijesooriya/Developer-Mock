<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>ONEzero Petty Cash Management</title>

<!-- Bootstrap Core CSS -->

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" />


<!-- Custom CSS -->
<link href="<c:url value="/resources/css/sb-admin.css" />"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/custom.css" />"
	rel="stylesheet" />

<!-- Custom Fonts -->
<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.min.css" />"
	rel="stylesheet" />

<link
	href="<c:url value="/resources/css/datatables.min.css" />"
	rel="stylesheet" />
	
<link href="https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css	"/>	


<style type="text/css">
.error {
	color: red;
}
</style>

</head>

<body>

<div id="wrapper">

<%@ include file ="../common/navbar.jspf" %>

<div id="page-wrapper">

	<div class="container-fluid">

		<!-- Page Heading -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Report Management</h1>
				
				<div class="row">
				
					<div class="col-sm-3">
						<div class="row">
							<label class="col-sm-2">From</label>
							<div class="col-sm-10">
								<input class="form-control" type="date" id="fromDate"/>
							</div>
						</div>						
					</div>
					
					<div class="col-sm-3">
						<div class="row">
							<label class="col-sm-2 text-right">To</label>
							<div class="col-sm-10">
								<input class="form-control"  type="date" id="toDate"/>
							</div>
						</div>
					</div>
					
					<div class="col-sm-3">
						<div class="row">
							
			                <div class="btn btn-primary btn-sm" id="search">Search</div>
			                
		                </div>
	                </div>
																		
	
					<div class="col-sm-3"><input type="text" placeholder="Search" class="table-search form-control" id="SearchField"></div>
						
					
				</div>	
				
				<div class="clearfix"></div>
				<div class="space-20"></div>
				

					
				<div class="panel panel-warning">

					<div class="panel-body">
					
                    

						<table class="table" id="tblVoucher">
						
						<tfoot align="left">
						
		                <tr style="display: none;"><th></th><th></th><th></th><th></th><th></th><th></th> <th></th></tr>		
		                <tr><th></th><th></th><th></th><th></th><th></th><th id="metaheader"></th> <th id="metadt"></th></tr>		
		               
		                		
	                    </tfoot>

						</table>



					</div>
				</div>

			</div>
		</div>
		<!-- /.row -->

	</div>
	<!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->




<!-- jQuery -->
<script src="<c:url value="/resources/js/jquery.js" />"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<script src="<c:url value="/resources/js/datatables.min.js" />"></script>

<script src="<c:url value="/resources/js/navbar.js" />"></script>

<script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js" ></script>
<script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js" ></script>
<script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js" ></script>
<script src="https://cdn.datatables.net/plug-ins/1.10.19/api/sum().js"></script>


<script>
	
                      $(document).ready(function() {
                    	  
                    	  var strVar="";
                    	  strVar += "<br\/>";

                    	  var fullDate = new Date()                    	 
                    	  //Thu Otc 15 2014 17:25:38 GMT+1000 {}
                    	    
                    	  //convert month to 2 digits
                    	  var twoDigitMonth = ((fullDate.getMonth().length+1) === 1)? (fullDate.getMonth()+1) :(fullDate.getMonth()+1);
                    	    
                    	  var currentDate = fullDate.getDate() + "/" + twoDigitMonth + "/" + fullDate.getFullYear();                    	 
					
                          var tempto,tempfrom,totalFloat=0,totalUnsettledIou=0,cashinhand=0;


                         $(document).on('input propertychange','#toDate',function(){
 							 
  							/* tempto = $('#toDate').val(); */
  							table.clear().draw();
  							
  							 				 			 
  					    }); 
                          
                          
                          $(document).on('input propertychange','#fromDate',function(){
  							 
                          	/* tempfrom = $('#fromDate').val(); */
                          	table.clear().draw();
  							
  							 				 			 
  					    });
                          
                          
                         var tblproperty = {
                        		 
                        	   "paging" : false,
                        	   "ordering" : false,
                        	   "info" : false,
                        	   "searching":false,
     							
     							columns : [

     							{
     								title : "Transaction No."
     							},
     							
     							{
     								title : "Paid Date"
     							},
     							
     							{
     								title : "Username"
     							},
     							
     							{
     								title : "Description"
     							},

     							{
     								title : "Category"
     							},
     							
     							{
     								title : "Department"
     							},
     							
     							{
     								title : "Amount"
     							}

     							],
     							
     							dom: 'Bfrtip',
     					        buttons: [
     					                					        	
     					        	
     					        	{ 
     					        		
     					        	   extend: 'pdfHtml5',
     					        	   title: 'PettyCash Reimbursement',    					        	       					        	   
      					        	   className: 'btn btn-danger btn-md',     					        	   
      					        	   messageTop: 'To :- General Manager \n Through :- Snr. manager HR & AD \n From :- Accountant \n Date :- '+currentDate+' \n Period :- '+tempfrom+' - '+tempto+'',
      					        	   footer: true, 
      					        	   exportOptions: { stripNewlines: false }
      					    					        		    					        	  					       					        	
     					        	},
     					        	
     					        	
     					        	{ extend: 'excelHtml5', title: 'PettyCash Reimbursement' ,className: 'btn btn-danger btn-md' } 
     					            				            
     					        ],
     					        
     					        fixedHeader : {
     								header : true,
     								footer : true
     							},
     							
     							 drawCallback: function () {
     									
     							      var api = this.api();
     							      
     							      var sum = api.column( 6 ).data().sum();
     							      
     							      var decsum = parseFloat(sum).toFixed(2);
     							      var decfloat = parseFloat(totalFloat).toFixed(2);
     							      var decunsettled = parseFloat(totalUnsettledIou).toFixed(2);
     							      
     							      cashinhand = (parseFloat(totalFloat) - (parseFloat(sum)+parseFloat(totalUnsettledIou))).toFixed(2);
     							      

     							      $( api.column(5).footer() ).html('Total \n'+'Iou Outstanding \n'+'Cash In Hand \n'+'Float ');
     							      $( api.column(6).footer() ).html(''+decsum+'\n'+''+decunsettled+'\n'+''+cashinhand+'\n'+''+decfloat+' ');
     							     
     							      $('#metaheader').html('Total'+strVar+'Iou Outstanding'+strVar+'Cash In Hand'+strVar+'Float ')
     							      $('#metadt').html(decsum+strVar+decunsettled+strVar+cashinhand+strVar+decfloat)
     							      
     							      
     							      
     							      
     							 } 	 
                        		                        		 
                        		 
                         } ;
                         
                         
    					var table;
                        table = $('#tblVoucher').DataTable(tblproperty);

    						
 							
                        $('#tblVoucher_wrapper').addClass("table-responsive");
   						   /* Makes tbl responsive */ 
   						   
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						});  
   						   
								                 
                        
                        $("#search").click(function(){
                        	
                        	var from = $('#fromDate').val().trim();
                        	var to = $('#toDate').val().trim();
                        	
                        	
                            var tblproperty2 = {
                           		 
                             	   "paging" : false,
                             	   "ordering" : false,
                             	   "info" : false,
                             	   "searching":false,
          							
          							columns : [

          							{
          								title : "Transaction No."
          							},
          							
          							{
          								title : "Paid Date"
          							},
          							
          							{
          								title : "Username"
          							},
          							
          							{
          								title : "Description"
          							},

          							{
          								title : "Category"
          							},
          							
          							{
          								title : "Department"
          							},
          							
          							{
          								title : "Amount"
          							}

          							],
          							
          							dom: 'Bfrtip',
          					        buttons: [
          					                					        	
          					        	
          					        	{ 
          					        		
          					        	   extend: 'pdfHtml5',
          					        	   title: 'PettyCash Reimbursement',    					        	       					        	   
           					        	   className: 'btn btn-danger btn-md',     					        	   
           					        	   messageTop: 'To :- General Manager \n Through :- Snr. manager HR & AD \n From :- Accountant \n Date :- '+currentDate+' \n Period :- '+from+' - '+to+'',
           					        	   footer: true, 
           					        	   exportOptions: { stripNewlines: false }
           					    					        		    					        	  					       					        	
          					        	},
          					        	
          					        	
          					        	{ 
          					        		extend: 'excelHtml5', 
          					        		title: 'PettyCash Reimbursement' ,
          					        		className: 'btn btn-danger btn-md',
          					        	    footer: true, 
            					        	exportOptions: { stripNewlines: false }
          					        	} 
          					            				            
          					        ],
          					        
          					        fixedHeader : {
          								header : true,
          								footer : true
          							},
          							
          							 drawCallback: function () {
          									
          							      var api = this.api();
          							      
          							      var sum = api.column( 6 ).data().sum();
          							      
          							      var decsum = parseFloat(sum).toFixed(2);
          							      var decfloat = parseFloat(totalFloat).toFixed(2);
          							      var decunsettled = parseFloat(totalUnsettledIou).toFixed(2);
          							      
          							      cashinhand = (parseFloat(totalFloat) - (parseFloat(sum)+parseFloat(totalUnsettledIou))).toFixed(2);
          							      

          							      $( api.column(5).footer() ).html('Total \n'+'Iou Outstanding \n'+'Cash In Hand \n'+'Float ');
          							      $( api.column(6).footer() ).html(''+decsum+'\n'+''+decunsettled+'\n'+''+cashinhand+'\n'+''+decfloat+' ');
          							     
          							      $('#metaheader').html('Total'+strVar+'Iou Outstanding'+strVar+'Cash In Hand'+strVar+'Float ')
          							      $('#metadt').html(decsum+strVar+decunsettled+strVar+cashinhand+strVar+decfloat)
          							      
          							      
          							      
          							      
          							 } 	 
                             		                        		 
                             		 
                              } ;
                        	                       	
                        	
                    		$.ajax({
                    			type : "GET",
                    			url : "${pageContext.request.contextPath}/Reports/Search?fromDate="+from+"&toDate="+to+"",
                    		
                    			success : function(response) {
                    				
                    				
                    				var result = JSON.parse(response);
                    				
                    				table.destroy(); 
                    				table = $('#tblVoucher').DataTable(tblproperty2);
                    				table.clear().draw();  
                    				
																											
 			                    	$.each(result, function(key, value) {
 			                    		
 			                    		
 			                    		$('#tblVoucher').DataTable().row.add(
	        		    						 [value.tid ,value.paiddate, value.username ,value.description ,value.category,value.department.deptname,value.amount  ])
	        		    						 .draw(); 
 			                    		
 			                    		totalFloat = value.TotalFloat;
 			                    		totalUnsettledIou = value.TotalUnsettledIou;
			    						 
			    				   }); 
 			                    	
                    				
                    			}

                    		}); 
                        	
                            
                        });
                        
                        
                        

                 });
                      
</script>

</body>

</html>
