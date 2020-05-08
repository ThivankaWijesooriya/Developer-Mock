
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!doctype html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<title>PettyCash Login</title>
<!-- BOOTSTRAP CORE STYLE  -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" />
<!-- CUSTOM STYLE  -->
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" />


</head>

<body>

	<div class="container">
		<!-- Content goes here -->
		<div id="loginbox" class="mainbox">
			<div class="panel panel-info">
				<div class="panel-heading">

					<div class="panel-title">ONEzero Petty Cash</div>
				</div>

				<h3 class="form-signin-heading">User Login</h3>

				<div class="panel-body">

					<form id="loginform" class="form-horizontal" role="form"
						action="${pageContext.request.contextPath}/login/submit" method="POST">


						<div class="form-group">

							<div class="col-xs-15">

								<div>

									
									${loginErrormsg}
									
									
									<!--  <div class="alert alert-success col-xs-offset-1 col-xs-10">
                                    You have been logged out.</div>  -->
									
								      ${logoutmsg}


								</div>



							</div>


						</div>


						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="txtUserName"
								class="form-control" placeholder="username" name="username" type="text"/>
						</div>

						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="txtPassword"
								class="form-control" placeholder="password" name="password" type="password"/>
						</div>



						<div class="form-group">
							<!-- Button -->
							<div class="col-sm-12">
								<label class="warning lableFont"></label>
							</div>
							<div class="col-sm-12 controls">
								<button type="submit" class="btn btn-success">Login</button>
							</div>
						</div>

						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />

					</form>

				</div>
				<div class="panel-footer">
					<div class="form-group">
						<div class="col-md-12 control">
							<div>
								Solution by <img
									src="<c:url value="/resources/images/onezero_logo_small.png" />"
									style="width: 60px; margin-bottom: 4px;" />

							</div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>


	<!-- CORE JQUERY SCRIPTS -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>


	<!-- BOOTSTRAP SCRIPTS  -->
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>
</html>
