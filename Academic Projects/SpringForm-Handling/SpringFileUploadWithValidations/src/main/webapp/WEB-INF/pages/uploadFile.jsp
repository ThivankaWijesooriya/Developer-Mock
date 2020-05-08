

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
 <form:form method="POST" action="uploadFile" enctype="multipart/form-data" modelAttribute="fileUploadModel">
        File to Upload: <form:input type="file" name="file" path="file"/></br> </br> 
        <form:errors path="file" style="color:red;"/>
        <input type="submit" value="Upload"></br>
        
 </form:form>
</body>
</html>