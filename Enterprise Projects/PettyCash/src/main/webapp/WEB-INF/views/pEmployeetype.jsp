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
						<h1 class="page-header">Employee Type Details</h1>

						<!-- <ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Blank Page</li>
						</ol> -->


						<button type="button" class="btn btn-success" id="btnadd">Add Employee Type</button>
						
						<input type="text" placeholder="Search" class="table-search form-control" id="SearchField">

						<div class="space-20"></div>

						<div class="panel panel-warning">
							
							<div class="panel-body">

                               <!--  <br/> <br/> -->
								<table class="table" id="tblemployeetype">
									
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

					<form action="${pageContext.request.contextPath}/Employeetype/Submit" method="POST">


						<div>

							


							<div class="form-group">
								
								<label for="exampleInputEmail1">Description <span class="required">&nbsp *</span></label> 
								<input class="form-control" placeholder="" id="emptypedes"/>
								<label id="emptypedeserror" style="color: red;"> </label>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status" checked>Active</label>
                              
                            </div>
								
								


							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							 <input class="form-control" placeholder="" id="emptyperemarks"/>
							 <label id="emptyperemarkserror" style="color: red;"> </label>
								
								
								
							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-success" id="submitemptype">Submit</div> &nbsp &nbsp
						<div class="btn btn-sm btn-warning" id="clrBtn" >Clear</div>

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

					<form action="${pageContext.request.contextPath}/Employeetype/Update" method="POST">


						<div>

							<div class="form-group">
								
								<label for="exampleInputEmail1">Employee Type ID</label> 
								<input class="form-control" placeholder="" id="emptypeid2"/>
									
							
								
							</div>


							<div class="form-group">
								
								<label for="exampleInputEmail1">Description <span class="required">&nbsp *</span></label> 
								<input class="form-control" placeholder="" id="emptypedes2"/>
								<label id="emptypedeserror2" style="color: red;"> </label>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status <span class="required">&nbsp *</span></label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status2">Active</label>
                              
                            </div>
								
								


							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							<input class="form-control" placeholder="" id="emptyperemarks2"/>
								
								
								
							</div>



						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-primary" id="updateemptype">Update</div> 
						

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

					<form action="${pageContext.request.contextPath}/Employeetype/Delete" method="POST">


						<div>

							<div class="form-group">
								
								<label for="exampleInputEmail1">Employee Type ID</label> 
								<input class="form-control" placeholder="" id="emptypeid3"/>
									
							
								
							</div>


							<div class="form-group">
								
								<label for="exampleInputEmail1">Description</label> 
								<input class="form-control" placeholder="" id="emptypedes3"/>
									
								
								
							</div>

							<div class="form-group">

								<label for="exampleInputEmail1">Status</label> 
								
							<div class="checkbox form-control">
                              
                              <label><input type="checkbox" value="" id="status3">Active</label>
                              
                            </div>
								
								


							</div>


							<div class="form-group">
							
							<label for="exampleInputEmail1">Remarks</label>
							<input class="form-control" placeholder="" id="emptyperemarks3"/>
								
								
								
							</div>

                            <input type="hidden" value="2" id="deletestat">

						</div>

						<div class="clearfix"></div>
						<div class="space-25"></div>


						
						<div type="submit" class="btn btn-sm btn-danger" id="deleteemptype">Delete</div> 
						

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
			
					
			
			var obj = JSON.parse('${employeetypelist}'); 
			
			
			var table= $('#tblemployeetype').DataTable({
				
				
				"paging" : true,
				"ordering" : false,
				"info" : false,
				"search" : false,
				
				columns : [ 
				
				
				{
					title : "Employee Type ID"
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
			
			$('#tblemployeetype_filter').hide();
			
			
			$.each(obj, function(key, value) {


				
				var strVar="";
				strVar += "<div type=\"button\" class=\"btn btn-primary update\">Update<\/div>";
				
				var strVar2="";
				strVar2 += "<div type=\"button\" class=\"btn btn-danger delete\">Delete<\/div>";
				
				if(value.description == ""){
					
					
					$('#tblemployeetype').DataTable().row.add(
							[value.stremptypeid , value.description,value.Stringstatus,value.remarks,"","" ])
							.draw(); 
					
					
				}
				
				else{
					
					
					$('#tblemployeetype').DataTable().row.add(
							[value.emptypeid , value.description,value.Stringstatus,value.remarks,strVar,strVar2 ])
							.draw();
					
					
				}

				  
				 

			});
			
			$('#tblemployeetype_wrapper').addClass("table-responsive");
			/* Makes tbl responsive */
	
			
			$( "#btnadd" ).click(function() {
				 
				 /* $('#modal1').modal('show'); */
				 
				 $('#modal1').modal({
					 
					    backdrop: 'static',
					    keyboard: false  
					    
				 });
				
		    });
			
			
			$( ".update" ).click(function() {
				 
				/*  $('#modal2').modal('show');  */
				
				$('#tblemployeetype tbody').on( 'click', 'tr', function () {
					
				     var emptypeid = ( table.row( this ).data()[0] );
				     var desc = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				    
				     
				     
 				     if(status=="Inactive"){
 				    	 
				    	 
				    	 $('#status2').prop('checked', false);
				    	   				    	
				    	 
				     }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status2').prop('checked', true);
				    	 
				    	 
				     }
				     				     
				     
				     
				     $('#emptypeid2').val(emptypeid).prop('disabled', true);
				     $('#emptypedes2').val(desc); 
				   
				     $('#emptyperemarks2').val(remarks); 
				     
				     
				     $('#modal2').modal({
						 
						    backdrop: 'static',
						    keyboard: false  
						    
					 });
				
				     
				    
			 
				});
				
				
	
				
		    });
			
			
			
			$( ".delete" ).click(function() {
				 
				/* $('#modal3').modal('show');  */
				
			$('#tblemployeetype tbody').on( 'click', 'tr', function () {
					
				     var emptypeid = ( table.row( this ).data()[0] );
				     var desc = ( table.row( this ).data()[1] );
				     var status = ( table.row( this ).data()[2] );
				     var remarks = ( table.row( this ).data()[3] );
				    
				     
				     
 				     if(status=="Inactive"){
 				    	 
				    	 
				    	 $('#status3').prop('checked', false).prop('disabled', true);
				    	   				    	
				    	 
				     }
				     
				     else
				    	 
				     {
				    	 
				    	 $('#status3').prop('checked', true).prop('disabled', true);
				    	 
				    	 
				     }
				     				     
				     
				     
				     $('#emptypeid3').val(emptypeid).prop('disabled', true); 
				     $('#emptypedes3').val(desc).prop('disabled', true); 
				   
				     $('#emptyperemarks3').val(remarks).prop('disabled', true); 
				     
				     
				     $('#modal3').modal({
						 
						    backdrop: 'static',
						    keyboard: false  
						    
					 });
							     
				    
			 
				});
				
							
				
		    });
			
			
			$( "#submitemptype" ).click(function() {
				
				
				var stat = null;
				
				if($('#status').is(':checked')){
					
					
					stat = "1";
					
				}
				
				else{
					
					stat = "0";
					
				}
				
				
				
				var emptypedes = $('#emptypedes').val();
				var status = stat;
				var remarks = $('#emptyperemarks').val();
				
				
			       
			      
						
					if(emptypedes==""){
							
							
					  document.getElementById("emptypedeserror").innerHTML = "Input field cannot be Empty";
					  
					}
											
											
					
					else{
						
						
						
						var data = {
								
									
								"emptypedes":emptypedes,	
								"status":status,	
								"remarks":remarks
									
						}
						
						data = JSON.stringify(data);
						
						console.log(data);
						
						
						$.ajax({
							type : "POST",
							accept : "text/html",
							dataType : "html",
							url : "${pageContext.request.contextPath}/Employeetype/Submit?${_csrf.parameterName}=${_csrf.token}",
									
						 	data : ({
								
								"data" : data											

							}), 
							
							success : function() {
								
								
								
								 location.reload(true);   						
								
							}

						});
						
						
						
					}
							 
				 
			});
			
			
			$( "#updateemptype" ).click(function() {
				
				
	            var stat2 = null;
				
				if($('#status2').is(':checked')){
					
					
					stat2 = "1";
					console.log(stat2);
				}
				
				else{
					
					stat2 = "0";
					console.log(stat2);
				}
				
				
				
				
				var emptypeid = $('#emptypeid2').val();
				var emptypedes = $('#emptypedes2').val();
				var status = stat2;
				var remarks = $('#emptyperemarks2').val();
				
				
				if(emptypedes==""){
					
					
				  document.getElementById("emptypedeserror2").innerHTML = "Input field cannot be Empty";
					  
				}
				
				else{
					
					
					
					var data = {
							
							"emptypeid":emptypeid,	
							"emptypedes":emptypedes,	
							"status":status,	
							"remarks":remarks
								
					}
					
					data = JSON.stringify(data);
					
					console.log(data);
					
					
					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Employeetype/Update?${_csrf.parameterName}=${_csrf.token}",
								
					 	data : ({
							
							"data" : data											

						}), 
						
						success : function() {
							
							
							
							 location.reload(true);   	 				
							
						}

					});
					
										
					
				}
				

				
			 
				 
			});
			
			
			
			
			$( "#deleteemptype" ).click(function() {
				
				var emptypeid = $('#emptypeid3').val();
				var stat = $('#deletestat').val();
				
				
				
				 var data = {
						
						"emptypeid":emptypeid,		
						"status":stat
						
							
					}
					
					
					data = JSON.stringify(data);
					
				    console.log(data);
					
					
 					$.ajax({
						type : "POST",
						accept : "text/html",
						dataType : "html",
						url : "${pageContext.request.contextPath}/Employeetype/Delete?${_csrf.parameterName}=${_csrf.token}",
								
						data : ({
							
							"data" : data											

						}), 
						
						success : function() {
							
							
							 location.reload(true);  	 		
							
						}

					}); 
				
				 
				 
			});
			
			
            $( "#clrBtn" ).click(function() {
				
				
			    $('#emptypedes').val("");
			    $('#emptyperemarks').val("");
				 
				 
			});
			
			
			$( ".closemodal" ).click(function() {
				
				
				 location.reload(true);  
				 
				 
			});
			
			
			  
			$('#SearchField').keyup(function(){
				table.search($(this).val()).draw() ;
			});
		

		});
		
	</script>

</body>

</html>
