package com.study.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckConnection {

	public boolean testConn(String user,String pass){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vicky");
			PreparedStatement pst = conn.prepareStatement("select * from login  where username=? and password=?");
			pst.setString(1, user);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			System.out.println("Exception"+e);
			
		}
		return false;
	} 
}
