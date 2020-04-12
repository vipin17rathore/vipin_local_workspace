
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h2>${headDetails}</h2>
<table>
<tr>
<td><b>Student Name</b></td><td>${student.name}</td> </tr>
<tr>
<td><b>Stream</b></td><td>${student.stream}</td></tr>
<tr>
<td><b>Moblie</b></td><td>${student.mobile}</td>
</tr><tr>
<td><b>DOB</b></td><td>${student.dob}</td>
</tr><tr>
<%-- <tr>
<td><b>Skills</b></td><td>${student.skills}</td>
</tr> --%>
<td><b>Street</b></td><td>${student.stuAddress.street}</td>
<td><b>PinCode</b></td><td>${student.stuAddress.pincode}</td>
<td><b>City</b></td><td>${student.stuAddress.city}</td>
</tr>
</table>
</body>
</html>