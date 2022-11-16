package com.EcomProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.SQLException;

public class Admin_Data {

	/*public void Stock_Upload() {
		// TODO Auto-generated method stub
		Connection con = DB_Utilities.getConnection();
		PreparedStatement ps4 = null;
		try {
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Please Enter Product id");
		int Product_id = sc3.nextInt();
		
		System.out.println("Please Enter Product Name>>");
		String Product_Name = sc3.next();
		
		System.out.println("Please Enter Product Description>>");
		String Product_Desc=sc3.next();
		
		System.out.println("Please Enter Product Price>>");
		int Product_Price = sc3.nextInt();
		
		System.out.println("Please Enter Product Stock Procured>>");
		int Stock_Procured = sc3.nextInt();
		
		//System.out.println("Please Enter Product Stock Sold>>");
		int Stock_Sold = sc3.nextInt();
		
	//	System.out.println("Please Enter Product Balance Stock>>");
		int Balance_Stock  = sc3.nextInt();
				
		String query4 = "insert into prstock_report values (?, ?, ?, ?, ?, +Stock_Sold, +Balance_Stock)";
		//String query= "select * from Cart_Details"
		
			ps4=con.prepareStatement(query4);
			ps4.setInt(1, Product_id);
			ps4.setString(2, Product_Name);
			ps4.setString(3, Product_Desc);
			ps4.setInt(4, Product_Price);
			ps4.setInt(5, Stock_Procured);
			ps4.setInt(6, Stock_Sold);
			ps4.setInt(7, Balance_Stock);
			 int s=ps4.executeUpdate();
			 
			
			System.out.println(" Product inventory record added successfully"+1);
			sc3.close();
			ps4.close();
			con.close();
	} 
		catch (Exception e ) {
		
		e.printStackTrace();
	}
	}*/
	
	public static void main(String[] args) {
		/*Admin_Data ad = new Admin_Data ();
		ad.Stock_Upload();*/
		
		sale_history sh = new sale_history();
		sh.sale_report();
		
	}
		}

	
