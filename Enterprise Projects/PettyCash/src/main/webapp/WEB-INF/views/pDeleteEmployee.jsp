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
						<h1 class="page-header">
							Employee Master
						</h1>
						

						<div class="panel panel-warning">
							
							<div class="panel-body">

								<form:form id="employeeform"
									action="${pageContext.request.contextPath}/Employee/Delete/Submit?${_csrf.parameterName}=${_csrf.token}"
									method="POST" modelAttribute="Employee"
									enctype="multipart/form-data">



									<div class="col-md-6">

										


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Employee
													No.</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="employeeNo" readonly="true"/>
													<form:errors path="employeeNo" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Upload
													File</label>
												<div class="col-sm-7">
													<form:input placeholder="" path="multiimage" type="file" value="" readonly="true"/>
													<form:errors path="multiimage" cssClass="error" />
													
												</div>
											</div>
										</div>



										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Employee
													Type </label>
												<div class="col-sm-7">

													<form:select path="employeetype" class="form-control" readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:options items="${EmpListType}" />
													</form:select>

													<form:errors path="employeetype" cssClass="error" />

												</div>
											</div>
										</div>


										<%-- <div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Emp.
													Initials</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="empinitials" readonly="true"/>
													<form:errors path="empinitials" cssClass="error" />
												</div>
											</div>
										</div> --%>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Emp.
													First Name</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="empfirstname" readonly="true"/>
													<form:errors path="empfirstname" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Emp.
													Last Name</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="emplastname" readonly="true"/>
													<form:errors path="emplastname" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Emp.
													Full Name</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="empfullname" readonly="true"/>
													<form:errors path="empfullname" cssClass="error" />
												</div>
											</div>
										</div>

										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">
													Sex</label>
												<div class="col-sm-7">

													<form:select path="empsex" class="form-control" readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:option value="M" label="Male" />
														<form:option value="F" label="Female" />

													</form:select>
													<form:errors path="empsex" cssClass="error" />

												</div>

											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">
													Marital Status</label>
												<div class="col-sm-7">

													<form:select path="empMaritalStatus" class="form-control" id="maritalstat" readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:option value="S" label="Single" />
														<form:option value="M" label="Married" />


													</form:select>
													<form:errors path="empMaritalStatus" cssClass="error" />

												</div>

											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Shift</label>
												<div class="col-sm-7">
												
												 <form:input class="form-control" placeholder="" id="tempshift" path="shift.description" readonly="true"/> 
													<form:input class="form-control" placeholder=""
														path="shift.shiftid" id="shiftfield" type="hidden"/>
														
													<form:errors path="shift.shiftid" cssClass="error" />
												</div>
												<!-- <a class="help-btn" href="#" id="shiftbtn"></a> -->
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Department</label>
												<div class="col-sm-7">
												
												<form:input class="form-control" placeholder="" id="tempdept" path="department.deptname" readonly="true"/> 
												
													<form:input class="form-control" placeholder=""
														path="department.deptid" id="deptfield" type="hidden" />
													<form:errors path="department.deptid" cssClass="error" />
												</div>
												
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Designation</label>
												<div class="col-sm-7">
												
												<form:input class="form-control" placeholder="" id="tempdesig" path="designation.designame" readonly="true"/> 
													<form:input class="form-control" placeholder=""
														path="designation.desigid" id="desigfield" type="hidden"/>
													<form:errors path="designation.desigid" cssClass="error" />
												</div>
												
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Mobile
												</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="empmobile" readonly="true"/>
													<form:errors path="empmobile" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Telephone
												</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="emptp" readonly="true"/>
													<form:errors path="emptp" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Email</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="email" readonly="true"/>
													<form:errors path="email" cssClass="error" />
												</div>
											</div>
										</div>




									</div>


									<div class="col-md-6">


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Permanent
													Address1 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="pAddress1" readonly="true"/>
													<form:errors path="pAddress1" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Permanent
													Address2 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="pAddress2" readonly="true"/>
													<form:errors path="pAddress2" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Permanent
													Address3 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="pAddress3" readonly="true"/>
													<form:errors path="pAddress3" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Temp
													Address1 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="tAddress1" readonly="true"/>
													<form:errors path="tAddress1" cssClass="error" />
												</div>
											</div>
										</div>

										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Temp
													Address2 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="tAddress2" readonly="true"/>
													<form:errors path="tAddress2" cssClass="error" />
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Temp
													Address3 </label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="tAddress3" readonly="true"/>
													<form:errors path="tAddress3" cssClass="error" />
												</div>
											</div>
										</div>





										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Status
												</label>
												<div class="col-sm-7">

													<form:select path="status" class="form-control"
														id="statusflag" readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:option value="1" label="Active" />
														<form:option value="0" label="Inactive" />
														<form:option value="2" label="Resign" />
														<form:option value="3" label="Terminate" />

													</form:select>
													<form:errors path="status" cssClass="error" />


												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<div class="d-none" id="hideflag">
													<label class="col-sm-3" for="exampleInputEmail1">Date
														of Resignation</label>
													<div class="col-sm-7">

														<form:input class="form-control" placeholder=""
															path="resigdate" type="date" readonly="true"/>
														<form:errors path="resigdate" cssClass="error" />

													</div>
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<div class="d-none" id="hideflag2">
													<label class="col-sm-3" for="exampleInputEmail1">Date
														of Termination</label>
													<div class="col-sm-7">

														<form:input class="form-control" placeholder=""
															path="terminatedate" type="date" readonly="true"/>
														<form:errors path="terminatedate" cssClass="error" />

													</div>
												</div>
											</div>
										</div>


										<div class="form-group">
											<div class="row">
											
											<input id="rptstat"  type="hidden" />

												<label class="col-sm-3">Is Reporting Officer</label>
												<div class="checkbox col-sm-7">
													<label> <form:checkbox path="isreportingoff"
															value="" readonly="true"/> Yes <form:errors path="isreportingoff"
															cssClass="error" />

													</label>
												</div>

											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Reporting
													Officer</label>
												<div class="col-sm-7">
												
												   <form:input class="form-control" placeholder=""
														path="temprptoff1"  readonly="true"/>
												
												
													<form:input class="form-control" placeholder=""
														path="rptoffid" type="hidden"/>
													<form:errors path="rptoffid" cssClass="error" />
												</div>
												
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Alternate
													Reporting Officer</label>
												<div class="col-sm-7">
												
												
												    <form:input class="form-control" placeholder=""
														path="temprptoff2" readonly="true"/>
												
													<form:input class="form-control" placeholder=""
														path="altoffid" type="hidden"/>
													<form:errors path="altoffid" cssClass="error" />
												</div>
												
											</div>
										</div>


										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Known
													Name</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="knownname" readonly="true"/>
													<form:errors path="knownname" cssClass="error" />
												</div>
											</div>
										</div>
										
										
										<div class="form-group">
											<div class="row">
												<label class="col-sm-3" for="exampleInputEmail1">Remarks
													</label>
												<div class="col-sm-7">
													<form:input class="form-control" placeholder=""
														path="remarks" readonly="true"/>
													<form:errors path="remarks" cssClass="error" />
												</div>
											</div>
										</div>





									</div>



									<div class="clearfix"></div>
									<div class="space-25"></div>

									<div class="col-md-6">

										<div class="row">
											<div class="col-xs-3"></div>
											<div class="col-sm-2">
												<button type="submit" class="btn btn-sm btn-success">Delete</button>
											</div>
											<div class="col-sm-2">
												<button type="button" id="cnclBTN" class="btn btn-sm btn-warning">Return</button>
											</div>
										</div>
									</div>


								</form:form>

								<!-- panel body end -->

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
			 
			 			 
			 
			
			  var a = $('#statusflag').val();
			  
			  if(a==2){
				  
				  console.log(a);
				  $("#hideflag").removeClass("d-none");
			  }
			  
			  else if(a==3){
				  
            	  console.log(a);
				  $("#hideflag2").removeClass("d-none");
			  }
			  
			  else{
				  
				  console.log(a);
				  
				  $("#hideflag").addClass("d-none");
				  $("#hideflag2").addClass("d-none");
				  
				  
				  
			  }	 
			 
					
			
			$("#statusflag").change(function(){
				
				  var a = $('#statusflag').val();
				  
				  if(a==2){
					  
					  console.log(a);
					  $("#hideflag").removeClass("d-none");
					  $("#hideflag2").addClass("d-none");
				  }
				  
				  else if(a==3){
					  
                	  console.log(a);
					  $("#hideflag2").removeClass("d-none");
					  $("#hideflag").addClass("d-none");
				  }
				  
				  else{
					  
					  console.log(a);
					  
					  $("#hideflag").addClass("d-none");
					  $("#hideflag2").addClass("d-none");
					  
					  
					  
				  }
				  
		    });
			
			

			
			
			var table= $('#tblref').DataTable({
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				{
					title : ""
				},
				
				{
					title : "Officer ID"
				}, 
				
				{
					title : "Officer Name"
				}

				

				]
			});
        	
        	   


			$('#tblref_filter').hide();
			
			
			
			
			var table= $('#tblaltref').DataTable({
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				{
					title : ""
				},
				
				{
					title : "Officer ID"
				}, 
				
				{
					title : "Officer Name"
				}

				

				]
			});
        	
			


			$('#tblaltref_filter').hide();
			

			
        	
			var table= $('#depttbl').DataTable({
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				{
					title : ""
				},
				
				{
					title : "Department ID"
				}, 
				
				{
					title : "Department Name"
				}

				

				]
			});
        	      	   


			$('#depttbl_filter').hide();
			
			
        	$('#desigtbl').DataTable({
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				{
					title : ""
				},
				
				{
					title : "Designation ID"
				}, 
				
				{
					title : "Designation Name"
				}

				

				]
			});

			$('#desigtbl_filter').hide();
			
			
			
			
			$('#shifttbl').DataTable({
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				{
					title : ""
				},
				
				{
					title : "Shift ID"
				}, 
				
				{
					title : "Description"
				}

				

				]
			});

			$('#shifttbl_filter').hide();
			

			
			
			$( "#cnclBTN" ).click(function() {
								
				 
				window.location.href = "${pageContext.request.contextPath}/Employee/GetAll";
				
				
			});
			
			

		}); 
		 
		 
	</script>

</body>

</html>
