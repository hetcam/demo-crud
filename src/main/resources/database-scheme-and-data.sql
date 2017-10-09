CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.6.37-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tont_aves`
--

DROP TABLE IF EXISTS `tont_aves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tont_aves` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CDAVE` varchar(5) NOT NULL,
  `DSNOMBRE_COMUN` varchar(100) DEFAULT NULL,
  `DSNOMBRE_CIENTIFICO` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CDAVE_UNIQUE` (`CDAVE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tont_aves`
--

LOCK TABLES `tont_aves` WRITE;
/*!40000 ALTER TABLE `tont_aves` DISABLE KEYS */;
INSERT INTO `tont_aves` VALUES (1,'AVE01','CODORNIZ','CODORNIZ DE KOREA'),(2,'AVE02','GALLINA','GALLINA ARABIGA'),(3,'AVE03','PAVO REAL','PAVO EUROPEO');
/*!40000 ALTER TABLE `tont_aves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tont_aves_pais`
--

DROP TABLE IF EXISTS `tont_aves_pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tont_aves_pais` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CDPAIS` int(11) NOT NULL,
  `CDAVE` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_AVES_CDAVE_idx` (`CDAVE`),
  KEY `FK_PAIS_CDPAIS_idx` (`CDPAIS`),
  CONSTRAINT `FK_AVES_CDAVE` FOREIGN KEY (`CDAVE`) REFERENCES `tont_aves` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_PAIS_CDPAIS` FOREIGN KEY (`CDPAIS`) REFERENCES `tont_paises` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tont_aves_pais`
--

LOCK TABLES `tont_aves_pais` WRITE;
/*!40000 ALTER TABLE `tont_aves_pais` DISABLE KEYS */;
INSERT INTO `tont_aves_pais` VALUES (6,1,1),(7,1,2),(8,2,3),(9,3,1),(10,3,3);
/*!40000 ALTER TABLE `tont_aves_pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tont_paises`
--

DROP TABLE IF EXISTS `tont_paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tont_paises` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CDPAIS` varchar(3) NOT NULL,
  `DSNOMBRE` varchar(100) DEFAULT NULL,
  `CDZONA` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CDPAIS_UNIQUE` (`CDPAIS`),
  KEY `FK_ZONAS_CDZONA_idx` (`CDZONA`),
  CONSTRAINT `FK_ZONAS_CDZONA` FOREIGN KEY (`CDZONA`) REFERENCES `tont_zonas` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tont_paises`
--

LOCK TABLES `tont_paises` WRITE;
/*!40000 ALTER TABLE `tont_paises` DISABLE KEYS */;
INSERT INTO `tont_paises` VALUES (1,'P01','COLOMBIA',1),(2,'P02','CANADA',2),(3,'P03','ALEMANIA',3);
/*!40000 ALTER TABLE `tont_paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tont_zonas`
--

DROP TABLE IF EXISTS `tont_zonas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tont_zonas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CDZONA` varchar(3) NOT NULL,
  `DSNOMBRE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CDZONA_UNIQUE` (`CDZONA`),
  UNIQUE KEY `UK_fqplg61fqft4kf013l2rypevd` (`CDZONA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tont_zonas`
--

LOCK TABLES `tont_zonas` WRITE;
/*!40000 ALTER TABLE `tont_zonas` DISABLE KEYS */;
INSERT INTO `tont_zonas` VALUES (1,'Z01','SUDAMERICA'),(2,'Z02','NORTEAMERICA'),(3,'Z03','EUROPA ORIENTAL');
/*!40000 ALTER TABLE `tont_zonas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-06  5:32:40
