
<%@page import="com.ConnectionPool"%>
<%@ page import="com.ConnectionPool.*" %>
<%@ page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green">This is my first app on AWS...!!!</h1>

<%-- <%
String val ="";
try{
	
	Connection con = ConnectionPool.connection();
	Statement stmt=con.createStatement();    
	ResultSet rs=stmt.executeQuery("select name from vipin");  
	while(rs.next())  {
	System.out.println(rs.getString("name"));  
	val = rs.getString("name");
	}
	con.close();  
	
}
catch(Exception E){
	E.getStackTrace();
}
%>
<h2>DB val is <%=val%></h2>
 --%>
</body>
</html>