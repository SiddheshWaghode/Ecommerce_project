package com.EcomProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cust_Registration {

	
		public void Customer_Registration() {
		// TODO Auto-generated method stub
		Connection con = DB_Utilities.getConnection();
		PreparedStatement ps = null;
		try {
		System.out.println("Please register Customer Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer id>>");
		int Cust_id=sc.nextInt();
		System.out.println("Enter First Name>>");
		String Cust_FirstName=sc.next();
		System.out.println("Enter Last name>>");
		String Cust_LastName=sc.next();
		System.out.println("Enter Address>>");
		String Cust_Address=sc.next();
		System.out.println("Enter Phone Number>>");
		String Cust_PhNumber = sc.next();
		
		String query ="insert into cust_data values (?, ?, ?, ?, ?)";
		
		
			ps=con.prepareStatement(query);
			ps.setInt(1,Cust_id);
			ps.setString(2, Cust_FirstName);
			ps.setString(3, Cust_LastName);
			ps.setString(4, Cust_Address);
			ps.setString(5,Cust_PhNumber);
			int i=ps.executeUpdate();
			System.out.println(i+ " Customer successfully registered");
		sc.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		}
	}



