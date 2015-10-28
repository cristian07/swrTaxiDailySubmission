-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2015 at 09:48 PM
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
-- Table structure for table `movil`
--

CREATE TABLE IF NOT EXISTS `movil` (
  `idMovil` int(11) NOT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `kilometraje` int(11) DEFAULT NULL,
  `correa` int(11) DEFAULT NULL,
  `aceite` int(11) DEFAULT NULL,
  `grasa` int(11) DEFAULT NULL,
  `filtro` int(11) DEFAULT NULL,
  `aditivoMotor` varchar(45) DEFAULT NULL,
  `aditivoCaja` varchar(45) DEFAULT NULL,
  `patente` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `movil`
--

INSERT INTO `movil` (`idMovil`, `modelo`, `kilometraje`, `correa`, `aceite`, `grasa`, `filtro`, `aditivoMotor`, `aditivoCaja`, `patente`) VALUES
(111, '95', 123456, 145, 125, 1225, 1125, 'bardal', 'pepe', 'ABC123'),
(222, 'regata', 45678, 4568, 1258, 126, 1258, 'jojo', 'lalala', 'ACC123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `movil`
--
ALTER TABLE `movil`
 ADD PRIMARY KEY (`idMovil`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
