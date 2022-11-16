package com.EcomProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class sale_history {

	public void sale_report() {
		//Connection con = DB_Utilities.getConnection();
		//PreparedStatement ps3 = null;
		// TODO Auto-generated method stub
		String query5= "select * from Cust_data";
		String query6= "select * from cart_details";
		/* try {

			 Statement stmt = con.createStatement();
				
			ResultSet rs5=stmt.executeQuery("select * from product_list where Product_id="+Product_id);

			while (rs.next()) {
				
			System.out.println(rs.getInt(4));
			int Product_Price = rs.getInt(4); 
			int Total_ProductPrice= Product_Price*Selected_Qty;
			System.out.println("Total Product Price will be>>"+Total_ProductPrice);
									
			String query ="insert into cart_details values (?, ?, ?, ?, ?)";
				
			ps2=con.prepareStatement(query);
			ps2.setInt(1,Cart_id);
			ps2.setInt(2, Product_id);
			ps2.setInt(3, Product_Price);
			ps2.setInt(4, Selected_Qty);
			ps2.setInt(5,Total_ProductPrice);
			int i=ps2.executeUpdate();
			System.out.println(i+ " Sale record updated successfully");*/
	
		try {
			Connection con = DB_Utilities.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet rs5 = stmt.executeQuery(query5);
			
			while (rs5.next()) {
				System.out.println(rs5.getString(2)+"\t"+rs5.getString(3));		
			
			}
			
			ResultSet rs6 = stmt.executeQuery(query6);
			while (rs6.next()) {
				System.out.println(rs6.getInt(1)+rs6.getInt(4)+"\t"+rs6.getInt(5));
				}
			con.close();
			stmt.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	}
	


