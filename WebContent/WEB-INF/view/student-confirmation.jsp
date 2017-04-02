<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
The student is confirmed : ${student.firstName} ${student.lastName}
<br/><br/>
His country is : ${student.country}
<br/><br/>
Favourite Programming Language : ${student.favouriteLanguage}
<br/><br/>
Operating Systems :
<c:forEach items="${student.operatingSystems}" var="object">
	<ul>
		<li>${object}</li>
	</ul>
</c:forEach>
</body>
</html>