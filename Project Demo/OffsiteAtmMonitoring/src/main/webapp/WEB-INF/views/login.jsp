<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>Offsite ATM Condition Monitoring</title>
<!-- BOOTSTRAP CORE STYLE  -->

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/resources/css/custom.css"
	rel="stylesheet" type="text/css">


</head>

<body>

	<div class="container">
		<!-- Content goes here -->
		<div id="loginbox" class="mainbox">
			<div class="panel panel-info">
				<div class="panel-heading">

					<div class="panel-title">Offsite ATM Condition Monitoring</div>
				</div>

				<h3 class="form-signin-heading">User Login</h3>
				
				<c:if test="${param.error != null}">
				
                    <div class="alert alert-danger col-xs-offset-1 col-xs-10" role="alert" style="text-align:center">Invalid username and password.</div>
                    
                </c:if>
                
                <c:if test="${param.logout != null}">
                
                   <div class="alert alert-success col-xs-offset-1 col-xs-10" role="alert" style="text-align:center">You have been logged out.</div>                
                
                </c:if>


				<div class="panel-body">

					<form:form id="loginform" class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/login">

						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="txtUserName"
								class="form-control" placeholder="username" name="username"/>
						</div>

						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="txtPassword"
								type="password" class="form-control" placeholder="password" name="password"/>
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
					</form:form>
					
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

				</div>
				<div class="panel-footer">
					<div class="form-group">
						<div class="col-md-12 control">
							<div>
								Solution by <img
									src="${pageContext.request.contextPath}/resources/images/onezero_logo_small.png"
									style="width: 60px; margin-bottom: 4px;" />
							</div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.js">
		
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.js">
		
	</script>

</body>
</html>
