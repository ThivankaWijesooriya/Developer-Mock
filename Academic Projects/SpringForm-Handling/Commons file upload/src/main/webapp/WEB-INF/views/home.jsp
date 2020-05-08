<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
	
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js"></script>

	<script
		src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js">
		
	</script>

<style>

.error{

  color:red;
}

</style>
</head>
<body>


<form:form  action="${pageContext.request.contextPath}/Submit" method="POST" modelAttribute="mapfile" enctype="multipart/form-data">

 
 <form:input type="file" path="picture"/> <br> <br>
 <form:errors path="picture" cssClass="error" />
  <br> <br> <br>
  
  <form:input type="text" path="message"/> <br>
  <form:errors path="message" cssClass="error" />
 
  <input type="submit" value="Submit"> 

</form:form>

<table id="tblUnitdetails" class="ui single line table"></table>


	<script>
		/* var obj = JSON.parse('${pic}'); */
		$('#tblUnitdetails').DataTable({
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,
			columns : [ {
				title : "Image"
			} 
			
			]
		});
		$('#tblUnitdetails_filter').hide();
		$.each(obj, function(key, value) {
			
		
			/*  console.log(value.id); */
			/* $('#tblUnitdetails').DataTable().row.add(
					[ value.profilepic]).draw();  */
		});
	</script>

</body>
</html>