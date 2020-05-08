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
				<h1 class="page-header">Authorize IOU/Voucher Details</h1>
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
							<div class="col-sm-9">
								<select class="form-control"  id="statusid">
								  <option value="">Select Status</option>
								  <option value="ST06">IOU Authorized</option>
								  <option value="ST14">IOU Return Authorized</option>
								  <option value="ST12">Voucher Authorized</option>
				                </select>
			                </div>
			                <div class="btn btn-primary btn-sm" id="search">Search</div>
		                </div>
	                </div>
								
					
					
	
					<div class="col-sm-3"><input type="text" placeholder="Search" class="table-search form-control" id="SearchField"></div>
						
					
				</div>	
				<div class="clearfix"></div>
				<div class="space-20"></div>
					
				<div class="panel panel-warning">

					<div class="panel-body">
					
					<form id="authorizeformVoucher" action="${pageContext.request.contextPath}/Inquiry/Voucher/Authorize/Readonly" method="GET" >


                     <input type="hidden" id="vouid" name="vouid"/>

                    </form>
                    
                    
                    <form id="authorizeformIOU" action="${pageContext.request.contextPath}/Inquiry/IOU/Authorize/Readonly" method="GET" >


                     <input type="hidden" id="louid" name="louid"/>

                    </form>
                    
                    
                  <form id="returnform" action="${pageContext.request.contextPath}/Inquiry/IOU_Return/ViewIouReturn/Authorize" method="GET">
				
				  <input type="hidden" id="iouid2" name="authorizeiouno" value=""/> 
				  
				  </form>
                    
                                       
					

						<!--  <br/> <br/> -->
						<table class="table" id="tblVoucher">

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

<script>
	
                      $(document).ready(function() {
					

                    	    /* var obj = JSON.parse('${voulist}'); */   

    						var table = $('#tblVoucher').DataTable({

    							"paging" : true,
    							"ordering" : true,
    							"aaSorting": [[2,'desc']],
    							"info" : true,
    							"search" : false,

    							columns : [

    							{
    								title : "Transaction No."
    							},
    							
    							{
    								title : "Type"
    							},
    							
    							{
    								title : "Request Date"
    							},
    							
    							{
    								title : "Request By"
    							},

    							{
    								title : "Category"
    							},
    							
    							{
    								title : "IOU No."
    							},
    							
    							{
    								title : "IOU Amount"
    							},
    							
    							{
    								title : "Settled Amount"
    							},
    							
    							{
    								title : "Approved By"
    							},

    							
    							{
    								title : "Status"
    							},

    							{
    								title : ""
    							}

     							

    							]
    						});
    						
    						

    						$('#tblVoucher_filter').hide();
    						
     						
    						
    						 var strVar3="";
     						 strVar3 += "";
     						 strVar3 += "";
     						 strVar3 += "<div type=\"button\" class=\"btn btn-info view\">View<\/div>";
     						 strVar3 += "";
     						 
     						 
     						 var strVar4="";
     						 strVar4 += "";
     						 strVar4 += "";
     						 strVar4 += "<div type=\"button\" class=\"btn btn-info view2\">View<\/div>";
     						 strVar4 += "";
     						 
     						 
     						 var strVar5="";
    						 strVar5 += "";
    						 strVar5 += "";
    						 strVar5 += "<div type=\"button\" class=\"btn btn-info view3\">View<\/div>";
    						 strVar5 += "";
    						 
						
							
                    	   $('#tblVoucher_wrapper').addClass("table-responsive");
   						   /* Makes tbl responsive */  
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						}); 
   						   
   						   
						$('#fromDate').bind ("input propertychange", function () {
							 
							   
							table.clear().draw();
							 				 			 
						});  
						
						
						$('#toDate').bind ("input propertychange", function () {
							 
							   
							table.clear().draw();
							 				 			 
						}); 
						
						
						$('#statusid').bind ("input propertychange", function () {
							 
							   
							table.clear().draw();
							 				 			 
						}); 
						
						
                      
						$(document).on('click', '#tblVoucher tbody .view', function() {
	 		 						
									 var tr = $(this).closest('tr');
									 var row = table.row(tr);
						             var rowData = row.data();
						            
						             var vouid = rowData[0];

	 							     
	 							     $('#vouid').val(vouid); 
	 							     
	 							     $("#authorizeformVoucher").submit();

							
													
						});
						

						
						$(document).on('click', '#tblVoucher tbody .view2', function(e) {
							
							var tr = $(this).closest('tr');
							var row = table.row(tr);
				            var rowData = row.data();
				            
				            var louid = rowData[0];
	  								
	  				  							     
	  					   $('#louid').val(louid); 
	  							     
	  					   $("#authorizeformIOU").submit(); 
	  									
							
													
						 }); 
						
						
						$(document).on('click', '#tblVoucher tbody .view3', function() {
							
	   						  
										var tr = $(this).closest('tr');
										var row = table.row(tr);
							            var rowData = row.data();
							            
							            var louid = rowData[0];

		   							     
		   							    $('#iouid2').val(louid); 
		   							     
		   							    $("#returnform").submit();
	   									

	  					 							
													
						});
						
                        
                        
                        
                        $("#search").click(function(){
                        	
                        	var from = $('#fromDate').val().trim();
                        	var to = $('#toDate').val().trim();
                        	var stat = $('#statusid').val();
                        	
                        	
                        	sessionStorage.setItem("from", from);
                        	sessionStorage.setItem("to", to);
                        	sessionStorage.setItem("stat", stat); 
                        	
                        	
                    		$.ajax({
                    			type : "GET",
                    			url : "${pageContext.request.contextPath}/Request/Authorize/Inquiry/Search?fromDate="+from+"&toDate="+to+"&status="+stat+"",
                    		
                    			success : function(response) {
                    				
                    				var result = JSON.parse(response);
                    				
									table.clear().draw();
									
 			                    	$.each(result, function(key, value) {
 			                    		
			    						 
			    						 if(value.voucherstatus=="Voucher Authorized".trim()){
			    							 
			    							 if(value.IouBeforeSettle==""){
			    								 
			    								 $('#tblVoucher').DataTable().row.add(
			        		    						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,value.settlediouno,"","Rs."+value.amount,value.approvedby,value.voucherstatus ,strVar3 ])
			        		    						 .draw(); 
			    								 
			    							 }
			    							 
			    							 else{
			    								 
			    								 $('#tblVoucher').DataTable().row.add(
			        		    						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,value.settlediouno,"Rs."+value.IouBeforeSettle,"Rs."+value.amount,value.approvedby,value.voucherstatus ,strVar3 ])
			        		    						 .draw(); 
			    								 
			    								 
			    							 }
			    							 
					 
			    							 
			    						 }
			    						 
			    						 else if(value.voucherstatus=="IOU Authorized".trim()){
			    							 
			    							 
			    							 $('#tblVoucher').DataTable().row.add(
		        		    						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,value.settlediouno,"","Rs."+value.amount,value.approvedby,value.voucherstatus ,strVar4 ])
		        		    						 .draw(); 
			    							 
			    							 
			    						 }
			    						 
			    						 else{
			    							 

			    								 
			    							 $('#tblVoucher').DataTable().row.add(
		        		    						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,value.settlediouno,"","Rs."+value.amount,value.approvedby,value.voucherstatus ,strVar5 ])
		        		    						 .draw(); 
			    								 
	     							 
			    							 
			    						 } 
			    						
			    						 
			    				   });
                    				
                    			}

                    		}); 
                        	
                            
                        });
                        
                        
                        
                        if(sessionStorage.getItem("viewMode")=="true"){
                        	
                        	$('#fromDate').val(sessionStorage.getItem("from"));
                        	$('#toDate').val(sessionStorage.getItem("to"));
                        	$('#statusid').val(sessionStorage.getItem("stat"));
                        	
                        	$('#search').click();
                        	
                        }
                        
                    	
                    	


                 });
                      
</script>

</body>

</html>
