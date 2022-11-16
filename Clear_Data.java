package com.EcomProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;


public class Clear_Data {

	public  void Clear_Details() {
		// TODO Auto-generated method stub
		Connection con = DB_Utilities.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("DELETE FROM  cart_details WHERE Selected_Qty > 0");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	

		
	}

/*String query2 = "SELECT sum(Total_Price) as total FROM cart_details";     	   
ResultSet rs1 = stmt.executeQuery(query2);

while (rs1.next()) {*/
