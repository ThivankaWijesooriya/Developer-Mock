<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>

    <style>
        
        
        img {

            width: 60px;
            height: 60px;
        }

    </style>


</head>

<body>

<table>

  <tr>
    <th>Profile Pic</th>
    <th>Id</th> 
    <th>Name</th>
  </tr>
  
  <c:forEach var = "student" items="${stu}">
  
    <tr>
    <td><img src="${pageContext.request.contextPath}/resources/images/${student.photo}.jpg"/></td>
    <td>${student.id}</td> 
    <td>${student.name }</td>
   </tr>
  
  
  </c:forEach>


</table>



</body>

</html>
