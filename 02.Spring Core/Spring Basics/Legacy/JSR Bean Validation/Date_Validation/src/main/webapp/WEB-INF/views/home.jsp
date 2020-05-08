<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
 
</head>
<body>

<div class="container">

<div class="left-bar"></div>
<div class="center-bar">

<form:form action="${pageContext.request.contextPath}/Form/Submit" method="POST" modelAttribute="student">

<label>Name</label>

<br/>

<form:input type="text" path="name"/> 

<br/>

<form:errors path="name" cssClass="error"/>

<br/>

<label>Enrollment Date</label>

<br/>

<form:input type="date" path="enrollment"/> 

<br/>

<form:errors path="enrollment" cssClass="error"/>

<br/>
<label>Graduation Date</label>

<br/>

<form:input type="date" path="graduation"/> 

<br/>

<form:errors path="graduation" cssClass="error"/>

<br/> <br/>

<input type="submit" value="Submit">

</form:form>

</div>
<div class="right-bar"></div>


</div>

</body>
</html>