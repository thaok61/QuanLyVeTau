-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: quan_ly_ve
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `idkhach_hang` int(11) NOT NULL AUTO_INCREMENT,
  `sdt` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `cmnd` varchar(45) NOT NULL,
  `tuoi` int(11) NOT NULL,
  `doi_tuong` varchar(45) NOT NULL,
  `namekhach_hang` varchar(45) NOT NULL,
  PRIMARY KEY (`idkhach_hang`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES (1,'1','thao.vd@gmail.com','212',12,'tre em','thao'),(2,'0212','sda@gmail.com','123',32,'nguoi lon','Ngoc'),(3,'021521','fafda@gmail.com','1224',12,'tre em','minh');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lich_tau_chay`
--

DROP TABLE IF EXISTS `lich_tau_chay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lich_tau_chay` (
  `idlich_tau_chay` int(11) NOT NULL AUTO_INCREMENT,
  `ga_den` varchar(45) NOT NULL,
  `ma_tau` varchar(45) NOT NULL,
  `thoi_gian_di` varchar(45) NOT NULL,
  `gia_ve` varchar(45) NOT NULL,
  `so_cho` int(11) NOT NULL,
  PRIMARY KEY (`idlich_tau_chay`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lich_tau_chay`
--

LOCK TABLES `lich_tau_chay` WRITE;
/*!40000 ALTER TABLE `lich_tau_chay` DISABLE KEYS */;
INSERT INTO `lich_tau_chay` VALUES (2,'Ga Ha Noi','S1','10.00 am','1000',50),(3,'Ga Da Nang','S2','10.30 am','5000',40);
/*!40000 ALTER TABLE `lich_tau_chay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thong_tin_ve`
--

DROP TABLE IF EXISTS `thong_tin_ve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thong_tin_ve` (
  `idve` int(11) NOT NULL AUTO_INCREMENT,
  `idlich_tau_chay` int(11) NOT NULL,
  `ma_cho` int(11) DEFAULT NULL,
  `idkhach_hang` int(11) NOT NULL,
  PRIMARY KEY (`idve`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thong_tin_ve`
--

LOCK TABLES `thong_tin_ve` WRITE;
/*!40000 ALTER TABLE `thong_tin_ve` DISABLE KEYS */;
INSERT INTO `thong_tin_ve` VALUES (1,2,NULL,1),(5,2,21,2);
/*!40000 ALTER TABLE `thong_tin_ve` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-05 10:01:20
