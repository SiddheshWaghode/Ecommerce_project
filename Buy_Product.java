package com.EcomProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

public class Buy_Product {
	
	public void Buy_Function() {
		
		
		
		Connection con = DB_Utilities.getConnection();
		PreparedStatement ps2 = null;
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the Cart_id");
        int Cart_id= sc.nextInt();

        System.out.println("Enter the Product id you wish to buy");
        int Product_id= sc.nextInt();
        
        System.out.println("Enter the Quantity");
        int Selected_Qty=sc.nextInt();
                
       try {
			
			Statement stmt = con.createStatement();
			
			 ResultSet rs=stmt.executeQuery("select * from product_list where Product_id="+Product_id);
			 

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
			System.out.println(i+ " Product Sucessfully added to Cart");
			System.out.println("Press 1 to continue shopping other products");
			System.out.println("Press 2 to proceed for payment");
			int choice1 = sc.nextInt();
				
			
			switch (choice1) {
						
			case 1: 
	    	   Pr_List pl = new Pr_List();
	        	pl.View_Product();
	        	
	        	Buy_Product bp = new Buy_Product();
	        	bp.Buy_Multiple();
	        	
	       
	    	         
	       case 2:
	    	   Cart_Total ct = new Cart_Total();
	        	ct.Total_CartValue();
	       System.out.println("We would like to thank you for choosing us."
	   	       		+ "We truly appreciate your business and look forward to helping you again soon.");
	      
			}
			}
       
			con.close();
			stmt.close();
			sc.close(); 
			
				}
       
				
       catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
}
	
       public void Buy_Multiple() {
    	   Buy_Product bp = new Buy_Product();
       	   bp.Buy_Function();
       }
       }        

   

        
	
       /* try

        {
            PreparedStatement ps=con.prepareStatement("select * from product_list where Product_id=?");

            ps.setInt(1,Product_id);

            ResultSet rs=ps.executeQuery();

            if(rs.next())

            {

                int stock=rs.getInt("pstock");

                if(qty<=stock)

                {

                    int price=rs.getInt("pprice");

                    int amt=qty
	}
            }
}*/
	


   /* public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Product ID");

        int pid=sc.nextInt();

        System.out.println("Enter the Quantity");

        int qty=sc.nextInt();

        try

        {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

            PreparedStatement ps=con.prepareStatement("select * from product where pid=?");

            ps.setInt(1,pid);

            ResultSet rs=ps.executeQuery();

            if(rs.next())

            {

                int stock=rs.getInt("pstock");

                if(qty<=stock)

                {

                    int price=rs.getInt("pprice");

                    int amt=qty*/