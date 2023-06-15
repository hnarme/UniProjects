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
-- Database: `epiz_29443851_sports_images`
--

-- --------------------------------------------------------

--
-- Table structure for table `sports_images`
--

CREATE TABLE `sports_images` (
  `imgID` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `imgDIR` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sports_images`
--

INSERT INTO `sports_images` (`imgID`, `name`, `imgDIR`) VALUES
(1, 'basketball', 'images/sports/basketball.jpg'),
(2, 'badminton', 'images/sports/badminton.jpg'),
(3, 'football', 'images/sports/football.png'),
(4, 'netball', 'images/sports/netball.jpg'),
(5, 'rounders', 'images/sports/rounders.jpg'),
(6, 'rugby', 'images/sports/rugby.jpg'),
(7, 'softball', 'images/sports/softball.jpg'),
(8, 'tennis', 'images/sports/tennis.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sports_images`
--
ALTER TABLE `sports_images`
  ADD PRIMARY KEY (`imgID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sports_images`
--
ALTER TABLE `sports_images`
  MODIFY `imgID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
