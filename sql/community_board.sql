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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board` (
  `bd_num` int NOT NULL AUTO_INCREMENT,
  `bd_title` varchar(100) DEFAULT NULL,
  `bd_contents` longtext,
  `bd_reg_date` datetime DEFAULT NULL,
  `bd_up_date` datetime DEFAULT NULL,
  `bd_type` varchar(10) DEFAULT NULL,
  `bd_me_id` varchar(20) NOT NULL,
  `bd_ori_num` int NOT NULL,
  `bd_del` varchar(2) DEFAULT NULL,
  `bd_del_date` datetime DEFAULT NULL,
  `bd_views` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`bd_num`),
  KEY `FK_member_TO_board_1` (`bd_me_id`),
  KEY `FK_board_TO_board_1` (`bd_ori_num`),
  CONSTRAINT `FK_board_TO_board_1` FOREIGN KEY (`bd_ori_num`) REFERENCES `board` (`bd_num`),
  CONSTRAINT `FK_member_TO_board_1` FOREIGN KEY (`bd_me_id`) REFERENCES `member` (`me_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'aas','asdasd','2022-01-06 17:20:20',NULL,'일반','abc123',1,'N',NULL,0),(2,'ㅂㅂㅂ','ㅂㅂ','2022-01-10 12:06:04','2022-01-10 13:09:56','일반','qwe123',2,'N',NULL,0),(3,'제목','a','2022-01-13 11:43:14',NULL,'일반','qwe123',3,'Y','2022-01-14 10:58:32',0),(4,'수정됨as','asdas','2022-01-13 17:33:07',NULL,'일반','qwe123',4,'Y','2022-01-14 10:58:26',0),(5,'첨부파일 작업중','첨부파일 작업중','2022-01-14 14:20:00',NULL,'일반','qwe123',5,'N',NULL,0),(6,'첨부파일 작업중','첨부파일 작업중','2022-01-14 14:20:38',NULL,'일반','qwe123',6,'N',NULL,0),(7,'첨부파일 3','ㅁㅇ','2022-01-14 14:35:58',NULL,'일반','qwe123',7,'N',NULL,0),(8,'첨부파일4','ㅁㄴ','2022-01-14 15:17:19','2022-01-17 17:13:58','일반','qwe123',8,'N',NULL,0),(9,'1321','1','2022-01-17 11:29:58',NULL,'일반','qwe123',9,'N',NULL,0),(10,'asd1','a','2022-01-18 11:21:22',NULL,'일반','qwe123',10,'N',NULL,0),(11,'a1','a','2022-01-18 11:21:25',NULL,'일반','qwe123',11,'N',NULL,0),(12,'1','asd','2022-01-18 11:21:27',NULL,'일반','qwe123',12,'N',NULL,0),(13,'asd11','','2022-01-18 11:21:30',NULL,'일반','qwe123',13,'N',NULL,0),(14,'asd11','1','2022-01-18 11:21:34',NULL,'일반','qwe123',14,'N',NULL,0),(15,'2d1','ad','2022-01-18 11:21:37',NULL,'일반','qwe123',15,'N',NULL,0),(16,'asas','<h1><span style=\"background-color: rgb(255, 255, 0);\">dadaasss</span></h1>','2022-01-18 14:23:56',NULL,'일반','qwe123',16,'Y','2022-01-18 15:12:41',0),(17,'답변','<p>ㅇㅇ</p>','2022-01-18 15:29:49',NULL,'일반','qwe123',15,'N',NULL,0),(18,'ㅁㅁㅁㅁ','<p>ㅁㅁㅁㅁ</p>','2022-01-18 16:20:08',NULL,'일반','qwe123',18,'N',NULL,0),(19,'ㅋㅋㅋ','<p>ㅋㅋㅋㅋㅋㅋ</p>','2022-01-18 16:20:13',NULL,'일반','qwe123',18,'N',NULL,0),(20,'ㅁㅁ','<p>ㅁㅁ</p>','2022-01-18 16:29:25',NULL,'일반','qwe123',20,'N',NULL,0),(21,'1공지aa','<p>ㅁdaa</p>','2022-01-18 16:41:16','2022-01-19 10:46:41','일반','qwe123',21,'N',NULL,1),(22,'공지','<p>공지</p>','2022-01-18 16:42:52',NULL,'공지','qwe123',22,'N',NULL,0),(23,'ㅁㄴㅇㅁㄴ','<p>ㅁㅁㅁ</p>','2022-01-18 16:45:27',NULL,'공지','qwe123',23,'N',NULL,0),(24,'ㄷㄷ','<p>ㄷㄷㄷㄷ</p>','2022-01-18 17:15:11',NULL,'일반','qwe123',21,'N',NULL,0),(25,'ㅁㅁ','ㅁㅁ','2022-01-19 14:15:30',NULL,'일반','qwe123',25,'N',NULL,0),(26,'ㅁㅁ','ㅁㅁ','2022-01-19 14:15:57',NULL,'일반','qwe123',26,'N',NULL,0),(27,'11111','','2022-01-19 15:13:49',NULL,'일반','qwe123',27,'N',NULL,0),(28,'453','ㅜㅡㅡㅜ','2022-01-19 15:14:25','2022-01-19 16:48:08','일반','qwe123',28,'N',NULL,0),(29,'523253','253','2022-01-19 16:48:18',NULL,'일반','qwe123',29,'N',NULL,0),(30,'13','1111','2022-01-19 16:50:34',NULL,'일반','qwe123',30,'N',NULL,0),(31,'123','13','2022-01-19 16:53:11','2022-01-19 16:53:46','일반','qwe123',31,'N',NULL,0),(32,'32','32','2022-01-20 17:21:35',NULL,'일반','qwe123',32,'N',NULL,0),(33,'ㅁㅁ','ㅁㅁ','2022-01-20 17:34:04',NULL,'일반','qwe123',32,'N',NULL,0),(34,'4545','4','2022-01-20 17:37:36',NULL,'일반','qwe123',34,'N',NULL,0),(35,'as','aaa','2022-01-21 11:51:11',NULL,'일반','qwe123',35,'N',NULL,3),(36,'ddd','ddd','2022-01-21 11:51:15',NULL,'공지','qwe123',36,'N',NULL,0),(37,'aa','aa','2022-01-21 12:09:36',NULL,'공지','zxc123',37,'N',NULL,0),(38,'dsa','<p>a</p>','2022-01-21 14:47:23',NULL,'일반','qwe123',38,'N',NULL,0);
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
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
