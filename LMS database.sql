CREATE DATABASE  IF NOT EXISTS `lms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `lms`;
-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lms
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batch` (
  `batch_id` bigint NOT NULL AUTO_INCREMENT,
  `batch_collected_date` varchar(255) DEFAULT NULL,
  `batch_created_date` varchar(255) DEFAULT NULL,
  `status` bigint DEFAULT NULL,
  PRIMARY KEY (`batch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `book_id` bigint NOT NULL AUTO_INCREMENT,
  `author` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `copy_in_stock` int NOT NULL,
  `isbn` varchar(255) DEFAULT NULL,
  `published_year` int NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `book_image` varchar(255) DEFAULT NULL,
  `anything` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (59,'Baron Schwartz (Author), Peter Zaitsev (Author), Vadim Tkachenko (Author)','Technology',2,'978-1449314286',2012,'High Performance MySQL','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/978-1449314286.jpg?alt=media&token=81bf2238-5f96-4901-b1b1-2a38f2f87203',NULL),(60,'Daniel Nichter','Technology',6,'978-1098105099',2022,'Efficient MySQL Performance: Best Practices and Techniques','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/1098105095.jpg?alt=media&token=757dab43-99fb-4805-8fb9-1698d0a2c2a2',NULL),(61,'Tony J. Gipson','Fiction',4,'1547062118',2017,'Window With A View','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/1547062118.jpg?alt=media&token=8c5f5a78-ccc3-4a0b-ab89-4300fe8cb7b5',NULL),(62,'Hai Fan (Author), Jeremy Tiang (Translator)','Fiction',3,'1917126026',2024,'Delicious Hunger','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/9811753989.jpg?alt=media&token=ba679365-005b-477b-b0e5-5007cc85df0e',NULL),(63,'George Orwell (Author), Russell Baker (Preface), Tea Obreht (Introduction)','Fiction',3,'9780451526342',2004,'Animal Farm: 75th Anniversary Edition','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/AnimalFarm.jpg?alt=media&token=89e98d1d-a3fa-4d09-addf-8ef06aeeafc7',NULL),(64,'Harper Lee ','Fiction',2,'978-0060935467',2005,'To Kill a Mockingbird','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/Mockingbird.jpg?alt=media&token=d347083c-78ab-456f-8755-cc55497ceeb5',NULL),(65,'Marissa Meyer','Fiction',3,'978-1250768926',2020,'Winter','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/winter.jpg?alt=media&token=5773c415-e776-4e4f-9182-fdb53d224d59',NULL),(66,'Chris Ferrie (Author), Lindsay Dale-Scott (Illustrator)','Children',2,'978-1728220376',2020,'My First 100 Space Words: Planets, Stars, the Solar System, and Beyond for Babies and Toddlers - From the #1 Science Author for Kids','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/spacewords.jpg?alt=media&token=ea6b7ee4-8690-45c9-a978-e0fd594fd080',NULL),(67,'Melody Bober','Music',3,'978-1470629588',2015,'Grand Solos For Christmas 6: 7 Arrangements for Late Intermediate Pianists','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/pianomusic.jpg?alt=media&token=d800bda4-526c-45bf-92f6-c58d59d3fc5a',NULL),(68,'Lina Ng (Author)','Music',1,'978-9679856071',2010,'My Third Music Theory Book','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/MyThird.jpg?alt=media&token=81f96d6a-6188-4250-9406-1443fdff128f',NULL),(69,'Fairry Tales','Children',2,'978-1730119156',2010,'Snow White','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/Snow%20White.jpg?alt=media&token=1d12e49a-24b3-4ffc-96eb-4426bcdbfc3e',NULL),(71,'Alvin Tan','History',4,'978-9811840906',2022,'Singapore: A Very Short History: From Temasek to Tomorrow','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/singaporehistory.jpg?alt=media&token=589cb4cc-1bcc-46fc-be7a-279b4484c25d',NULL),(72,'Lonely Planet (Author), Ria de Jong (Author)','Travel',2,'978-1838699420',2024,'Lonely Planet Singapore','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/978-1838699420.jpg?alt=media&token=2b832120-5254-48b4-b64f-4f9e97d046d3',NULL),(73,'Mao Tse-Tung','History',4,'1409724751',2008,'Quotations From Chairman Mao Tse-Tung','https://firebasestorage.googleapis.com/v0/b/lms-cloudend.firebasestorage.app/o/mao.jpg?alt=media&token=1c67dc54-e862-4366-8447-db44aae29626',NULL);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `books_availability`
--

DROP TABLE IF EXISTS `books_availability`;
/*!50001 DROP VIEW IF EXISTS `books_availability`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `books_availability` AS SELECT 
 1 AS `book_id`,
 1 AS `author`,
 1 AS `category`,
 1 AS `copy_in_stock`,
 1 AS `isbn`,
 1 AS `published_year`,
 1 AS `title`,
 1 AS `book_image`,
 1 AS `borrowed`,
 1 AS `available`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `books_seq`
--

DROP TABLE IF EXISTS `books_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books_seq`
--

LOCK TABLES `books_seq` WRITE;
/*!40000 ALTER TABLE `books_seq` DISABLE KEYS */;
INSERT INTO `books_seq` VALUES (201);
/*!40000 ALTER TABLE `books_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `borrowed_book_count`
--

DROP TABLE IF EXISTS `borrowed_book_count`;
/*!50001 DROP VIEW IF EXISTS `borrowed_book_count`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `borrowed_book_count` AS SELECT 
 1 AS `book_id`,
 1 AS `borrowed`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `borrowed_book_overdue`
--

DROP TABLE IF EXISTS `borrowed_book_overdue`;
/*!50001 DROP VIEW IF EXISTS `borrowed_book_overdue`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `borrowed_book_overdue` AS SELECT 
 1 AS `user_id`,
 1 AS `overdue`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `borrowed_book_view`
--

DROP TABLE IF EXISTS `borrowed_book_view`;
/*!50001 DROP VIEW IF EXISTS `borrowed_book_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `borrowed_book_view` AS SELECT 
 1 AS `book_id`,
 1 AS `author`,
 1 AS `category`,
 1 AS `copy_in_stock`,
 1 AS `isbn`,
 1 AS `published_year`,
 1 AS `title`,
 1 AS `book_image`,
 1 AS `user_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `borrowed_books`
--

DROP TABLE IF EXISTS `borrowed_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrowed_books` (
  `borrow_id` bigint NOT NULL AUTO_INCREMENT,
  `actual_return_date` varchar(255) DEFAULT NULL,
  `batch_id` bigint DEFAULT NULL,
  `book_id` bigint DEFAULT NULL,
  `borrowed_date` varchar(255) DEFAULT NULL,
  `return_date` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `penelty` decimal(38,2) DEFAULT NULL,
  `penelty_paid` decimal(38,2) DEFAULT NULL,
  `overdue` bigint DEFAULT NULL,
  `renewed` bigint DEFAULT NULL,
  PRIMARY KEY (`borrow_id`),
  KEY `borrow_user_idx_idx` (`user_id`),
  KEY `borrow_book_idx_idx` (`book_id`),
  KEY `borrow_batch_idx_idx` (`batch_id`),
  CONSTRAINT `borrow_batch_idx` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`batch_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `borrow_book_idx` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `borrow_user_idx` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowed_books`
--

LOCK TABLES `borrowed_books` WRITE;
/*!40000 ALTER TABLE `borrowed_books` DISABLE KEYS */;
INSERT INTO `borrowed_books` VALUES (1,'2025-06-05 20:03:01',NULL,62,'2025-06-04 22:14:04','2025-06-25 23:59:58','1',109,NULL,NULL,NULL,0),(2,'2025-06-05 19:55:07',NULL,61,'2025-06-04 22:18:34','2025-06-25 23:59:58','1',109,NULL,NULL,NULL,0),(3,'2025-06-05 20:19:24',NULL,61,'2025-06-04 22:20:50','2025-06-25 23:59:58','1',109,NULL,NULL,NULL,0),(4,'2025-06-06 16:42:21',NULL,63,'2025-05-04 22:36:53','2025-05-25 23:59:58','1',109,6.00,NULL,12,0),(5,NULL,NULL,64,'2025-04-04 23:38:14','2025-04-25 23:59:58','1',109,NULL,NULL,NULL,0),(6,'2025-06-06 16:42:47',NULL,68,'2025-06-05 16:08:44','2025-06-26 23:59:58','1',109,NULL,NULL,0,0),(7,'2025-06-05 20:01:50',NULL,73,'2025-06-05 16:08:55','2025-06-26 23:59:58','1',109,NULL,NULL,NULL,0),(8,'2025-06-09 15:33:42',NULL,67,'2025-06-05 20:55:32','2025-11-08 23:59:59','1',108,NULL,NULL,0,2),(9,'2025-06-05 21:13:23',NULL,65,'2025-06-05 20:56:02','2025-06-26 23:59:58','1',108,NULL,NULL,NULL,0),(10,'2025-06-05 22:33:15',NULL,59,'2025-06-05 21:54:57','2025-06-26 23:59:58','1',108,NULL,NULL,NULL,0),(11,'2025-06-07 18:13:48',NULL,60,'2025-06-05 22:32:03','2025-06-26 23:59:58','1',108,NULL,NULL,0,0),(12,'2025-06-07 18:16:18',NULL,61,'2025-06-05 22:32:26','2025-06-26 23:59:58','1',108,NULL,NULL,0,0),(13,'2025-06-06 16:41:31',NULL,64,'2025-06-05 22:33:22','2025-06-26 23:59:58','1',108,NULL,NULL,0,0),(14,'2025-06-07 18:24:19',NULL,63,'2025-05-06 16:41:39','2025-05-20 23:59:59','1',108,NULL,NULL,0,0),(15,'2025-06-07 17:29:26',NULL,63,'2025-06-06 16:43:34','2025-06-20 23:59:59','1',109,NULL,NULL,0,0),(16,NULL,NULL,61,'2025-06-06 18:05:11','2025-07-04 23:59:59','1',111,NULL,NULL,NULL,0),(17,NULL,NULL,63,'2025-06-06 18:05:20','2025-06-20 23:59:59','1',111,NULL,NULL,NULL,0),(18,'2025-06-08 00:02:22',NULL,62,'2025-06-06 18:05:25','2025-06-20 23:59:59','1',111,NULL,NULL,0,0),(19,'2025-06-07 18:19:44',NULL,59,'2025-06-07 18:17:42','2025-06-21 23:59:59','1',108,NULL,NULL,0,0),(20,'2025-06-07 18:21:00',NULL,62,'2025-06-07 18:18:49','2025-06-21 23:59:59','1',108,NULL,NULL,0,0),(21,'2025-06-07 18:29:04',NULL,61,'2025-06-07 18:28:38','2025-06-21 23:59:59','1',108,NULL,NULL,0,0),(22,'2025-06-07 23:01:29',NULL,59,'2025-06-07 18:31:04','2025-06-21 23:59:59','1',108,NULL,NULL,0,0),(23,'2025-06-08 00:04:56',NULL,65,'2025-06-08 00:02:37','2025-06-21 23:59:59','1',111,NULL,NULL,0,0),(24,'2025-06-08 00:08:35',NULL,66,'2025-06-08 00:05:05','2025-06-21 23:59:59','1',111,NULL,NULL,0,0),(25,NULL,NULL,62,'2025-06-08 00:08:47','2025-06-21 23:59:59','1',111,NULL,NULL,NULL,0),(26,'2025-06-09 20:06:33',NULL,59,'2025-06-08 21:52:08','2025-07-20 23:59:59','1',109,NULL,NULL,0,2),(27,'2025-06-10 11:52:26',NULL,59,'2025-06-09 10:46:51','2025-07-07 23:59:59','1',108,NULL,NULL,0,1),(28,NULL,NULL,72,'2025-06-09 15:31:48','2025-07-21 23:59:59','1',108,NULL,NULL,NULL,2),(29,NULL,NULL,69,'2025-06-09 20:07:44','2025-07-07 23:59:59','1',108,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `borrowed_books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `borrowed_user_count`
--

DROP TABLE IF EXISTS `borrowed_user_count`;
/*!50001 DROP VIEW IF EXISTS `borrowed_user_count`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `borrowed_user_count` AS SELECT 
 1 AS `user_id`,
 1 AS `borrowed`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `borrowed_user_outstanding`
--

DROP TABLE IF EXISTS `borrowed_user_outstanding`;
/*!50001 DROP VIEW IF EXISTS `borrowed_user_outstanding`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `borrowed_user_outstanding` AS SELECT 
 1 AS `user_id`,
 1 AS `outstanding`,
 1 AS `max_outstanding`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `param`
--

DROP TABLE IF EXISTS `param`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `param` (
  `param_key` varchar(255) NOT NULL,
  `value_string` varchar(255) DEFAULT NULL,
  `value_long` bigint DEFAULT NULL,
  `value_decimal` decimal(38,2) DEFAULT NULL,
  PRIMARY KEY (`param_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `param`
--

LOCK TABLES `param` WRITE;
/*!40000 ALTER TABLE `param` DISABLE KEYS */;
INSERT INTO `param` VALUES ('BORROW_DAYS','14',14,NULL),('MAX_BORROW','3',3,NULL),('MAX_OUTSTANDING','10.00',NULL,10.00),('MAX_PENELTY_PER_BOOK','20.00',NULL,20.00),('MAX_RENEWAL','2',2,NULL),('PENELTY_PER_DAY','0.50',NULL,0.50),('REST_URL','http://localhost:8080/api/',NULL,NULL);
/*!40000 ALTER TABLE `param` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `quota_availability`
--

DROP TABLE IF EXISTS `quota_availability`;
/*!50001 DROP VIEW IF EXISTS `quota_availability`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `quota_availability` AS SELECT 
 1 AS `user_id`,
 1 AS `address`,
 1 AS `email_address`,
 1 AS `mobile_number`,
 1 AS `name`,
 1 AS `role`,
 1 AS `status`,
 1 AS `password`,
 1 AS `quota`,
 1 AS `borrowed`,
 1 AS `available`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `user_exceed_penelty`
--

DROP TABLE IF EXISTS `user_exceed_penelty`;
/*!50001 DROP VIEW IF EXISTS `user_exceed_penelty`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_exceed_penelty` AS SELECT 
 1 AS `user_id`,
 1 AS `address`,
 1 AS `email_address`,
 1 AS `mobile_number`,
 1 AS `name`,
 1 AS `role`,
 1 AS `status`,
 1 AS `password`,
 1 AS `outstanding`,
 1 AS `exceeded`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_login` (
  `login_id` bigint NOT NULL AUTO_INCREMENT,
  `time_login` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`login_id`),
  KEY `user_idx_idx` (`user_id`),
  CONSTRAINT `user_login_idx` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=465 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES (286,'2025-06-03 23:47:07',105),(287,'2025-06-04 15:13:10',105),(290,'2025-06-04 16:08:13',109),(291,'2025-06-04 17:04:16',109),(292,'2025-06-04 19:25:53',109),(293,'2025-06-04 19:26:26',109),(294,'2025-06-04 20:36:13',109),(295,'2025-06-04 20:48:24',109),(296,'2025-06-04 20:53:58',109),(297,'2025-06-04 22:13:48',109),(298,'2025-06-04 22:18:26',109),(299,'2025-06-04 22:56:19',109),(300,'2025-06-04 22:58:22',109),(301,'2025-06-04 22:59:53',105),(302,'2025-06-04 23:07:37',105),(303,'2025-06-04 23:13:13',105),(304,'2025-06-04 23:13:50',109),(305,'2025-06-04 23:15:52',105),(306,'2025-06-04 23:26:10',109),(307,'2025-06-04 23:26:37',105),(308,'2025-06-04 23:36:25',109),(309,'2025-06-04 23:36:41',105),(310,'2025-06-04 23:37:41',109),(311,'2025-06-05 15:41:50',109),(312,'2025-06-05 16:02:56',109),(313,'2025-06-05 16:04:33',109),(314,'2025-06-05 16:08:28',109),(315,'2025-06-05 16:23:46',109),(316,'2025-06-05 18:51:52',109),(317,'2025-06-05 19:55:57',109),(318,'2025-06-05 20:17:48',109),(319,'2025-06-05 20:32:18',109),(320,'2025-06-05 20:38:35',109),(321,'2025-06-05 20:44:53',109),(322,'2025-06-05 20:49:58',109),(323,'2025-06-05 20:52:40',109),(324,'2025-06-05 20:55:22',108),(325,'2025-06-05 21:07:49',108),(326,'2025-06-05 22:29:52',109),(327,'2025-06-05 22:31:54',108),(328,'2025-06-06 13:34:12',109),(329,'2025-06-06 13:35:15',109),(330,'2025-06-06 13:37:16',109),(331,'2025-06-06 13:41:30',109),(332,'2025-06-06 13:48:24',109),(333,'2025-06-06 13:50:11',109),(334,'2025-06-06 13:53:02',109),(335,'2025-06-06 13:55:13',109),(336,'2025-06-06 16:34:25',109),(337,'2025-06-06 16:38:58',108),(338,'2025-06-06 16:42:03',109),(339,'2025-06-06 18:03:46',111),(340,'2025-06-06 18:04:07',105),(341,'2025-06-06 18:04:56',111),(342,'2025-06-06 18:19:08',108),(343,'2025-06-06 18:19:23',105),(344,'2025-06-06 18:29:09',108),(345,'2025-06-06 18:29:48',105),(346,'2025-06-06 19:06:10',109),(347,'2025-06-06 19:06:50',105),(348,'2025-06-06 19:15:20',109),(349,'2025-06-06 21:11:23',109),(350,'2025-06-06 21:12:53',109),(351,'2025-06-07 10:46:44',108),(352,'2025-06-07 10:47:43',108),(353,'2025-06-07 10:48:16',108),(354,'2025-06-07 10:56:13',111),(355,'2025-06-07 11:18:27',108),(356,'2025-06-07 11:20:11',109),(357,'2025-06-07 11:21:31',109),(358,'2025-06-07 11:40:11',109),(359,'2025-06-07 11:45:41',105),(360,'2025-06-07 11:50:33',108),(361,'2025-06-07 12:21:25',109),(362,'2025-06-07 12:23:36',109),(363,'2025-06-07 12:25:11',109),(364,'2025-06-07 12:36:27',105),(365,'2025-06-07 16:37:46',109),(366,'2025-06-07 16:41:54',109),(367,'2025-06-07 17:11:02',109),(368,'2025-06-07 17:13:05',108),(369,'2025-06-07 17:13:33',109),(370,'2025-06-07 17:15:07',109),(371,'2025-06-07 17:16:07',109),(372,'2025-06-07 17:22:25',109),(373,'2025-06-07 17:27:20',109),(374,'2025-06-07 17:38:36',108),(375,'2025-06-07 17:44:58',109),(376,'2025-06-07 17:45:52',109),(377,'2025-06-07 17:50:50',109),(378,'2025-06-07 17:53:08',109),(379,'2025-06-07 17:54:12',109),(380,'2025-06-07 18:07:16',109),(381,'2025-06-07 18:08:19',109),(382,'2025-06-07 18:09:29',109),(383,'2025-06-07 18:12:03',109),(384,'2025-06-07 18:13:19',108),(385,'2025-06-07 18:39:35',105),(386,'2025-06-07 18:43:36',109),(387,'2025-06-07 19:13:17',109),(388,'2025-06-07 19:17:36',109),(389,'2025-06-07 19:18:00',109),(390,'2025-06-07 21:54:29',108),(391,'2025-06-07 21:58:58',108),(392,'2025-06-07 23:47:24',108),(393,'2025-06-07 23:50:30',108),(394,'2025-06-07 23:57:03',109),(395,'2025-06-08 00:01:44',111),(396,'2025-06-08 15:33:03',105),(397,'2025-06-08 15:33:25',108),(398,'2025-06-08 15:34:14',108),(399,'2025-06-08 16:19:52',109),(400,'2025-06-08 16:23:33',109),(401,'2025-06-08 16:28:57',105),(402,'2025-06-08 17:22:13',105),(403,'2025-06-08 17:23:09',105),(404,'2025-06-08 20:53:50',105),(405,'2025-06-08 21:07:29',105),(406,'2025-06-08 21:19:26',105),(407,'2025-06-08 21:20:05',105),(408,'2025-06-08 21:51:58',109),(409,'2025-06-08 22:21:52',108),(410,'2025-06-09 10:03:09',109),(411,'2025-06-09 10:23:39',108),(412,'2025-06-09 11:28:57',108),(413,'2025-06-09 14:25:35',109),(414,'2025-06-09 14:27:23',109),(415,'2025-06-09 14:40:41',109),(416,'2025-06-09 14:59:13',109),(417,'2025-06-09 15:04:31',109),(418,'2025-06-09 15:06:31',109),(419,'2025-06-09 15:07:33',109),(420,'2025-06-09 15:10:36',109),(421,'2025-06-09 15:24:20',109),(422,'2025-06-09 15:25:57',109),(423,'2025-06-09 15:31:37',108),(424,'2025-06-09 16:23:54',109),(425,'2025-06-09 16:24:14',108),(426,'2025-06-09 19:11:23',109),(427,'2025-06-09 19:16:12',109),(428,'2025-06-09 19:16:50',109),(429,'2025-06-09 19:18:50',109),(430,'2025-06-09 19:21:55',109),(431,'2025-06-09 19:25:46',109),(432,'2025-06-09 19:27:58',109),(433,'2025-06-09 19:28:45',109),(434,'2025-06-09 19:30:41',109),(435,'2025-06-09 20:00:11',105),(436,'2025-06-09 20:05:02',109),(437,'2025-06-09 20:06:13',109),(438,'2025-06-09 20:07:23',108),(439,'2025-06-10 11:15:10',109),(440,'2025-06-10 11:29:48',109),(441,'2025-06-10 11:30:34',109),(442,'2025-06-10 11:30:56',109),(443,'2025-06-10 11:31:16',109),(444,'2025-06-10 11:34:48',109),(445,'2025-06-10 11:35:16',109),(446,'2025-06-10 11:37:48',109),(447,'2025-06-10 11:39:11',109),(448,'2025-06-10 11:39:32',109),(449,'2025-06-10 11:42:08',109),(450,'2025-06-10 11:43:50',105),(451,'2025-06-10 11:44:06',105),(452,'2025-06-10 11:46:12',105),(453,'2025-06-10 11:46:26',105),(454,'2025-06-10 11:47:06',105),(455,'2025-06-10 11:47:27',105),(456,'2025-06-10 11:48:04',109),(457,'2025-06-10 11:50:03',109),(458,'2025-06-10 11:50:36',108),(459,'2025-06-10 11:51:57',108),(460,'2025-06-10 11:52:13',108),(461,'2025-06-10 11:53:07',108),(462,'2025-06-10 11:53:53',108),(463,'2025-06-10 11:54:12',108),(464,'2025-06-10 11:55:27',105);
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `user_overdue`
--

DROP TABLE IF EXISTS `user_overdue`;
/*!50001 DROP VIEW IF EXISTS `user_overdue`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_overdue` AS SELECT 
 1 AS `user_id`,
 1 AS `address`,
 1 AS `email_address`,
 1 AS `mobile_number`,
 1 AS `name`,
 1 AS `role`,
 1 AS `status`,
 1 AS `password`,
 1 AS `overdue`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `status` bigint DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (105,'35 Jln Tua Kong','system@lms.com','87654321','System Manager','admin',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(107,'201 Tampines Street 21','admin@lms.com','98765432','Administrator','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(108,'613 Bedor North Street 62','member1@lms.com','81726354','member1','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(109,'331 Juring Est Street 33','member2@lms.com','92837465','member2','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(110,'67 Jln Eunos','member3@lms.com','99887777','member3','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(111,'56 Lim Link','member4@lms.com','87651234','member4','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),(112,'123 toa street','member5@lms.com','88776655','member5','member',1,'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_seq`
--

DROP TABLE IF EXISTS `users_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_seq`
--

LOCK TABLES `users_seq` WRITE;
/*!40000 ALTER TABLE `users_seq` DISABLE KEYS */;
INSERT INTO `users_seq` VALUES (251);
/*!40000 ALTER TABLE `users_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `books_availability`
--

/*!50001 DROP VIEW IF EXISTS `books_availability`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `books_availability` AS select `b`.`book_id` AS `book_id`,`b`.`author` AS `author`,`b`.`category` AS `category`,`b`.`copy_in_stock` AS `copy_in_stock`,`b`.`isbn` AS `isbn`,`b`.`published_year` AS `published_year`,`b`.`title` AS `title`,`b`.`book_image` AS `book_image`,ifnull(`c`.`borrowed`,0) AS `borrowed`,(`b`.`copy_in_stock` - ifnull(`c`.`borrowed`,0)) AS `available` from (`books` `b` left join `borrowed_book_count` `c` on((`b`.`book_id` = `c`.`book_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `borrowed_book_count`
--

/*!50001 DROP VIEW IF EXISTS `borrowed_book_count`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `borrowed_book_count` AS select `borrowed_books`.`book_id` AS `book_id`,count(0) AS `borrowed` from `borrowed_books` where (`borrowed_books`.`actual_return_date` is null) group by `borrowed_books`.`book_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `borrowed_book_overdue`
--

/*!50001 DROP VIEW IF EXISTS `borrowed_book_overdue`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `borrowed_book_overdue` AS select `borrowed_books`.`user_id` AS `user_id`,count(0) AS `overdue` from `borrowed_books` where ((`borrowed_books`.`actual_return_date` is null) and (`borrowed_books`.`return_date` < now())) group by `borrowed_books`.`user_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `borrowed_book_view`
--

/*!50001 DROP VIEW IF EXISTS `borrowed_book_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `borrowed_book_view` AS select `b`.`book_id` AS `book_id`,`b`.`author` AS `author`,`b`.`category` AS `category`,`b`.`copy_in_stock` AS `copy_in_stock`,`b`.`isbn` AS `isbn`,`b`.`published_year` AS `published_year`,`b`.`title` AS `title`,`b`.`book_image` AS `book_image`,`r`.`user_id` AS `user_id` from (`books` `b` join `borrowed_books` `r`) where ((`b`.`book_id` = `r`.`book_id`) and (`r`.`actual_return_date` is null)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `borrowed_user_count`
--

/*!50001 DROP VIEW IF EXISTS `borrowed_user_count`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `borrowed_user_count` AS select `borrowed_books`.`user_id` AS `user_id`,count(0) AS `borrowed` from `borrowed_books` where (`borrowed_books`.`actual_return_date` is null) group by `borrowed_books`.`user_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `borrowed_user_outstanding`
--

/*!50001 DROP VIEW IF EXISTS `borrowed_user_outstanding`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `borrowed_user_outstanding` AS select `borrowed_books`.`user_id` AS `user_id`,sum((ifnull(`borrowed_books`.`penelty`,0) - ifnull(`borrowed_books`.`penelty_paid`,0))) AS `outstanding`,(select `param`.`value_decimal` from `param` where (`param`.`param_key` = 'MAX_OUTSTANDING')) AS `max_outstanding` from `borrowed_books` group by `borrowed_books`.`user_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `quota_availability`
--

/*!50001 DROP VIEW IF EXISTS `quota_availability`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `quota_availability` AS select `u`.`user_id` AS `user_id`,`u`.`address` AS `address`,`u`.`email_address` AS `email_address`,`u`.`mobile_number` AS `mobile_number`,`u`.`name` AS `name`,`u`.`role` AS `role`,`u`.`status` AS `status`,`u`.`password` AS `password`,`p`.`value_long` AS `quota`,ifnull(`c`.`borrowed`,0) AS `borrowed`,(`p`.`value_long` - ifnull(`c`.`borrowed`,0)) AS `available` from ((`users` `u` join `param` `p`) left join `borrowed_user_count` `c` on((`u`.`user_id` = `c`.`user_id`))) where (`p`.`param_key` = 'MAX_BORROW') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `user_exceed_penelty`
--

/*!50001 DROP VIEW IF EXISTS `user_exceed_penelty`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_exceed_penelty` AS select `u`.`user_id` AS `user_id`,`u`.`address` AS `address`,`u`.`email_address` AS `email_address`,`u`.`mobile_number` AS `mobile_number`,`u`.`name` AS `name`,`u`.`role` AS `role`,`u`.`status` AS `status`,`u`.`password` AS `password`,ifnull(`o`.`outstanding`,0) AS `outstanding`,ifnull((`o`.`outstanding` > `o`.`max_outstanding`),0) AS `exceeded` from (`users` `u` left join `borrowed_user_outstanding` `o` on((`u`.`user_id` = `o`.`user_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `user_overdue`
--

/*!50001 DROP VIEW IF EXISTS `user_overdue`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_overdue` AS select `u`.`user_id` AS `user_id`,`u`.`address` AS `address`,`u`.`email_address` AS `email_address`,`u`.`mobile_number` AS `mobile_number`,`u`.`name` AS `name`,`u`.`role` AS `role`,`u`.`status` AS `status`,`u`.`password` AS `password`,ifnull(`d`.`overdue`,0) AS `overdue` from (`users` `u` left join `borrowed_book_overdue` `d` on((`u`.`user_id` = `d`.`user_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-10 12:00:27
