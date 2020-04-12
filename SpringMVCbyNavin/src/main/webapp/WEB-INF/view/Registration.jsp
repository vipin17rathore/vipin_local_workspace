 <%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE HTML>
<HTML>
<head><title>Student Form</title></head>
<body>

<form:form action="processForm" modelAttribute="student">

FirstName: <form:input path="firstName" />
<br></br>
LastName: <form:input path="lastName" />
<br></br>
Country: <form:select path="country">
		<form:option value="India">India</form:option>
		<form:option value="Aus">Aus</form:option>
		<form:option value="Germany">Germany</form:option>
</form:select>
<br></br>
<input type="submit" value="Submit" />
</form:form>
</body>
</HTML>