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
						<h1 class="page-header">Assign Pages</h1>


                        
						<div class="space-20"></div>

						<div class="panel panel-warning">
							
						<div class="panel-body">
							
							
							
                          <form:form action="${pageContext.request.contextPath}/UserManagement/view/Submit"
							method="POST" modelAttribute="Pages">


							<div class="col-md-8">
							
														

								<div class="form-group">

									<div class="row">
									
									 <label class="col-sm-2" for="exampleInputEmail1">User
											ID</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder=""  name = "userid" readonly="true"  value="${userid}"/>
											
											

										</div>
									</div>
								</div>



								<div class="form-group">

									<div class="row">
                                       
                                     <label class="col-sm-2" for="exampleInputEmail1">Employee
											Name</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder="" readonly="true" value="${EmpName}"/>
											
											

										</div>
                                       
									</div>


								</div>

								
								
							  <div class="form-group " >

									<div class="row">
										<label class="col-sm-2" for="exampleInputEmail1">Pages</label>
										<div class="col-sm-6">
										
												
                                                <%-- <label class="checkbox"> <form:checkbox path="pagelist" value="1" /> Department </label>
												<label class="checkbox"> <form:checkbox path="pagelist" value="2" /> Designation</label>
												<label class="checkbox"> <form:checkbox path="pagelist" value="3" /> Shift</label> 
												<label class="checkbox"><form:checkbox path="pagelist" value="4" />Employee Type</label> 
												<label class="checkbox"><form:checkbox path="pagelist" value="5" />Pettycash Authorize</label> 
												<label class="checkbox"><form:checkbox path="pagelist" value="6" />Employee Master</label>
												<label class="checkbox"><form:checkbox path="pagelist" value="7" />Pettycash Float</label> 
												<label class="checkbox"><form:checkbox path="pagelist" value="8" />User Management</label>  --%>
												
												<table class="table form_table">
																								    
												    <tbody>
												     <thead>
												      <tr>
												        <th>Select</th>
												        <th>Page Name</th>
												      </tr>
												    </thead>
												      <tr>
												        <td> <form:checkbox path="pagelist" value="1" /> </td>
												        <td> <label>Department</label> </td>												        
												      </tr>
												      
												      <tr>
												        <td> <form:checkbox path="pagelist" value="2" /> </td>
												        <td> <label>Designation</label> </td>
												      </tr>
												      
												  
												      
												       <tr>
												        <td> <form:checkbox path="pagelist" value="4" /> </td>
												        <td> <label>Employee Type</label> </td>
												      </tr>
												      
												       <tr>
												        <td> <form:checkbox path="pagelist" value="5" /> </td>
												        <td> <label> Pettycash Authorize </label> </td> 
												      </tr>
												      
												       <tr>
												        <td> <form:checkbox path="pagelist" value="6" /> </td>
												        <td> <label> Employee Master </label> </td>
												      </tr>
												      
												       <tr>
												        <td> <form:checkbox path="pagelist" value="7" /> </td>
												        <td> <label> Pettycash Float </label> </td>  
												      </tr>
												      
												       <tr>
												        <td> <form:checkbox path="pagelist" value="8" /> </td>
												        <td> <label> User Management </label> </td>
												      </tr>
												      
												
												    </tbody>
												    
											   </table>
																					        

										</div>
									</div>


							  </div>
							

							<div class="clearfix"></div>
							<div class="space-25"></div>


							<div class="row">
								<span class="col-sm-2"></span>
								<div class="col-sm-6">
									<button type="submit" class="btn btn-sm btn-success"
									>Save</button>
									
									 &nbsp &nbsp
									<div class="btn btn-sm btn-info" id="return">Return</div>
								</div>

							</div>

							</div>


						</form:form>
                        


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
			
						 
			 $("#return").click(function(){
				  
				 window.location.href = "${pageContext.request.contextPath}/UserManagement";
			 });
			

		});
		
	</script>

</body>

</html>
