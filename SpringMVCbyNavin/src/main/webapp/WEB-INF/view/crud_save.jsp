 <%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML>
<HTML>
<head><title>Student Form</title></head>
<body>

<form:form method="post" action="empSave">

Name: <form:input path="name" />
<br></br>
salary <form:input path="salary" />
<br></br>
designation <form:input path="designation" />
<br></br>
<input type="submit" value="Submit" />
</form:form>
</body>
</HTML>