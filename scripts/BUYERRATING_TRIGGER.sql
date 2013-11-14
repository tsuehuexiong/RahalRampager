drop trigger IF EXISTS BUYERRATING_TRIGGER;
delimiter &&
CREATE TRIGGER BUYERRATING_TRIGGER
After INSERT on BuyerRating
	FOR EACH ROW	
		Begin
		declare satis int;
		declare pay int;
		declare buyerRat int;
		
		set satis = (select Avg(satisfaction) From BuyerRating where 
						NEW.buyerID = BuyerRating.buyerID);
					
		set pay = (select Avg(payment) From BuyerRating where 
						NEW.buyerID = BuyerRating.buyerID);
			set buyerRat =(pay + satis) / 2;
			
			UPDATE Customer
			SET buyerRating = buyerRat where New.buyerID = Customer.cID;
					End &&
delimiter ;
