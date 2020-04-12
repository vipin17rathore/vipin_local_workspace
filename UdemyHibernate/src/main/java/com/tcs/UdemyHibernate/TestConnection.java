package com.tcs.UdemyHibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String [] args) {
		
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String USER = "system";
		String PASS = "vicky";
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("connection"+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
