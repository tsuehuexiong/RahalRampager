-- status function
drop procedure if exists proc_item_status;
DELIMITER &&
create procedure proc_item_status(iID int(11))
BEGIN
declare endTime timestamp;
select auctionEnd into endTime
from Item i where iID = i.itemID;

if(endTime <= NOW()) and 
exists(select * from Auction a where itemID = a.itemID)
then 
	update Item set status = 2
	where itemID = iID;
elseif(endTime <= NOW())
then
	update Item set status = 1
	where itemID = iID;
end if;
END
&&
DELIMITER ;





drop event if exists event_item_status;
delimiter &&
create event event_item_status;
On Schedule every 30 minute
	do 
		update Item set status = 2
		where auctionEnd <= NOW() and itemID in (select itemID from Auction);
		
		update Item set status = 1
		where auctionEnd <=NOW() and itemID not in (select itemID from Auction a);
	&&
delimiter ;
