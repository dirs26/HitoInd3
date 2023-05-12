-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2023 at 01:46 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hito`
--

-- --------------------------------------------------------

--
-- Table structure for table `clienteh`
--

CREATE TABLE `clienteh` (
  `id` int(100) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `plan` varchar(200) NOT NULL,
  `peso` varchar(500) NOT NULL,
  `categoria` varchar(500) NOT NULL,
  `horas` int(10) NOT NULL,
  `competicion` int(10) NOT NULL,
  `precio` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clienteh`
--

INSERT INTO `clienteh` (`id`, `nombre`, `plan`, `peso`, `categoria`, `horas`, `competicion`, `precio`) VALUES
(12, 'Ivan', 'Elite', '50-55', 'Peso pluma', 7, 5, '319.65');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clienteh`
--
ALTER TABLE `clienteh`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clienteh`
--
ALTER TABLE `clienteh`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
