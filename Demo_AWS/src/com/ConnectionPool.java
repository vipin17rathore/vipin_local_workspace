package com;
import java.sql.*;
import java.util.*;

public class ConnectionPool{  
public static Connection connection(){  
	Connection con = null;
	try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
 con=DriverManager.getConnection(  
"jdbc:oracle:thin:@ora11g.cbmyfjuvohxm.us-east-2.rds.amazonaws.com:1521:CBOS","cbosowner","cbosowner");  
  
//step3 create the statement object  
/*Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from vipin");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
//step5 close the connection object  
con.close();  
 */ 
}catch(Exception e){ System.out.println(e);}
return con;  
  
}  
}