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
						<h1 class="page-header">Change Password</h1>


                        
						<div class="space-20"></div>

						<div class="panel panel-warning">
							
						<div class="panel-body">
							
													
                          <form>
							

							<div class="col-md-8">
							

								<div class="form-group">

									<div class="row">
									
									 <label class="col-sm-2" for="exampleInputEmail1">User
											ID</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder=""  name = "userid" readonly="true"  value="${sessionScope.userid}"/>
											
											

										</div>
									</div>
								</div>



								<div class="form-group">

									<div class="row">
                                       
                                     <label class="col-sm-2" for="exampleInputEmail1">Employee
											Name</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder="" readonly="true" value="${name}"/>
											
											

										</div>
                                       
									</div>


								</div>
								
								
								<div class="form-group">

									<div class="row">
                                       
                                     <label class="col-sm-2" for="exampleInputEmail1"> Current Password</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder="" type="password" id="currentPass"/>
											<label style="color:red;" id="errormsg"></label>
											
											

										</div>
                                       
									</div>


								</div>
								
								
								<div class="form-group">

									<div class="row">
                                       
                                     <label class="col-sm-2" for="exampleInputEmail1"> New Password</label> 
										
										<div class="col-sm-6">
										
										   
										
											<input class="form-control" placeholder="" type="password" id="newPass"/>
											
											

										</div>
                                       
									</div>


								</div>

								
							<div class="clearfix"></div>
							<div class="space-25"></div>


							<div class="row">
								<span class="col-sm-2"></span>
								<div class="col-sm-6">
								
									<div  class="btn btn-sm btn-success" id="saveBtn"> Save</div>

								</div>

							</div>
							

							</div>
							

						</form>
                        


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
	

<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog modalmsg">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="exit close" >&times;</button>
        <h4 class="modal-title">Password Change Success</h4>
      </div>
      <div class="modal-body">
       <h4>Password Changed Successfully, Please Login with New Password </h4>
      </div>
      <div class="modal-footer">
        <button type="button" class="exit pull-left btn btn-default" >Close</button>
      </div>
    </div>

  </div>
</div>



	<!-- jQuery -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

	<script src="<c:url value="/resources/js/datatables.min.js" />"></script>
	
	<script src="<c:url value="/resources/js/navbar.js" />"></script>

	<script>
	
	
		$(document).ready(function() {
			
						 
			 $("#saveBtn").click(function(){
				
				 var currentPass = $('#currentPass').val();
				 var newPass = $('#newPass').val();
				  
				 var data = {
						 
					"currentPass" :currentPass,
					"newPass":newPass
						 					 
				 };
				 
				 
				 var jsondata =  JSON.stringify(data);
				
				 				 
					$.ajax({
						
						type : "POST",
						url : "${pageContext.request.contextPath}/Password/Validate?data="+jsondata+" ",
					
						success : function(response) {
							
							
							if(response=="Password Incorrect"){
								
								$('#errormsg').html(response);
								
							}
							
							else{
								
								
								$('#errormsg').html("");
								
								 $('#myModal').modal({
									 
									    backdrop: 'static',
									    keyboard: false  
									    
								 });
								
								
							}
							
					     }
						
					     

				   });  
				 				 			 
			 });
			 
			 
			 $(document).on("click",".exit",function() {
				   
								  
			      location.reload(); 
			
				    
			 });
			 

		});
		
	</script>

</body>

</html>
