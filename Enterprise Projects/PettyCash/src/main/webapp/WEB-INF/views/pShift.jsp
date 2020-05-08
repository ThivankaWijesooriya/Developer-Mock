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
						<h1 class="page-header">Shift Details</h1>

						<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->


						<button type="button" class="btn btn-success" id="btnadd">Add Shift</button>
						
						<input type="text" placeholder="Search" class="table-search form-control" id="SearchField">

						<div class="space-20"></div>

						<div class="panel panel-warning">
							
							<div class="panel-body">


								<table class="table" id="tblshift">

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

					<form action="${pageContext.request.contextPath}/Shift/Submit" method="POST">


						<div>



							<div class="form-group">
								
								<label for="exampleInputEmail1">Description <span class="required">&nbsp *</span></label> 
								<input class="form-control" placeholder="" id="shiftname"/>
								<label id="shiftnameerror" style="color: red;"> </label>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
								<!-- <select class="form-control" id="status">
									<option value="">--- Select ---</option>
									<option value="0">Active</option>
									<option value="1">Inactive</option>
								</select> -->
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status" checked>Active</label>
                              
                            </div>
								

							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							<input class="form-control" placeholder="" id="remarks"/>
							<label id="remarkserror" style="color: red;"> </label>
																
								
							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-success" id="addsubmit">Submit</div> &nbsp &nbsp
						<div class="btn btn-sm btn-warning" id="clrBtn">Clear</div>

					</form>


				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</button>
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

					<form action="${pageContext.request.contextPath}/Shift/Update" method="POST">


						<div>

							<div class="form-group">
								
								<label for="exampleInputEmail1">Shift ID</label> 
								<input class="form-control" placeholder="" id="shiftid2"/>
								<label id="shiftiderror2" style="color: red;"> </label>
								
																	
								
							</div>


							<div class="form-group">
								
								<label for="exampleInputEmail1">Description <span class="required">&nbsp *</span></label> 
								<input class="form-control" placeholder="" id="shiftname2"/>
								<label id="shiftnameerror2" style="color: red;"> </label>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status2">Active</label>
                              
                            </div>
								

							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							<input class="form-control" placeholder="" id="remarks2"/>
							<label id="remarkserror2" style="color: red;"> </label>
																
								
							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-primary" id="updatesubmit">Update</div> 
						

					</form>


				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</button>
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

					<form action="${pageContext.request.contextPath}/Shift/Delete" method="POST">


						<div>

							<div class="form-group">
								
								<label for="exampleInputEmail1">Shift ID</label> 
								<input class="form-control" placeholder="" id="shiftid3"/>
																	
								
							</div>


							<div class="form-group">
								
								<label for="exampleInputEmail1">Description</label> 
								<input class="form-control" placeholder="" id="shiftname3"/>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status</label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status3">Active</label>
                              
                            </div>
								

							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							<input class="form-control" placeholder="" id="remarks3"/>
																
								
							</div>
							
							<input type="hidden" value="2" id="deletestat"/>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-danger" id="deletesubmit">Delete</div> 
						

					</form>


				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default closemodal" data-dismiss="modal">Close</button>
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
			
			
			
			var obj = JSON.parse('${shiftlist}'); 
			
			var table= $('#tblshift').DataTable({
				"paging" : true,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				
				{
					title : "Shift ID"
				}, 
				
				{
					title : "Description"
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
			
			
			
			$('#tblshift_filter').hide();
			
			
           $.each(obj, function(key, value) {


				
				var strVar="";
				strVar += "<div type=\"button\" class=\"btn btn-primary update\">Update<\/div>";
				
				var strVar2="";
				strVar2 += "<button type=\"button\" class=\"btn btn-danger delete\">Delete<\/button>";
				
				if(value.description==""){
					
					 $('#tblshift').DataTable().row.add(
								[value.strshiftid , value.description ,value.stringstate ,value.remarks ,"" ,"" ])
								.draw(); 
					
					
				}
				
				else{
					
					
					$('#tblshift').DataTable().row.add(
							[value.shiftid , value.description ,value.stringstate ,value.remarks ,strVar ,strVar2 ])
							.draw();
					
					
				}

				  
				 

			});
           
		
           $('#tblshift_wrapper').addClass("table-responsive");
			/* Makes tbl responsive */
			
			
			$( "#btnadd" ).click(function() {
				 
				/*  $('#modal1').modal('show'); */
				 
				 
				 $('#modal1').modal({
					 
					    backdrop: 'static',
					    keyboard: false  
					    
				});
				 
				 
				 
				
		    });
			
			
			$( ".update" ).click(function() {
				
				$('#tblshift tbody').on( 'click', 'tr', function () {
					
				     var shiftid = ( table.row( this ).data()[0] );
				     var shiftname = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				    
				     
				     
				     if(status=="Inactive"){
				    	 
				    	 $('#status2').prop('checked', false);
				    	   				    	
				    	 
				     }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status2').prop('checked', true);
				    	 
				    	 
				     }
				     
				     
				     
				     $('#shiftid2').val(shiftid).prop('disabled', true); 
				     $('#shiftname2').val(shiftname); 
				   
				     $('#remarks2').val(remarks);  
				    
				    /*  $('#modal2').modal('show');  */
				     
					 $('#modal2').modal({
						 
						    backdrop: 'static',
						    keyboard: false  
						    
					});
				     
				    
			 
				});
				 
				
				
		    });
			
			
			$( ".delete" ).click(function() {
				
				$('#tblshift tbody').on( 'click', 'tr', function () {
					
				     var shiftid = ( table.row( this ).data()[0] );
				     var shiftname = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				    
				     
				     
				     if(status=="Inactive"){
				    	 
				    	 $('#status3').prop('checked', false).prop('disabled', true);
				    	   				    	
				    	 
				     }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status3').prop('checked', true).prop('disabled', true);
				    	 
				    	 
				     }
				     
				     
				     
				     $('#shiftid3').val(shiftid).prop('disabled', true); 
				     $('#shiftname3').val(shiftname).prop('disabled', true); 
				   
				     $('#remarks3').val(remarks).prop('disabled', true);  
				    
				    /*  $('#modal3').modal('show'); */
				     
				     $('#modal3').modal({
						 
						    backdrop: 'static',
						    keyboard: false  
						    
					});
				     
				    
			 
				});
				 
				 
				
		    });
			
			
			$( "#addsubmit" ).click(function() {
				
				
				var stat = null;
				
				if($('#status').is(':checked')){
					
					
					stat = "1";
					console.log(stat);
				}
				
				else{
					
					stat = "0";
					console.log(stat);
				}
				
				
				
				
				
				var shiftname = $('#shiftname').val();
				var status = stat;
				var remarks = $('#remarks').val();
				
				
	
				
			if(shiftname==""){
					
					
			  document.getElementById("shiftnameerror").innerHTML = "Input field cannot be Empty";
			}
				
	
			
			
			else{
				
				
				var data = {
						
							
						"shiftname":shiftname,	
						"status":status,	
						"remarks":remarks
							
					}
				
				data = JSON.stringify(data);
				
				
				$.ajax({
					type : "POST",
					accept : "text/html",
					dataType : "html",
					url : "${pageContext.request.contextPath}/Shift/Submit?${_csrf.parameterName}=${_csrf.token}",
							
					data : ({
						
						"data" : data											

					}),
					
					success : function() {
						
						
						
						 location.reload(true);   						
						
					}

				});
				
		
				
			}
				 
				
				
		    });
			
			
			$( "#updatesubmit" ).click(function() {
				
				var stat2 = null;
				
				if($('#status2').is(':checked')){
					
					
					stat2 = "1";
					console.log(stat2);
				}
				
				else{
					
					stat2 = "0";
					console.log(stat2);
				}
				
			
				
				var shiftid = $('#shiftid2').val();
				var shiftname = $('#shiftname2').val();
				var status = stat2;
				var remarks = $('#remarks2').val();
				
				 

						
				if(shiftname==""){
							
							
					 document.getElementById("shiftnameerror2").innerHTML = "Input field cannot be Empty";
				}
						
						
						
				
				
				else{
					
					
					var data = {
							
							"shiftid":shiftid,	
							"shiftname":shiftname,	
							"status":status,	
							"remarks":remarks
								
						}
					
					data = JSON.stringify(data);
					
					console.log(data);
					
					
 					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Shift/Update?${_csrf.parameterName}=${_csrf.token}",
								
						data : ({
							
							"data" : data											

						}),
						
						success : function() {
							
							
							
							 location.reload(true);   						
							
						}

					}); 
					
					
					
					
				}
				
		    });
			
			
			$( "#deletesubmit" ).click(function() {
				
							 
				
				var shiftid = $('#shiftid3').val();
				var stat = $('#deletestat').val();
				
				
				
				 var data = {
						
						"shiftid":shiftid,	
						"status":stat
						
							
					}
					
					
					data = JSON.stringify(data);
					
					
					
 					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Shift/Delete?${_csrf.parameterName}=${_csrf.token}",
								
						data : ({
							
							"data" : data											

						}),
						
						success : function() {
							
							
							 location.reload(true);  	 			
							
						}

					}); 
				
	
				
				
		    });
			
			
            $( "#clrBtn" ).click(function() {
				
				
			    $('#shiftname').val("");
			    $('#remarks').val("");
				 
				 
			});
			
			
			
			$( ".closemodal" ).click(function() {
				
				
				 location.reload(true);  
				 
				 
			});
			
			
			$('#SearchField').keyup(function(){
				
				table.search($(this).val()).draw();  
				 			
				
			});
			
			
		

		});
		
		
	
		
	</script>

</body>

</html>
