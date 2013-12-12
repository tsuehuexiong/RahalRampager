<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html><head>
<%@ page language="java" import="java.sql.*"%>

<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope ="session"/>

<link rel="stylesheet" href="esassheet1" type="text/css">
<title>User Profile</title>
<%@include file="CustomerMenu.jsp" %>
<h1>Profile for <%=customer.getUsername()%></h1>
<div id="profile">

<table>
<tr><td>
Buyer Rating</td><td><%=customer.getBuyerRating()%></td></tr>
<tr><td>Seller Rating</td><td><%=customer.getSellerRating()%></td></tr>
</table>
<br><br>
<b>Items For Sale</b>
<br><br>
Get the items for sale and put them in a table!
</div>
