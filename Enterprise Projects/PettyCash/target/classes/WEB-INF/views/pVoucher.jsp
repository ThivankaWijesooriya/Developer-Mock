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
				<h1 class="page-header">Voucher Requisition </h1>


				<button type="button" class="btn btn-success" id="btnadd">Add
					Voucher</button>
					
				<button type="button" class="btn btn-info" id="inquiry">Inquiry </button>	

				<input type="text" placeholder="Search"
					class="table-search form-control" id="SearchField">

				<div class="space-20"></div>

				<div class="panel panel-warning">

					<div class="panel-body">
					
					
					<form id="updateform" action="${pageContext.request.contextPath}/Voucher/Update" method="GET" >


                     <input type="hidden" id="vouid" name="vouid"/>

                    </form>
                    
                    
                    
                    <form id="deleteform" action="${pageContext.request.contextPath}/Voucher/Delete" method="GET" >


                     <input type="hidden" id="vouid2" name="vouid2"/>

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
							"info" : true,
							"search" : false,

							columns : [

							{
								title : "Voucher No."
							},
							
							{
								title : "Type"
							},


							{
								title : "Category"
							},

							{
								title : "Description"
							},

							{
								title : "Amount"
							},
							
							{
								title : "Status"
							},

							{
								title : ""
							},

							{
								title : ""
							}
							
						
							
							

							]
						});

						$('#tblVoucher_filter').hide();
						
						

 						 $.each(obj, function(key, value) {


						
						 var strVar="";
						 strVar += "<div type=\"button\" class=\"btn btn-primary update\">Update<\/div>";
						
						 var strVar2="";
						 strVar2 += "<div type=\"button\" class=\"btn btn-danger delete\">Delete<\/div>";
						 
						 
						 var strVar3="";
						 strVar3 += "<button class=\"btn btn-primary\" disabled> Update <\/button>";
						 
						 var strVar4="";
						 strVar4 += "<button class=\"btn btn-danger\" disabled> Delete <\/button>";
						 
						 
						 
						 if(value.voucherstatus=="Voucher Deleted"){
							 
							 $('#tblVoucher').DataTable().row.add(
									 [value.voucherno,value.type , value.category,value.description,"Rs."+value.amount,value.voucherstatus ,strVar3,strVar4 ])
									 .draw();  
							 
						 }
						 
						 else{
							 
							 
							 $('#tblVoucher').DataTable().row.add(
									 [value.voucherno,value.type , value.category,value.description,"Rs."+value.amount,value.voucherstatus ,strVar,strVar2 ])
									 .draw();  
							 
							 
						 }
						 
						

						 }); 
 						 
 						 
 						$('#tblVoucher_wrapper').addClass("table-responsive");
						/* Makes tbl responsive */
						 
						 

						$("#btnadd").click(function() {

							window.location.href = "${pageContext.request.contextPath}/Voucher/Create";

						});
						
						
						$("#inquiry").click(function() {

							window.location.href = "${pageContext.request.contextPath}/Voucher/GetVoucherInquiry";

						});
						
						
						
						
						$(".update").click(function() {

							
							
							$('#tblVoucher tbody').on( 'click', 'tr', function () {
								
							     var vouid = ( table.row( this ).data()[0] );
							     
							     $('#vouid').val(vouid); 
							     
							     $("#updateform").submit();
									

						 
							});

						});
						
						
						
						
						$(".delete").click(function() {
							
							
							$('#tblVoucher tbody').on( 'click', 'tr', function () {
								
							     var vouid2 = ( table.row( this ).data()[0] );
							     
							     $('#vouid2').val(vouid2); 
							     
							     $("#deleteform").submit();
									

						 
							});

							

						});
						
						
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						}); 



                 });
                      
</script>

</body>

</html>
