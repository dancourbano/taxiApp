-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-08-2018 a las 08:07:50
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `taxistemadb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_administrador` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `dni` varchar(45) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `cuenta_id_cuenta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `create_at` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `ciudad` varchar(100) DEFAULT NULL,
  `telefono` varchar(40) DEFAULT NULL,
  `identificador` varchar(16) NOT NULL,
  `isruc` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `company` varchar(60) DEFAULT NULL,
  `update_at` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `apellido`, `create_at`, `email`, `nombre`, `direccion`, `ciudad`, `telefono`, `identificador`, `isruc`, `status`, `company`, `update_at`) VALUES
(1, 'asdas', '2018-04-21', 'asdasdasd', 'asdas', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(4, 'asdas', NULL, 'asdasdasd', 'vteyrth', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(5, 'cam', NULL, 'danielcam.inf@gmail.com', 'daniel', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(9, 'cam', NULL, 'danielcam.inf@gmail.com', 'jkghlkyioyutuy', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(11, '123123', '2018-04-22', '123123123', '123123', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(12, 'asdasd', '2018-04-24', '213213', 'asdas', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(13, 'asdasd', '2018-04-24', 'asdasd', 'asdas', NULL, NULL, NULL, '', 0, 0, NULL, NULL),
(15, '123', '2018-08-12', '123', '123', NULL, '123', '123123', '123', 0, 1, '123', NULL),
(16, '1231', '2018-08-12', 'danielcam.inf@gmail.com', 'daniel1', NULL, '123123', '1231231', '123123', 1, 1, '12312', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `id_conductor` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `dni` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `foto` text,
  `latitud` float DEFAULT NULL,
  `longitud` float DEFAULT NULL,
  `id_cuenta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`id_conductor`, `nombre`, `apellidos`, `telefono`, `correo`, `dni`, `direccion`, `foto`, `latitud`, `longitud`, `id_cuenta`) VALUES
(1, 'der123123', 'ewqeqwe', '8888888', 'dsaasd@qas.com', NULL, '132123', 'sasadsa', NULL, NULL, 60);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor_posicion`
--

CREATE TABLE `conductor_posicion` (
  `id` bigint(20) NOT NULL,
  `latitud` varchar(45) DEFAULT NULL,
  `longitud` varchar(45) DEFAULT NULL,
  `id_conductor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor_position`
--

CREATE TABLE `conductor_position` (
  `id` bigint(20) NOT NULL,
  `latitud` varchar(45) DEFAULT NULL,
  `longitud` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor_vehiculo`
--

CREATE TABLE `conductor_vehiculo` (
  `id_conductor_vehiculo` int(11) NOT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `fecha_alta` varchar(45) DEFAULT NULL,
  `fecha_baja` varchar(45) DEFAULT NULL,
  `id_conductor` int(11) NOT NULL,
  `id_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `conductor_vehiculo`
--

INSERT INTO `conductor_vehiculo` (`id_conductor_vehiculo`, `turno`, `estado`, `fecha_alta`, `fecha_baja`, `id_conductor`, `id_vehiculo`) VALUES
(1, '1', '1', '2015-12-12', '2015-12-14', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `id_cuenta` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `usuario` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id` bigint(20) NOT NULL,
  `create_at` date DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `observacion` varchar(255) DEFAULT NULL,
  `cliente_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas_items`
--

CREATE TABLE `facturas_items` (
  `id` bigint(20) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `producto_id` bigint(20) DEFAULT NULL,
  `factura_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localizacion_servicio`
--

CREATE TABLE `localizacion_servicio` (
  `id_localizacion` int(11) NOT NULL,
  `longitud_inicial` double DEFAULT NULL,
  `latitud_inicial` double DEFAULT NULL,
  `direccion_inicial` varchar(45) DEFAULT NULL,
  `referencias` varchar(45) DEFAULT NULL,
  `longitud_final` varchar(45) DEFAULT NULL,
  `latitud_final` varchar(45) DEFAULT NULL,
  `direccion_final` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL,
  `create_at` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicios` int(11) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `costo` varchar(45) DEFAULT NULL,
  `km_recorridos` varchar(45) DEFAULT NULL,
  `valoracion` varchar(45) DEFAULT NULL,
  `fecha_servicio` varchar(45) DEFAULT NULL,
  `clientes_id_cliente` int(11) NOT NULL,
  `id_conductor_vehiculo` int(11) NOT NULL,
  `id_localizacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `spring_session`
--

CREATE TABLE `spring_session` (
  `SESSION_ID` char(36) NOT NULL,
  `CREATION_TIME` bigint(20) NOT NULL,
  `LAST_ACCESS_TIME` bigint(20) NOT NULL,
  `MAX_INACTIVE_INTERVAL` int(11) NOT NULL,
  `PRINCIPAL_NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `spring_session_attributes`
--

CREATE TABLE `spring_session_attributes` (
  `SESSION_ID` char(36) NOT NULL,
  `ATTRIBUTE_NAME` varchar(200) NOT NULL,
  `ATTRIBUTE_BYTES` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `email` varchar(80) NOT NULL,
  `name` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_role`
--

CREATE TABLE `user_role` (
  `user_role_id` bigint(20) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `placa` varchar(255) DEFAULT NULL,
  `tipo_servicio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_administrador`),
  ADD KEY `fk_Administrador_Cuenta1_idx` (`cuenta_id_cuenta`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`id_conductor`),
  ADD KEY `fk_Conductor_Cuenta1_idx` (`id_cuenta`);

--
-- Indices de la tabla `conductor_posicion`
--
ALTER TABLE `conductor_posicion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `conductor_position`
--
ALTER TABLE `conductor_position`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `conductor_vehiculo`
--
ALTER TABLE `conductor_vehiculo`
  ADD PRIMARY KEY (`id_conductor_vehiculo`),
  ADD KEY `fk_Conductor_Vehiculo_Conductor1_idx` (`id_conductor`),
  ADD KEY `fk_Conductor_Vehiculo_Vehiculo1_idx` (`id_vehiculo`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`id_cuenta`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdrp2rxy2vals0xhwh7b8u378u` (`cliente_id`);

--
-- Indices de la tabla `facturas_items`
--
ALTER TABLE `facturas_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7i5nmmqllrjiiwmsf7sq5vxw9` (`producto_id`),
  ADD KEY `FKi2dhk9a2hkgm3olh4vgq9u83k` (`factura_id`);

--
-- Indices de la tabla `localizacion_servicio`
--
ALTER TABLE `localizacion_servicio`
  ADD PRIMARY KEY (`id_localizacion`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_id`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicios`),
  ADD KEY `fk_Servicio_Clientes1_idx` (`clientes_id_cliente`),
  ADD KEY `fk_Servicio_Conductor_Vehiculo1_idx` (`id_conductor_vehiculo`),
  ADD KEY `fk_Servicio_Localizacion_Servicio1_idx` (`id_localizacion`);

--
-- Indices de la tabla `spring_session`
--
ALTER TABLE `spring_session`
  ADD PRIMARY KEY (`SESSION_ID`),
  ADD KEY `SPRING_SESSION_IX1` (`LAST_ACCESS_TIME`);

--
-- Indices de la tabla `spring_session_attributes`
--
ALTER TABLE `spring_session_attributes`
  ADD PRIMARY KEY (`SESSION_ID`,`ATTRIBUTE_NAME`),
  ADD KEY `SPRING_SESSION_ATTRIBUTES_IX1` (`SESSION_ID`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_role_id`),
  ADD KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  ADD KEY `FK859n2jvi8ivhui0rl0esws6o` (`user_id`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehiculo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT de la tabla `conductor`
--
ALTER TABLE `conductor`
  MODIFY `id_conductor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `id_cuenta` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `facturas_items`
--
ALTER TABLE `facturas_items`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `user_role`
--
ALTER TABLE `user_role`
  MODIFY `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `FKdrp2rxy2vals0xhwh7b8u378u` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`);

--
-- Filtros para la tabla `facturas_items`
--
ALTER TABLE `facturas_items`
  ADD CONSTRAINT `FK7i5nmmqllrjiiwmsf7sq5vxw9` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `FKi2dhk9a2hkgm3olh4vgq9u83k` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`);

--
-- Filtros para la tabla `spring_session_attributes`
--
ALTER TABLE `spring_session_attributes`
  ADD CONSTRAINT `SPRING_SESSION_ATTRIBUTES_FK` FOREIGN KEY (`SESSION_ID`) REFERENCES `spring_session` (`SESSION_ID`) ON DELETE CASCADE;

--
-- Filtros para la tabla `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
