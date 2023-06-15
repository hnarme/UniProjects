-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql309.epizy.com
-- Generation Time: Aug 16, 2021 at 10:42 AM
-- Server version: 5.7.34-37
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `epiz_29443851_organisers`
--

-- --------------------------------------------------------

--
-- Table structure for table `organiser_information`
--

CREATE TABLE `organiser_information` (
  `id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `organiser_information`
--

INSERT INTO `organiser_information` (`id`, `Name`, `Email`, `Password`, `Phone`) VALUES
(1, 'Hannah', 'organiser@gmail.com', 'Password1', '07733333334'),
(2, 'Daniel', 'danyoung@gmail.com', 'Password1', '07523426321'),
(3, 'Ulyssa', 'lyssa@gmail.com', 'Password1', '07523426321'),
(4, 'Alice', 'Alicepayne@gmail.com', 'Password1', '07523426321'),
(5, 'Hugh', 'hughjackman@gmail.com', 'Password1', '07523426321'),
(6, 'Taylor', 'taymist@gmail.com', 'Password1', '07523426321'),
(7, 'John', 'gotsmith@gmail.com', 'Password1', '07523426321'),
(8, 'James', 'peaches@gmail.com', 'Password1', '07523426321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `organiser_information`
--
ALTER TABLE `organiser_information`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `organiser_information`
--
ALTER TABLE `organiser_information`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
