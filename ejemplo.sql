CREATE DATABASE  IF NOT EXISTS `ejemplo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ejemplo`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: ejemplo
-- ------------------------------------------------------
-- Server version	5.6.15

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
-- Table structure for table `auxdep`
--

DROP TABLE IF EXISTS `auxdep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auxdep` (
  `dept_no` tinyint(4) NOT NULL,
  `dnombre` varchar(10) DEFAULT NULL,
  `loc` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auxdep`
--

LOCK TABLES `auxdep` WRITE;
/*!40000 ALTER TABLE `auxdep` DISABLE KEYS */;
INSERT INTO `auxdep` VALUES (6,'aux','aux'),(7,'aux','aux'),(10,'aux','aux'),(44,'aux','aux'),(55,'aux','aux'),(88,'aux','aux');
/*!40000 ALTER TABLE `auxdep` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auxemp`
--

DROP TABLE IF EXISTS `auxemp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auxemp` (
  `emp_no` int(11) NOT NULL,
  `apellido` varchar(10) DEFAULT NULL,
  `oficio` varchar(10) DEFAULT NULL,
  `dir` int(11) DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `comision` double DEFAULT NULL,
  `dept_no` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`emp_no`),
  KEY `dept_no_idx` (`dept_no`),
  CONSTRAINT `dept_no` FOREIGN KEY (`dept_no`) REFERENCES `departamentos` (`dept_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auxemp`
--

LOCK TABLES `auxemp` WRITE;
/*!40000 ALTER TABLE `auxemp` DISABLE KEYS */;
INSERT INTO `auxemp` VALUES (10,'auxiliar','auxiliar',1,'2000-01-01',1000,10,20),(20,'auxiliar','auxiliar',1,'2000-01-01',1000,12,20);
/*!40000 ALTER TABLE `auxemp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamentos` (
  `dept_no` tinyint(4) NOT NULL,
  `dnombre` varchar(10) DEFAULT NULL,
  `loc` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (6,'aux','aux'),(7,'aux','aux'),(10,'aux','aux'),(20,'ventas','madrid'),(30,'admin','sevilla'),(40,'rrhh','madrid'),(44,'aux','aux'),(50,'compras','sevilla'),(55,'vacio','vacio'),(60,'direccion','Madrid'),(70,'cont','barce'),(88,'vacio','vacio'),(90,'prueba','prueba');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `emp_no` int(11) NOT NULL,
  `apellido` varchar(10) DEFAULT NULL,
  `oficio` varchar(10) DEFAULT NULL,
  `dir` int(11) DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `comision` double DEFAULT NULL,
  `dept_no` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`emp_no`),
  KEY `dept_no` (`dept_no`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`dept_no`) REFERENCES `departamentos` (`dept_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (0,'NUEVO','NUEVO',123,'2016-02-03',1200,12,60),(1,'nuevo','prueba',10,'2016-01-20',2250,10,70),(2,'fernandez','admin',2,'2013-11-02',15342,2,20),(3,'lopez','comercial',2,'2001-11-11',1567,2,30),(4,'garcia','admin',2,'2011-11-12',1846,2,40),(5,'alvarez','rrhh',2,'2011-01-01',1946,2,50),(6,'perez','admin',2,'2003-11-03',1756,2,20),(7,'gil','comercial',2,'2000-01-01',1654,2,90),(8,'panero','comercial',2,'2013-01-14',1637,2,30),(9,'rodriguez','comercial',2,'2015-01-01',2567,2,60),(10,'auxiliar','auxiliar',1,'2000-01-01',1000,10,20),(20,'auxiliar','auxiliar',1,'2000-01-01',1000,12,20),(99,'prueba','prueba',12,'2016-01-29',1000,10,70),(1234,'Alonso','Program',4567,'2016-01-29',2500,15,90);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ejemplo'
--
/*!50003 DROP PROCEDURE IF EXISTS `aumentoSueldo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`ejemplo`@`%` PROCEDURE `aumentoSueldo`(
	in numeroDepartamento int,
	in porcentaje float
	)
BEGIN
	UPDATE empleados SET salario=salario+(salario*(porcentaje/100)) WHERE dept_no=numeroDepartamento;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-19  9:07:43
