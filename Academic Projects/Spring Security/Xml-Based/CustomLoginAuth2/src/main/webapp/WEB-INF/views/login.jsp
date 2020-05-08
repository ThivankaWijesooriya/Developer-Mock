
<%@ include file="../common/Header.jspf"%>
<div class="container">

	<c:url value="/login" var="loginVar" />
	<form id="appointment-form" action="${loginVar}" method="POST">


		<!-- Check for login error -->

		<c:if test="${param.error != null}">

			<!-- <div class="alert alert-danger col-xs-offset-1 col-xs-10">
				Invalid username or password.</div> -->
				
		<p style = "color:red;"> Invalid username or password</p>		

		</c:if>
		
		




		<div class="form-group">
			<label for="make">Username</label> <input name="custom_username"
				class="form-control" />
		</div>
		<div class="form-group">
			<label for="model">Password</label> <input type="password"
				name="custom_password" class="form-control" />
		</div>
		<sec:csrfInput />
		<button type="submit" id="btn-save" class="btn btn-primary">Login</button>
	</form>
</div>
</body>
</html>