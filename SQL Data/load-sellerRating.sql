LOAD DATA LOCAL INFILE "~/queries/seller-rating.dat"
INTO TABLE SellerRating
FIELDS ENCLOSED BY "\"" TERMINATED BY ","
;
