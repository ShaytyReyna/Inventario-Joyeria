-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: inventario_joyeria
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
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `id_c` int NOT NULL AUTO_INCREMENT,
  `id_pr` int NOT NULL,
  `cantidad` int NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`id_c`),
  UNIQUE KEY `id_c_UNIQUE` (`id_c`),
  KEY `idproducto_idx` (`id_pr`),
  CONSTRAINT `idproducto` FOREIGN KEY (`id_pr`) REFERENCES `inventario` (`id_pr`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (1,1,10,'2023-01-15 00:00:00'),(2,18,10,'2023-01-18 00:00:00'),(3,18,10,'2023-01-19 00:00:00'),(4,20,10,'2023-01-20 00:00:00'),(5,16,5,'2023-01-21 00:00:00'),(6,18,5,'2023-01-21 00:00:00');
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `id_pr` int NOT NULL AUTO_INCREMENT,
  `productos` varchar(45) NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  `stock` int NOT NULL,
  PRIMARY KEY (`id_pr`),
  UNIQUE KEY `id_pr_UNIQUE` (`id_pr`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES (1,'Agate mate turquesa',4.80,20),(2,'Agate mate gris',1.38,61),(3,'Agate mate salmon',1.38,60),(4,'Agate mate negro',1.21,63),(5,'Agate mate azul',1.38,60),(6,'Agate mate rosa',2.09,62),(7,'Agate morada',1.21,48),(8,'Agate naranja',1.80,46),(9,'Agate turquesa',0.52,61),(10,'Agate agrietado gris',1.43,62),(11,'Cuarzo blanco',0.63,60),(12,'Cuarzo negro',1.92,60),(13,'Cuarzo rosa',1.92,60),(14,'Cuarzo marmoleado blanco',1.92,60),(15,'Perla blanca',0.21,200),(16,'Hoja dorada',2.30,25),(17,'Ojo turco dorado',1.50,30),(18,'Unicornio dorado',10.17,25),(19,'Pajaro dorado',6.30,60),(20,'Ala dorada',3.60,20),(21,'Separador redondo plateado',2.06,100),(22,'Separador redondo dorado',3.50,1200),(23,'Separador redondo negro',0.12,200),(24,'Corazon plateado',1.07,50),(25,'Tortuga plateada',0.80,50),(26,'Perla negra',0.21,200);
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `id_pe` int NOT NULL AUTO_INCREMENT,
  `nom_client` varchar(45) DEFAULT NULL,
  `id_pr` int NOT NULL,
  `cantidad` int NOT NULL,
  `fecha` datetime NOT NULL,
  `completado` int DEFAULT NULL,
  PRIMARY KEY (`id_pe`),
  UNIQUE KEY `id_pe_UNIQUE` (`id_pe`),
  KEY `id_idx` (`id_pr`),
  CONSTRAINT `id` FOREIGN KEY (`id_pr`) REFERENCES `inventario` (`id_pr`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,'Juanito',5,25,'2023-01-15 00:00:00',0),(2,'Ana',3,15,'2023-01-16 00:00:00',0),(3,'Gerardo',4,25,'2023-01-21 00:00:00',NULL),(4,'Armando',10,25,'2023-01-21 00:00:00',NULL),(5,'Monica',15,25,'2023-01-21 00:00:00',NULL);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-21 16:02:25
