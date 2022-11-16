package com.EcomProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cust_Details {
	
public void View_CustDetails() {
		
		String query= "select * from Cust_data";
		try {
			Connection con = DB_Utilities.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
		
			while (rs.next()) {
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
			con.close();
			stmt.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


