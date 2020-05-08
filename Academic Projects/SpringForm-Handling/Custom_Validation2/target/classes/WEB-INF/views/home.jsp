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

 
<label>Category</label>

<br/>

<form:input type="text" path="category"/> 

<br/>

<form:errors path="category" cssClass="error"/>

<br/> 

<label>Location</label>

<br/>

<form:input type="text" path="location"/> 

<br/>



<br/> <br/>

<input type="submit" value="Submit">

</form:form>

</div>
<div class="right-bar"></div>


</div>

</body>
</html>