drop function if exists changePassword;
delimiter &&
Create function changePassword(name varchar(15),oldPassword varchar(15),newPassword varchar(15) ) Returns varchar(15)
	Begin
	declare curPassword varchar(15);
	declare answer varchar(15);
	
set curPassword = (select password from User where username = name);
set answer = curPassword;
if (oldPassword =curPassword) then
	set answer = newPassword;
	update User set password = newPassword where username = name;
	End If;
	
	return answer;
	
		End 
	&&
delimiter ;
	
