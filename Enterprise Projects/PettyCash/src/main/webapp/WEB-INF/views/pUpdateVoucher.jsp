<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

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

<link href="<c:url value="/resources/css/datatables.min.css" />"
	rel="stylesheet" />

<style type="text/css">
.error {
	color: red;
}
</style>

</head>

<body>

	<div id="wrapper">

		<%@ include file="../common/navbar.jspf"%>

		<div id="page-wrapper">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Update Voucher</h1>



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


								<form:form
									action="${pageContext.request.contextPath}/Voucher/Update/Submit"
									method="POST" modelAttribute="voucher" id="formupdate">


									<div>



										<div class="form-group">

											<div class="row">

												<label class="col-sm-1" for="exampleInputEmail1">Voucher
													No.</label>

												<div class="col-sm-6">



													<form:input class="form-control" placeholder=""
														path="voucherno" readonly="true" />
													<form:errors path="voucherno" cssClass="error" />


												</div>
											</div>
										</div>



										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Category
												<span class="required">&nbsp;*</span></label>
												<div class="col-sm-6">

													<form:select path="category" class="form-control">
														<form:option value="" label="--- Select ---" />
														<form:options items="${CatListType}" />
													</form:select>

													<form:errors path="category" cssClass="error" />


												</div>
											</div>


										</div>



										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Description<span class="required">&nbsp;*</span></label>
												<div class="col-sm-6">
													<form:textarea rows="4" class="form-control" placeholder=""
														path="description" maxlength="80" />
													<form:errors path="description" cssClass="error" />

												</div>
											</div>


										</div>


										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Date<span class="required">&nbsp;*</span></label>
												<div class="col-sm-6">

													<form:input class="form-control" placeholder=""
														path="voucherdate" type="date" />
													<form:errors path="voucherdate" cssClass="error" />

												</div>
											</div>


										</div>


										<div id="hiddenset">

											<div class="form-group d-none" id="fromfield">

												<div class="row">
													<label class="col-sm-1" for="exampleInputEmail1">From<span class="required">&nbsp;*</span></label>
													<div class="col-sm-6">

														<form:input class="form-control" placeholder=""
															path="fromlocation" type="" />
														<form:errors path="fromlocation" cssClass="error" />
														<label id="lblerror1" style="color: red;"></label>

													</div>
												</div>


											</div>



											<div class="form-group d-none" id="tofield">

												<div class="row">
													<label class="col-sm-1" for="exampleInputEmail1">To<span class="required">&nbsp;*</span></label>
													<div class="col-sm-6">

														<form:input class="form-control" placeholder=""
															path="tolocation" type="" />
														<form:errors path="tolocation" cssClass="error" />
														<label id="lblerror2" style="color: red;"></label>

													</div>
												</div>


											</div>


											<div class="form-group d-none" id="viafield">

												<div class="row">
													<label class="col-sm-1" for="exampleInputEmail1">Via</label>
													<div class="col-sm-6">

														<form:input class="form-control" placeholder="" path="via"
															type="" />
														<form:errors path="via" cssClass="error" />
														<label id="lblerror3" style="color: red;"></label>

													</div>
												</div>


											</div>


										</div>




										<div class="form-group">

											<div class="row">

												<label class="col-sm-1" for="exampleInputEmail1">Is
													IOU Settlement</label>

												<div class="col-sm-6">


													<form:checkbox path="isiousettlement" id="issettle" />


												</div>

											</div>


										</div>


										<div class="form-group d-none" id="ioucolumn">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Settled
													IOU ID<span class="required">&nbsp;*</span></label>
												<div class="col-sm-6">


													<form:select path="settlediouno" class="form-control">
														<form:option value="" label="--- Select ---" />
														<form:options items="${ioucolumn}" />
													</form:select>

													<form:errors path="settlediouno" cssClass="error" />
													<label id="settleiderror" style="color: red;"></label>


												</div>
											</div>


										</div>




										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Amount<span class="required">&nbsp;*</span></label>
												<div class="col-sm-6">
													<form:input class="form-control" placeholder=""
														path="amount" id="Amount" />
													<form:errors path="amount" cssClass="error" />

												</div>
											</div>


										</div>




										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Remarks</label>
												<div class="col-sm-6">

													<form:textarea path="remarks" rows="4" class="form-control"
														maxlength="250" />
													<form:errors path="remarks" cssClass="error" />




												</div>
											</div>


										</div>




									</div>

									<div class="clearfix"></div>
									<div class="space-25"></div>


									<div class="row">
										<span class="col-sm-1"></span>
										<div class="col-sm-6">
											<button id="updatebtn" class="btn btn-sm btn-success">Update</button>
											
											&nbsp &nbsp
									
									        <div id="resetBtn" class="btn btn-sm btn-warning"> Reset</div>

											&nbsp &nbsp
											<div class="btn btn-sm btn-info" id="return">Return</div>
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
	

	 
	if($('input:checkbox[name=isiousettlement]').is(':checked')){
		
		
		 $("#ioucolumn").removeClass("d-none");
		 
	}
	
	else{
		
		
		$("#ioucolumn").addClass("d-none");
		
	}
	
	
	
	$("#issettle").click(function(){
		
		
		
		if($('input:checkbox[name=isiousettlement]').is(':checked')){
			
			 $("#ioucolumn").removeClass("d-none");
		}
		
		else{
			
			$("#ioucolumn").addClass("d-none");
			$("#settlediouno").val(null);
						
			
		}
		

		
	}); 
	
	
	
	var cat = $('#category').val();
	
	if(cat=='CAT00002'){
		
		$("#tofield").removeClass("d-none");
		$("#fromfield").removeClass("d-none");
		$("#viafield").removeClass("d-none");
		
		
	}
	
	else{
		
		$("#tofield").addClass("d-none");
		$("#fromfield").addClass("d-none");
		$("#viafield").addClass("d-none");
		
		$('#fromlocation').val(null);
		$('#tolocation').val(null);
		$('#via').val(null);
		
		
	}
	
	 
	$("#category").change(function(){
	    
		
		var cat = $('#category').val();
		
		if(cat=='CAT00002'){
			
			$("#tofield").removeClass("d-none");
			$("#fromfield").removeClass("d-none");
			$("#viafield").removeClass("d-none");
			
			
		}
		
		else{
			
			$("#tofield").addClass("d-none");
			$("#fromfield").addClass("d-none");
			$("#viafield").addClass("d-none");
			
			
			$('#fromlocation').val(null);
			$('#tolocation').val(null);
			$('#via').val(null);
			
			
		}
		
	}); 
	 
	  
	 
	 
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
		  
		 window.location.href = "${pageContext.request.contextPath}/Voucher";
		 
	 });
	 
	 
	 
    $("#resetBtn").click(function(){
		 
		 var vou = $('#voucherno').val();

		 
		 window.location.href = "${pageContext.request.contextPath}/Voucher/Update?vouid="+vou+"";  
		
		 
	 });
	 
	 
	  
	

});

	
</script>

</body>

</html>
