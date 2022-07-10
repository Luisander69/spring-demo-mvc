<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>MVC-Input form</title>
<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" >
</head>
<body>

	<form action="processForm" method="GET">
		<input type="text" name="studentName"
			placeholder="What is your name?"/>
		<input type="submit" />
	</form>

</body>
</html>