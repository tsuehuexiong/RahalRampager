DROP SCHEMA IF EXISTS RahalRampagers;
-- Create the database
CREATE SCHEMA IF NOT EXISTS RahalRampagers; 

use RahalRampagers;

-- Auction
CREATE TABLE `Auction` (
  `itemID` int(11) NOT NULL,
  `bidderID` int(11) DEFAULT NULL,
  `maxBid` int(11) DEFAULT NULL,
  `bidTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`itemID`,`bidderID`,`bidTime`)
)ENGINE=InnoDB;

-- BuyerRating
CREATE TABLE `BuyerRating` (
  `itemID` int(11) NOT NULL,
  `sellerID` int(11) NOT NULL,
  `buyerID` int(11) NOT NULL,
  `itemName` varchar(50) NOT NULL DEFAULT '',
  `satisfaction` int(11) NOT NULL DEFAULT '0',
  `payment` int(11) NOT NULL DEFAULT '0',
  `comment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`itemID`)
)ENGINE=InnoDB;

-- SellerRating
CREATE TABLE `SellerRating` (
  `itemID` int(11) NOT NULL,
  `sellerID` int(11) DEFAULT NULL
  `buyerID` int(11) DEFAULT NULL,
  `itemName` varchar(50) NOT NULL DEFAULT '',
  `satisfaction` int(11) NOT NULL DEFAULT '0',
  `quality` int(11) NOT NULL DEFAULT '0',
  `delivery` int(11) NOT NULL DEFAULT '0',
  `comment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`itemID`)
)ENGINE=InnoDB;
-- Customer
CREATE TABLE `Customer` (
  `cID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `fName` varchar(10) DEFAULT NULL,
  `lName` varchar(20) DEFAULT NULL,
  `ccNumber` varchar(16) DEFAULT NULL,
  `ccType` varchar(10) DEFAULT NULL,
  `ccExp` varchar(10) DEFAULT NULL,
  `phone` char(10) DEFAULT NULL,
  `email` varchar(25) NOT NULL DEFAULT '',
  `sellerRating` int(11) DEFAULT NULL,
  `buyerRating` int(11) DEFAULT NULL,
  PRIMARY KEY (`cID`)
)ENGINE=InnoDB;

-- User
CREATE TABLE `User` (
  `username` varchar(15) NOT NULL UNIQUE,
  `password` varchar(15) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`username`)
)ENGINE=InnoDB;

-- Item
CREATE TABLE `Item` (
  `itemID` int(11) NOT NULL AUTO_INCREMENT,
  `iName` varchar(50) NOT NULL DEFAULT '',
  `category` varchar(15) NOT NULL DEFAULT 'none',
  `auctionStart` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `auctionEnd` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `startPrice` int(11) DEFAULT NULL,
  `description` varchar(100) NOT NULL DEFAULT '',
  `photo` varchar(50) NOT NULL DEFAULT '0',
  `sellerID` int(11) NOT NULL,
  `currentBid` int(11),
-- current bid has to be something!!!!!!!!!!
  `status` tinyint(2) default '0',
-- 0 is open auction, 1 is over but not sold, 2 is sold
  PRIMARY KEY (`itemID`)
)ENGINE=InnoDB;

Alter Table Auction Add Constraint fk_Auction_bidderID foreign key (bidderID) references Customer(cID) on update cascade;
Alter Table Auction Add Constraint fk_Auction_itemID foreign key (itemID) references Item(itemID) on update cascade;
Alter Table BuyerRating Add Constraint fk_BuyerRating_sellerID foreign key (sellerID) references Customer(cID) on update cascade;
Alter Table BuyerRating Add Constraint fk_BuyerRating_buyerID foreign key (buyerID) references Customer(cID) on update cascade;
Alter Table BuyerRating Add Constraint fk_BuyerRating_itemID foreign key (itemID) references Item(itemID) on update cascade;
Alter Table SellerRating Add Constraint fk_SellerRating_sellerID foreign key (sellerID) references Customer(cID) on update cascade;
Alter Table SellerRating Add Constraint fk_SellerRating_buyerID foreign key (buyerID) references Customer(cID) on update cascade;
Alter Table Customer Add Constraint fk_Customer_username foreign key (username) references User(username) on update cascade;
Alter Table Item Add Constraint fk_Item_sellerID foreign key (sellerID) references Customer(cID) on update cascade;


