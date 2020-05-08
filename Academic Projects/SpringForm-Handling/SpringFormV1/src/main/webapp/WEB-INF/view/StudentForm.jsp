<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/semantic.min.css">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js">  </script>
<script
	src="${pageContext.request.contextPath}/resources/js/semantic.min.js">  </script>


<style type="text/css">
#formid {
	padding: 15% 25% 25% 25%;
}

.error {
	color: red;
}
</style>

</head>


<body>

	<form:form class="ui form" id="formid"
		action="${pageContext.request.contextPath}/StudentForm/Submit"
		method="POST" modelAttribute="Student">
		<h1>LOGIN FORM</h1>
		<br />
		<div class="field">
			<label>Name</label>
			<form:input type="text" placeholder="" path="Name" />
			<form:errors path="Name" cssClass="error" />
		</div>
		<div class="field">
			<label>School</label>
			<form:input type="password" placeholder="" path="School" />
			<form:errors path="School" cssClass="error" />
		</div>

		<div class="field">

			<label>Age</label>
			<form:input type="text" path="age" name="age" />
			<form:errors path="age" cssClass="error" />

		</div>
		<div class="field">
			<label>Enrollment</label>
			<form:input type="date" placeholder="" path="Enrollment" />
			<form:errors path="Enrollment" cssClass="error" />
		</div>

		<div class="field">
			<label>Graduation</label>
			<form:input type="date" placeholder="" path="Graduation" />
			<form:errors path="Graduation" cssClass="error" />
		</div>

		<div class="field">
			<label>Email</label>
			<form:input type="text" placeholder="" path="Email" />
			<form:errors path="Email" cssClass="error" />
		</div>

		<div class="field">
			<label>License</label>
			<form:input type="text" placeholder="" path="license.number" />
			<form:errors path="license.number" cssClass="error" />
		</div>

		<div class="field">
			<label>Teacher1</label>
			<form:input type="text" placeholder="" path="teacherlist[0].teachername" />
			<form:errors path="teacherlist[0].teachername" cssClass="error" />
		</div>

		<div class="field">
			<label>Teacher2</label>
			<form:input type="text" placeholder="" path="teacherlist[1].teachername" />
			<form:errors path="teacherlist[1].teachername" cssClass="error" />
		</div>

		<div class="two fields">

			<div class="field">
				<button class="ui button primary" type="submit">Submit</button>
			</div>

			<div class="field">
				<button class="ui button">Discard</button>
			</div>

		</div>

	</form:form>


</body>
</html>