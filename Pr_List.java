package com.EcomProject;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class Pr_List {
	
	
	
	public void View_Product() {
		
		String query= "select * from Product_List";
		try {
			Connection con = DB_Utilities.getConnection();
			//Statement stmt = null;
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
//			System.out.println("----------------------------------------------------------------------------------------------------");
//			System.out.printf("%5s %10s %10s %8s %20s %17s", "Product_id", "Product_Name", "Product_Desc", "Product Price", "Product_Qty"); 
//			System.out.println();
//			System.out.println("----------------------------------------------------------------------------------------------------");
			while (rs.next()) {
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
			//System.out.format("%7s %14s %7s %10s %25s %13s",rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			
			}
			con.close();
			stmt.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	

	/*public void Product_List() {
		// TODO Auto-generated method stub
		Connection con = DB_Utilities.getConnection();
		PreparedStatement ps = null;
		String query= "insert into product_list values ( 101, 'Redmi 9A Sport', \r\n"
				+ "'(Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery', 7000, 20), \r\n"
				+ "(102,'Zebronics DRIP Smart Watch', \r\n"
				+ "'Bluetooth Calling, 4.3cm (1.69\"), 10 Built-in & 100+ Watch Faces, 100+ Sport Modes, 4 Built-in Games, Voice Assistant, 8 Menu UI, Fitness Health & Sleep Tracker (Blue)',\r\n"
				+ "1799, 15), \r\n"
				+ "(103, 'Apple AirPods (2nd Generation)',\r\n"
				+ "'True Wireless Earbuds with 42H Playtime, Beast™ Mode(Low Latency Upto 80ms) for Gaming, ENx™ Tech, ASAP™ Charge, IWP™, IPX4 Water Resistance, Smooth Touch Controls(Bold Black)',\r\n"
				+ "12499, 25),\r\n"
				+ "(104, 'HP 250 G8 Laptop', \r\n"
				+ "'11th Gen Intel Core i3-1115G4/8GB DDR4 Ram / 512GB SSD/Windows 10/39.62 cm 15.6 inch HD/Intel UHD Graphics 42V68PA Dark Ash Silver, 1.74 kg', 37799, 10),\r\n"
				+ "(105, 'Samsung 32-inch(80cm) Monitor', \r\n"
				+ "'Samsung 32-inch 80cm Odyssey G7 Gaming, 240 Hz, 1ms, 2K, Curved Monitor, HAS, WQHD, QLED, HDR600, G-Sync Compatible, 2560 x 1440 Pixels LC32G75TQSWXXL, Black',\r\n"
				+ "45125, 15),\r\n"
				+ "(106, 'MI Power Bank', 'Power Bank 3i 20000mAh Lithium Polymer 18W Fast Power Delivery Charging | Input- Type C | Micro USB| Triple Output | Sandstone Black',\r\n"
				+ "1999, 30),\r\n"
				+ "(107, '360 degree camera', 'insta360 ONE X2 Action Camera|5.7k 360 Capture| FlowState Stabilization| Ultra Bright Screen| Waterproof 10m|4-Mic 360 Audio |Time Shift | Voice Control | Invisible Selfie Stick, Optical Zoom, Black', 32990, 12),\r\n"
				+ "(108, 'Wireless Charger', 'RAEGR Arc 400 Pro 15W Type-C PD |Made in India| Qi-Certified Wireless Charger with Fireproof ABS for iPhone 14/13/12/11/X/8 Series, Galaxy S22/S21/S20/Note20/10/10+ Series, OnePlus 9/9 Pro-Matte Black', 809, 32),\r\n"
				+ "(109, 'Wireless Mouse', 'Lenovo 400 Wireless Mouse, 1200DPI Optical Sensor, 2.4GHz Wireless Nano USB, 3-Button (Left,Right,Scroll) Upto 8M Left/Right & 100K Scroll clicks & 1yr Battery, Ambidextrous, Ergonomic GY50R91293',\r\n"
				+ "800, 45),\r\n"
				+ "(110, 'Projector Device', 'Egate O9 Pro DigiMatic Smart Projector | Digital Foucs |Digital Keystone | Native Full HD 1080p + 4K Support | 840 ANSI | Android 9 | Projector for Home | Triple Band WiFi | E10K62', 22990, 19);\r\n"
				+ "\r\n"
				+ "";
		try {
			ps=con.prepareStatement(query);
			//ps.execute(query);
			int i = ps.executeUpdate();
			System.out.println(i+ " Records inserted successfully");
			con.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}*/
