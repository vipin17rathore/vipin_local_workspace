<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>

<body>
<a href="./Form.jsp?siteLanguage=fr">French</a>
<a href="./Form.jsp?siteLanguage=en">English</a>

<h2>${heading}</h2>
<form:errors path="student.*"/> 
<form action="./stuForm" method="post">
<table>
<tr><td><spring:message code="label.name"/></td><td><input type="text" name="name" /> </tr>
<tr><td><spring:message code="label.stream"/></td><td><input type="text" name="stream" /></tr>
<tr><td><spring:message code="label.mobile"/></td><td><input type="text" name="mobile" /></tr>
<tr><td><spring:message code="label.dob"/></td><td><input type="text" name="dob" /></tr>
 <!-- <tr><td>Skills</td><td><select name="dob" multiple>
						<option value="Java" >Java</option>
						<option value="oracle" >Oracle</option>
						</select></td></tr> -->
</table>
<table>
<tr><td><spring:message code="label.street"/></td><td><input type="text" name="stuAddress.street" /></tr>
<tr><td><spring:message code="label.pincode"/></td><td><input type="text" name="stuAddress.pincode" /></tr>
<tr><td><spring:message code="label.city"/></td><td><input type="text" name="stuAddress.city" /></tr>

<tr><td><input type="submit" name="Submit" /></tr>
</table>
</form>
</body>
</html>