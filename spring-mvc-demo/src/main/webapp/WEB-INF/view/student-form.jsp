<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
  <link rel="stylesheet" type="text/css"
  href="${pageContext.request.contextPath}/resources/css/styles2.css">
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br><br>
	Last name: <form:input path="lastName" />
	<br><br>
	Country:
	<form:select path="country">
		<form:options items="${student.countryOptions}" />
	</form:select>
	<br><br>
	Favorite Language:
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	<br><br>
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/>
	<br><br>
	
	<input type="submit" value="Submit"/> 
	</form:form>


</body>
</html>