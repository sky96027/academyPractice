-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: community
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `me_id` varchar(20) NOT NULL,
  `me_pw` varchar(255) DEFAULT NULL,
  `me_name` varchar(30) DEFAULT NULL,
  `me_gender` varchar(6) DEFAULT NULL,
  `me_birth` date DEFAULT NULL,
  `me_address` varchar(100) DEFAULT NULL,
  `me_phone` varchar(13) DEFAULT NULL,
  `me_authority` varchar(10) NOT NULL DEFAULT '회원',
  PRIMARY KEY (`me_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('8','$2a$10$G/W6LkXdlTKx7kP14wscgu7omimwVI0en9gigT0lAFz1xRxnBhHrq','8','여성','2022-01-08','8 8','8','회원'),('abc123','$2a$10$HtCEMhBwKZsBBqNzQHFCP.FSVKijlsQneVA21YDg9DkeSpSFQlt4O','홍길동','남성','1999-12-16','광주 남구 제중로 11 ㅁ','010-1111-1111','관리자'),('dfg','$2a$10$J2aywW8Hw9UB13FXbieuSuDMG0yY2h5OEj5sjd//wCSfYQnHQpava','dfg','남성','2022-01-01','d qwe123','010-3333-3333','회원'),('qwe123','$2a$10$OzA3p.ASPPDeAEiemyQsYuBAafayKX.sNIs5zIlaoVoKZDLaPDylu','qwe','남성','1999-12-08','','010-1111-1111','슈퍼관리자'),('zxc123','$2a$10$fHLvjsCql/Vde1GNvy5lz.o882o/VgY2ZRV3X9o6z7ppdfoxridW.','asdasd','남성','2022-01-20','aa qwe123','010-2222-2222','회원');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-21 17:25:39
