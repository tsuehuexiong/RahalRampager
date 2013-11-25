<%-- 
    Document   : Login
    Created on : Oct 11, 2013, 6:04:09 PM
    Author     : jespringer
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title>Login Page</title>
<link rel="stylesheet" href="esassheet1" type="text/css">
</head>
<body>
<center>
<h1> Welcome to eSAS </h1>
<span> Please enter your login information below. </span>
<form method="post" action="Login_Action.jsp" name="Login">
<span> Username: </span> <input name="username" value=""><br>
<span> Password: </span> <input name="password" type="password" value=""><br> <br>
<input name="Submit" value="Submit" type="submit">
</form>
<% String error = request.getParameter("error");
if (error != null){
    if (error.equals("0")){
        out.println("Incorrect Username/Password \n");
    }
    else if (error.equals("1")){
       out.println("Unknown error, Please try again later");
    }
}
%>
</center>
</body>
</html>