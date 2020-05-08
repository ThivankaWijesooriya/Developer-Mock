	
	<%@ include file ="../common/Header.jspf" %>
	<div class="container">
		
		<c:url value="/login" var="loginVar"/>
		<form id="appointment-form" action="${loginVar}" method="POST">
			<div class="form-group">
				<label for="make">Username</label>
				<input name="custom_username" class="form-control" />
			</div>
			<div class="form-group">
				<label for="model">Password</label>
				<input type="password" name="custom_password" class="form-control" />
			</div>
			<sec:csrfInput/>
			<button type="submit" id="btn-save" class="btn btn-primary">Login</button>
		</form>
	</div>
</body>
</html>