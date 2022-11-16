-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: ecom_database
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product_list`
--

DROP TABLE IF EXISTS `product_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_list` (
  `Product_id` int NOT NULL,
  `Product_Name` varchar(255) DEFAULT NULL,
  `Product_Desc` varchar(255) DEFAULT NULL,
  `Product_Price` int NOT NULL,
  `Product_Qty` int DEFAULT NULL,
  PRIMARY KEY (`Product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_list`
--

LOCK TABLES `product_list` WRITE;
/*!40000 ALTER TABLE `product_list` DISABLE KEYS */;
INSERT INTO `product_list` VALUES (101,'Redmi 9A Sport','(Coral Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery',7000,20),(102,'Zebronics DRIP Smart Watch','Bluetooth Calling, 4.3cm (1.69\"), 10 Built-in & 100+ Watch Faces, 100+ Sport Modes, 4 Built-in Games, Voice Assistant, 8 Menu UI, Fitness Health & Sleep Tracker (Blue)',1799,15),(103,'Apple AirPods (2nd Generation)','True Wireless Earbuds with 42H Playtime, Beast™ Mode(Low Latency Upto 80ms) for Gaming, ENx™ Tech, ASAP™ Charge, IWP™, IPX4 Water Resistance, Smooth Touch Controls(Bold Black)',12499,25),(104,'HP 250 G8 Laptop','11th Gen Intel Core i3-1115G4/8GB DDR4 Ram / 512GB SSD/Windows 10/39.62 cm 15.6 inch HD/Intel UHD Graphics 42V68PA Dark Ash Silver, 1.74 kg',37799,10),(105,'Samsung 32-inch(80cm) Monitor','Samsung 32-inch 80cm Odyssey G7 Gaming, 240 Hz, 1ms, 2K, Curved Monitor, HAS, WQHD, QLED, HDR600, G-Sync Compatible, 2560 x 1440 Pixels LC32G75TQSWXXL, Black',45125,15),(106,'MI Power Bank','Power Bank 3i 20000mAh Lithium Polymer 18W Fast Power Delivery Charging | Input- Type C | Micro USB| Triple Output | Sandstone Black',1999,30),(107,'360 degree camera','insta360 ONE X2 Action Camera|5.7k 360 Capture| FlowState Stabilization| Ultra Bright Screen| Waterproof 10m|4-Mic 360 Audio |Time Shift | Voice Control | Invisible Selfie Stick, Optical Zoom, Black',32990,12),(108,'Wireless Charger','RAEGR Arc 400 Pro 15W Type-C PD |Made in India| Qi-Certified Wireless Charger with Fireproof ABS for iPhone 14/13/12/11/X/8 Series, Galaxy S22/S21/S20/Note20/10/10+ Series, OnePlus 9/9 Pro-Matte Black',809,32),(109,'Wireless Mouse','Lenovo 400 Wireless Mouse, 1200DPI Optical Sensor, 2.4GHz Wireless Nano USB, 3-Button (Left,Right,Scroll) Upto 8M Left/Right & 100K Scroll clicks & 1yr Battery, Ambidextrous, Ergonomic GY50R91293',800,45),(110,'Projector Device','Egate O9 Pro DigiMatic Smart Projector | Digital Foucs |Digital Keystone | Native Full HD 1080p + 4K Support | 840 ANSI | Android 9 | Projector for Home | Triple Band WiFi | E10K62',22990,19);
/*!40000 ALTER TABLE `product_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 19:31:52
