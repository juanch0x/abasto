-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-12-2015 a las 05:27:34
-- Versión del servidor: 5.6.25
-- Versión de PHP: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `abasto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `id_categoria` int(2) NOT NULL,
  `categoria` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `categoria`) VALUES
(1, 'categoria'),
(2, 'Verduleria'),
(3, 'sadsad'),
(4, 'Panadera'),
(5, 'Carameleria'),
(6, 'asd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE IF NOT EXISTS `detalle` (
  `id_venta` int(8) NOT NULL,
  `codigo` bigint(13) NOT NULL,
  `cantidad` int(3) NOT NULL,
  `numero_item` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`id_venta`, `codigo`, `cantidad`, `numero_item`) VALUES
(5, 123213123, 1, 0),
(5, 123213123, 1, 1),
(5, 123213123, 1, 2),
(5, 123213123, 1, 3),
(5, 123213123, 1, 4),
(5, 123213123, 1, 5),
(5, 123213123, 1, 6),
(5, 123213123, 1, 7),
(5, 123213123, 1, 8),
(5, 123213123, 1, 9),
(5, 123213123, 1, 10),
(5, 123213123, 1, 11),
(5, 123213123, 1, 12),
(5, 123213123, 1, 13),
(6, 77912954, 1, 1),
(6, 77912954, 1, 2),
(6, 77912954, 2, 3),
(6, 77912954, 6, 0),
(6, 77929891, 1, 5),
(6, 77929891, 1, 6),
(6, 77929891, 3, 4),
(6, 1234567890123, 1, 7),
(7, 77912954, 1, 0),
(7, 77912954, 1, 1),
(7, 77912954, 1, 2),
(7, 77912954, 1, 3),
(7, 77912954, 1, 4),
(7, 77912954, 1, 5),
(7, 77912954, 1, 6),
(7, 77912954, 1, 7),
(7, 77912954, 1, 8),
(7, 77912954, 1, 9),
(7, 77912954, 1, 10),
(8, 123213123, 1, 4),
(8, 7790895068164, 1, 0),
(8, 7790895068164, 1, 1),
(8, 7790895068164, 1, 2),
(8, 7790895068164, 1, 3),
(9, 7790895068164, 1, 0),
(9, 7790895068164, 1, 1),
(9, 7790895068164, 1, 2),
(9, 123456789101112, 1, 3),
(10, 7790895068164, 1, 0),
(10, 7790895068164, 1, 1),
(11, 77912954, 1, 0),
(11, 77912954, 1, 1),
(11, 77912954, 1, 2),
(11, 77912954, 1, 3),
(11, 77912954, 1, 4),
(11, 77912954, 1, 5),
(11, 7790895068164, 5, 6),
(12, 7790895068164, 1, 0),
(12, 7790895068164, 1, 1),
(13, 7790895068164, 138, 0),
(14, 7790895068164, 1, 0),
(14, 7790895068164, 1, 1),
(14, 7790895068164, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lote`
--

CREATE TABLE IF NOT EXISTS `lote` (
  `lote` varchar(25) NOT NULL,
  `codigo` bigint(15) NOT NULL,
  `vencimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `lote`
--

INSERT INTO `lote` (`lote`, `codigo`, `vencimiento`) VALUES
('2131', 77910974, '2015-12-27'),
('23', 7790895068164, '2015-12-31'),
('asdif', 123123, '2015-12-18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `cantidad` int(3) NOT NULL DEFAULT '0',
  `id_categoria` int(2) NOT NULL,
  `id_producto` int(5) NOT NULL,
  `codigo` bigint(15) NOT NULL,
  `precio_compra` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`nombre`, `precio`, `cantidad`, `id_categoria`, `id_producto`, `codigo`, `precio_compra`) VALUES
('asdsadad', 55.5, 7, 1, 1, 123123, 20.5),
('asd', 33, 15, 4, 2, 1234567890123, 123),
('lala', 10.5, 0, 2, 3, 123456789101112, 5.5),
('asdsad', 10, 0, 1, 4, 123213123, 12.12),
('phillip morris', 23, 0, 5, 5, 77912954, 20),
('parisciens', 30, 0, 4, 6, 77929891, 23),
('coca cola 2,5 l', 28, -3, 2, 7, 7790895068164, 20),
('Camel 20', 28, 14, 5, 8, 77910974, 23),
('maquina de coser', 2000, 0, 1, 9, 7793319000498, 1338),
('papa', 911, 1, 5, 10, 111111111111111, 91);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `id_venta` int(8) NOT NULL,
  `fecha_venta` date NOT NULL,
  `total` decimal(8,0) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id_venta`, `fecha_venta`, `total`) VALUES
(1, '2015-12-21', '30'),
(2, '2015-12-21', '63'),
(3, '2015-12-21', '112'),
(4, '2015-12-21', '101'),
(5, '2015-12-21', '140'),
(6, '2015-12-22', '413'),
(7, '2015-12-22', '253'),
(8, '2015-12-22', '122'),
(9, '2015-12-22', '95'),
(10, '2015-12-22', '56'),
(11, '2015-12-22', '278'),
(12, '2015-12-22', '56'),
(13, '2015-12-22', '3864'),
(14, '2015-12-22', '84');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`id_venta`,`codigo`,`cantidad`,`numero_item`);

--
-- Indices de la tabla `lote`
--
ALTER TABLE `lote`
  ADD PRIMARY KEY (`lote`,`codigo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(2) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int(8) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
