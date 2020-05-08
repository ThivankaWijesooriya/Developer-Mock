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
				<h1 class="page-header">View IOU Return</h1>

               

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

						
						<form:form action="${pageContext.request.contextPath}/IOU_Return/CreateIouReturn/Submit"
						 method="POST"  modelAttribute="IOU">


							<div>

          

								<div class="form-group">

									<div class="row">
										<label class="col-sm-1" for="exampleInputEmail1">IOU No.
										</label>
										<div class="col-sm-6">
	
										<form:select path="iouno" class="form-control" id="iounum" readonly="true">
										
											<form:option value="" label="--- Select ---" />
											<form:options items="${iounolist}" />
											
										</form:select>

										<form:errors path="iouno" cssClass="error" />
										

										</div>
									</div>


								</div>

                                <form:input type="hidden" path="description" value="default"/>
                                <form:input type="hidden" path="ioudate" value="default"/>
                                <form:input type="hidden" path="category" value="default"/>

								<div class="form-group">

									<div class="row">
										<label class="col-sm-1" for="exampleInputEmail1">Amount</label>
										<div class="col-sm-6">
										
											<form:input class="form-control" placeholder="" path="amount" id="Amount" maxlength="13" readonly="true" />
											<form:errors path="amount" cssClass="error" />

										</div>
									</div>


								</div>


                               	<div class="form-group">

									<div class="row">
										<label class="col-sm-1" for="exampleInputEmail1">Is Iou Return</label>
										<div class="col-sm-6">
										
											<form:checkbox path="IsIouReturn" disabled="true"/>

										</div>
									</div>


								</div>
								
								
						   <div class="form-group" >

									<div class="row">
										<label class="col-sm-1" for="exampleInputEmail1">Reason</label>
										<div class="col-sm-6">
										
											<form:textarea class="form-control" path="returnComments" cols="4" rows="3" readonly="true"/>
											<form:errors path="returnComments" cssClass="error" />
											

										</div>
									</div>


						    </div>	
								


							</div>

							<div class="clearfix"></div>
							<div class="space-25"></div>


						    <div class="row">
								<span class="col-sm-1"></span>
								<div class="col-sm-6">
								
															 
									<div id="return" class="btn btn-sm btn-info">
									Return</div>
																	
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
	
	
	
	$("#iounum").change(function(){
	   
		
		var id = $('#iounum').val();
				
		
		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/GetAmount?iouid="+id+" ",
		
			success : function(response) {
				
				var result = JSON.parse(response);
				$('#Amount').val(result.amount);
				
			}

		}); 
		
			
	}); 
	
	
	 
	 
	 $("#return").click(function(){
		  
		 window.location.href = "${pageContext.request.contextPath}/IOU_Return";
		 
	 });
	 
	 
	

});

	
</script>

</body>

</html>
