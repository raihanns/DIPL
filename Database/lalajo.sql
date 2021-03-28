-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 23, 2021 at 09:56 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lalajo`
--

-- --------------------------------------------------------

--
-- Table structure for table `bioskop`
--

CREATE TABLE `bioskop` (
  `idBioskop` int(64) NOT NULL,
  `idTeater` varchar(64) NOT NULL,
  `idFilm` varchar(64) NOT NULL,
  `namaBioskop` varchar(64) NOT NULL,
  `jenisBioskop` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `IdFilm` varchar(64) NOT NULL,
  `Deskripsi` varchar(64) NOT NULL,
  `Rating` varchar(64) NOT NULL,
  `Judul` varchar(64) NOT NULL,
  `Kategori` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `harga`
--

CREATE TABLE `harga` (
  `IdHarga` varchar(64) NOT NULL,
  `Nominal` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `IdInvoice` varchar(64) NOT NULL,
  `Total Harga` int(64) NOT NULL,
  `Tanggal Pemesanan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `IdJadwal` varchar(64) NOT NULL,
  `IdFilm` varchar(64) NOT NULL,
  `IdBioskop` varchar(64) NOT NULL,
  `IdTeater` varchar(64) NOT NULL,
  `Jam Tayang` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE `kursi` (
  `idKursi` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `idTeater` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `idBioskop` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `idFilm` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `noKursi` varchar(64) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `IdLaporan` varchar(64) NOT NULL,
  `IdInvoice` varchar(64) NOT NULL,
  `Total Pemasukan` varchar(64) NOT NULL,
  `Total Tiket Terjual` int(64) NOT NULL,
  `Total Pengunjung` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `manajer`
--

CREATE TABLE `manajer` (
  `IdManajer` varchar(64) NOT NULL,
  `Nama` varchar(64) NOT NULL,
  `Umur` int(64) NOT NULL,
  `Alamat` longtext NOT NULL,
  `Email Manajer` varchar(64) NOT NULL,
  `Password Manajer` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `membuat`
--

CREATE TABLE `membuat` (
  `IdManajer` varchar(64) NOT NULL,
  `IdLaporan` varchar(64) NOT NULL,
  `Statistik` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `teater`
--

CREATE TABLE `teater` (
  `idTeater` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `IdFilm` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  `idBioskop` int(64) NOT NULL,
  `noTeater` int(64) NOT NULL,
  `namaTeater` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `IdTiket` varchar(64) NOT NULL,
  `IdTransaksi` varchar(64) NOT NULL,
  `IdInvoice` varchar(64) NOT NULL,
  `KodeBooking` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `IdTransaksi` varchar(64) NOT NULL,
  `IdFilm` varchar(64) NOT NULL,
  `IdTeater` varchar(64) NOT NULL,
  `IdKursi` varchar(64) NOT NULL,
  `IdTiket` varchar(64) NOT NULL,
  `IdHarga` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bioskop`
--
ALTER TABLE `bioskop`
  ADD PRIMARY KEY (`idBioskop`),
  ADD UNIQUE KEY `FK1` (`idTeater`),
  ADD UNIQUE KEY `FK2` (`idFilm`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`IdFilm`);

--
-- Indexes for table `harga`
--
ALTER TABLE `harga`
  ADD PRIMARY KEY (`IdHarga`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`IdInvoice`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`IdJadwal`),
  ADD KEY `FKIdFilm` (`IdFilm`) USING BTREE,
  ADD KEY `FKIdTeater` (`IdTeater`) USING BTREE,
  ADD KEY `FKIdBioskop` (`IdBioskop`) USING BTREE;

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`idKursi`),
  ADD UNIQUE KEY `FK1` (`idTeater`),
  ADD UNIQUE KEY `FK2` (`idBioskop`),
  ADD UNIQUE KEY `FK3` (`idFilm`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`IdLaporan`),
  ADD KEY `FK1Invoice` (`IdInvoice`);

--
-- Indexes for table `manajer`
--
ALTER TABLE `manajer`
  ADD PRIMARY KEY (`IdManajer`);

--
-- Indexes for table `membuat`
--
ALTER TABLE `membuat`
  ADD PRIMARY KEY (`IdManajer`,`IdLaporan`),
  ADD KEY `FK2Laporan` (`IdLaporan`);

--
-- Indexes for table `teater`
--
ALTER TABLE `teater`
  ADD PRIMARY KEY (`idTeater`),
  ADD UNIQUE KEY `FK1` (`IdFilm`),
  ADD UNIQUE KEY `FK2` (`idBioskop`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`IdTiket`),
  ADD UNIQUE KEY `IdTransaksi` (`IdTransaksi`),
  ADD UNIQUE KEY `IdInvoice` (`IdInvoice`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`IdTransaksi`),
  ADD UNIQUE KEY `IdFilm` (`IdFilm`),
  ADD UNIQUE KEY `IdTeater` (`IdTeater`),
  ADD UNIQUE KEY `IdKursi` (`IdKursi`),
  ADD UNIQUE KEY `IdTiket` (`IdTiket`),
  ADD UNIQUE KEY `IdHarga` (`IdHarga`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bioskop`
--
ALTER TABLE `bioskop`
  MODIFY `idBioskop` int(64) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `FKIdFilm` FOREIGN KEY (`IdFilm`) REFERENCES `film` (`IdFilm`);

--
-- Constraints for table `laporan`
--
ALTER TABLE `laporan`
  ADD CONSTRAINT `FK1Invoice` FOREIGN KEY (`IdInvoice`) REFERENCES `invoice` (`IdInvoice`);

--
-- Constraints for table `membuat`
--
ALTER TABLE `membuat`
  ADD CONSTRAINT `FK1Manajer` FOREIGN KEY (`IdManajer`) REFERENCES `manajer` (`IdManajer`),
  ADD CONSTRAINT `FK2Laporan` FOREIGN KEY (`IdLaporan`) REFERENCES `laporan` (`IdLaporan`);

--
-- Constraints for table `teater`
--
ALTER TABLE `teater`
  ADD CONSTRAINT `FKidBioskop` FOREIGN KEY (`idBioskop`) REFERENCES `bioskop` (`idBioskop`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK1` FOREIGN KEY (`IdTiket`) REFERENCES `tiket` (`IdTiket`),
  ADD CONSTRAINT `FK2` FOREIGN KEY (`IdFilm`) REFERENCES `film` (`IdFilm`),
  ADD CONSTRAINT `FK3` FOREIGN KEY (`IdHarga`) REFERENCES `harga` (`IdHarga`),
  ADD CONSTRAINT `FK4` FOREIGN KEY (`IdTeater`) REFERENCES `teater` (`idTeater`),
  ADD CONSTRAINT `Fk5` FOREIGN KEY (`IdKursi`) REFERENCES `kursi` (`idKursi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
