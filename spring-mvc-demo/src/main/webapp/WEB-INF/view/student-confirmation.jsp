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
<p>Congrats!!!</p>
</body>
</html>