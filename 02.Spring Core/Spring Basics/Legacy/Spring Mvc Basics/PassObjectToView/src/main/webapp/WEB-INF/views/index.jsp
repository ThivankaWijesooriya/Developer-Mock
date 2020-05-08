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
  
  
  <tr>
    <td><img src="${pageContext.request.contextPath}/resources/images/${stu.photo}.jpg"/></td>
    <td>${stu.id}</td> 
    <td>${stu.name }</td>
  </tr>

</table>



</body>

</html>
