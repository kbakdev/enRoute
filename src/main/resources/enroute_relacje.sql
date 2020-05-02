-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 01 Maj 2020, 17:03
-- Wersja serwera: 10.4.11-MariaDB
-- Wersja PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `enroute`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `deliver`
--

CREATE TABLE `deliver` (
  `deliver_id` int(11) NOT NULL,
  `deliver_name` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `deliver`
--

INSERT INTO `deliver` (`deliver_id`, `deliver_name`) VALUES
(1, 'Przesłano dalej'),
(2, 'Oczekiwanie'),
(3, 'Poczta'),
(4, 'DPD'),
(5, 'TNT'),
(6, 'UPS'),
(7, 'InPost'),
(8, 'DHL'),
(9, 'FeedEx'),
(10, 'GLS');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `destination`
--

CREATE TABLE `destination` (
  `destination_id` int(11) NOT NULL,
  `destination_city` char(50) NOT NULL,
  `destination_name` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `destination`
--

INSERT INTO `destination` (`destination_id`, `destination_city`, `destination_name`) VALUES
(1, 'Oczekiwanie', 'Oczekiwanie'),
(2, 'Kielce', 'Parcel locker'),
(3, 'Poznań', 'Parcel locker'),
(4, 'Warszawa', 'House'),
(5, 'Wodzisław', 'Parcel locker'),
(6, 'Katowice', 'House'),
(7, 'Łódz', 'House'),
(8, 'Gniezno', 'Gniezno'),
(9, 'Mielno', 'Mielno'),
(10, 'Jastrzębie Zdrój', 'Jastrzębie Zdrój');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `menu`
--

CREATE TABLE `menu` (
  `parcel_id` int(11) NOT NULL,
  `storeHouse_id` int(50) NOT NULL,
  `deliver_id` int(50) NOT NULL,
  `destination_id` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `menu`
--

INSERT INTO `menu` (`parcel_id`, `storeHouse_id`, `deliver_id`, `destination_id`) VALUES
(1, 5, 2, 1),
(2, 1, 1, 6),
(3, 1, 8, 1),
(4, 6, 2, 1),
(5, 1, 6, 1),
(6, 1, 7, 1),
(7, 3, 2, 1),
(8, 1, 1, 2),
(9, 1, 1, 8),
(10, 2, 2, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `storehause`
--

CREATE TABLE `storehause` (
  `storeHause_id` int(11) NOT NULL,
  `storeHause_city` char(50) NOT NULL,
  `storeHause_name` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `storehause`
--

INSERT INTO `storehause` (`storeHause_id`, `storeHause_city`, `storeHause_name`) VALUES
(1, 'Przesłano dalej', 'Przesłano dalej'),
(2, 'Poznań', 'Morele'),
(3, 'Kielce', 'Media Expert'),
(4, 'Wrocław', 'X-com'),
(5, 'Wodzisław', 'Avans'),
(6, 'Olkusz', 'AGD RTV'),
(7, 'Zakopane', 'Neonet'),
(8, 'Rybnik', 'Komputornik'),
(9, 'Kalisz', 'Mycenter'),
(10, 'Bydgoszcz', 'Sfera');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `deliver`
--
ALTER TABLE `deliver`
  ADD PRIMARY KEY (`deliver_id`);

--
-- Indeksy dla tabeli `destination`
--
ALTER TABLE `destination`
  ADD PRIMARY KEY (`destination_id`);

--
-- Indeksy dla tabeli `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`parcel_id`),
  ADD KEY `storeHouse_id` (`storeHouse_id`),
  ADD KEY `deliver_id` (`deliver_id`),
  ADD KEY `destination_id` (`destination_id`);

--
-- Indeksy dla tabeli `storehause`
--
ALTER TABLE `storehause`
  ADD PRIMARY KEY (`storeHause_id`);

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`storeHouse_id`) REFERENCES `storehause` (`storeHause_id`),
  ADD CONSTRAINT `menu_ibfk_2` FOREIGN KEY (`deliver_id`) REFERENCES `deliver` (`deliver_id`),
  ADD CONSTRAINT `menu_ibfk_3` FOREIGN KEY (`destination_id`) REFERENCES `destination` (`destination_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
