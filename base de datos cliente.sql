-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-12-2015 a las 02:46:10
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `swrtaxidailysubmission`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ajustes`
--

CREATE TABLE IF NOT EXISTS `ajustes` (
  `idAjustes` int(11) NOT NULL AUTO_INCREMENT,
  `comisionChofer` float DEFAULT NULL,
  `ajusteGas` float DEFAULT NULL,
  `precioGasCtaCte` float DEFAULT NULL,
  `precioGasFuera` float DEFAULT NULL,
  `estado` varchar(5) DEFAULT 'A',
  PRIMARY KEY (`idAjustes`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `ajustes`
--

INSERT INTO `ajustes` (`idAjustes`, `comisionChofer`, `ajusteGas`, `precioGasCtaCte`, `precioGasFuera`, `estado`) VALUES
(2, 0.35, 0.65, 5.17, 5.17, 'B'),
(3, 0.3, 0.65, 5.17, 5.17, 'B'),
(4, 0.31, 0.65, 5.17, 5.17, 'B'),
(5, 0.35, 0.65, 5.17, 5.17, 'B'),
(6, 0.35, 0.74, 5.929, 5.958, 'B'),
(7, 0.35, 0.74, 5.929, 5.958, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alertas`
--

CREATE TABLE IF NOT EXISTS `alertas` (
  `vencimientoLicenciaTaxi` int(11) DEFAULT NULL,
  `vencimientoLicenciaConductor` int(11) DEFAULT NULL,
  `correa` int(11) DEFAULT NULL,
  `aceite` int(11) DEFAULT NULL,
  `grasa` int(11) DEFAULT NULL,
  `filtro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alertas`
--

INSERT INTO `alertas` (`vencimientoLicenciaTaxi`, `vencimientoLicenciaConductor`, `correa`, `aceite`, `grasa`, `filtro`) VALUES
(60, 7, 3, 4, 5, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
--

CREATE TABLE IF NOT EXISTS `chofer` (
  `DNI` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `domicilio` varchar(45) NOT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) NOT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `fechaCarnetOtorgamiento` date DEFAULT NULL,
  `fechaCarnetVencimiento` date DEFAULT NULL,
  `categoria` varchar(5) DEFAULT NULL,
  `estado` varchar(5) DEFAULT 'A',
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `chofer`
--

INSERT INTO `chofer` (`DNI`, `nombre`, `apellido`, `domicilio`, `localidad`, `provincia`, `telefono`, `celular`, `fechaCarnetOtorgamiento`, `fechaCarnetVencimiento`, `categoria`, `estado`) VALUES
(1000, 'Nuevo', 'Chofer', 'a', 'b', 'Tucuman', '0', '0', '2015-11-14', '2020-11-14', 'D1', 'A'),
(2000, 'CHOFER', 'SIN', 'M', 'C', 'Tucuman', '0', '0', '2015-12-02', '2015-12-02', 'E', 'A'),
(3000, 'TALLER', 'TALLER', 'c', 'c', 'Tucuman', '0', '0', '2015-12-02', '2015-12-02', 'E', 'A'),
(4000, 'PENDIENTE', 'PENDIENTE', 'c', 'v', 'Tucuman', '0', '0', '2015-12-02', '2015-12-02', 'E', 'A'),
(123456, 'Juan', 'Perez', 'Cucha 123', 'Aguilares', 'Tucuman', '4987858', '1548965', '2015-12-02', '2016-12-02', 'B', 'B'),
(1234560, 'Bruce', 'Wayne', 'Calle sin nombre 560', 'Localidad 560', 'Tucuman', '4560', '154560', '2001-11-15', '2010-11-15', 'A', 'B'),
(1234561, 'Clark', 'Kent', 'Calle 561', 'Localidad 4561', 'Tucuman', '4561', '154561', '2013-11-01', '2015-07-01', 'A', 'B'),
(10556807, 'Gerardo Roque', 'Gonzalez', 'Pasaje Lafinur 3216 ', 'San Miguel de Tucuman', 'Tucuman', '0', '155239371', '2015-10-06', '2016-10-06', 'D', 'A'),
(10910329, 'Hugo Carlos ', 'Molina', 'Juan B Teran 789', 'San Miguel de Tucuman', 'Tucuman', '0', '153023003', '2015-11-14', '2015-11-14', 'D', 'A'),
(12352298, 'Ernesto Alberto', 'Flores', 'Crisostomo Alvarez 2925', 'San Miguel de Tucuman', 'Tucuman', '4235007', '155478060', '2012-11-22', '2015-11-22', 'D2', 'A'),
(12449065, 'Carlos Alberto ', 'Zelaya', 'Ramirez de Velazco 3054', 'San Miguel de Tucuman', 'Tucuman', '4340119', '155113032', '2013-10-16', '2018-10-16', 'D1', 'A'),
(14083816, 'Walter Raul', 'Escobedo', 'Pasaje Vera y Aragon 2369', 'San Miguel de Tucuman', 'Tucuman', '0', '153411058', '2015-01-23', '2017-01-23', 'D1', 'A'),
(16685407, 'Juan Santos', 'Quinteros', 'Barrios Los Pinos 6| Pasaje 683', 'San Miguel de Tucuman', 'Tucuman', '0', '155187706', '2015-03-02', '2016-03-02', 'A D', 'A'),
(16784647, 'Jose Armando', 'Diaz', 'San Juan 3719', 'San Miguel de Tucuman', 'Tucuman', '4355890', '156228833', '2015-06-22', '2016-06-22', 'D', 'A'),
(17042491, 'Hugo Rene', 'Blasco', 'Manzana I Lote 6 Casa 2 Barrio Oeste II', 'San Miguel de Tucuman', 'Tucuman', '4340880', '155233316', '2013-09-20', '2016-09-20', 'D1', 'A'),
(17182268, 'Ernesto', 'Torrico', 'Barrio Nestor Kirchner Manzana 15 Lote 2', 'San Miguel de Tucuman', 'Tucuman', '0', '153161990', '2014-09-04', '2017-09-04', 'D2', 'A'),
(17269980, 'Felix Leocadio', 'Caceres Pinto', 'Cordoba 1145', 'San Miguel de Tucuman', 'Tucuman', '0', '156828904', '2015-08-06', '2016-08-06', 'D', 'A'),
(17376047, 'Carlo Roberto', 'Salina', 'Pasaje Rodrigez Peña 1213 (altura Jujuy 3700)', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2013-01-30', '2016-01-30', 'D', 'A'),
(17859191, 'Juan Salvador', 'Barrios', 'Manuel Alberti 251', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-10-13', '2016-10-13', 'D1', 'A'),
(18203194, 'Eduardo Miguel', 'Clessi', 'Pasaje Bolougne Sur Mer 4080', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2014-03-07', '2016-03-07', 'D', 'A'),
(18203365, 'Juan Luis', 'Maidana', 'Pedro Leon Gallo 331', 'San Miguel de Tucuman', 'Tucuman', '0', '156837325', '2011-01-25', '2016-01-25', 'D', 'A'),
(20171861, 'Luis Esteban', 'Salazar', 'a', 'San Miguel de Tucuman', 'Tucuman', '0', '155687482', '2015-05-29', '2016-05-29', 'A D', 'A'),
(20342160, 'Carlos Guillermo', 'Gonzalez', 'a', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-04-23', '2016-04-23', 'D2', 'A'),
(22030966, 'Alberto Marcelo', 'Ruiz', 'Sargento Cabral 464', 'San Miguel de Tucuman', 'Tucuman', '0', '154506728', '2015-11-14', '2015-11-14', 'D1', 'A'),
(22414674, 'Francisco Oscar', 'Bernal Russ', 'Colon 263', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-05-11', '2017-05-11', 'D', 'A'),
(22429787, 'Martin Fernando', 'Barrionuevo', 'barrio San Javier Manzana D Casa 20', 'Villa Carmela', 'Tucuman', '0', '156491083', '2015-11-20', '2016-11-20', 'D1', 'A'),
(22665440, 'Hector Vicente', 'Guanuco', 'Luis Braile 2232', 'Yerba Buena', 'Tucuman', '4250839', '0', '2014-12-10', '2016-12-10', 'D', 'A'),
(22861751, 'Claudio Dionicio', 'Flores', 'Barrio Seoc Manzana B Casa 16', 'San Miguel de Tucuman', 'Tucuman', '0', '153537030', '2014-02-27', '2016-02-27', 'B C D', 'A'),
(23116136, 'Vicente Roque', 'Granero', 'Junin 1415', 'San Miguel de Tucuman', 'Tucuman', '4225752', '155844161', '2014-09-10', '2016-09-10', 'B D', 'A'),
(23367064, 'Marcelo Norberto', 'Quinteros', 'Km 102', 'Famailla', 'Tucuman', '154036397', '154431170', '2015-02-25', '2016-02-25', 'D2', 'A'),
(23425938, 'Pablo Andres', 'Gomez', 'Brigido Teran 63 Habitacion 7', 'San Miguel de Tucuman', 'Tucuman', '0', '155083233', '2014-12-05', '2017-12-05', 'D1', 'A'),
(23783738, 'Eduardo Marcelo', 'Orellana', 'Pasaje General Belgrano S/N y Pasaje Lavalle', 'San Pablo', 'Tucuman', '3071474', '154594590', '2014-05-05', '2019-05-05', 'D1', 'A'),
(24750777, 'Mario Jose', 'Alvarez', 'Inca Garcilazo 2790', 'San Miguel de Tucuman', 'Tucuman', '0', '155536226', '2012-02-24', '2017-02-24', 'D', 'A'),
(24816963, 'Jose Ricardo Fabian', 'Soto', 'Sector 15 Manzana 8 Casa 16 Lomas de Tafi', 'Tafi Viejo', 'Tucuman', '0', '155070453', '2014-06-19', '2016-04-24', 'A D E', 'A'),
(24933321, 'Omar Alejandro', 'Medina', 'Manzana B Lote 49 Cevil Redondo', 'Yerba Buena', 'Tucuman', '0', '0', '2014-02-18', '2016-02-18', 'D', 'A'),
(25740874, 'Martin Marcelo', 'Martorell', 'Manzana A Casa 27 Barrio San Jose II', 'Yerba Buena', 'Tucuman', '0', '156768507', '2015-05-13', '2016-05-13', 'D2', 'A'),
(26013709, 'Walter Marcelo', 'Romano', 'Pasaje Pedro Medrano 322', 'San Miguel de Tucuman', 'Tucuman', '0', '156095660', '2015-11-14', '2015-11-14', 'D1', 'A'),
(26412611, 'Sergio Martin', 'Mendez', 'Necochea 2500', 'San Miguel de Tucuman', 'Tucuman', '0', '155721907', '2014-12-11', '2016-12-11', 'D', 'A'),
(26743065, 'Juan Nicolas ', 'Suarez', 'Belisario Lopez 1579', 'Capital', 'Tucuman', '0', '0', '2015-01-27', '2016-01-27', 'D1', 'A'),
(26743665, 'Juan Nicolas', 'Suarez', 'Belisario Lopez 1579', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-01-27', '2016-01-27', 'D1', 'A'),
(27370077, 'Carlos Fabian', 'Farias', 'Americo Vespucio 1584', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-03-13', '2017-03-13', 'D1', 'A'),
(27589051, 'Nicolas Alejandro', 'Pizola', 'c', 'San Miguel de Tucuman', 'Tucuman', '0', '155860675', '2014-01-09', '2017-01-09', 'D1', 'A'),
(28157260, 'Andres Sebastian', 'Arevalos', 'a', 'San Miguel de Tucuman', 'Tucuman', '0', '154445746', '2014-12-16', '2016-12-16', 'A D', 'A'),
(29060521, 'Maximiliano David', 'Quinteros', 'Matheu 3054', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2014-03-20', '2016-03-20', 'D1', 'A'),
(30268270, 'Juan Jose', 'Palacios', 'Cordoba 1327', 'San Miguel de Tucuman', 'Tucuman', '4300086', '156400264', '2012-01-26', '2017-01-26', 'D', 'A'),
(30357320, 'Marcelo Alexis', 'Delgado', 'Lucas Cordoba 494', 'San Miguel de Tucuman', 'Tucuman', '4322420', '153316977', '2015-11-05', '2016-11-05', 'D2', 'A'),
(30608570, 'Angel Luis ', 'Bonifatti', 'Rivadavia 2567', 'San Miguel de Tucuman', 'Tucuman', '4270684', '153501856', '2014-04-08', '2016-04-08', 'A D', 'A'),
(30801668, 'Luis Horacio', 'Moya', 'Canal Sur y Matienzo', 'San Miguel de Tucuman', 'Tucuman', '153204946', '153573876', '2015-08-19', '2017-08-19', 'A D', 'A'),
(32134260, 'Cristian Anibal', 'Gonzalez', 'Agustin Mazza 226', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-04-13', '2017-04-13', 'A D E', 'A'),
(32163411, 'Daniel Antonio', 'Nieto', 'Pasaje Federico Helguera 663', 'Manantial', 'Tucuman', '0', '154069390', '2015-09-14', '2016-09-14', 'D1', 'A'),
(33050305, 'Alejandro', 'Suarez', 'Rivadavia 139', 'San Miguel de Tucuman', 'Tucuman', '4978161', '154092002', '2012-05-26', '2015-05-26', 'B', 'B'),
(33050306, 'Sebastian', 'Suarez', 'Pje Junin 1446', 'San Miguel de Tucuman', 'Tucuman', '4619034', '1555907300', '2015-11-01', '2020-11-01', 'A', 'B'),
(33541310, 'Juan Jose', 'Robledo', 'Manzana 2 Casa 58 Barrio San Blas', 'Tafi Viejo', 'Tucuman', '0', '153359834', '2015-02-10', '2017-02-10', 'A B D', 'A'),
(33974100, 'Cristian Ernesto', 'Mercado', 'Barrio Ampliacion Soeme Manzana F Casa 7', 'San Miguel de Tucuman', 'Tucuman', '4373606', '156683558', '2015-03-27', '2016-03-27', 'D', 'A'),
(33977175, 'Emanuel David', 'Carrizo', 'Barrio Elena White Manzana I Lote 24', 'San Miguel de Tucuman', 'Tucuman', '0', '156278111', '2015-06-15', '2017-06-15', 'D1', 'A'),
(33978414, 'Daniel ', 'Bejar Accardi', 'Caseros 1284', 'San Miguel de Tucuman', 'Tucuman', '4347610', '0', '2014-12-29', '2015-12-29', 'D1', 'A'),
(34186717, 'Alejandro Nicolas', 'Luna', 'Ecuador 750', 'San Miguel de Tucuman', 'Tucuman', '0', '154782755', '2014-09-10', '2016-09-10', 'D', 'A'),
(34603152, 'Adrian Esteban', 'Fayoni', 'Mz F Lote 28 Barrio Elena White', 'Capital', 'Tucuman', '0', '156474028', '2014-04-24', '2019-04-24', 'D1', 'A'),
(34719308, 'Daniel Mauricio', 'Tefaha', 'Manuel Estrada 2192', 'San Miguel de Tucuman', 'Tucuman', '0', '156673641', '2015-06-18', '2016-06-18', 'A B D', 'A'),
(34764075, 'Armando Maximiliano', 'Palomino', 'Mendoza 2816', 'San Miguel de Tucuman', 'Tucuman', '0', '156096488', '2015-10-19', '2016-10-19', 'D1', 'A'),
(35484121, 'Luis Alfredo', 'Llobell', 'Pelegrini 683', 'San Miguel de Tucuman', 'Tucuman', '4204487', '153395288', '2014-10-10', '2016-10-10', 'D E', 'A'),
(36049770, 'Antonio Luis Alberto', 'Suarez', 'Alsina 1525', 'San Miguel de Tucuman', 'Tucuman', '0', '155697320', '2014-04-30', '2016-04-30', 'D', 'A'),
(37657336, 'Marcio Iban', 'Teseira', 'Sin', 'a', 'Tucuman', '0', '154193698', '2012-03-20', '2017-03-20', 'D', 'A'),
(40036800, 'Jaime Fernando Ramon', 'Coronel', 'Bolivia 1860', 'Yerba Buena', 'Tucuman', '0', '155520865', '2015-08-31', '2016-08-31', 'D1', 'B'),
(40086800, 'Ramon Fernando', 'Coronel Jaimez', 'Bolivia 1860', 'Yerba Buena', 'Tucuman', '0', '155520865', '2015-08-31', '2016-08-31', 'D1', 'A'),
(321342602, 'Cristian Anibal', 'Gonzalez', 'Agustin Mazza 226', 'San Miguel de Tucuman', 'Tucuman', '0', '0', '2015-04-13', '2017-04-13', 'A D E', 'B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

CREATE TABLE IF NOT EXISTS `mecanico` (
  `idMecanico` int(11) NOT NULL AUTO_INCREMENT,
  `Movil_idMovil` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `reparacion` varchar(45) DEFAULT NULL,
  `importe` float DEFAULT NULL,
  PRIMARY KEY (`idMecanico`,`Movil_idMovil`),
  KEY `fk_Mecanico_Movil1_idx` (`Movil_idMovil`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`idMecanico`, `Movil_idMovil`, `fecha`, `reparacion`, `importe`) VALUES
(1, 1111, '2015-11-08', 'Hola :) ', 12.36),
(2, 123, '2015-11-08', ':) ', 12.23),
(3, 123, '2015-11-08', ':)', 12.34);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movil`
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
  `patente` varchar(20) DEFAULT NULL,
  `ajusteReloj` float DEFAULT NULL,
  `fechaLicencia` date DEFAULT NULL,
  `numeroLicencia` int(11) DEFAULT NULL,
  `licencia` varchar(45) DEFAULT NULL,
  `estado` varchar(5) DEFAULT 'A',
  PRIMARY KEY (`idMovil`),
  KEY `patente` (`patente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `movil`
--

INSERT INTO `movil` (`idMovil`, `modelo`, `kilometraje`, `correa`, `aceite`, `grasa`, `filtro`, `aditivoMotor`, `aditivoCaja`, `patente`, `ajusteReloj`, `fechaLicencia`, `numeroLicencia`, `licencia`, `estado`) VALUES
(4, 'Chevrolet Classic 2015', 0, 0, 24200, 0, 0, 'ninguno', 'ninguno', 'PCT-956', 0.94, '2019-11-29', 3262, 'SUTRAPPA', 'A'),
(5, 'Fiat Uno 2008', 0, 0, 0, 0, 0, 'ninguno', 'ninguno', 'GUX-141', 0.93, '2015-11-14', 2913, 'SUTRAPPA', 'A'),
(48, 'Fiat Uno 2014', 0, 112448, 155400, 0, 0, 'ninguno', 'ninguno', 'ODD-392', 0.98, '2019-05-12', 4258, 'SUTRAPPA', 'A'),
(60, 'Fiat Palio 2015', 0, 524350, 0, 385022, 0, 'ninguno', 'ninguno', 'PEF-441', 0.97, '2017-03-07', 5134, 'SUTRAPPA', 'A'),
(63, 'Fiat Uno 2008', 0, 524350, 0, 385022, 0, 'ninguno', 'ninguno', 'HOB-899', 0.98, '2016-04-21', 644, 'YERBA BUENA', 'A'),
(74, 'Fiat Palio 2009', 408911, 408911, 408900, 0, 0, 'ninguno', 'ninguno', 'IGJ-883', 1, '2016-04-21', 412, 'YERBA BUENA', 'A'),
(80, 'Fiat Siena 2014', 0, 0, 58250, 0, 0, 'ninguno', 'ninguno', 'OGK-845', 1, '2015-11-14', 4820, 'SUTRAPPA', 'A'),
(84, 'Fiat Uno 2012', 0, 0, 0, 0, 0, 'null', 'null', 'KZP-065', 1, '2016-04-21', 673, 'YERBA BUENA ', 'A'),
(106, 'Fiat Uno 2007', 0, 0, 0, 0, 0, 'null', 'null', 'GIT-943', 0.99, '2016-04-21', 382, 'YERBA BUENA', 'A'),
(123, 'modelo', 123456, 123456789, 123456789, 123456789, 123456789, 'vardal', 'fernet', 'ABB123', 0.99, '2015-10-01', 4041, 'SUTRAPA', 'B'),
(238, 'Fiat Uno 2011', 0, 441500, 0, 338000, 356000, 'ninguno', 'ninguno', 'KMJ-466', 0.95, '2016-10-05', 2035, 'SUTRAPPA', 'A'),
(241, 'Volkswagen Gol 2010', 0, 373600, 0, 276483, 0, 'ninguno', 'ninguno', 'IRO-177', 0.99, '2017-12-16', 5433, 'SUTRAPPA', 'A'),
(242, 'Fiat Uno 2012', 0, 441500, 0, 338000, 356000, 'ninguno', 'ninguno', 'LDC-256', 1, '2018-09-15', 2031, 'SUTRAPPA', 'A'),
(243, 'Fiat Siena 2011', 0, 340620, 0, 247218, 238140, 'ninguno', 'ninguno', 'JYY-285', 0.93, '2015-11-14', 7168, 'SUTRAPPA', 'A'),
(244, 'Fiat Uno 2010', 0, 340620, 0, 247218, 238140, 'ninguno', 'ninguno', 'IXA-040', 0.92, '2019-10-28', 1330, 'SUTRAPPA', 'A'),
(246, 'Fiat Uno 2011', 0, 427800, 0, 356685, 318575, 'ninguno', 'ninguno', 'KKZ-838', 0.97, '2018-12-15', 2365, 'SUTRAPPA', 'A'),
(256, 'Fiat Uno 2013', 0, 208350, 0, 0, 50900, 'ninguno', 'ninguno', 'MBT-747', 0.99, '2019-01-11', 4719, 'SUTRAPPA', 'A'),
(265, 'Fiat Siena 2014', 0, 158500, 0, 0, 0, 'ninguno', 'ninguno', 'NUF-131', 0.99, '2019-09-06', 4844, 'SUTRAPPA', 'A'),
(266, 'Fiat Uno 2010', 0, 501780, 534980, 428253, 428253, 'ninguno', 'ninguno', 'INZ-971', 0.99, '2019-09-16', 6028, 'SUTRAPPA', 'A'),
(268, 'Chevrolet Classic 2013', 0, 141415, 0, 0, 0, 'ninguno', 'ninguno', 'MUI-265', 0.99, '2015-11-14', 5959, 'SUTRAPPA', 'A'),
(284, 'Chevrolet Classic 2015', 0, 495380, 0, 0, 422886, 'ninguno', 'ninguno', 'PAT-230', 0.99, '2016-02-13', 2034, 'SUTRAPPA', 'A'),
(291, 'Fiat Uno 2013', 0, 364862, 375200, 175564, 175564, 'ninguno', 'ninguno', 'MAF-729', 0.99, '2017-11-19', 7709, 'SUTRAPPA', 'A'),
(500, 'Fiat Palio 2008', 0, 338282, 0, 240000, 253600, 'ninguno', 'ninguno', 'HGV-947', 0.99, '2016-04-21', 113, 'YERBA BUENA', 'A'),
(501, 'Fiat Uno 2007', 0, 356460, 0, 290850, 0, 'ninguno', 'ninguno', 'GIT-943', 0.99, '2016-04-21', 382, 'YERBA BUENA', 'B'),
(502, 'Fiat Uno 2014', 0, 0, 0, 0, 0, 'ninguno', 'ninguno', 'NYH-666', 0.99, '2016-04-21', 673, 'YERBA BUENA', 'A'),
(503, 'Fiat Uno 2011', 0, 233590, 0, 0, 0, 'ninguno', 'ninguno', 'KHF-697', 0.99, '2016-04-21', 412, 'YERBA BUENA', 'A'),
(504, 'Fiat Uno 2008', 0, 315500, 0, 240231, 260058, 'ninguno', 'ninguno', 'HOB-899', 0.99, '2016-04-21', 644, 'YERBA BUENA', 'B'),
(505, 'Volkswagen Gol 2008', 0, 205895, 0, 0, 0, 'ninguno', 'ninguno', 'HKZ-496', 0.99, '2016-04-21', 314, 'YERBA BUENA', 'A'),
(506, 'Fiat Uno 2013', 0, 230472, 0, 121762, 121762, 'ninguno', 'ninguno', 'NCM-774', 0.99, '2016-04-21', 674, 'YERBA BUENA', 'A'),
(507, 'Fiat Uno 2013', 0, 64640, 0, 30700, 0, 'ninguno', 'ninguno', 'NAI-122', 0.99, '2016-04-21', 382, 'YERBA BUENA', 'A'),
(508, 'Fiat Uno 2013', 0, 62000, 0, 0, 0, 'ninguno', 'ninguno', 'MIQ-328', 0.99, '2016-04-21', 644, 'YERBA BUENA', 'A'),
(509, 'Fiat Uno 2012', 0, 390600, 0, 0, 0, 'ninguno', 'ninguno', 'KZP-065', 0.99, '2016-04-21', 673, 'YERBA BUENA', 'B'),
(510, 'Fiat Palio 2009', 0, 359117, 0, 287467, 298300, 'ninguno', 'ninguno', 'IGJ-883', 0.99, '2016-04-21', 412, 'YERBA BUENA', 'B'),
(1111, 'Ford Fiesta 2005', 88000, 1, 2, 3, 4, 'motormail', 'caja magica', 'FAS 648', 0.99, '2015-11-08', 9876, 'YERBA BUENA', 'B'),
(7894, 'Focus 2012', 90000, 0, 0, 0, 0, 'null', 'null', 'JJJ 111', 0.99, '2015-12-01', 4321, 'SUTRAPA', 'B'),
(123456, 'Ford Taunus 95', 12356, 0, 0, 0, 0, 'null', 'null', 'HHH666', 0, '2015-12-01', 987654, 'SUTRAPA', 'B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE IF NOT EXISTS `repuesto` (
  `Nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `repuesto`
--

INSERT INTO `repuesto` (`Nombre`) VALUES
('Aceite'),
('Correa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto_has_mecanico`
--

CREATE TABLE IF NOT EXISTS `repuesto_has_mecanico` (
  `Repuesto_Nombre` varchar(45) NOT NULL,
  `Mecanico_idMecanico` int(11) NOT NULL,
  `Mecanico_Movil_idMovil` int(11) NOT NULL,
  PRIMARY KEY (`Repuesto_Nombre`,`Mecanico_idMecanico`,`Mecanico_Movil_idMovil`),
  KEY `fk_Repuesto_has_Mecanico_Mecanico1_idx` (`Mecanico_idMecanico`,`Mecanico_Movil_idMovil`),
  KEY `fk_Repuesto_has_Mecanico_Repuesto1_idx` (`Repuesto_Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `repuesto_has_mecanico`
--

INSERT INTO `repuesto_has_mecanico` (`Repuesto_Nombre`, `Mecanico_idMecanico`, `Mecanico_Movil_idMovil`) VALUES
('Aceite', 3, 123),
('Correa', 3, 123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE IF NOT EXISTS `turno` (
  `idTurno` int(11) NOT NULL AUTO_INCREMENT,
  `Movil_idMovil` int(11) NOT NULL,
  `Ajustes_idAjustes` int(11) NOT NULL,
  `Chofer_DNI` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `kmInicial` int(11) DEFAULT NULL,
  `kmFinal` int(11) DEFAULT NULL,
  `gastosVarios` float NOT NULL,
  `recaudacion` float DEFAULT NULL,
  `gncBrutoCtaCte` float DEFAULT NULL,
  `gncFueraCtaCte` float DEFAULT NULL,
  `kmOcupados` int(11) DEFAULT NULL,
  `kmLibres` int(11) DEFAULT NULL,
  `ticketRelevo1` float DEFAULT NULL,
  `ticketRelevo2` float DEFAULT NULL,
  `tipo` varchar(1) DEFAULT NULL,
  `gastosChequera` float DEFAULT NULL,
  `novedades` varchar(500) DEFAULT NULL,
  `detalleCaja` varchar(500) DEFAULT NULL,
  `importeCaja` float DEFAULT NULL,
  PRIMARY KEY (`idTurno`,`Movil_idMovil`,`Ajustes_idAjustes`,`Chofer_DNI`),
  KEY `fk_Turno_Movil1_idx` (`Movil_idMovil`),
  KEY `fk_Turno_Ajustes1_idx` (`Ajustes_idAjustes`),
  KEY `fk_Turno_Chofer1_idx` (`Chofer_DNI`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=121 ;

--
-- Volcado de datos para la tabla `turno`
--

INSERT INTO `turno` (`idTurno`, `Movil_idMovil`, `Ajustes_idAjustes`, `Chofer_DNI`, `fecha`, `kmInicial`, `kmFinal`, `gastosVarios`, `recaudacion`, `gncBrutoCtaCte`, `gncFueraCtaCte`, `kmOcupados`, `kmLibres`, `ticketRelevo1`, `ticketRelevo2`, `tipo`, `gastosChequera`, `novedades`, `detalleCaja`, `importeCaja`) VALUES
(1, 123, 5, 123456, '2015-11-11', 1, 2, 7, 5, 8, 9, 10, 11, 3, 4, 'P', 12, '2121', NULL, NULL),
(2, 284, 7, 28157260, '2015-11-23', 3325, 3507, 8, 917.7, 89.89, 0, 104, 87, 35, 0, 'P', 0, '', NULL, NULL),
(3, 502, 7, 24750777, '2015-11-23', 41595, 41757, 8, 756.7, 89.53, 0, 73, 88, 105.7, 0, 'P', 0, '', 'Frecuencia 353', 150),
(4, 291, 7, 1000, '2015-11-23', 375071, 375256, 8, 897.4, 83.12, 0, 95, 95, 36.4, 0, 'P', 0, '', NULL, NULL),
(5, 80, 7, 1000, '2015-11-23', 57776, 57945, 8, 644.7, 79.03, 0, 67, 101, 20.3, 0, 'P', 0, '', NULL, NULL),
(6, 60, 7, 12449065, '2015-11-23', 2066, 2229, 8, 724.5, 90.95, 0, 81, 87, 15.4, 17.5, 'P', 0, '', NULL, NULL),
(7, 241, 7, 40036800, '2015-11-23', 387561, 387661, 8, 383, 25.67, 0, 0, 0, 74.9, 0, 'P', 0, '', NULL, NULL),
(8, 508, 7, 33978414, '2015-11-23', 77164, 77348, 8, 581, 77.91, 0, 58, 125, 49, 37.8, 'P', 0, '', 'Frecuencia 353', 150),
(9, 256, 7, 24933321, '2015-11-23', 230806, 230967, 58, 788.9, 80.87, 0, 84, 100, 47.6, 49, 'P', 0, '', 'Nafta', 150),
(10, 243, 7, 27589051, '2015-11-23', 367365, 367520, 20, 588, 107.55, 0, 62, 104, 70.7, 0, 'P', 0, '', NULL, NULL),
(11, 84, 7, 1000, '2015-11-23', 398388, 398540, 8, 702.7, 98.48, 0, 68, 83, 74.9, 0, 'P', 0, '', 'Frecuencia Bulnes', 170),
(12, 242, 7, 22414674, '2015-11-23', 385147, 385299, 8, 470.2, 74.95, 0, 49, 102, 16.1, 39.2, 'P', 0, '', NULL, NULL),
(13, 4, 7, 18203365, '2015-11-23', 21059, 21219, 0, 743.4, 79.56, 0, 76, 95, 19.6, 20.3, 'P', 0, '', NULL, NULL),
(14, 246, 7, 35484121, '2015-11-23', 467612, 467721, 8, 392, 56.38, 0, 39, 74, 13.3, 67.2, 'P', 0, '', NULL, NULL),
(15, 506, 7, 17269980, '2015-11-23', 263126, 263285, 0, 545.3, 78.26, 15, 52, 105, 95.2, 14, 'P', 0, '', 'Frecuencia 353', 150),
(16, 265, 7, 24816963, '2015-11-23', 184410, 184576, 0, 763, 89.77, 0, 82, 95, 52.5, 52.5, 'P', 0, '', NULL, NULL),
(17, 63, 7, 1000, '2015-11-23', 322695, 322813, 8, 385.7, 57.86, 0, 34, 86, 0, 0, 'P', 0, '', 'Frecuencia Bulnes', 170),
(18, 500, 7, 1000, '2015-11-23', 356986, 357168, 8, 705.6, 106.79, 0, 74, 122, 42, 0, 'P', 0, '', 'Frecuencia 353', 150),
(19, 268, 7, 18203194, '2015-11-23', 162450, 162639, 8, 896, 135.13, 0, 95, 106, 70, 64.4, 'P', 0, '', NULL, NULL),
(20, 238, 7, 1000, '2015-11-23', 465254, 465388, 158, 413.7, 75.16, 0, 39, 102, 0, 0, 'P', 0, '', NULL, NULL),
(21, 244, 7, 1000, '2015-11-23', 511828, 511979, 8, 765.1, 97.17, 0, 82, 82, 58.8, 0, 'P', 0, '', NULL, NULL),
(22, 503, 7, 1000, '2015-11-23', 262006, 262227, 0, 779.1, 102.87, 0, 92, 141, 177.1, 0, 'P', 0, '', 'Frecuencia 353', 150),
(23, 5, 7, 23116136, '2015-11-23', 359946, 360061, 8, 496.3, 66.52, 0, 51, 73, 28.7, 32.9, 'P', 0, '', NULL, NULL),
(24, 48, 7, 27370077, '2015-11-23', 155355, 155535, 8, 733.6, 102.03, 0, 77, 107, 130.9, 0, 'P', 0, '', NULL, NULL),
(25, 266, 7, 1000, '2015-11-23', 534535, 534761, 8, 882.7, 126.05, 0, 94, 141, 8.4, 152.6, 'P', 55, '', NULL, NULL),
(26, 266, 7, 22429787, '2015-11-24', 534761, 534918, 8, 671.3, 81.88, 0, 73, 91, 51.1, 0, 'S', 0, '', NULL, NULL),
(27, 503, 7, 30608570, '2015-11-24', 262227, 262439, 8, 741.3, 94.44, 0, 89, 137, 107, 0, 'S', 0, '', NULL, NULL),
(28, 244, 7, 22861751, '2015-11-24', 511979, 512180, 38, 733.6, 94.45, 0, 81, 132, 0, 0, 'P', 0, '', NULL, NULL),
(29, 242, 7, 14083816, '2015-11-24', 385299, 295473, 8, 756.7, 85.14, 0, 80, 94, 30.1, 29.4, 'P', 78, '', NULL, NULL),
(30, 265, 7, 33977175, '2015-11-24', 184576, 184735, 8, 756.7, 86.74, 0, 82, 87, 51.8, 50.4, 'P', 0, '', NULL, NULL),
(31, 48, 7, 16685407, '2015-11-24', 155535, 155700, 8, 638.4, 84, 0, 74, 98, 79.8, 65.1, 'P', 0, '', NULL, NULL),
(32, 508, 7, 30268270, '2015-11-24', 77348, 77567, 8, 759.5, 62.43, 0, 79, 139, 81.2, 70, 'P', 0, '', NULL, NULL),
(33, 502, 7, 33974100, '2015-11-24', 41767, 41913, 8, 581, 67.89, 0, 63, 85, 50.4, 0, 'P', 0, '', NULL, NULL),
(34, 256, 7, 36049770, '2015-11-24', 230976, 231175, 8, 784, 93.98, 0, 91, 128, 84.7, 93.1, 'P', 72.8, '', NULL, NULL),
(35, 84, 7, 25740874, '2015-11-24', 398540, 398692, 0, 503.3, 86.38, 0, 54, 98, 0, 0, 'P', 0, '', NULL, NULL),
(36, 4, 7, 17042491, '2015-11-24', 21219, 21461, 8, 982, 91.31, 0, 105, 154, 22.4, 20.3, 'P', 130, '', NULL, NULL),
(37, 60, 7, 32134260, '2015-11-24', 2229, 2424, 8, 817.6, 103.52, 0, 89, 113, 33.6, 64.4, 'P', 0, '', NULL, NULL),
(38, 246, 7, 29060521, '2015-11-24', 467721, 467900, 8, 702.1, 81.35, 0, 74, 115, 58.8, 0, 'P', 0, '', NULL, NULL),
(39, 505, 7, 23425938, '2015-11-24', 247759, 248014, 0, 937.3, 90, 0, 106, 152, 0, 0, 'P', 0, '', NULL, NULL),
(40, 5, 7, 17859191, '2015-11-24', 360061, 360249, 8, 691, 97.18, 0, 86, 92, 0, 0, 'P', 0, 'SIN TICKET 2 Y DE RELEVOS POR PRENDIDAS DE RELOJ REITERADAS', NULL, NULL),
(41, 63, 7, 17376047, '2015-11-24', 322813, 322476, 8, 573.3, 85.26, 0, 60, 95, 88.9, 0, 'S', 0, '', NULL, NULL),
(42, 500, 7, 1000, '2015-11-24', 357168, 357394, 0, 774.2, 100.68, 20, 85, 148, 32, 0, 'S', 0, '', NULL, NULL),
(43, 284, 7, 28157260, '2015-11-24', 3508, 3603, 8, 456.4, 54.84, 0, 49, 52, 0, 0, 'S', 0, '', NULL, NULL),
(44, 268, 7, 10910329, '2015-11-24', 162639, 162778, 0, 596.4, 44.95, 0, 73, 76, 49.7, 0, 'S', 0, '', NULL, NULL),
(45, 80, 7, 34764075, '2015-11-24', 57945, 58148, 8, 982.1, 108.56, 0, 113, 91, 60.2, 73.5, 'S', 71, '', NULL, NULL),
(46, 291, 7, 23367064, '2015-11-24', 375256, 375393, 0, 555.1, 69.49, 0, 60, 89, 56, 79.1, 'S', 0, '', NULL, NULL),
(47, 241, 7, 40086800, '2015-11-24', 387661, 387794, 0, 479.5, 83.77, 0, 54, 89, 0, 0, 'S', 0, '', NULL, NULL),
(48, 80, 7, 32163411, '2015-11-24', 58151, 58333, 8, 896, 85.86, 0, 95, 88, 16.8, 0, 'P', 0, '', NULL, NULL),
(49, 48, 7, 27370077, '2015-11-24', 155700, 155841, 8, 541.8, 85.67, 0, 53, 92, 0, 0, 'P', 0, '', NULL, NULL),
(50, 60, 7, 12449065, '2015-11-24', 2424, 2606, 8, 854.7, 101.09, 0, 91, 97, 16.1, 0, 'P', 0, '', NULL, NULL),
(51, 508, 7, 33978414, '2015-11-24', 77567, 77568, 8, 680.4, 78.62, 0, 72, 111, 33.6, 0, 'P', 0, '', NULL, NULL),
(52, 502, 7, 24750777, '2015-11-24', 41918, 42072, 8, 767.9, 72.1, 0, 78, 82, 106.4, 0, 'P', 0, '', NULL, NULL),
(53, 506, 7, 17269980, '2015-11-24', 263285, 263491, 16, 588.7, 91.72, 0, 61, 144, 0, 0, 'P', 0, '', NULL, NULL),
(54, 266, 7, 27589051, '2015-11-24', 534918, 535091, 8, 726.6, 79.98, 0, 72, 107, 74.9, 0, 'P', 0, '', NULL, NULL),
(55, 503, 7, 33541310, '2015-11-24', 262439, 262652, 0, 773.5, 93.56, 0, 85, 142, 93.1, 0, 'P', 0, '', NULL, NULL),
(56, 284, 7, 28157260, '2015-11-24', 3603, 3803, 8, 826.7, 108.62, 0, 91, 118, 0, 30.1, 'P', 0, '', NULL, NULL),
(57, 265, 7, 24816963, '2015-11-24', 184135, 184919, 0, 912.8, 96.29, 0, 94, 101, 48.3, 52.5, 'P', 0, '', NULL, NULL),
(58, 243, 7, 20342160, '2015-11-24', 367523, 367676, 108, 728.7, 89.29, 0, 78, 88, 63.7, 68.6, 'P', 0, '', NULL, NULL),
(59, 4, 7, 18203365, '2015-11-24', 21461, 21641, 8, 877.8, 141.29, 0, 92, 101, 53.9, 21, 'P', 0, '', NULL, NULL),
(60, 268, 7, 18203194, '2015-11-24', 162768, 162940, 8, 768.6, 110.29, 0, 85, 88, 0, 0, 'P', 0, '', NULL, NULL),
(61, 242, 7, 22414674, '2015-11-24', 385473, 385621, 8, 538.3, 77.96, 0, 52, 95, 38.5, 36.4, 'P', 0, '', NULL, NULL),
(62, 256, 7, 24933321, '2015-11-24', 231175, 231346, 8, 771.4, 79.62, 0, 82, 99, 48.3, 48.3, 'P', 0, '', NULL, NULL),
(63, 291, 7, 10556807, '2015-11-24', 375393, 375592, 8, 896, 89.82, 10, 97, 111, 0, 0, 'P', 0, '', NULL, NULL),
(64, 241, 7, 40086800, '2015-11-24', 387794, 387926, 8, 581.7, 122.38, 0, 65, 78, 80.5, 0, 'P', 0, '', NULL, NULL),
(65, 244, 7, 16784647, '2015-11-24', 512180, 512335, 0, 776.3, 81, 10, 83, 84, 49, 0, 'P', 0, '', NULL, NULL),
(66, 500, 7, 30357320, '2015-11-24', 357394, 357584, 0, 614.6, 102.95, 0, 62, 135, 93.8, 33.6, 'P', 0, '', NULL, NULL),
(67, 84, 7, 17182268, '2015-11-24', 398692, 398865, 0, 731.5, 94.51, 0, 76, 97, 0, 0, 'P', 0, '', NULL, NULL),
(68, 80, 7, 34764075, '2015-11-26', 58662, 58862, 8, 954.8, 100.43, 0, 109, 91, 77, 72.1, 'S', 0, '', NULL, NULL),
(69, 503, 7, 30608570, '2015-11-26', 263059, 263265, 8, 767.2, 105, 0, 92, 123, 84.7, 184.1, 'S', 0, '', NULL, NULL),
(70, 268, 7, 10910329, '2015-11-26', 163170, 163342, 8, 928.9, 110.94, 0, 111, 73, 23.1, 0, 'S', 0, '', NULL, NULL),
(71, 244, 7, 22861751, '2015-11-26', 512693, 512868, 8, 826, 80.22, 0, 94, 90, 0, 0, 'S', 0, '', NULL, NULL),
(72, 502, 7, 33974100, '2015-11-26', 42496, 42724, 8, 889, 101.57, 0, 97, 130, 69.3, 106.4, 'S', 0, '', NULL, NULL),
(73, 265, 7, 33977175, '2015-11-26', 185133, 185245, 8, 525, 61.29, 0, 61, 57, 49.7, 0, 'S', 0, '', NULL, NULL),
(74, 256, 7, 36049770, '2015-11-26', 231670, 231882, 8, 797.3, 89.41, 0, 89, 123, 81.2, 96.6, 'S', 0, '', NULL, NULL),
(75, 246, 7, 29060521, '2015-11-26', 468213, 468434, 8, 834.4, 119.65, 0, 151, 141, 30.8, 28.7, 'S', 0, '', NULL, NULL),
(76, 508, 7, 30268270, '2015-11-26', 77936, 78210, 26, 840.75, 81.61, 0, 96, 170, 69.3, 33.6, 'S', 0, '', NULL, NULL),
(77, 4, 7, 17042491, '2015-11-26', 22051, 22276, 8, 835.8, 137.61, 0, 89, 151, 17.5, 20.3, 'S', 0, '', NULL, NULL),
(78, 266, 7, 22429787, '2015-11-26', 535390, 535556, 8, 854.7, 74, 0, 97, 76, 51.8, 56, 'S', 0, '', NULL, NULL),
(79, 48, 7, 1000, '2015-11-26', 156182, 156378, 8, 777, 100, 0, 82, 122, 60.9, 65.8, 'S', 0, '', NULL, NULL),
(80, 284, 7, 1000, '2015-11-26', 4185, 4350, 8, 617.4, 107.49, 0, 60, 113, 26.6, 23.1, 'S', 0, '', NULL, NULL),
(81, 63, 7, 17376047, '2015-11-26', 323317, 323490, 8, 522.2, 80.69, 0, 52, 124, 14, 58.8, 'S', 0, '', NULL, NULL),
(82, 241, 7, 23783738, '2015-11-26', 388307, 388567, 8, 1137.5, 221.45, 0, 141, 148, 7, 47.6, 'S', 0, '', NULL, NULL),
(83, 242, 7, 14083816, '2015-11-26', 385963, 386150, 8, 852.6, 82.24, 0, 93, 94, 33.6, 29.4, 'S', 0, '', NULL, NULL),
(84, 500, 7, 26743065, '2015-11-26', 357863, 358039, 0, 690.9, 97.71, 0, 73, 93, 36.4, 0, 'S', 0, '', NULL, NULL),
(85, 60, 7, 32134260, '2015-11-26', 2804, 2962, 8, 685.3, 93.56, 0, 77, 86, 65.1, 7, 'S', 40, '', NULL, NULL),
(86, 506, 7, 1000, '2015-11-26', 263806, 263945, 8, 625.1, 64.09, 0, 71, 81, 116.2, 37.8, 'S', 0, '', NULL, NULL),
(87, 243, 7, 16685407, '2015-11-26', 368027, 268208, 8, 721, 89.9, 0, 78, 117, 83.3, 89.6, 'S', 0, '', NULL, NULL),
(88, 5, 7, 17859191, '2015-11-26', 360688, 360944, 8, 812.7, 108.09, 10, 96, 180, 52.5, 52.5, 'S', 0, '', NULL, NULL),
(89, 84, 7, 23425938, '2015-11-26', 399178, 399335, 0, 444.3, 60.9, 0, 47, 122, 28.7, 0, 'S', 0, '', NULL, NULL),
(90, 291, 7, 1000, '2015-11-26', 375978, 376045, 0, 408.8, 45.42, 0, 45, 26, 86.8, 0, 'S', 0, '', NULL, NULL),
(91, 238, 7, 23367064, '2015-11-26', 465717, 465789, 8, 288.4, 46.6, 0, 29, 47, 28.7, 18.9, 'S', 0, '', NULL, NULL),
(92, 60, 7, 12449065, '2015-11-26', 2962, 3123, 0, 786.1, 107.97, 0, 77, 90, 16.8, 17.5, 'P', 0, '', NULL, NULL),
(93, 500, 7, 1000, '2015-11-26', 358033, 358203, 8, 631.4, 111.58, 20, 64, 108, 7, 0, 'P', 0, '', NULL, NULL),
(94, 284, 7, 28157260, '2015-11-26', 4350, 4563, 8, 990.5, 108.62, 0, 110, 114, 30.8, 0, 'P', 0, '', NULL, NULL),
(95, 5, 7, 23116136, '2015-11-26', 360944, 361066, 8, 718.9, 74.77, 0, 69, 63, 74.26, 7, 'P', 0, '', NULL, NULL),
(96, 242, 7, 22414674, '2015-11-26', 386150, 386344, 8, 863.1, 90.53, 0, 89, 104, 71.4, 45.5, 'P', 0, '', NULL, NULL),
(97, 4, 7, 18203365, '2015-11-26', 22276, 22467, 8, 1071, 99.25, 0, 113, 91, 21, 21, 'P', 0, '', NULL, NULL),
(98, 241, 7, 40086800, '2015-11-26', 388567, 388722, 8, 702.8, 75.48, 0, 73, 94, 49, 0, 'P', 0, '', NULL, NULL),
(99, 63, 7, 17182268, '2015-11-26', 323490, 323684, 8, 851.2, 72.09, 0, 87, 112, 160.3, 7, 'P', 0, '', NULL, NULL),
(100, 265, 7, 24816963, '2015-11-26', 185245, 185449, 0, 848.4, 118.64, 0, 90, 128, 46.9, 51.8, 'P', 0, '', NULL, NULL),
(101, 256, 7, 24933321, '2015-11-26', 231882, 232042, 8, 760.9, 80.99, 0, 80, 89, 74.9, 76.3, 'P', 0, '', NULL, NULL),
(102, 84, 7, 25740874, '2015-11-26', 399335, 399440, 0, 445.9, 49.33, 0, 48, 66, 163.1, 0, 'P', 0, '', NULL, NULL),
(103, 268, 7, 18203194, '2015-11-26', 163342, 163506, 8, 851.9, 130.02, 0, 96, 79, 58.8, 0, 'P', 0, '', NULL, NULL),
(104, 243, 7, 20342160, '2015-11-26', 368208, 368352, 8, 983.5, 90.65, 0, 96, 57, 63.7, 103.6, 'P', 0, '', NULL, NULL),
(105, 244, 7, 16784647, '2015-11-26', 512868, 513019, 8, 829.5, 85.74, 0, 85, 75, 50.4, 0, 'P', 0, '', NULL, NULL),
(106, 291, 7, 10556807, '2015-11-26', 376045, 376226, 8, 963.2, 63.8, 10, 105, 80, 35, 0, 'P', 0, '', NULL, NULL),
(107, 80, 7, 32163411, '2015-11-26', 58862, 59025, 8, 940.1, 85.5, 0, 98, 65, 16.8, 19.8, 'P', 0, '', NULL, NULL),
(108, 48, 7, 27370077, '2015-11-26', 0, 0, 0, 341.6, 0, 0, 0, 0, 128.1, 0, 'P', 0, '', NULL, NULL),
(109, 503, 7, 33541310, '2015-11-26', 263265, 263485, 8, 915.6, 87.21, 15, 102, 133, 73.5, 163.8, 'P', 0, '', NULL, NULL),
(110, 266, 7, 1000, '2015-11-26', 535556, 535738, 8, 802.9, 92.85, 0, 79, 109, 76.3, 0, 'P', 0, '', NULL, NULL),
(111, 508, 7, 33978414, '2015-11-26', 78203, 78401, 8, 886.9, 104.05, 0, 91, 106, 110.6, 67.2, 'P', 0, '', NULL, NULL),
(112, 506, 7, 17269980, '2015-11-26', 263945, 264133, 8, 793.8, 55.97, 15, 87, 101, 65.8, 61.6, 'P', 0, '', NULL, NULL),
(113, 246, 7, 35484121, '2015-11-26', 468434, 468609, 8, 812.7, 108.38, 0, 83, 105, 35.7, 14.7, 'P', 0, '', NULL, NULL),
(114, 238, 7, 27589051, '2015-11-26', 465789, 465939, 8, 611.8, 85.68, 0, 69, 89, 0, 0, 'P', 0, '', NULL, NULL),
(115, 502, 7, 1000, '2015-11-26', 42724, 42857, 0, 516.6, 62.08, 0, 48, 85, 21, 0, 'P', 0, '', NULL, NULL),
(116, 80, 7, 32163411, '2015-12-01', 60939, 61136, 8, 1030.4, 103.35, 0, 111, 88, 0, 0, 'P', 0, '', NULL, NULL),
(117, 503, 7, 30608570, '2015-12-01', 264989, 265151, 8, 432.6, 56.2, 0, 50, 110, 66.5, 0, 'S', 0, '', NULL, NULL),
(118, 80, 7, 34764075, '2015-12-01', 61136, 61376, 8, 1248.1, 126.41, 0, 142, 100, 51.8, 53.9, 'S', 40, '', NULL, NULL),
(119, 48, 7, 1000, '2015-12-01', 156506, 156771, 8, 1060.5, 147.52, 0, 110, 165, 0, 0, 'S', 0, '', NULL, NULL),
(120, 500, 7, 2000, '2015-12-01', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'S', 0, '', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `nombre` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  `permisos` varchar(15) DEFAULT 'A',
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `clave`, `permisos`) VALUES
('Diego', 'F1/HFI099/2034', 'R'),
('encargado', 'encargado', 'A'),
('marcelo', 'norberto', 'A'),
('root', 'root', 'A'),
('tury', 'marcelo', 'A');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mecanico`
--
ALTER TABLE `mecanico`
  ADD CONSTRAINT `fk_Mecanico_Movil1` FOREIGN KEY (`Movil_idMovil`) REFERENCES `movil` (`idMovil`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `repuesto_has_mecanico`
--
ALTER TABLE `repuesto_has_mecanico`
  ADD CONSTRAINT `fk_Repuesto_has_Mecanico_Mecanico1` FOREIGN KEY (`Mecanico_idMecanico`, `Mecanico_Movil_idMovil`) REFERENCES `mecanico` (`idMecanico`, `Movil_idMovil`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Repuesto_has_Mecanico_Repuesto1` FOREIGN KEY (`Repuesto_Nombre`) REFERENCES `repuesto` (`Nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `fk_Turno_Ajustes1` FOREIGN KEY (`Ajustes_idAjustes`) REFERENCES `ajustes` (`idAjustes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Turno_Chofer1` FOREIGN KEY (`Chofer_DNI`) REFERENCES `chofer` (`DNI`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Turno_Movil1` FOREIGN KEY (`Movil_idMovil`) REFERENCES `movil` (`idMovil`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
