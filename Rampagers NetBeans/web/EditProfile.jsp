<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html><head>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="kakutzke.RahalRampagers.User" scope="session"/>
<jsp:useBean id="customer" class="kakutzke.RahalRampagers.Customer" scope ="session"/>

<link rel="stylesheet" href="esassheet1" type="text/css">
<title>Edit Profile</title>
<%@include file="CustomerMenu.jsp" %>

<h1>Edit Profile</h1>

<%
String s = request.getParameter("s");
if(s!=null) {
if(s.equals("1")) out.println("<font color=\"green\">Update Successful</font><br><br>");
else if(s.equals("0")) out.println("<font color=\"red\">Update failed. Check to see that your password is correct and that your new passwords match.</font><br><br>");
}
%>
<form method="post" action="EditProfile_action.jsp">
<table>
<tr>
<td>Username</td><td><input readonly="readonly" name="username" value="<%=customer.getUsername()%>"></td></tr><tr>
<td>First Name</td><td><input type="text" name="fName" value="<%=customer.getfName()%>"></td></tr><tr>
<td>Last Name</td><td><input type="text" name="lName" value="<%=customer.getlName()%>"></td></tr><tr>
<td>email</td><td><input type="text" name="email" value="<%=customer.getEmail()%>"></td></tr><tr>
<td>Phone</td><td><input type="text" name="phone" value="<%=customer.getPhone()%>"></td></tr><tr>
<td>Credit Card Number</td><td><input type="text" name="ccNumber" value="<%=customer.getCcNumber()%>"></td></tr><tr>
<td>Credit Card Expiration</td><td><input type="date" name="ccExp" value="<%=customer.getCcExp()%>"></td></tr><tr>
<td>Credit Card Type</td><td><select name="ccType" id="ccNumber">
<option value="1">Visa</option>
<option value="2">MasterCard</option>
<option value="3">Discover</option>
</select></td></tr><tr>
<td>Buyer Rating</td><td align="right"><%=customer.getBuyerRating()%></td></tr><tr>
<td>Seller Rating</td><td align="right"><%=customer.getSellerRating()%></td></tr><tr>
<td>Old Password</td><td><input name="password" type="password" value=""></td></tr><tr>
<td>New Password</td><td><input name="newpassword" type="password" value=""></td></tr><tr>
<td>Retype New Password</td><td><input name="newpassword2" type="password" value=""></td></tr><tr>
</tr></table>
<br>
<input type="submit" value="Submit"></form><a href="CustomerManagement.jsp"><button>Back</button></a>
