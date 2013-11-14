drop trigger IF EXISTS SELLERRATING_TRIGGER;
delimiter &&
CREATE TRIGGER SELLERRATING_TRIGGER
After INSERT on SellerRating
	FOR EACH ROW	
		Begin
		declare satis int;
		declare qual int;
		declare del int;
		declare sellerRat int;
		
		set satis = (select Avg(satisfaction) From SellerRating where 
						NEW.sellerID = SellerRating.sellerID);
					
		set qual = (select Avg(quality) From SellerRating where 
						NEW.sellerID = SellerRating.sellerID);
						
		set del = (select Avg(delivery) From SellerRating where 
						NEW.sellerID = SellerRating.sellerID);
			set sellerRat =(qual + satis+del) / 3;
			
			UPDATE Customer
			SET sellerRating = sellerRat where New.sellerID = Customer.cID;
					End &&
delimiter ;
