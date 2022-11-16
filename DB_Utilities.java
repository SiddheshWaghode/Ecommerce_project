package com.EcomProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Utilities {

	
	public static Connection getConnection() {
		Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ecom_database?characterEncoding=utf8";
		con= DriverManager.getConnection(url, "root", "Siddhesh@1990");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	
	}
	
	}


