<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName" />

		<br />
		<br />

Last Name : <form:input path="lastName" />

		<br />
		<br />

		<input type="submit" value="submit" />

		<br />
		<br />

		<form:select path="country">
			<!--<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Russia" label="Russia"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="China" label="China"></form:option>
			<form:option value="South Africa" label="South Africa"></form:option>-->
			
			<form:options items="${student.options}"></form:options>
		</form:select>

	</form:form>
</body>
</html>