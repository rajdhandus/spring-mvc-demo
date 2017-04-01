<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName"></form:input>
<br/><br/>
Last Name:<form:input path="lastName"></form:input>
<br/><br/>
		<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>
		<br/><br/>
		Favourite Programming Language :
		<br/><br/>
		Java <form:radiobutton path="favouriteLanguage" value="Java"></form:radiobutton>
		JavaScript <form:radiobutton path="favouriteLanguage" value="JavaScript"></form:radiobutton>
		C# <form:radiobutton path="favouriteLanguage" value="C#"></form:radiobutton>
		C++ <form:radiobutton path="favouriteLanguage" value="C++"></form:radiobutton>
		<br/><br/>
		<input type="submit" value="SUBMIT" />
		<br/><br/>
	</form:form>
</body>
</html>