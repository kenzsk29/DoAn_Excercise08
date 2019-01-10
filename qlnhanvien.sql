-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2019 at 03:50 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlnhanvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE `dantoc` (
  `madantoc` int(11) NOT NULL,
  `dantoc` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`madantoc`, `dantoc`) VALUES
(1, 'Kinh'),
(2, 'Hoa'),
(3, 'Chăm');

-- --------------------------------------------------------

--
-- Table structure for table `dcsvn`
--

CREATE TABLE `dcsvn` (
  `madcsvn` int(11) NOT NULL,
  `ngaygianhap` int(25) NOT NULL,
  `chucvu` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `noisinhhoat` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `dcsvn`
--

INSERT INTO `dcsvn` (`madcsvn`, `ngaygianhap`, `chucvu`, `noisinhhoat`) VALUES
(1, 25, 'Đảng viên', 'hcm');

-- --------------------------------------------------------

--
-- Table structure for table `doanthanhnien`
--

CREATE TABLE `doanthanhnien` (
  `madoanthanh` int(11) NOT NULL,
  `ngaygianhap` int(25) NOT NULL,
  `chucvu` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `noisinhhoat` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `doanthanhnien`
--

INSERT INTO `doanthanhnien` (`madoanthanh`, `ngaygianhap`, `chucvu`, `noisinhhoat`) VALUES
(1, 25, 'Đoàn viên', 'HCM');

-- --------------------------------------------------------

--
-- Table structure for table `hocvan`
--

CREATE TABLE `hocvan` (
  `mahocvan` int(11) NOT NULL,
  `hocvan` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `hocvan`
--

INSERT INTO `hocvan` (`mahocvan`, `hocvan`) VALUES
(1, 'Đại Học'),
(2, 'Phổ Thông'),
(3, 'Cao Đẳng'),
(4, 'Nghề');

-- --------------------------------------------------------

--
-- Table structure for table `hokhau`
--

CREATE TABLE `hokhau` (
  `mahokhau` int(11) NOT NULL,
  `hokhau` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `hokhau`
--

INSERT INTO `hokhau` (`mahokhau`, `hokhau`) VALUES
(1, 'TP.Hồ Chí Mình'),
(2, 'Hà Nội'),
(3, 'Đà Nẵng');

-- --------------------------------------------------------

--
-- Table structure for table `honnhan`
--

CREATE TABLE `honnhan` (
  `mahonnhan` int(11) NOT NULL,
  `honnhan` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `honnhan`
--

INSERT INTO `honnhan` (`mahonnhan`, `honnhan`) VALUES
(1, 'Vợ'),
(2, 'Chồng'),
(3, 'Độc Thân');

-- --------------------------------------------------------

--
-- Table structure for table `nguyenquan`
--

CREATE TABLE `nguyenquan` (
  `manguyenquan` int(11) NOT NULL,
  `nguyenquan` varchar(55) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `nguyenquan`
--

INSERT INTO `nguyenquan` (`manguyenquan`, `nguyenquan`) VALUES
(1, 'TP.Hồ Chí Minh'),
(2, 'Hà Nội'),
(3, 'Đà Nẵng');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manhanvien` int(55) NOT NULL,
  `sotaikhoan` int(55) NOT NULL,
  `msthue` int(55) NOT NULL,
  `dienthoai` int(55) NOT NULL,
  `cmnd` int(55) NOT NULL,
  `ngaycap` date NOT NULL,
  `thuongtru` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  `anh` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `ghichu` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `hoten` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `ten` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `gioitinh` tinyint(1) NOT NULL DEFAULT '0',
  `ngaysinh` date NOT NULL,
  `tamtru` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  `didong` int(20) NOT NULL,
  `email` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `madantoc` int(11) NOT NULL,
  `madcsvn` int(11) NOT NULL,
  `madoanthanh` int(11) NOT NULL,
  `mahocvan` int(11) NOT NULL,
  `mahokhau` int(11) NOT NULL,
  `mahonnhan` int(11) NOT NULL,
  `manguyenquan` int(11) NOT NULL,
  `manoicap` int(11) NOT NULL,
  `manoisinh` int(11) NOT NULL,
  `maquan` int(11) NOT NULL,
  `maquandoi` int(11) NOT NULL,
  `maquoctich` int(11) NOT NULL,
  `mataikhoan` int(11) NOT NULL,
  `mavanhoa` int(11) NOT NULL,
  `matongiao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`manhanvien`, `sotaikhoan`, `msthue`, `dienthoai`, `cmnd`, `ngaycap`, `thuongtru`, `anh`, `ghichu`, `hoten`, `ten`, `gioitinh`, `ngaysinh`, `tamtru`, `didong`, `email`, `madantoc`, `madcsvn`, `madoanthanh`, `mahocvan`, `mahokhau`, `mahonnhan`, `manguyenquan`, `manoicap`, `manoisinh`, `maquan`, `maquandoi`, `maquoctich`, `mataikhoan`, `mavanhoa`, `matongiao`) VALUES
(1511060521, 123456789, 987654321, 1265095524, 321654987, '2019-01-01', 'Bình Chánh', '', NULL, 'Andy', 'Kenz', 0, '2019-01-01', 'Quận 8', 765095524, 'kenz29@live.com', 1, 1, 1, 1, 1, 3, 1, 1, 1, 13, 1, 1, 1, 1, 1),
(1511060571, 99999999, 88888888, 765095534, 112334567, '2012-06-06', 'HCM', '', NULL, 'Sỹ', 'Hòn', 0, '1997-11-11', 'HCM', 765095527, 'honemail@gmail.com', 1, 1, 1, 1, 1, 3, 1, 1, 1, 13, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `noicap`
--

CREATE TABLE `noicap` (
  `manoicap` int(11) NOT NULL,
  `noicap` varchar(55) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `noicap`
--

INSERT INTO `noicap` (`manoicap`, `noicap`) VALUES
(1, 'TP.Hồ Chí Minh'),
(2, 'Hà Nội'),
(3, 'Đà Nẵng');

-- --------------------------------------------------------

--
-- Table structure for table `noisinh`
--

CREATE TABLE `noisinh` (
  `manoisinh` int(11) NOT NULL,
  `noisinh` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `noisinh`
--

INSERT INTO `noisinh` (`manoisinh`, `noisinh`) VALUES
(1, 'TP.Hồ Chí Minh'),
(2, 'Hà Nội'),
(3, 'Đà Nẵng');

-- --------------------------------------------------------

--
-- Table structure for table `quan`
--

CREATE TABLE `quan` (
  `maquan` int(11) NOT NULL,
  `quan` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `quan`
--

INSERT INTO `quan` (`maquan`, `quan`) VALUES
(1, 'Quận 01'),
(2, 'Quận 02'),
(3, 'Quận 03'),
(4, 'Quận 4'),
(5, 'Quận 05'),
(6, 'Quận 06'),
(7, 'Quận 07'),
(8, 'Quận 08'),
(9, 'Quận 09'),
(10, 'Quận 10'),
(11, 'Quận 11'),
(12, 'Quận 12'),
(13, 'Bình Chánh'),
(14, 'Bình Thạnh'),
(15, 'Tân Bình'),
(16, 'Bình Tân');

-- --------------------------------------------------------

--
-- Table structure for table `quandoi`
--

CREATE TABLE `quandoi` (
  `maquandoi` int(11) NOT NULL,
  `ngaynhapngu` int(25) NOT NULL,
  `ngayxuatngu` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL,
  `noisinhhoat` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `quandoi`
--

INSERT INTO `quandoi` (`maquandoi`, `ngaynhapngu`, `ngayxuatngu`, `noisinhhoat`) VALUES
(1, 25, '26/10/1997', 'hcm');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE `quoctich` (
  `maquoctich` int(11) NOT NULL,
  `quoctich` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `quoctich`
--

INSERT INTO `quoctich` (`maquoctich`, `quoctich`) VALUES
(1, 'Việt Nam'),
(2, 'Norway'),
(3, 'Hoa Kỳ'),
(4, 'Nhật Bản'),
(5, 'Trung Quốc');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `mataikhoan` int(55) NOT NULL,
  `taikhoan` varchar(55) COLLATE utf8_vietnamese_ci NOT NULL,
  `maukhau` varchar(55) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`mataikhoan`, `taikhoan`, `maukhau`) VALUES
(1, 'test#1', '123');

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE `tongiao` (
  `matongiao` int(11) NOT NULL,
  `tongiao` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`matongiao`, `tongiao`) VALUES
(1, 'Phật Giáo'),
(2, 'Thiên Chúa');

-- --------------------------------------------------------

--
-- Table structure for table `vanhoa`
--

CREATE TABLE `vanhoa` (
  `mavanhoa` int(11) NOT NULL,
  `vanhoa` varchar(25) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `vanhoa`
--

INSERT INTO `vanhoa` (`mavanhoa`, `vanhoa`) VALUES
(1, '12/12'),
(2, '11/12'),
(3, '10/12'),
(4, '09/12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`madantoc`);

--
-- Indexes for table `dcsvn`
--
ALTER TABLE `dcsvn`
  ADD PRIMARY KEY (`madcsvn`);

--
-- Indexes for table `doanthanhnien`
--
ALTER TABLE `doanthanhnien`
  ADD PRIMARY KEY (`madoanthanh`);

--
-- Indexes for table `hocvan`
--
ALTER TABLE `hocvan`
  ADD PRIMARY KEY (`mahocvan`);

--
-- Indexes for table `hokhau`
--
ALTER TABLE `hokhau`
  ADD PRIMARY KEY (`mahokhau`);

--
-- Indexes for table `honnhan`
--
ALTER TABLE `honnhan`
  ADD PRIMARY KEY (`mahonnhan`);

--
-- Indexes for table `nguyenquan`
--
ALTER TABLE `nguyenquan`
  ADD PRIMARY KEY (`manguyenquan`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manhanvien`),
  ADD KEY `matongiao` (`matongiao`),
  ADD KEY `nhanvien_dantoc` (`madantoc`),
  ADD KEY `nhanvien_dcsvn` (`madcsvn`),
  ADD KEY `nhanvien_doanthanh` (`madoanthanh`),
  ADD KEY `nhanvien_hocvan` (`mahocvan`),
  ADD KEY `nhanvien_honnhan` (`mahonnhan`),
  ADD KEY `nhanvien_nguyenquan` (`manguyenquan`),
  ADD KEY `nhanvien_noisinh` (`manoisinh`),
  ADD KEY `nhanvien_noicap` (`manoicap`),
  ADD KEY `nhanvien_quan` (`maquan`),
  ADD KEY `nhanvien_vanhoa` (`mavanhoa`),
  ADD KEY `nhanvien_quandoi` (`maquandoi`),
  ADD KEY `nhanvien_quoctich` (`maquoctich`),
  ADD KEY `nhanvien_taikhoan` (`mataikhoan`),
  ADD KEY `nhanvien_hokhau` (`mahokhau`);

--
-- Indexes for table `noicap`
--
ALTER TABLE `noicap`
  ADD PRIMARY KEY (`manoicap`);

--
-- Indexes for table `noisinh`
--
ALTER TABLE `noisinh`
  ADD PRIMARY KEY (`manoisinh`);

--
-- Indexes for table `quan`
--
ALTER TABLE `quan`
  ADD PRIMARY KEY (`maquan`);

--
-- Indexes for table `quandoi`
--
ALTER TABLE `quandoi`
  ADD PRIMARY KEY (`maquandoi`);

--
-- Indexes for table `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`maquoctich`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`mataikhoan`);

--
-- Indexes for table `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`matongiao`);

--
-- Indexes for table `vanhoa`
--
ALTER TABLE `vanhoa`
  ADD PRIMARY KEY (`mavanhoa`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_dantoc` FOREIGN KEY (`madantoc`) REFERENCES `dantoc` (`madantoc`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_dcsvn` FOREIGN KEY (`madcsvn`) REFERENCES `dcsvn` (`madcsvn`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_doanthanh` FOREIGN KEY (`madoanthanh`) REFERENCES `doanthanhnien` (`madoanthanh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_hocvan` FOREIGN KEY (`mahocvan`) REFERENCES `hocvan` (`mahocvan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_hokhau` FOREIGN KEY (`mahokhau`) REFERENCES `hokhau` (`mahokhau`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_honnhan` FOREIGN KEY (`mahonnhan`) REFERENCES `honnhan` (`mahonnhan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_nguyenquan` FOREIGN KEY (`manguyenquan`) REFERENCES `nguyenquan` (`manguyenquan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_noicap` FOREIGN KEY (`manoicap`) REFERENCES `noicap` (`manoicap`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_noisinh` FOREIGN KEY (`manoisinh`) REFERENCES `noisinh` (`manoisinh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_quan` FOREIGN KEY (`maquan`) REFERENCES `quan` (`maquan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_quandoi` FOREIGN KEY (`maquandoi`) REFERENCES `quandoi` (`maquandoi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_quoctich` FOREIGN KEY (`maquoctich`) REFERENCES `quoctich` (`maquoctich`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_taikhoan` FOREIGN KEY (`mataikhoan`) REFERENCES `taikhoan` (`mataikhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_tongiao` FOREIGN KEY (`matongiao`) REFERENCES `tongiao` (`matongiao`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_vanhoa` FOREIGN KEY (`mavanhoa`) REFERENCES `vanhoa` (`mavanhoa`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
