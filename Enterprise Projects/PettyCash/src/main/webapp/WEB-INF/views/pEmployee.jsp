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
						<h1 class="page-header">Employee Details</h1>

						<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->
						



						<button type="button" class="btn btn-success" id="btnadd">Add
							Employee</button>
							
						<input type="text" placeholder="Search" class="table-search form-control" id="SearchField">	
								
                        
						<div class="space-20"></div>

						<div class="panel panel-warning">
							
							<div class="panel-body">
							
						<form id="viewform" action="${pageContext.request.contextPath}/Employee/View/Get" method="GET" >


                        <input type="hidden" id="empid" name="empid"/>

                        </form>
                        
                         
                        
                        
                      <form id="updateform" action="${pageContext.request.contextPath}/Employee/Update/Get" method="GET" >


                        <input type="hidden" id="empid3" name="empid3"/>

                      </form>
                        
                        
                           
                                
								<div>
									<table class="table table-bordered " id="tblemp">
									
									</table>
								</div>
								


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
			
			/* table.column(0).visible(false); */
			
			
			var obj = JSON.parse('${emplist}');   
			
			var table= $('#tblemp').DataTable({
				"paging" : true,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				
				{
					title : ""
				},
				
 				{
					title : "User ID"
				},
				
				{
					title : "Full Name"
				},
				
				{
					title : "Department"
				},
				
				{
					title : "Designation"
				},
				
				
				{
					title : "Reporting Off."
				},
				
				{
					title : ""
				},
				
				{
					title : ""
				}
							 
		

				]
			
			
			});
			
			$('#tblemp_filter').hide();
						
			
 			$.each(obj, function(key, value) {


				
				var strVar="";
				strVar += "<div type=\"button\" class=\"btn btn-primary update\">Update<\/div>";
				
				
				var strVar3="";
				strVar3 += "<div type=\"button\" class=\"btn btn-info view\">View<\/div>";
				
				
							
							
				/* var strVar5="";
				strVar5 += "<img src=\"data:image\/jpeg;base64,"+value.Imgbase64+"  \">";  */
				
				
				
				var strVar5="";
				strVar5 += "<img src=\"data:image\/jpeg;base64,"+value.Imgbase64+"\" class=\"empimg\">";
				

				 
				 
				 $('#tblemp').DataTable().row.add(
							[strVar5,value.userid,value.knownname+" "+value.emplastname,value.department.deptname,value.designation.designame,value.temprptoff1,strVar3, strVar ])
							.draw(); 
				 

			}); 
			
			
 			$( "#btnadd" ).click(function() {
 				
 				window.location.href = "${pageContext.request.contextPath}/Employee/Create"; 
 				 
 			});
 			
 			
 			$('#tblemp_wrapper').addClass("table-responsive");
 			/* Makes tbl responsive */
 			
 			
            $( ".view" ).click(function() {
 				
 				 
 				 
 				 
 				$('#tblemp tbody').on( 'click', 'tr', function () {
					
				     var empid = ( table.row( this ).data()[1] );
				     
				     $('#empid').val(empid); 
				     
				     $("#viewform").submit();
						

			 
				});
 				 
 				 
 				 
 				 
 				 
 			});
            
            
            $( ".update" ).click(function() {
            	
            	
            	$('#tblemp tbody').on( 'click', 'tr', function () {
					
				     var empid = ( table.row( this ).data()[1] );
				     
				     $('#empid3').val(empid); 
				     
				     
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
