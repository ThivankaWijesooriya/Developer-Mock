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
				<h1 class="page-header">PettyCash Float</h1>



				<div class="space-20"></div>
				
				<div class="row rt-info">
						<div class="col-lg-4 col-md-4 col-sm-12">
							<label>Balance :</label><label> ${balance} </label>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12">
							<label></label><label></label>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-12">
							<label>Reporting Officer :</label><label> ${rptoff} </label>
						</div>
					    </div>
				
				<div class="space-20"></div>

				<div class="panel panel-warning">

					<div class="panel-body">

						
						<form:form action="${pageContext.request.contextPath}/PettyCashFloat/Update/Submit"
							method="POST" modelAttribute="cheque" enctype="multipart/form-data">


							<div class="col-md-8">



								<div class="form-group">

									<div class="row">
										<label class="col-sm-2" for="exampleInputEmail1">Cheque No.
										<span class="required">&nbsp *</span></label>
										<div class="col-sm-6">
	
											
                                             <form:input class="form-control" placeholder="" path="chequeno"  readonly="true"  maxlength="80"/>
											 <form:errors path="chequeno" cssClass="error" />


										</div>
									</div>


								</div>



								<div class="form-group">

									<div class="row">
										<label class="col-sm-2" for="exampleInputEmail1">Amount <span class="required">&nbsp *</span> </label>
										<div class="col-sm-6">
										
											<form:input class="form-control" placeholder="" path="amount" id="Amount"  maxlength="13" />
											<form:errors path="amount" cssClass="error" />

										</div>
									</div>


								</div>
								
								
								<div class="form-group">

									<div class="row">
										<label class="col-sm-2" for="exampleInputEmail1">Reorder Amount</label>
										<div class="col-sm-6">
										
											<form:input class="form-control" placeholder="" path="reorderamount"  maxlength="13" />
											<form:errors path="reorderamount" cssClass="error" />

										</div>
									</div>


								</div>


                               	<div class="form-group">

									<div class="row">
										<label class="col-sm-2" for="exampleInputEmail1">Cheque Date <span class="required">*</span> </label>
										<div class="col-sm-6">
										
											<form:input class="form-control" placeholder="" path="chequedt"  type="date"/>											
										    <form:errors path="chequedt" cssClass="error" /> 

										</div>
									</div>


								</div>
								
								
							<div class="form-group" id="fromfield">
	
										<div class="row">
											<label class="col-sm-2" for="exampleInputEmail1">Upload Cheque</label>
											<div class="col-sm-6">
											
												<form:input  path="multipartimage"  type="file" value=""/>
											    <form:errors path="multipartimage" cssClass="error" /> 
	
											</div>
										</div>
	
	
							</div>	
						    
						    
						    <div class="clearfix"></div>
							<div class="space-25"></div>


							<div class="row">
								<span class="col-sm-2"></span>
								<div class="col-sm-6">
									
									<button type="submit" class="btn btn-sm btn-success"
									>Update</button>
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


<div id="document" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      
      </div>
      <div class="modal-body">
      
          <img src="data:image/jpeg;base64, ${img}">
       
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
		
	
	$("#Amount").on("input", function(evt) {
		
		   var self = $(this);
		   self.val(self.val().replace(/[^0-9\.]/g, ''));
		   
		    var number = ($(this).val().split('.'));
		    if (number[1].length > 2)
		    {
		       
		    	
		    	var num = parseFloat($("#Amount").val());
		        $("#Amount").val( num.toFixed(2)); 
		        
  
		        
		    }
		   		 		   
		   
		   if ((evt.which != 46 || self.val().indexOf('.') != -1) && (evt.which < 48 || evt.which > 57)) 
		   {
			  			   		   
		     evt.preventDefault();
		     
		   }
		   
	});
	

	
	 
	 
	 $("#return").click(function(){
		  
		 window.location.href = "${pageContext.request.contextPath}/PettyCashFloat";
	 });
	 
	 
	 
	 $("#opendoc").click(function(){
		 
		 
		 $('#document').modal({
			 
			    backdrop: 'static',
			    keyboard: false  
			    
		 });
		
	 });
	

});

	
</script>

</body>

</html>
