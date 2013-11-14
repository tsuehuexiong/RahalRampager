drop trigger if exists update_current_bid;
delimiter &&
create trigger update_current_bid
after insert on Auction for each row
begin
declare numBids int;
select count(bidTime) into numBids from Auction where itemID = NEW.itemID;
if (numBids == 1) then 
	call proc_firstCurrentBid(NEW.itemID);
else
	call proc_currentBid(NEW.itemID);
end if;
end
&&
delimiter ;
