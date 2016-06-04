-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: university
-- ------------------------------------------------------
-- Server version	5.6.27

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
-- Table structure for table `ALUNO`
--

DROP TABLE IF EXISTS `ALUNO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ALUNO` (
  `idAluno` int(11) NOT NULL,
  `RA` int(11) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  `INGRESSO` date NOT NULL,
  `PERIODO` int(11) NOT NULL,
  `COEFICIENTE` float NOT NULL,
  `SITUACAO` varchar(15) NOT NULL,
  `TURNO` varchar(15) DEFAULT NULL,
  `TELEFONE` varchar(30) DEFAULT NULL,
  `NOME_CURSO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ALUNO`
--

LOCK TABLES `ALUNO` WRITE;
/*!40000 ALTER TABLE `ALUNO` DISABLE KEYS */;
INSERT INTO `ALUNO` VALUES (101,1372475,'Vinicius Custodio','2016-06-11',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(151,1372475,'Vinicius Custodio','2016-06-10',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(152,1372475,'Vinicius Custodio','2016-06-10',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(153,1372475,'Vinicius Custodio','2016-06-10',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(154,1372475,'Vinicius Custodio','2016-06-10',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(156,1372475,'Vinicius Custodio','2016-06-10',1,0,'Regular','Manhã',NULL,'Ciência da Computação'),(201,1372475,'Vinicius Custodio','2016-06-17',1,0,'Regular','Manhã','(42) 8425-9609','Ciência da Computação'),(251,1372475,'Vinicius Custodio','2016-06-03',1,0,'Regular','Manhã','(42) 8425-9609','Ciência da Computação'),(301,1372475,'Vinicius Custodio','2016-06-18',1,9,'Regular','Manhã','(42) 8425-9609','Ciência da Computação');
/*!40000 ALTER TABLE `ALUNO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ALUNO_DISCIPLINA`
--

DROP TABLE IF EXISTS `ALUNO_DISCIPLINA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ALUNO_DISCIPLINA` (
  `ID_ALUNO_DISCIPLINA` int(11) NOT NULL,
  `ANO` int(11) DEFAULT NULL,
  `SEMESTRE` int(11) DEFAULT NULL,
  `ALUNO_idAluno` int(11) NOT NULL,
  `DISCIPLINA_ID_DISCIPLINA` int(11) NOT NULL,
  PRIMARY KEY (`ID_ALUNO_DISCIPLINA`),
  KEY `fk_ALUNO_DISCIPLINA_ALUNO_idx` (`ALUNO_idAluno`),
  KEY `fk_ALUNO_DISCIPLINA_DISCIPLINA1_idx` (`DISCIPLINA_ID_DISCIPLINA`),
  CONSTRAINT `fk_ALUNO_DISCIPLINA_ALUNO` FOREIGN KEY (`ALUNO_idAluno`) REFERENCES `ALUNO` (`idAluno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ALUNO_DISCIPLINA_DISCIPLINA1` FOREIGN KEY (`DISCIPLINA_ID_DISCIPLINA`) REFERENCES `DISCIPLINA` (`ID_DISCIPLINA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ALUNO_DISCIPLINA`
--

LOCK TABLES `ALUNO_DISCIPLINA` WRITE;
/*!40000 ALTER TABLE `ALUNO_DISCIPLINA` DISABLE KEYS */;
/*!40000 ALTER TABLE `ALUNO_DISCIPLINA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DISCIPLINA`
--

DROP TABLE IF EXISTS `DISCIPLINA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DISCIPLINA` (
  `ID_DISCIPLINA` int(11) NOT NULL,
  `NOME` varchar(30) NOT NULL,
  `PERIODO` int(11) DEFAULT NULL,
  `CARGA_HORARIA` int(11) NOT NULL,
  `EMENTA` varchar(100) DEFAULT NULL,
  `PROFESSOR_ID_PROFESSOR` int(11) NOT NULL,
  PRIMARY KEY (`ID_DISCIPLINA`),
  KEY `fk_DISCIPLINA_PROFESSOR1_idx` (`PROFESSOR_ID_PROFESSOR`),
  CONSTRAINT `fk_DISCIPLINA_PROFESSOR1` FOREIGN KEY (`PROFESSOR_ID_PROFESSOR`) REFERENCES `PROFESSOR` (`ID_PROFESSOR`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DISCIPLINA`
--

LOCK TABLES `DISCIPLINA` WRITE;
/*!40000 ALTER TABLE `DISCIPLINA` DISABLE KEYS */;
/*!40000 ALTER TABLE `DISCIPLINA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PROFESSOR`
--

DROP TABLE IF EXISTS `PROFESSOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PROFESSOR` (
  `ID_PROFESSOR` int(11) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  `CPF` varchar(50) DEFAULT NULL,
  `RG` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `DATANASCIMENTO` varchar(45) DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_PROFESSOR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PROFESSOR`
--

LOCK TABLES `PROFESSOR` WRITE;
/*!40000 ALTER TABLE `PROFESSOR` DISABLE KEYS */;
/*!40000 ALTER TABLE `PROFESSOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SEQUENCE`
--

DROP TABLE IF EXISTS `SEQUENCE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SEQUENCE` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SEQUENCE`
--

LOCK TABLES `SEQUENCE` WRITE;
/*!40000 ALTER TABLE `SEQUENCE` DISABLE KEYS */;
INSERT INTO `SEQUENCE` VALUES ('SEQ_GEN',350);
/*!40000 ALTER TABLE `SEQUENCE` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-04 13:47:25
