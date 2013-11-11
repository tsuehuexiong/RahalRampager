SET foreign_key_checks=0;
source ~/queries/load-customer.sql;
source ~/queries/load-user.sql;
source ~/queries/load-sellerRating.sql;
source ~/queries/load-buyerRating.sql;
source ~/queries/load-item.sql;
source ~/queries/load-auction.sql;
SET foreign_key_checks=1;
