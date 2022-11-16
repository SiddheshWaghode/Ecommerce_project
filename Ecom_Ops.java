package com.EcomProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Ecom_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("************************************************************************************");
		System.out.println("                       Welcome to Electronics Shoppee");
		System.out.println("************************************************************************************");
		Connection con = DB_Utilities.getConnection();
		System.out.println("Enter your choice");
		System.out.println("Press 1 for registration");
		System.out.println("Press 2 for view product list");
		System.out.println("Press 3 for exit");
		
		
		Scanner sc = new Scanner (System.in);
		
		
		 int choice = sc.nextInt();
	        switch (choice) {
	        case 1:
	        	Cust_Registration cr = new Cust_Registration();
	        	cr.Customer_Registration();
	        
	        case 2:
	        	Pr_List pl = new Pr_List();
	        	pl.View_Product();
	        	
	        	Buy_Product bp = new Buy_Product();
	        	bp.Buy_Multiple();
	        	
	        	
				
	        case 3:
	        	/*sale_history sh = new sale_history();
				sh.sale_report();*/
				
	        	Clear_Data clr = new Clear_Data();
	        	clr.Clear_Details();
	        
	        	
	        }
	        }
	}


