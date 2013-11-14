drop function if exists isAdmin;
delimiter &&
Create function isAdmin(name varchar(15),pass varchar(15) ) Returns int
	Begin
		
		declare answer int;
	set answer =	(Select isAdmin from User where username = name and password = pass);
	
		Return  answer;
	End 
	&&
delimiter ;



