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

				
				<button type="button" class="btn btn-info" id="btninquiry">Inquiry</button>

				
				<div class="clearfix"></div>
				<div class="space-20"></div>
					
				<div class="panel panel-warning">

					<div class="panel-body">
					
					<form id="authorizeformVoucher" action="${pageContext.request.contextPath}/Voucher/Authorize/Readonly" method="GET" >


                     <input type="hidden" id="vouid" name="vouid"/>

                    </form>
                    
                    
                    <form id="authorizeformIOU" action="${pageContext.request.contextPath}/IOU/Authorize/Readonly" method="GET" >


                     <input type="hidden" id="louid" name="louid"/>

                    </form>
                    
                    
                  <form id="returnform" action="${pageContext.request.contextPath}/IOU_Return/ViewIouReturn/Authorize" method="GET">
				
				  <input type="hidden" id="iouid2" name="authorizeiouno" value=""/> 
				  
				  </form>
					
                       
                       
	                        <h3><strong>IOU Details</strong></h3>
							<!--  <br/> <br/> -->
							<div class="space-20"></div>
							<table class="table" id="IouTbl">
	
							</table>
						
						
						

					</div>
					
				</div>
				
				<!-- Second Panel -->
				
					<div class="panel panel-warning">

					<div class="panel-body">
					
									            						
						
							<h3><strong>Voucher Details</strong></h3>
							
							<div class="space-20"></div>
							<table class="table" id="VouTbl">
	
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
					
                    	  sessionStorage.setItem("viewMode", "false");
                    	  
                    	    var obj = JSON.parse('${Iou}');  
                    	    var obj2 = JSON.parse('${Vou}'); 
                    	    

    						var table = $('#IouTbl').DataTable({

    							"paging" : true,
    							"ordering" : true,
    							"aaSorting": [[1,'desc']],
    							"info" : true,
    							"search" : false,

    							columns : [

    								{
        								title : "IOU No."
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
        								title : "Amount"
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
    						
    						

    						$('#IouTbl_filter').hide();
    						
    						
    						var table2 = $('#VouTbl').DataTable({

    							"paging" : true,
    							"ordering" : true,
    							"aaSorting": [[1,'desc']],
    							"info" : true,
    							"search" : false,

    							columns : [

    							{
    								title : "VOU No."
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
    								title : "Settled IOU No."
    							},
    							
    							{
    								title : "IOU Amount"
    							},
    							
    							{
    								title : "Settlement Amount"
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
    						
    						
    						$('#VouTbl_filter').hide();
    						
    						 $.each(obj2, function(key, value) {


         						 var strVar3="";
         						 strVar3 += "";
         						 strVar3 += "";
         						 strVar3 += "<div type=\"button\" class=\"btn btn-info view\">View<\/div>";
         						 strVar3 += "";
         						 
         						
         						 if(value.IouBeforeSettle==""){
         							 
         							$('#VouTbl').DataTable().row.add(
         	        		    			[value.voucherno ,value.voucherdate,value.enteredby,value.category,value.settlediouno,"","Rs."+value.amount,value.approvedby,value.voucherstatus,strVar3 ])
         	        		    			.draw(); 
         						 }
         						 
         						 else{
         							 
         							 
         							$('#VouTbl').DataTable().row.add(
         	        		    			[value.voucherno ,value.voucherdate,value.enteredby,value.category,value.settlediouno,"Rs."+value.IouBeforeSettle,"Rs."+value.amount,value.approvedby,value.voucherstatus,strVar3 ])
         	        		    			.draw();
         							 
         							 
         						 }
         						 
         						
        						 
        		        }); 				
    						

    	         /* ************************* 1st Loop Begining ******************	 */	
    	
     						 $.each(obj, function(key, value) {


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
    						 
  							 
    							 
    							 if(value.ioustatus == "IOU Returned"){
      								 
    								 $('#IouTbl').DataTable().row.add(
        		    						 [value.iouno ,value.ioudate,value.enteredby,value.category,"Rs."+value.amount,value.approvedby,value.ioustatus ,strVar5 ])
        		    						 .draw(); 
      								 
      							 }
    							 
    							 else if(value.ioustatus == "IOU Return Authorized"){
    								 
    								 $('#IouTbl').DataTable().row.add(
        		    						 [value.iouno ,value.ioudate,value.enteredby,value.category,"Rs."+value.amount,value.approvedby ,value.ioustatus ,strVar5 ])
        		    						 .draw(); 
    								 
    								 
    							 }
    							 
    							 else if(value.ioustatus == "IOU Return Approved"){
    								 
    								 $('#IouTbl').DataTable().row.add(
        		    						 [value.iouno ,value.ioudate,value.enteredby,value.category,"Rs."+value.amount,value.approvedby ,value.ioustatus ,strVar5 ])
        		    						 .draw(); 
    								 
    							 }
    							 
    							 else{
    								 
    								 
    								 $('#IouTbl').DataTable().row.add(
        		    						 [value.iouno ,value.ioudate,value.enteredby,value.category,"Rs."+value.amount,value.approvedby ,value.ioustatus,strVar4 ])
        		    						 .draw(); 
    								 
    								 
    							 }
    							     							 
     						
    						 
    						 }); 
						

    	         
     						$('#IouTbl_wrapper').addClass("table-responsive");
    						/* Makes tbl responsive */
    						
    						$('#VouTbl_wrapper').addClass("table-responsive");
						   /* Makes tbl responsive */
						
						
                       $(".view").click(function() {
							
							
						  $('#VouTbl tbody').on( 'click', 'tr', function () {
								
							     var vouid = ( table2.row( this ).data()[0] );
							     
							     $('#vouid').val(vouid); 
							     
							     $("#authorizeformVoucher").submit();
									

						 
							}); 
							
							

						});
                       
                       
                       $(".view2").click(function() {
							
							
 						  $('#IouTbl tbody').on( 'click', 'tr', function () {
 								
 							     var louid = ( table.row( this ).data()[0] );
 							     
 							     $('#louid').val(louid); 
 							     
 							     $("#authorizeformIOU").submit();
 									

 						 
 							}); 
 							
 							

 						});
                       
                       
                       $(".view3").click(function() {
							
							
  						  $('#IouTbl tbody').on( 'click', 'tr', function () {
  								
  							     var louid = ( table.row( this ).data()[0] );
  							     
  							     $('#iouid2').val(louid); 
  							     
  							     $("#returnform").submit();
  									

  						 
  							}); 
  							
  							

  						});
                       
                                           
										
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						}); 
						
						
						
						
                        $( "#btninquiry" ).click(function() {
			 				
			 				window.location.href = "${pageContext.request.contextPath}/Request/Authorize/Inquiry"; 
			 				 
			 			});



                 });
                      
</script>

</body>

</html>
