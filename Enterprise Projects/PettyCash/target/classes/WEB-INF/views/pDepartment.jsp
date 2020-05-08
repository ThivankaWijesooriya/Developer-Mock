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
						<h1 class="page-header">Department Details</h1>

						<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->


						<div type="button" class="btn btn-success" id="btnadd">Add
							Department</div>
							
							
						<input type="text" placeholder="Search" class="table-search form-control" id="SearchField">		

						<div class="space-20"></div>

						<div class="panel panel-warning">
							
							<div class="panel-body">


								<table class="table" id="depttbl">

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


	<div id="modal1" class="modal fade" role="dialog">
		<div class="modal-dialog ">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close closemodal" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Add Record</h4>
				</div>
				<div class="modal-body">

					<form action="${pageContext.request.contextPath}/Department/Submit"
						method="POST">


						<div>

							


							<div class="form-group">

								<label for="exampleInputEmail1">Department Name <span class="required">&nbsp *</span></label> <input
									class="form-control" placeholder="" id="dptname" value="" /> <label
									id="deptnameerror" style="color: red;"> </label>
								

							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status" checked>Active</label>
                              
                            </div>

							</div>


							<div class="form-group">

								<label for="exampleInputEmail1">Remarks</label> <input
									class="form-control" placeholder="" id="remarks" /> <label
									id="remarkserror" style="color: red;"> </label>
								

							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>

						<div id="submitbtn" class="btn btn-sm btn-success">Submit</div>


						&nbsp &nbsp
					   <div type="button" id="clrBtn" class="btn btn-sm btn-warning">Clear</div> 

					</form>


				</div>
				<div class="modal-footer">
					<div type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</div>

				</div>
			</div>

		</div>
	</div>
	
	
	
		<div id="modal2" class="modal fade" role="dialog">
		<div class="modal-dialog ">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close closemodal" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Update Record</h4>
				</div>
				<div class="modal-body">

					<form action="${pageContext.request.contextPath}/Department/Update"
						method="POST">


						<div>

							<div class="form-group">

								<label for="exampleInputEmail1">Department ID</label> <input
									class="form-control" placeholder="" id="dptid2" value="" /> <label
									id="" style="color: red;"> </label>

								

							</div>


							<div class="form-group">

								<label for="exampleInputEmail1">Department Name <span class="required">&nbsp *</span></label> <input
									class="form-control" placeholder="" id="dptname2" value="" /> <label
									id="Deptnameerror3" style="color: red;"> </label>
								

							</div>

							<div class="form-group">

							<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
							
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status2">Active</label>
                              
                            </div>
								


							</div>


							<div class="form-group">

								<label for="exampleInputEmail1">Remarks</label> <input
									class="form-control" placeholder="" id="remarks2" /> <label
									id="" style="color: red;"> </label>
								

							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>

						<div id="updatebtn" class="btn btn-sm btn-primary">Update</div>

	

					</form>


				</div>
				<div class="modal-footer">
					<div type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</div>

				</div>
			</div>

		</div>
	</div>
	
	
	
	<div id="modal3" class="modal fade" role="dialog">
		<div class="modal-dialog ">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close closemodal" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Delete Record</h4>
				</div>
				<div class="modal-body">

					<form action="${pageContext.request.contextPath}/Department/Delete"
						method="POST">


						<div>

							<div class="form-group">

								<label for="exampleInputEmail1">Department ID</label> <input
									class="form-control" placeholder="" id="dptid3" value="" /> <label
									id="" style="color: red;"> </label>

								

							</div>


							<div class="form-group">

								<label for="exampleInputEmail1">Department Name  </label> <input
									class="form-control" placeholder="" id="dptname3" value="" /> <label
									id="" style="color: red;"> </label>
								

							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status  </label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status3">Active</label>
                              
                            </div>
								


							</div>


							<div class="form-group">

								<label for="exampleInputEmail1">Remarks</label> <input
									class="form-control" placeholder="" id="remarks3" /> <label
									id="" style="color: red;"> </label>
								

							</div>

                            <input type="hidden" value="2" id="deletestat"/>

						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>

						<div id="deletebtn" class="btn btn-sm btn-danger">Delete</div>



					</form>


				</div>
				<div class="modal-footer">
					<div type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</div>

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
			
			
			
			var obj = JSON.parse('${deptlist}'); 
			
			var table= $('#depttbl').DataTable({
				"paging" : true,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				
				{
					title : "Department ID"
				}, 
				
				{
					title : "Department Name"
				},
				
				{
					title : "Status"
				},
				
				{
					title : "Remarks"
				},
				
				{
					title : ""
				},
				
				{
					title : ""
				}
				
				

				]
			
			});
			
			$('#depttbl_filter').hide();
			
			/* table.column(0).visible(false); */
			
			$.each(obj, function(key, value) {


				
				var strVar="";
				strVar += "<div type=\"button\" class=\"btn btn-primary update\">Update<\/div>";
				
				var strVar2="";
				strVar2 += "<button type=\"button\" class=\"btn btn-danger delete\">Delete<\/button>";
				
				if(value.deptid==""){
					
					
					$('#depttbl').DataTable().row.add(
							[value.deptid , value.deptname,value.stringstatus,value.remarks,"","" ])
							.draw(); 
					
					
				}
				
				else{
					
					
					$('#depttbl').DataTable().row.add(
							[value.deptid , value.deptname,value.stringstatus,value.remarks,strVar,strVar2 ])
							.draw(); 
					
					
				}

				
				 

			});
			
			
			$('#depttbl_wrapper').addClass("table-responsive");
 			/* Makes tbl responsive */
			
			
	         $("#btnadd").click(function() {

				
				$('#modal1').modal({
					 
				    backdrop: 'static',
				    keyboard: false  
				    
			    });
							

			});
			
			
			$( ".update" ).click(function() {
				
				$('#depttbl tbody').on( 'click', 'tr', function () {
				     var deptid = ( table.row( this ).data()[0] );
				     var deptname = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				     
				     
				    
                    if(status=="Inactive"){
				    	 
				    	 $('#status2').prop('checked', false);
				    	   				    	
				    	 
				    }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status2').prop('checked', true);
				    	 
				    	 
				     }
				     
				     
				     
				     
				     $('#dptid2').val(deptid).prop('disabled', true); 
				     $('#dptname2').val(deptname); 
				     $('#remarks2').val(remarks); 
				    
				
				     $('#modal2').modal({
						 
						    backdrop: 'static',
						    keyboard: false  
						    
					 });
				     
				     
				     
			 
				});	
				
		
				  
		    });
			
			
			
			$( ".delete" ).click(function() {
				
				
				$('#depttbl tbody').on( 'click', 'tr', function () {
				     var deptid = ( table.row( this ).data()[0] );
				     var deptname = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				    
				     
                    if(status=="Inactive"){
				    	 
				    	 $('#status3').prop('checked', false).prop('disabled', true);
				    	   				    	
				    	 
				    }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status3').prop('checked', true).prop('disabled', true);
				    	 
				    	 
				     }
				     
				     
				     
				     $('#dptid3').val(deptid).prop('disabled', true); 
				     $('#dptname3').val(deptname).prop('disabled', true); 
				     $('#remarks3').val(remarks).prop('disabled', true); 
				    
				
				 	$('#modal3').modal({
						 
					    backdrop: 'static',
					    keyboard: false  
					    
				    });
				     
				     
				     
			 
				});	
				
	     
			 
			});	
			
			
			
			$("#submitbtn").click(function() {
				
				
                var stat = null;
				
				if($('#status').is(':checked')){
					
					
					stat = "1";
					console.log(stat);
				}
				
				else{
					
					stat = "0";
					console.log(stat);
				}
				
				
				
				var deptname = $('#dptname').val();
				var status = stat;
				var remarks = $('#remarks').val();
				
				
				
				
				if(deptname==""){
					
					
					document.getElementById("deptnameerror").innerHTML = "Input field cannot be Empty";
				}
				
				
                 /* 	if(status==""){
					
					document.getElementById("statuserror").innerHTML = "Input field cannot be Empty";
					
				} */
				
					
				
				else{
					
					
					
 					var data = {
							
							
							"deptname" : deptname,
							"status" : status,
							"remarks" : remarks
							
					};
					
					
					
					data = JSON.stringify(data);
					
					
					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Department/Submit?${_csrf.parameterName}=${_csrf.token}",
								
						data : ({
							
							"data" : data											

						}),
						
						success : function() {
							
							location.reload(true);  
							
							
						}

					}); 
					
					
				}



			});
			
			
			$("#updatebtn").click(function() {
				
				
				    var stat2 = null;
					
					if($('#status2').is(':checked')){
						
						
						stat2 = "1";
						console.log(stat2);
					}
					
					else {
				
						
						stat2 = "0";
						console.log(stat2);
						
				     }
				

				var deptid = $('#dptid2').val();
				var deptname = $('#dptname2').val();
				var status = stat2;
				var remarks = $('#remarks2').val();
				
				
                if(deptname==""){
					
					
					document.getElementById("Deptnameerror3").innerHTML = "Input field cannot be Empty";
				}
                
                else{
                	
                	
                	
    				var data = {
    						
    						"deptid" : deptid,
    						"deptname" : deptname,
    						"status" : status,
    						"remarks" : remarks
    						
    				};
    				
    				
    				
    				data = JSON.stringify(data);
    				
    				
    				$.ajax({
    					type : "POST",
    					accept : "text/html",
    					dataType : "html",
    					url : "${pageContext.request.contextPath}/Department/Update?${_csrf.parameterName}=${_csrf.token}",
    							
    					data : ({
    						
    						"data" : data											

    					}),
    					
    					success : function() {
    						
    					 location.reload(true);  
    						
    						
    					}

    				});
                	
                	
                	
                }
				
				

			});
			
			
			
			
			
	         $("#deletebtn").click(function() {
	        	 

	        	 var deptid = $('#dptid3').val();
	        	 var state = $('#deletestat').val();
	        	 
	        	 
					var data = {
							
							"deptid" : deptid,
							"status" : state
							
							
					};
					
					
					
					data = JSON.stringify(data);
					
					
					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Department/Delete?${_csrf.parameterName}=${_csrf.token}",
								
						data : ({
							
							"data" : data											

						}),
						
						success : function() {
							
						 location.reload(true);  
							
							
						}

					});
				
					
								

			 });
			
			
			
			$( ".closemodal" ).click(function() {
				
				
				 location.reload(true);  
				 
				 
			});
			
			
						
			$( "#clrBtn" ).click(function() {
				
				
			    $('#dptname').val("");
			    $('#remarks').val("");
				 
				 
			});
			
			
			 $('#SearchField').keyup(function(){
					
					
				 table.search($(this).val()).draw();  
					 			
					
			 });
				
				

				
				  
      });
			
			

			
		
		
		
	</script>

</body>

</html>
