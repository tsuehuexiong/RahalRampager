drop procedure if exists proc_currentBid;
delimiter &&
create procedure proc_currentBid(item int(11)) 
begin
declare nextMaxBid int(11);

select maxBid into nextMaxBid
from Auction
where itemID = item and maxBid = 
(select max(maxBid)
from Auction
where itemID = item and not maxBid = (select max(maxBid) from Auction where itemID = item));

update Item set currentBid = (nextMaxBid + 1)
where itemID = item;
end
&&
delimiter ;

drop procedure if exists proc_firstCurrentBid;
delimiter &&
create procedure proc_firstCurrentBid(item int(11))
begin
declare sBid int;

select startPrice into sBid
from Item
where itemID = item;

update Item set currentBid = (sBid + 1)
where itemID = item;
end
&&
delimiter ;
