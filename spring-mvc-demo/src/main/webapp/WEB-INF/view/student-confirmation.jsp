<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/resources/css/styles2.css">

</head>
<body>

<h1>The student is confirmed: ${student.firstName} ${student.lastName}</h1>
<br><br>
<h1>You come from ${student.country}</h1>
<br><br>
<h1>Your Language is ${student.favoriteLanguage}</h1>
<br><br>
<h1>Operating systems you are using:</h1>
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li> ${temp} </li>
	</c:forEach>
</ul>

<p>Congrats!!!</p>
</body>
</html>