CREATE DATABASE  IF NOT EXISTS `kelvin` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `kelvin`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: kelvin
-- ------------------------------------------------------
-- Server version	5.7.41-log

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
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `CategoryID` varchar(100) DEFAULT NULL,
  `CategoryName` varchar(100) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES ('1','Beverages','Soft drinks, coffees, teas, beers, and ales'),('2','Condiments','Sweet and savory sauces, relishes, spreads, and seasonings'),('3','Confections','Desserts, candies, and sweet breads'),('4','Dairy Products','Cheeses'),('5','Grains/Cereals','Breads, crackers, pasta, and cereal'),('6','Meat/Poultry','Prepared meats'),('7','Produce','Dried fruit and bean curd'),('8','Seafood','Seaweed and fish');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `CustomerID` varchar(100) DEFAULT NULL,
  `CustomerName` varchar(100) DEFAULT NULL,
  `ContactName` varchar(100) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `City` varchar(100) DEFAULT NULL,
  `PostalCode` varchar(100) DEFAULT NULL,
  `Country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('1','Alfreds Futterkiste','Maria Anders','Obere Str. 57','Berlin','12209','Germany'),('2','Ana Trujillo Emparedados y helados','Ana Trujillo','Avda. de la Constitución 2222','México D.F.','05021','Mexico'),('3','Antonio Moreno Taquería','Antonio Moreno','Mataderos 2312','México D.F.','05023','Mexico'),('4','Around the Horn','Thomas Hardy','120 Hanover Sq.','London','WA1 1DP','UK'),('5','Berglunds snabbköp','Christina Berglund','Berguvsvägen 8','Luleå','S-958 22','Sweden'),('6','Blauer See Delikatessen','Hanna Moos','Forsterstr. 57','Mannheim','68306','Germany'),('7','Blondel père et fils','Frédérique Citeaux','24, place Kléber','Strasbourg','67000','France'),('8','Bólido Comidas preparadas','Martín Sommer','C/ Araquil, 67','Madrid','28023','Spain'),('9','Bon app','Laurence Lebihans','12, rue des Bouchers','Marseille','13008','France'),('10','Bottom-Dollar Marketse','Elizabeth Lincoln','23 Tsawassen Blvd.','Tsawassen','T2F 8M4','Canada');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `EmployeeID` varchar(100) DEFAULT NULL,
  `LastName` varchar(100) DEFAULT NULL,
  `FirstName` varchar(100) DEFAULT NULL,
  `BirthDate` varchar(100) DEFAULT NULL,
  `Notes` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('1','Davolio','Nancy','1968-12-08','Education includes a BA in psychology.'),('2','Fuller','Andrew','1952-02-19','Andrew received his BTS commercial and a Ph.D. in international marketing'),('3','Leverling','Janet','1963-08-30','Janet has a BS degree in chemistry from Boston College). '),('4','Peacock','Margaret','1958-09-19','Margaret holds a BA in English literature'),('5','Buchanan','Steven','1955-03-04','Steven Buchanan graduated from St. Andrews University, Scotland, with a BSC degree'),('6','Suyama','Michael','1963-07-02','Michael is a graduate of Sussex University (MA, economics)'),('7','King','Robert','1960-05-29','Robert King served in the Peace Corps');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetails` (
  `OrderDetailID` varchar(100) DEFAULT NULL,
  `OrderID` varchar(100) DEFAULT NULL,
  `ProductID` varchar(100) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
INSERT INTO `orderdetails` VALUES ('1','10248','1',12),('2','10248','1',10),('3','10249','2',5),('4','10249','2',10),('5','10249','1',20),('6','10250','3',20),('7','10250','4',5),('8','10250','5',20),('9','10251','4',5),('9','10251','2',5);
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `OrderID` varchar(100) DEFAULT NULL,
  `CustomerID` varchar(100) DEFAULT NULL,
  `EmployeeID` varchar(100) DEFAULT NULL,
  `OrderDate` varchar(100) DEFAULT NULL,
  `ShipperID` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES ('10248','1','1','2023-02-14','1'),('10248','1','2','2023-02-14','1'),('10249','2','3','2023-02-14','2'),('10249','2','4','2023-02-14','2'),('10249','3','5','2023-02-14','3'),('10250','3','6','2023-02-14','3'),('10250','4','7','2023-02-14','1'),('10251','5','6','2023-02-14','2'),('10251','5','5','2023-02-14','2');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `ProductID` varchar(100) DEFAULT NULL,
  `ProductName` varchar(100) DEFAULT NULL,
  `SupplierID` varchar(100) DEFAULT NULL,
  `CategoryID` varchar(100) DEFAULT NULL,
  `Unit` varchar(100) DEFAULT NULL,
  `Price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES ('1','Chais','1','1','10 boxes x 20 bags',18),('2','Chang','1','1','24 - 12 oz bottles',19),('3','Aniseed Syrup','1','2','12 - 550 ml bottles',10),('4','Chef Antons Cajun Seasoning','2','2','48 - 6 oz jars',22),('5','Chef Antons Gumbo Mix','2','2','36 boxes',21.35),('6','Grandmas Boysenberry Spread','3','2','12 - 8 oz jars',25);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shippers`
--

DROP TABLE IF EXISTS `shippers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shippers` (
  `ShipperID` varchar(100) DEFAULT NULL,
  `ShipperName` varchar(100) DEFAULT NULL,
  `Phone` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shippers`
--

LOCK TABLES `shippers` WRITE;
/*!40000 ALTER TABLE `shippers` DISABLE KEYS */;
INSERT INTO `shippers` VALUES ('1','Speedy Express','(503) 555-9831'),('2','United Package','(503) 555-3199'),('3','Federal Shipping','(503) 555-9931');
/*!40000 ALTER TABLE `shippers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers` (
  `SupplierID` varchar(100) DEFAULT NULL,
  `SupplierName` varchar(100) DEFAULT NULL,
  `ContactName` varchar(100) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `City` varchar(100) DEFAULT NULL,
  `PostalCode` varchar(100) DEFAULT NULL,
  `Country` varchar(100) DEFAULT NULL,
  `Phone` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES ('1','Exotic Liquid','Charlotte Cooper','49 Gilbert St.','Londona','EC1 4SD','UK','(171) 555-2222'),('2','New Orleans Cajun Delights','Shelley Burke','P.O. Box 78934','New Orleans','70117','USA','(100) 555-4822'),('3','Grandma Kellys Homestead','Regina Murphy','707 Oxford Rd.','Ann Arbor','48104','USA','(313) 555-5735');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-23 21:08:38
