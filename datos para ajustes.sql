-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2015 at 09:53 PM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `swrtaxidailysubmission`
--

-- --------------------------------------------------------

--
-- Table structure for table `ajustes`
--

CREATE TABLE IF NOT EXISTS `ajustes` (
`idAjustes` int(11) NOT NULL,
  `comisionChofer` float DEFAULT NULL,
  `ajusteGas` float DEFAULT NULL,
  `precioGasCtaCte` float DEFAULT NULL,
  `precioGasFuera` float DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ajustes`
--

INSERT INTO `ajustes` (`idAjustes`, `comisionChofer`, `ajusteGas`, `precioGasCtaCte`, `precioGasFuera`, `estado`) VALUES
(1, 0.35, 0.65, 5.17, 5.17, 'INACTIVO'),
(2, 0.3, 0.66, 5.17, 5.17, 'ACTIVO');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ajustes`
--
ALTER TABLE `ajustes`
 ADD PRIMARY KEY (`idAjustes`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ajustes`
--
ALTER TABLE `ajustes`
MODIFY `idAjustes` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
