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
								
						
					
				</div>	
				<div class="clearfix"></div>
				<div class="space-20"></div>
				

					
				<div class="panel panel-warning">

					<div class="panel-body">
					
												
						<table class="table" id="tblsummary">

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


<script>
	
                      $(document).ready(function() {
                    	  
   						
    					  var table = $('#tblsummary').DataTable({

    						  "paging" : false,
                       	      "ordering" : false,
                       	      "info" : false,
                       	      "searching":false,
    							
    							columns : [

    							{
    								title : "Costs/Expenses"
    							},
    							
    							{
    								title : "IT Support"
    							},
    							
    							{
    								title : "Software"
    							},
    							
    							{
    								title : "Admin"
    							}
   							

    							],
    							
    							dom: 'Bfrtip',
    					        buttons: [
    					                					        	
    					        	
    					        	{ 
    					        		
    					        	   extend: 'pdfHtml5',
    					        	   title: 'PettyCash Reimbursement',    					        	       					        	   
     					        	   className: 'btn btn-danger btn-md'     					        	   
     					        	   				      
     					    					        		    					        	  					       					        	
    					        	},
    					        	
    					        	
    					        	{ extend: 'excelHtml5', title: 'PettyCash Reimbursement' ,className: 'btn btn-danger btn-md' } 
    					            				            
    					        ]
    						
    						});
    						

   						   /* Makes tbl responsive */ 
   						   
   						$('#tblsummary_wrapper').addClass("table-responsive");   

   						   
   						   
						$('#fromDate').bind ("input propertychange", function () {
							 
							tempfrom = $('#fromDate').val();   
							table.clear().draw();
							 				 			 
						});  
						
						
						$('#toDate').bind ("input propertychange", function () {
							 
							tempto = $('#toDate').val();   
							table.clear().draw();
							 				 			 
						}); 
						
						var result = JSON.parse('${catlist}');
						
						$.each(result, function(key, value) {
							

								$('#tblsummary').DataTable().row.add(
			    						 [value.catname ,value.supportcost,value.softwarecost ,value.admincost ])
			    						 .draw(); 
								
							    						
   						 
	    				}); 
						
                        
                        $("#search").click(function(){
                        	
                        	var from = $('#fromDate').val().trim();
                        	var to = $('#toDate').val().trim();
                        	var stat = $('#statusid').val();

                        	
                        	
                    		$.ajax({
                    			type : "GET",
                    			url : "${pageContext.request.contextPath}/Request/Authorize/Inquiry/Search?fromDate="+from+"&toDate="+to+"&status="+stat+"",
                    		
                    			success : function(response) {
                    				
                    				var result = JSON.parse(response);
                    				
									table.clear().draw();
									
 			                    	$.each(result, function(key, value) {
 			                    		

			    						
			    						 
			    				   });
                    				
                    			}

                    		}); 
                        	
                            
                        });
                        
                        
                        

                 });
                      
</script>

</body>

</html>
