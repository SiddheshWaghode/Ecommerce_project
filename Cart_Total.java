package com.EcomProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cart_Total {

	public void Total_CartValue() {
		// TODO Auto-generated method stub
		Connection con = DB_Utilities.getConnection();
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs2 = stmt.executeQuery("SELECT SUM(Total_Price) FROM cart_details");
			
			if (rs2.next()) {
					int sum = rs2.getInt(1);
					 System.out.println("Total Cart Value payable is>> "+sum);
				}
			
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
