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
						<h1 class="page-header">Authorize Voucher</h1>



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


								<form:form action="" method="POST" modelAttribute="voucher"
									id="formId">



									<div>

										<input type="hidden" id="actionstat" name="actionstat"
											value="" />


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
												</label>
												<div class="col-sm-6">


													<form:select path="category" class="form-control"
														readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:options items="${CatListType}" />
													</form:select>

													<form:errors path="category" cssClass="error" />


												</div>
											</div>


										</div>



										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Description</label>
												<div class="col-sm-6">
													<form:textarea rows="4" class="form-control" placeholder=""
														path="description" maxlength="80" readonly="true" />
													<form:errors path="description" cssClass="error" />

												</div>
											</div>


										</div>


										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Date</label>
												<div class="col-sm-6">

													<form:input class="form-control" placeholder=""
														path="voucherdate" type="date" readonly="true" />
													<form:errors path="voucherdate" cssClass="error" />

												</div>
											</div>


										</div>




										<div class="form-group d-none" id="fromfield">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">From</label>
												<div class="col-sm-6">

													<form:input class="form-control" placeholder=""
														path="fromlocation" type="" readonly="true" />
													<form:errors path="fromlocation" cssClass="error" />

												</div>
											</div>


										</div>



										<div class="form-group d-none" id="tofield">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">To</label>
												<div class="col-sm-6">

													<form:input class="form-control" placeholder=""
														path="tolocation" type="" readonly="true" />
													<form:errors path="tolocation" cssClass="error" />

												</div>
											</div>


										</div>


										<div class="form-group d-none" id="via">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Via</label>
												<div class="col-sm-6">

													<form:input class="form-control" placeholder="" path="via"
														type="" readonly="true" />
													<form:errors path="via" cssClass="error" />

												</div>
											</div>


										</div>


										<div class="form-group">

											<div class="row">

												<label class="col-sm-1" for="exampleInputEmail1">Is
													IOU Settlement</label>

												<div class="col-sm-6">


													<form:checkbox path="isiousettlement" id="issettle"
														readonly="true" />


												</div>

											</div>


										</div>


										<div class="form-group d-none" id="ioucolumn">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Settled
													IOU ID</label>
												<div class="col-sm-6">


													<form:select path="settlediouno" class="form-control"
														readonly="true">
														<form:option value="" label="--- Select ---" />
														<form:options items="${ioucolumn}" />
													</form:select>

													<form:errors path="settlediouno" cssClass="error" />


												</div>
											</div>


										</div>


										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Amount</label>
												<div class="col-sm-6">
													<form:input class="form-control" placeholder=""
														path="amount" id="Amount" maxlength="13" readonly="true" />
													<form:errors path="amount" cssClass="error" />

												</div>
											</div>


										</div>





										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Remarks</label>
												<div class="col-sm-6">

													<form:textarea path="remarks" rows="4" class="form-control"
														maxlength="250" readonly="true" />
													<form:errors path="remarks" cssClass="error" />




												</div>
											</div>


										</div>

										<div class="form-group">

											<div class="row">
												<label class="col-sm-1" for="exampleInputEmail1">Comments</label>
												<div class="col-sm-6">

													<textarea rows="4" class="form-control" maxlength="250"
														name="comments" id="comments" value=""> ${authcomments}</textarea>
													<label id="commenterror" style="color: red;"> </label>


												</div>
											</div>


										</div>




									</div>

									<div class="clearfix"></div>
									<div class="space-25"></div>


									<div class="row">
										<span class="col-sm-1"></span>
										<div class="col-sm-6">
											<!-- <div id="approveBTN" class="btn btn-sm btn-primary">Authorize</div>
											&nbsp &nbsp -->

									<!-- <div id="rejectBTN" class="btn btn-sm btn-danger">Reject</div> -->
											
									<c:choose>
									
										<c:when test="${AuthReject}">
										
										     <button id="approveBTN" class="btn btn-sm btn-primary" disabled>Authorize</button>
											 &nbsp &nbsp
												   									    								        
											   <button id="rejectBTN" class="btn btn-sm btn-danger"
											   disabled>Reject</button>
												   
										</c:when>
												  
										<c:otherwise>
										
										   <div id="approveBTN" class="btn btn-sm btn-primary">Authorize</div>
											&nbsp &nbsp
												    
									       <div id="rejectBTN" class="btn btn-sm btn-danger">Reject</div>
												    
										</c:otherwise>
										  
								   </c:choose>
											
											
											
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


	<div id="confirm" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Authorize Confirmation</h4>
				</div>
				<div class="modal-body">
					<p>Are You Sure you want to Authorize ?</p>
				</div>


				<div class="modal-footer">

					<div type="button" id="accept" class="btn btn-primary pull-left"
						data-dismiss="modal">Yes</div>

					<button type="button" class="btn btn-default pull-left"
						data-dismiss="modal">No</button>

				</div>
			</div>

		</div>
	</div>


	<div id="reject" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Rejection Confirmation</h4>
				</div>
				<div class="modal-body">
					<p>Are You Sure you want to Reject ?</p>
				</div>


				<div class="modal-footer">

					<div type="button" id="decline" class="btn btn-primary pull-left"
						data-dismiss="modal">Yes</div>

					<button type="button" class="btn btn-default pull-left"
						data-dismiss="modal">No</button>

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
		$(document)
				.ready(
						function() {
							
							sessionStorage.setItem("viewMode", "true");

							if ($('input:checkbox[name=isiousettlement]').is(
									':checked')) {

								$("#ioucolumn").removeClass("d-none");
							}

							else {

								$("#ioucolumn").addClass("d-none");

							}

							var cat = $('#category').val();

							if (cat == 'CAT00002') {

								$("#tofield").removeClass("d-none");
								$("#fromfield").removeClass("d-none");
								$("#via").removeClass("d-none");

							}

							else {

								$("#tofield").addClass("d-none");
								$("#fromfield").addClass("d-none");
								$("#via").addClass("d-none");

							}

							$('#approveBTN').click(function() {

								$('#confirm').modal({

									backdrop : 'static',
									keyboard : false

								});

							});

							$('#accept')
									.click(
											function() {

												$('#formId')
														.attr('action',
																'${pageContext.request.contextPath}/Voucher/Authorize/Submit')
														.submit();

											});

							$('#rejectBTN')
									.click(
											function() {

												var cmt = $('#comments').val().trim();

												if (cmt == "") {

													document
															.getElementById("commenterror").innerHTML = "Comments for Voucher Rejection cannot be Empty";

												}

												else {

													document
															.getElementById("commenterror").innerHTML = "";

													$('#reject').modal({

														backdrop : 'static',
														keyboard : false

													});

												}

											});

							$('#decline')
									.click(
											function() {

												$('#actionstat').val(
														'AuthRejectVOU');

												$('#formId')
														.attr('action',
																'${pageContext.request.contextPath}/Voucher/Reject/Submit')
														.submit();

											});

							

							$("#category").change(function() {

								var cat = $('#category').val();

								if (cat == 'CAT00002') {

									$("#tofield").removeClass("d-none");
									$("#fromfield").removeClass("d-none");
									$("#via").removeClass("d-none");

								}

								else {

									$("#tofield").addClass("d-none");
									$("#fromfield").addClass("d-none");
									$("#via").addClass("d-none");

								}

							});

							$("#return")
									.click(
											function() {

												window.location.href = "${pageContext.request.contextPath}/Request/Authorize/Inquiry";
											});

						});
	</script>

</body>

</html>
