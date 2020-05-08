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
				<h1 class="page-header">PettyCash Float </h1>

				<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->


				<button type="button" class="btn btn-success" id="btnadd">Add
					PettyCash Float</button>

				<input type="text" placeholder="Search"
					class="table-search form-control" id="SearchField">

				<div class="space-20"></div>

				<div class="panel panel-warning">

					<div class="panel-body">
					
					<form id="viewform" action="${pageContext.request.contextPath}/PettyCashFloat/view" method="GET" >


                     <input type="hidden" id="cheqid" name="cheqid"/>

                    </form>
                    
                    <form id="updateform" action="${pageContext.request.contextPath}/PettyCashFloat/Update" method="GET" >


                     <input type="hidden" id="cheqid2" name="cheqid2"/>

                    </form>
                    					

						<!--  <br/> <br/> -->
						<table class="table" id="tblIOU">

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
					

						var obj = JSON.parse('${floatinglist}');  

						var table = $('#tblIOU').DataTable({

							"paging" : true,
							"ordering" : true,
							"aaSorting": [[1,'desc']],
							"info" : true,
							"search" : false,

							columns : [

							{
								title : "Cheque No."
							},

							{
								title : "Date"
							},


							{
								title : "Amount"
							},
							
							
							{
								title : ""
							},
							
							{
								title : ""
							}
							

							]
						});

						$('#tblIOU_filter').hide();

						 $.each(obj, function(key, value) {


						
						 var strVar="";
						 strVar += "<div type=\"button\" class=\"btn btn-primary view\">View<\/div>";
						 
						 
						 var strVar1="";
						 strVar1 += "<div type=\"button\" class=\"btn btn-info update\">Update<\/div>";
						
						if(value.chequeno==""){
							
							$('#tblIOU').DataTable().row.add(
									 ["" , "","","",""])
									 .draw(); 
							
						}
						
						else{
							
							
							<c:choose>
							
							<c:when test="${sessionScope.Admin == true}">
							
							 $('#tblIOU').DataTable().row.add(
									 [value.chequeno , value.date,"Rs."+value.amount,strVar,strVar1 ])
									 .draw();
							 
							 
							    
							</c:when>
							
							<c:otherwise>
							
							$('#tblIOU').DataTable().row.add(
									 [value.chequeno , value.date,"Rs."+value.amount,strVar,"" ])
									 .draw();
							
							table.column(4).visible(false);
							
							 
							    
							</c:otherwise>
							

							</c:choose>
														  
							
						}

						

					});  
						 
						 

						$("#btnadd").click(function() {

							window.location.href = "${pageContext.request.contextPath}/PettyCashFloat/Create";

						});
						
						
						$(".view").click(function() {

							
							
							$('#tblIOU tbody').on( 'click', 'tr', function () {
								
							     var cheqid = ( table.row( this ).data()[0] );
							     
							     $('#cheqid').val(cheqid); 
							     
							     $("#viewform").submit();
									

						 
							});

						});
						
						
						
                        $(".update").click(function() {

							
							
							$('#tblIOU tbody').on( 'click', 'tr', function () {
								
							     var cheqid = ( table.row( this ).data()[0] );
							     
							     $('#cheqid2').val(cheqid); 
							     
							     $("#updateform").submit();
									

						 
							});

						});
						
						 
						$('#SearchField').keyup(function(){
							
							
							 table.search($(this).val()).draw();  
								 			
								
						}); 



                 });
                      
</script>

</body>

</html>
