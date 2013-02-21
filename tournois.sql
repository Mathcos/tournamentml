-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Lun 18 Février 2013 à 10:30
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `tournois`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbitre`
--

CREATE TABLE IF NOT EXISTS `arbitre` (
  `id_arbitre` int(11) NOT NULL AUTO_INCREMENT,
  `nom_arbitre` varchar(255) NOT NULL,
  `id_match` int(11) NOT NULL,
  PRIMARY KEY (`id_arbitre`),
  KEY `id_match` (`id_match`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE IF NOT EXISTS `equipe` (
  `id_equipe` int(11) NOT NULL AUTO_INCREMENT,
  `nom_equipe` varchar(255) NOT NULL,
  `entraineur_equipe` varchar(255) NOT NULL,
  `capitaine_equipe` varchar(255) NOT NULL,
  `nombre_joueur` int(11) NOT NULL,
  `id_match` int(11) NOT NULL,
  PRIMARY KEY (`id_equipe`),
  KEY `id_match` (`id_match`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `joueur`
--

CREATE TABLE IF NOT EXISTS `joueur` (
  `id_joueur` int(11) NOT NULL AUTO_INCREMENT,
  `nom_joueur` varchar(255) CHARACTER SET utf8 NOT NULL,
  `type_joueur` varchar(255) CHARACTER SET utf8 NOT NULL,
  `id_equipe` int(11) NOT NULL,
  PRIMARY KEY (`id_joueur`),
  KEY `id_equipe` (`id_equipe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `match`
--

CREATE TABLE IF NOT EXISTS `match` (
  `id_match` int(11) NOT NULL,
  `type_match` varchar(255) NOT NULL,
  `equipe_a` varchar(255) NOT NULL,
  `equipe_b` varchar(255) NOT NULL,
  `id_tournois` int(11) NOT NULL,
  PRIMARY KEY (`id_match`),
  KEY `id_match` (`id_match`),
  KEY `id_tournois` (`id_tournois`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `terrain`
--

CREATE TABLE IF NOT EXISTS `terrain` (
  `id_terrain` int(11) NOT NULL AUTO_INCREMENT,
  `nom_terrain` varchar(255) NOT NULL,
  `type_terrain` varchar(255) NOT NULL,
  `id_match` int(11) NOT NULL,
  PRIMARY KEY (`id_terrain`),
  KEY `id_match` (`id_match`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `tournois`
--

CREATE TABLE IF NOT EXISTS `tournois` (
  `id_tournois` int(11) NOT NULL AUTO_INCREMENT,
  `nom_tournois` varchar(255) CHARACTER SET utf8 NOT NULL,
  `type_tournois` varchar(255) CHARACTER SET utf8 NOT NULL,
  `nombre_equipe` int(11) NOT NULL,
  PRIMARY KEY (`id_tournois`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `arbitre`
--
ALTER TABLE `arbitre`
  ADD CONSTRAINT `arbitre_ibfk_1` FOREIGN KEY (`id_match`) REFERENCES `match` (`id_match`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD CONSTRAINT `equipe_ibfk_1` FOREIGN KEY (`id_match`) REFERENCES `match` (`id_match`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `joueur`
--
ALTER TABLE `joueur`
  ADD CONSTRAINT `joueur_ibfk_1` FOREIGN KEY (`id_equipe`) REFERENCES `equipe` (`id_equipe`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `match`
--
ALTER TABLE `match`
  ADD CONSTRAINT `match_ibfk_1` FOREIGN KEY (`id_tournois`) REFERENCES `tournois` (`id_tournois`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `terrain`
--
ALTER TABLE `terrain`
  ADD CONSTRAINT `terrain_ibfk_1` FOREIGN KEY (`id_match`) REFERENCES `match` (`id_match`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
