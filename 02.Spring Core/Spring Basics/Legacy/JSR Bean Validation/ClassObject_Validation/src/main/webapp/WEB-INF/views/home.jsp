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

<form:form action="${pageContext.request.contextPath}/Form/Submit" method="POST" modelAttribute="department">

<label> Department Name</label>

<br/>

<form:input type="text" path="deptname"/> 

<br/>

<form:errors path="deptname" cssClass="error"/>

<br/> 

<label> Student Name 1</label>

<br/> 

<form:input type="text" path="studentList[0].name"/> 

<br/>

<form:errors path="studentList[0].name" cssClass="error"/>

<br/>

<label> Student Name 2</label>

<br/>
<form:input type="text" path="studentList[1].name"/> 

<br/>

<form:errors path="studentList[1].name" cssClass="error"/>

<br/> <br/>
<input type="submit" value="Submit">

</form:form>

</div>

<div class="right-bar"></div>


</div>

</body>
</html>