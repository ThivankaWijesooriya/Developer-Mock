<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
	
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} 
		</h2>
		
		<p>Your Session id is: "${pageContext.request.session.id}"</p>
		<h2>User : ${user} </h2>
		
	</c:if>
	


</body>
</html>
