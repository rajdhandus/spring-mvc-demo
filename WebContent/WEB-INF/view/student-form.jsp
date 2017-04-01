<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName"></form:input>
Last Name:<form:input path="lastName"></form:input>
		<input type="submit" value="submit" />
		<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>
	</form:form>
</body>
</html>