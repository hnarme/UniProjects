-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql309.epizy.com
-- Generation Time: Aug 16, 2021 at 10:41 AM
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
-- Database: `epiz_29443851_events`
--

-- --------------------------------------------------------

--
-- Table structure for table `culture`
--

CREATE TABLE `culture` (
  `id` int(11) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Dates` date NOT NULL,
  `Description` varchar(120) NOT NULL,
  `Organiser` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Picture` blob NOT NULL,
  `Ranking` int(10) NOT NULL,
  `Interest_Link` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `culture`
--

INSERT INTO `culture` (`id`, `Category`, `Name`, `Dates`, `Description`, `Organiser`, `Location`, `Picture`, `Ranking`, `Interest_Link`) VALUES
(1, 'Culture', 'Food Fair', '2022-03-15', 'Come and learn about other cultures food and try some as well!', 'Hannah', 'Outside', '', 30, 'Link'),
(2, 'Culture', 'Art & culture', '2022-03-15', 'See how culture has impacted art throughtout history, and even today', 'Daniel', 'Outside', '', 20, 'Link'),
(3, 'Culture', 'Culutre Festival', '2022-03-18', 'Learn about other cultures from 5+ different countries. Come with an open mind.', 'Ulyssa', 'Outside/directed', '', 10, 'Link');

-- --------------------------------------------------------

--
-- Table structure for table `other`
--

CREATE TABLE `other` (
  `id` int(11) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Dates` date NOT NULL,
  `Description` varchar(120) NOT NULL,
  `Organiser` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Picture` blob NOT NULL,
  `Ranking` int(10) NOT NULL,
  `Interest_Link` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `other`
--

INSERT INTO `other` (`id`, `Category`, `Name`, `Dates`, `Description`, `Organiser`, `Location`, `Picture`, `Ranking`, `Interest_Link`) VALUES
(1, 'Other', 'Piano', '2022-03-04', 'Are you a professional pianist or a beginner? All are welcome to this piano/instruments event.', 'Alice', 'Music Room', '', 5, 'Link'),
(2, 'Other', 'Comedy', '2022-03-05', 'Come and enjoy an open mic night.', 'Hugh', 'The Hub', '', 15, 'Link');

-- --------------------------------------------------------

--
-- Table structure for table `sports`
--

CREATE TABLE `sports` (
  `id` int(11) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Dates` date NOT NULL,
  `Description` varchar(120) NOT NULL,
  `Organiser` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Picture` blob NOT NULL,
  `Ranking` int(10) NOT NULL,
  `Interest_Link` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sports`
--

INSERT INTO `sports` (`id`, `Category`, `Name`, `Dates`, `Description`, `Organiser`, `Location`, `Picture`, `Ranking`, `Interest_Link`) VALUES
(1, 'Sport', 'Basketball', '2022-03-01', 'Beginner-Intermediate basketball matches/freeplay. Come and join in!', 'Hannah', 'Sports Center', 0x696d616765732e73706f7274735f696d616765732e31, 4, 'Link'),
(2, 'Sport', 'Badminton', '2022-03-02', 'Beginner-Intermediate badminton matches/freeplay. Come and join in!', 'Taylor', 'Sports Center', 0x696d616765732e73706f7274735f696d616765732e32, 43, 'Link'),
(3, 'Sport', 'Football', '2022-03-01', 'Beginner-Intermediate football matches/freeplay. Come and join in!', 'John', 'Outside Field', 0x696d616765732e73706f7274735f696d616765732e33, 25, 'Link'),
(4, 'Sport', 'Netball', '2022-03-01', 'Beginner-Intermediate netball matches/freeplay. Come and join in!', 'John', 'Sports Center', 0x696d616765732e73706f7274735f696d616765732e34, 65, 'Link'),
(5, 'Sport', 'Rounders', '2022-03-04', 'Beginner-Intermediate rounders matches/freeplay. Come and join in!', 'Taylor', 'Outside Field', 0x696d616765732e73706f7274735f696d616765732e35, 9, 'Link'),
(6, 'Sport', 'Tennis', '2022-03-04', 'Beginner-Intermediate rounders matches/freeplay. Come and join in!', 'Hannah', 'Sports Center', 0x696d616765732e73706f7274735f696d616765732e38, 10, 'Link'),
(7, 'Sport', 'Rugby', '2022-03-06', 'Beginner-Intermediate rugby matches/freeplay. Come and join in!', 'James', 'Sports Center', 0x696d616765732e73706f7274735f696d616765732e36, 15, 'Link'),
(8, 'Sport', 'Rugby', '2022-03-06', 'Beginner-Intermediate rugby matches/freeplay. Come and join in!', 'James', 'Outside Center', 0x696d616765732e73706f7274735f696d616765732e7275676279, 49, 'Link');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `culture`
--
ALTER TABLE `culture`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `other`
--
ALTER TABLE `other`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sports`
--
ALTER TABLE `sports`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `culture`
--
ALTER TABLE `culture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `other`
--
ALTER TABLE `other`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sports`
--
ALTER TABLE `sports`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
