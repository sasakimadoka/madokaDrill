-- MySQL dump 10.13  Distrib 5.7.18, for osx10.12 (x86_64)
--
-- Host: localhost    Database: WebDrill
-- ------------------------------------------------------
-- Server version	5.7.18

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
-- Table structure for table `answer`
--

DROP TABLE IF EXISTS `answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `answer` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(15) NOT NULL,
  `user_id` char(8) NOT NULL,
  `student_name` varchar(15) NOT NULL,
  `student_answer` text NOT NULL,
  `impression` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES (1,'システム設計','E155408n','何度目のトライ','ご飯を食べようね','頑張ろうね'),(2,'システム設計','あ','あ','あ','あ'),(3,'理科実験のおける基本','あああjさっっだ','朝崎あ','bづbだb','あっっっっっっっs'),(4,'最終日','E155408n','佐々木円香','動作した。','嬉しかった。安心。'),(5,'１２時','','','',''),(6,'システム設計','E155408n','sasakimadok','a','a'),(7,'理科実験のおける基本','','','',''),(8,'理科実験のおける基本','','','','');
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(15) NOT NULL,
  `content` text NOT NULL,
  `correct_answer` text,
  `kind` varchar(4) NOT NULL,
  `teacher_name` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'a','b','2','1','a'),(2,'yftujgkuhilj','urtfykguhli','fyguilh','理科','a'),(3,'文章題','問題を解け','模範回答','国語','佐々木円香'),(4,'システム設計','ああ','おっけー','情報','櫨山先生'),(5,'１２時','頑張る','やりきる','英語','深夜'),(6,'理科実験のおける基本','理科実験における必要事項を述べよ。','実験道具はあらかじめ用意しよう（適当）','理科','佐々木円香'),(7,'try1','答えを打ち込んでAnswerテーブルに入るか','入れ！','国語','佐々木円香テスト'),(8,'ご飯','いつの間にか寝てた','やばい','数学','佐々木円香'),(9,'嬉しいな','頑張るぞ！','あとすこーし！','英語','生徒用ページ完成した'),(10,'最終日','しっかりと動作するか','頑張れ！','その他','再確認');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-26 19:48:16
