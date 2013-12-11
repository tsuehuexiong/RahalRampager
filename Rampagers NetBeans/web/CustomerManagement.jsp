<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="kakutzke.RahalRampagers.User" scope="session"/>
<jsp:useBean id="customer" class="kakutzke.RahalRampagers.Customer" scope="session"/>
<jsp:setProperty name="customer" property="username"/>

<%
try{
	ResultSet rs = customer.getCustomerInfo();
	while(rs.next()) {
		customer.setcID(rs.getInt("cID"));
		customer.setfName(rs.getString("fName"));
		customer.setlName(rs.getString("lName"));
		customer.setCcNumber(rs.getString("ccNumber"));
		customer.setCcType(rs.getString("ccType"));
		customer.setCcExp(rs.getString("ccExp"));
		customer.setPhone(rs.getString("phone"));
		customer.setEmail(rs.getString("email"));
		customer.setBuyerRating(rs.getInt("sellerRating"));
		customer.setSellerRating(rs.getInt("buyerRating"));
	} 
rs.close();
} 
catch(IllegalStateException ise) {
out.println(ise.getMessage());
}
%>

<html><head>
<link rel="stylesheet" href="esassheet1" type="text/css"> 
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Customer Management</title>


  
</head><body style="height: 396px;">

<%@include file="CustomerMenu.jsp" %>

<h1>Customer Management</h1>
<br>

<div id="profile">
<center><button type="button" align="center">View Profile</button>
<button type="button" align="center">Selling Management</button>
<button type="button" align="center">Bidding Management</button>
<a href="Feedback.jsp"><button type="button" align="center" >View Feedback</button></a>
</center>
</div>

<br>

<br>

</body></html>
