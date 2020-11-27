-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 27, 2020 at 04:41 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gym_mgmt_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `enquiry`
--

CREATE TABLE IF NOT EXISTS `enquiry` (
`id` int(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `enquiry_for` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enquiry`
--

INSERT INTO `enquiry` (`id`, `fullname`, `address`, `contact`, `enquiry_for`, `email`, `date`) VALUES
(1, 'chathura sanjaya', 'no1', '0718831661', 'nope', 'rrmchathura@gmail.com', '2020-10-06');

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

CREATE TABLE IF NOT EXISTS `fees` (
`id` int(11) NOT NULL,
  `duration` int(11) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fees`
--

INSERT INTO `fees` (`id`, `duration`, `amount`) VALUES
(1, 1, 1000),
(2, 2, 2000),
(3, 3, 3000),
(4, 4, 4200),
(5, 5, 4600),
(6, 6, 6000),
(7, 7, 7000),
(8, 8, 8000),
(9, 9, 9000),
(10, 10, 10000),
(11, 11, 12),
(12, 12, 12),
(13, 13, 1200),
(14, 14, 33),
(15, 15, 45),
(16, 16, 233);

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE IF NOT EXISTS `history` (
`id` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `task` varchar(255) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=193 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `date`, `task`) VALUES
(1, '2020-10-15 11:42:39', 'Logged in by admin'),
(2, '2020-10-15 11:43:48', 'Logged in by admin'),
(3, '2020-10-16 01:02:21', 'Logged in by admin'),
(4, '2020-10-16 01:04:21', 'Logged in by admin'),
(5, '2020-10-16 01:04:43', 'Logged in by admin'),
(6, '2020-10-16 01:06:05', 'Logged in by admin'),
(7, '2020-10-16 01:06:49', 'Logged in by admin'),
(8, '2020-10-16 01:08:13', 'Logged in by admin'),
(9, '2020-10-16 01:09:04', 'Logged in by admin'),
(10, '2020-10-16 01:09:29', 'Logged in by admin'),
(11, '2020-10-16 01:57:13', 'Logged in by admin'),
(12, '2020-10-16 02:24:35', 'Logged in by admin'),
(13, '2020-10-16 02:31:35', 'Logged in by admin'),
(14, '2020-10-16 02:37:16', 'Logged in by admin'),
(15, '2020-10-16 11:21:18', 'Logged in by admin'),
(16, '2020-10-16 11:39:10', 'Logged in by admin'),
(17, '2020-10-16 12:24:36', 'Logged in by admin'),
(18, '2020-10-16 12:28:00', 'Logged in by admin'),
(19, '2020-10-16 12:34:05', 'Logged in by admin'),
(20, '2020-10-16 12:38:50', 'Logged in by admin'),
(21, '2020-10-16 12:40:25', 'Member sdsd is added by '),
(22, '2020-10-16 12:46:13', 'Logged in by admin'),
(23, '2020-10-16 12:51:01', 'Logged in by admin'),
(24, '2020-10-16 01:00:37', 'Logged in by admin'),
(25, '2020-10-16 01:12:00', 'Logged in by admin'),
(26, '2020-10-16 01:17:46', 'Logged in by admin'),
(27, '2020-10-16 01:56:35', 'Logged in by admin'),
(28, '2020-10-16 02:05:13', 'Logged in by admin'),
(29, '2020-10-16 02:20:57', 'Logged in by admin'),
(30, '2020-10-16 02:35:49', 'Logged in by admin'),
(31, '2020-10-16 02:39:22', 'Logged in by admin'),
(32, '2020-10-16 02:41:00', 'Logged in by admin'),
(33, '2020-10-16 02:49:42', 'Logged in by admin'),
(34, '2020-10-16 02:55:57', 'Logged in by admin'),
(35, '2020-10-16 02:56:41', 'Logged in by admin'),
(36, '2020-10-16 04:05:35', 'Logged in by admin'),
(37, '2020-10-16 04:07:23', 'Logged in by admin'),
(38, '2020-10-16 04:19:02', 'Logged in by admin'),
(39, '2020-10-16 04:26:47', 'Logged in by admin'),
(40, '2020-10-16 04:27:35', 'Member fafefaffef is added by '),
(41, '2020-10-16 04:31:29', 'Logged in by admin'),
(42, '2020-10-16 04:35:28', 'Logged in by admin'),
(43, '2020-10-16 04:39:38', 'Logged in by admin'),
(44, '2020-10-16 04:42:15', 'Logged in by admin'),
(45, '2020-10-16 04:45:14', 'Logged in by admin'),
(46, '2020-10-16 04:46:17', 'Logged in by admin'),
(47, '2020-10-16 04:48:11', 'Logged in by admin'),
(48, '2020-10-16 04:57:37', 'Logged in by admin'),
(49, '2020-10-16 04:59:11', 'Member chathurasanjayarathnayaka is added by '),
(50, '2020-10-16 06:23:28', 'Logged in by admin'),
(51, '2020-10-16 06:25:16', 'Logged in by admin'),
(52, '2020-10-16 06:29:51', 'Logged in by admin'),
(53, '2020-10-16 06:31:48', 'Logged in by admin'),
(54, '2020-10-16 06:39:24', 'Logged in by admin'),
(55, '2020-10-16 06:40:43', 'Logged in by admin'),
(56, '2020-10-16 06:44:52', 'Logged in by admin'),
(57, '2020-10-16 07:00:51', 'Logged in by admin'),
(58, '2020-10-16 07:47:22', 'Logged in by admin'),
(59, '2020-10-16 08:13:32', 'Logged in by admin'),
(60, '2020-10-16 09:05:00', 'Logged in by admin'),
(61, '2020-10-16 09:06:20', 'Logged in by admin'),
(62, '2020-10-16 09:11:22', 'Logged in by admin'),
(63, '2020-10-16 09:19:10', 'Logged in by admin'),
(64, '2020-10-17 02:48:28', 'Logged in by admin'),
(65, '2020-10-17 02:51:04', 'Logged in by admin'),
(66, '2020-10-17 03:08:05', 'Logged in by admin'),
(67, '2020-10-17 03:14:13', 'Logged in by admin'),
(68, '2020-10-17 06:56:44', 'Logged in by admin'),
(69, '2020-10-17 08:48:17', 'Logged in by admin'),
(70, '2020-10-21 11:33:13', 'Logged in by admin'),
(71, '2020-10-21 01:46:39', 'Logged in by admin'),
(72, '2020-10-21 01:48:43', 'Logged in by admin'),
(73, '2020-10-21 01:51:02', 'Logged in by admin'),
(74, '2020-10-21 07:16:49', 'Logged in by admin'),
(75, '2020-10-22 01:36:48', 'Logged in by admin'),
(76, '2020-10-22 02:00:10', 'Logged in by admin'),
(77, '2020-10-22 02:02:32', 'Logged in by admin'),
(78, '2020-10-22 02:45:34', 'Logged in by admin'),
(79, '2020-10-22 03:04:01', 'Logged in by admin'),
(80, '2020-10-22 04:09:45', 'Logged in by admin'),
(81, '2020-10-22 04:13:02', 'Logged in by admin'),
(82, '2020-10-22 04:47:44', 'Logged in by admin'),
(83, '2020-10-22 04:56:47', 'Logged in by admin'),
(84, '2020-10-22 06:34:07', 'Logged in by admin'),
(85, '2020-10-22 07:42:13', 'Logged in by admin'),
(86, '2020-10-22 07:42:31', 'Logged in by admin'),
(87, '2020-10-22 08:20:26', 'Logged in by admin'),
(88, '2020-10-22 08:43:15', 'Logged in by admin'),
(89, '2020-10-22 08:47:28', 'Logged in by admin'),
(90, '2020-10-22 08:48:26', 'Logged in by admin'),
(91, '2020-10-22 08:49:01', 'Logged in by admin'),
(92, '2020-10-22 09:20:41', 'Logged in by admin'),
(93, '2020-10-22 09:23:03', 'Logged in by admin'),
(94, '2020-10-22 09:24:18', 'Logged in by admin'),
(95, '2020-10-22 09:26:26', 'Logged in by admin'),
(96, '2020-10-22 09:26:42', 'Logged in by admin'),
(97, '2020-10-22 09:27:20', 'Logged in by admin'),
(98, '2020-10-22 09:49:28', 'Logged in by admin'),
(99, '2020-10-22 10:09:41', 'Logged in by admin'),
(100, '2020-10-23 08:02:52', 'Logged in by admin'),
(101, '2020-10-23 08:03:30', 'Logged in by admin'),
(102, '2020-10-23 08:05:28', 'Logged in by admin'),
(103, '2020-10-23 08:07:18', 'Logged in by admin'),
(104, '2020-10-23 08:11:07', 'Logged in by admin'),
(105, '2020-10-23 08:36:19', 'Logged in by admin'),
(106, '2020-10-23 08:39:11', 'Member gfuuygiu is added by null'),
(107, '2020-10-23 10:05:10', 'Logged in by admin'),
(108, '2020-10-23 11:01:57', 'Logged in by admin'),
(109, '2020-10-23 11:05:08', 'Logged in by admin'),
(110, '2020-10-23 11:12:14', 'Logged in by admin'),
(111, '2020-10-24 03:49:13', 'Logged in by admin'),
(112, '2020-10-24 03:54:54', 'Logged in by '),
(113, '2020-10-24 03:55:13', 'Logged in by '),
(114, '2020-10-24 04:03:27', 'Logged in by admin'),
(115, '2020-10-24 04:06:13', 'Logged in by admin'),
(116, '2020-10-24 03:49:15', 'Logged in by admin'),
(117, '2020-10-24 05:27:41', 'Logged in by admin'),
(118, '2020-10-24 05:48:52', 'Logged in by admin'),
(119, '2020-10-24 08:30:49', 'Logged in by admin'),
(120, '2020-10-24 11:15:10', 'Logged in by admin'),
(121, '2020-10-25 01:17:55', 'Logged in by admin'),
(122, '2020-10-25 02:38:35', 'Logged in by admin'),
(123, '2020-10-25 03:55:13', 'Logged in by admin'),
(124, '2020-10-25 12:48:06', 'Logged in by admin'),
(125, '2020-10-25 01:37:53', 'Logged in by admin'),
(126, '2020-10-25 05:33:58', 'Logged in by admin'),
(127, '2020-10-25 06:08:31', 'Logged in by admin'),
(128, '2020-10-25 06:28:48', 'Logged in by admin'),
(129, '2020-10-25 06:37:12', 'Member ssrathnayaka is added by null'),
(130, '2020-10-26 06:51:49', 'Logged in by admin'),
(131, '2020-10-26 07:35:25', 'Logged in by admin'),
(132, '2020-10-26 08:22:37', 'Logged in by admin'),
(133, '2020-10-26 08:27:41', 'Logged in by admin'),
(134, '2020-10-27 01:23:59', 'Logged in by admin'),
(135, '2020-10-27 09:45:40', 'Logged in by user'),
(136, '2020-10-27 09:52:48', 'Logged in by user'),
(137, '2020-10-27 11:01:34', 'Logged in by user'),
(138, '2020-10-27 11:13:43', 'Logged in by admin'),
(139, '2020-10-27 11:14:08', 'Logged in by user'),
(140, '2020-10-28 12:49:44', 'Logged in by admin'),
(141, '2020-10-28 12:50:26', 'Logged in by admin'),
(142, '2020-10-28 05:59:29', 'Logged in by admin'),
(143, '2020-10-28 06:00:02', 'Logged in by user'),
(144, '2020-10-28 07:17:44', 'Logged in by user'),
(145, '2020-10-28 07:18:30', 'Logged in by admin'),
(146, '2020-11-24 09:30:28', 'Logged in by admin'),
(147, '2020-11-24 10:00:51', 'Logged in by admin'),
(148, '2020-11-24 10:08:53', 'Member supipi is added by null'),
(149, '2020-11-24 10:33:59', 'Logged in by admin'),
(150, '2020-11-24 11:16:56', 'Logged in by admin'),
(151, '2020-11-24 11:22:07', 'Logged in by admin'),
(152, '2020-11-24 11:36:57', 'Logged in by admin'),
(153, '2020-11-24 11:39:49', 'Logged in by admin'),
(154, '2020-11-24 11:40:17', 'Logged in by user'),
(155, '2020-11-24 12:12:23', 'Logged in by admin'),
(156, '2020-11-24 12:19:47', 'Logged in by admin'),
(157, '2020-11-24 12:21:45', 'Logged in by admin'),
(158, '2020-11-24 12:25:19', 'Logged in by admin'),
(159, '2020-11-24 12:38:40', 'Logged in by admin'),
(160, '2020-11-24 12:45:08', 'Logged in by user'),
(161, '2020-11-24 12:50:01', 'Logged in by user'),
(162, '2020-11-24 12:56:56', 'Logged in by sup'),
(163, '2020-11-24 12:57:22', 'Logged in by admin'),
(164, '2020-11-24 01:04:34', 'Logged in by admin'),
(165, '2020-11-24 01:47:11', 'Logged in by admin'),
(166, '2020-11-24 01:50:13', 'Logged in by admin'),
(167, '2020-11-24 05:51:55', 'Logged in by admin'),
(168, '2020-11-24 05:53:13', 'Logged in by admin'),
(169, '2020-11-24 05:57:49', 'Logged in by admin'),
(170, '2020-11-24 06:00:21', 'Member  is added by null'),
(171, '2020-11-24 09:33:30', 'Logged in by admin'),
(172, '2020-11-24 09:37:00', 'Member  is added by null'),
(173, '2020-11-24 09:43:53', 'Logged in by user'),
(174, '2020-11-24 09:50:36', 'Logged in by admin'),
(175, '2020-11-24 09:50:59', 'Logged in by user'),
(176, '2020-11-24 09:52:03', 'Logged in by user'),
(177, '2020-11-24 09:56:22', 'Logged in by admin'),
(178, '2020-11-24 10:03:34', 'Logged in by admin'),
(179, '2020-11-24 10:04:25', 'Logged in by admin'),
(180, '2020-11-24 10:15:09', 'Logged in by admin'),
(181, '2020-11-24 10:16:04', 'Logged in by user'),
(182, '2020-11-24 10:19:19', 'Logged in by user'),
(183, '2020-11-24 10:32:14', 'Logged in by user'),
(184, '2020-11-24 10:33:37', 'Logged in by user'),
(185, '2020-11-24 10:44:40', 'Logged in by user'),
(186, '2020-11-24 10:48:05', 'Logged in by user'),
(187, '2020-11-24 10:49:36', 'Logged in by admin'),
(188, '2020-11-24 10:51:16', 'Logged in by admin'),
(189, '2020-11-24 10:54:46', 'Logged in by user'),
(190, '2020-11-24 11:02:16', 'Logged in by user'),
(191, '2020-11-24 11:03:01', 'Logged in by user'),
(192, '2020-11-24 11:06:17', 'Logged in by admin');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
`id` int(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `full_name`, `security_question`, `answer`) VALUES
(1, 'admin', 'password', '', '', ''),
(2, 'D_admin', 'password', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE IF NOT EXISTS `members` (
`id` int(11) NOT NULL,
  `membership_no` int(11) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `weight` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `reg_date` date NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `fees_mode` varchar(255) NOT NULL,
  `discription` varchar(255) NOT NULL,
  `duration` int(11) NOT NULL,
  `paid_fee` double NOT NULL,
  `contact_no` double NOT NULL,
  `dob` date NOT NULL,
  `occupation` varchar(255) NOT NULL,
  `img` longblob
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`id`, `membership_no`, `full_name`, `gender`, `address`, `country`, `weight`, `status`, `email`, `reg_date`, `start_date`, `end_date`, `fees_mode`, `discription`, `duration`, `paid_fee`, `contact_no`, `dob`, `occupation`, `img`) VALUES
(5, 3004, 'Polo', 'Male', 'Pyuthan', 'Nepal', 45, 'Registered', 'polo@gmail.com', '2018-05-16', '2018-05-24', '2018-05-22', 'Monthly', 'joiing', 3, 65100, 98561204, '2018-05-08', 'Ag', 0x89504e470d0a1a0a0000000d494844520000014300000109080200000081),
(27, 3024, 'sadun pushpika', 'Male', 'etrh', 'Sri Lanka	', 66, 'Registerd', 'nsbm@gmail.com', '2020-11-11', '2020-11-11', '2020-11-05', 'Quartly', 'eraheuhhjahhae5y', 1, 1200, 718853737, '2011-11-17', 'hthtdrhter', 0xffd8ffe000104a46494600010101004800480000ffe20c584943435f50524f46494c4500010100000c484c696e6f021000006d6e74725247422058595a2007ce000200),
(19, 3017, 'sdsd', 'Male', 'sd', 'China', 20, 'Registered', 'sd', '2020-10-08', '2020-10-09', '2020-10-08', 'Monthly', '', 5, 1200, 718831661, '2020-10-03', 'sd', 0xffd8ffe000104a46494600010100000100010000ffdb0043000302020302020303030304030304050805050404050a07),
(20, 3018, 'fafefaffef', 'Male', 'qafwqw#F', 'India', 44, 'Registerd', 'feafeaFFFE', '2020-10-09', '2020-10-02', '2020-10-09', 'Monthly', 'fwqf', 3, 1200, 34556745342, '2020-10-03', 'feAQF', 0xffd8ffe000104a46494600010100000100010000ffdb0043000302020302020303030304030304050805050404050a07),
(21, 3019, 'chathurasanjayarathnayaka', 'Male', 'none', 'Sri Lanka	', 70, 'Registerd', 'rrmchathura@gmail.com', '2020-10-16', '2020-10-09', '2020-10-24', 'Quartly', 'lol', 2, 3500, 718831661, '1998-12-27', 'none', 0xffd8ffe000104a46494600010101012c012c0000ffed034650686f746f73686f7020332e30003842494d03ed000000000010012c000000010001012c0000000100013842494d040400000000030e1c0100000200041c02050074477265656e20626c756520436f6c6f72204772616469656e7420566563746f72204261636b67726f756e642c53696d706c6520666f72),
(22, 3020, 'dd', 'Male', 'feeeff', 'Sri Lanka	', 12, 'Registerd', 'wdwffe', '2020-10-24', '2020-10-28', '2020-10-30', 'Monthly', 'qfwddddedqwfqf', 1, 1200, 3456789, '2020-10-16', 'fef', 0xffd8ffe146cf4578696600004d4d002a00000008000c01000003000000010fa0000001100002000000060000009e0101000300000001),
(24, 3022, 'ssrathnayaka', 'Male', 'ddddd', 'Sri Lanka	', 123, 'Registerd', 'fwfqewffqwef', '2020-10-16', '2020-10-21', '2020-10-08', 'Quartly', 'lolo', 1, 1200, 134564463, '2020-10-07', 'ssssss', 0xffd8ffe100ca4578696600004d4d002a0000000800050100000400000001000009c20101000400000001000009c287690004000000010000004a),
(26, 3023, 'nimal fernando', 'Male', 'gwGWRG', 'Sri Lanka	', 61, 'Registerd', 'ertyuiodfghjk', '2020-11-18', '2020-11-05', '2020-11-05', 'Monthly', '10026822', 1, 1200, 7536373, '2020-11-13', 'gwgwrg', 0xffd8ffe000104a46494600010101004800480000ffe20c584943435f50524f46494c4500010100000c484c696e6f021000006d6e74725247422058595a2007ce000200);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE IF NOT EXISTS `signup` (
`id` int(255) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`id`, `full_name`, `username`, `password`, `security_question`, `answer`, `type`) VALUES
(1, '', 'admin', 'admin', '', '', ''),
(3, 'chathura sanjaya', 'rrmchathura', '123456', 'What is your father name?', 'jayasundara', 'admin'),
(7, '', 'user', 'user', 'What is your father name?', '', 'admin'),
(8, 'supipi ', 'sup', 'sup', 'Who is your Best Actor?', 'dd', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `enquiry`
--
ALTER TABLE `enquiry`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fees`
--
ALTER TABLE `fees`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `membership_no` (`membership_no`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `enquiry`
--
ALTER TABLE `enquiry`
MODIFY `id` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `fees`
--
ALTER TABLE `fees`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=193;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
MODIFY `id` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
