package com.hrms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection start() {
		
		Connection con = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

		
		return con;
		
		
	}
	
}
