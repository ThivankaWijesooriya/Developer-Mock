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
				<h1 class="page-header">Approve IOU/Voucher Details</h1>

				<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->


				

				<input type="text" placeholder="Search"
					class="table-search form-control" id="SearchField">
				<div class="clearfix"></div>
				<div class="space-20"></div>
					
				<div class="panel panel-warning">

					<div class="panel-body">
					

                    
                    
                    <form id="approveformVoucher" action="${pageContext.request.contextPath}/Voucher/Approve/Readonly" method="GET" >


                     <input type="hidden" id="vouid1" name="vouid1"/>

                    </form>
                    
                    
                     <form id="approveformIOU" action="${pageContext.request.contextPath}/IOU/Approve/Readonly" method="GET" >


                     <input type="hidden" id="louid1" name="louid1"/>

                    </form>
                    
                    
                  <form id="returnform" action="${pageContext.request.contextPath}/IOU_Return/ViewIouReturn/Approve" method="GET">
				
				  <input type="hidden" id="iouid2" name="approveiouno" value=""/> 
				  
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
					

                    	
                    	  
                    	var obj = JSON.parse('${voulist}');  

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
    								title : "Status"
    							},

    							{
    								title : ""
    							}

   							

  							]
  						});

  						$('#tblVoucher_filter').hide();
  						
  						

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
  						 
  						 
  						 if(value.type=="VOU"){
  							 
  							 if(value.settlediouno==""){
  								 
  								$('#tblVoucher').DataTable().row.add(
  	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,"","","Rs."+value.amount,value.voucherstatus ,strVar3 ])
  	  			  						 .draw(); 
  								 
  								 
  							 }
  							 
  							 else{
  								 
  								$('#tblVoucher').DataTable().row.add(
  	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,value.settlediouno,"Rs."+value.IouBeforeSettle,"Rs."+value.amount,value.voucherstatus ,strVar3 ])
  	  			  						 .draw(); 
  								 
  								 
  							 }
  							 
  						 }
  						 
  						 else{
  							 
  							/* $('#tblVoucher').DataTable().row.add(
  			  						 [value.voucherno ,value.type ,value.category,value.description,"Rs."+value.amount,value.voucherstatus ,strVar4 ])
  			  						 .draw();  */
  							 
  							 if(value.voucherstatus == "IOU Returned"){
  								 
  								 $('#tblVoucher').DataTable().row.add(
  	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,"","","Rs."+value.amount,value.voucherstatus ,strVar5 ])
  	  			  						 .draw(); 
  								 
  							 }
  			  						 
  							 else if(value.voucherstatus == "IOU Return Authorized"){
  								 
  								 $('#tblVoucher').DataTable().row.add(
  	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,"","","Rs."+value.amount,value.voucherstatus ,strVar5 ])
  	  			  						 .draw(); 
  								 
  								 
  							 }
  			  						 
  							 else if(value.voucherstatus == "IOU Return Approved"){
  								 
  								$('#tblVoucher').DataTable().row.add(
 	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,"","","Rs."+value.amount,value.voucherstatus ,strVar5 ])
 	  			  						 .draw(); 
  								 
  							 }		 
  							 
  							 else{
  								
  								/* Approve/Create IOU  */
  								
  								$('#tblVoucher').DataTable().row.add(
  	  			  						 [value.voucherno ,value.type, value.voucherdate ,value.enteredby ,value.category,"","","Rs."+value.amount,value.voucherstatus ,strVar4 ])
  	  			  						 .draw(); 
  								 
  							 }
  							 
  						 }

  						
  						

  						 }); 


   						$('#tblVoucher_wrapper').addClass("table-responsive");
						/* Makes tbl responsive */

						
                       $(".view").click(function() {
							
							
						  $('#tblVoucher tbody').on( 'click', 'tr', function () {
								
							     var vouid = ( table.row( this ).data()[0] );
							     
							     $('#vouid1').val(vouid); 
							     
							     $("#approveformVoucher").submit();
									

						 
							}); 
							
							

						});
                       
                       
                       $(".view2").click(function() {
							
							
 						  $('#tblVoucher tbody').on( 'click', 'tr', function () {
 								
 							     var louid = ( table.row( this ).data()[0] );
 							     
 							     $('#louid1').val(louid); 
 							     
 							     $("#approveformIOU").submit();
 									

 						 
 							}); 
 							
 							

 						});
                       
                       
                       $(".view3").click(function() {
							
							
  						  $('#tblVoucher tbody').on( 'click', 'tr', function () {
  								
  							     var louid = ( table.row( this ).data()[0] );
  							     
  							     $('#iouid2').val(louid); 
  							     
  							     $("#returnform").submit();
  									

  						 
  							}); 
  							
  							

  						});
                       

						 
						
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						}); 



                 });
                      
</script>

</body>

</html>
