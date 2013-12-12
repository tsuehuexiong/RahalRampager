<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope="session"/>

<script type="text/javascript">

function showBuyerFeedback() {
b = document.getElementById("buyerFeedback");
if(b.style.display == 'block') b.style.display = 'none';
else if(b.style.display == 'none') b.style.display = 'block';
}

function showSellerFeedback() {
s = document.getElementById("sellerFeedback");
if(s.style.display == 'block') s.style.display = 'none';
else if(s.style.display == 'none') s.style.display = 'block';
}
</script>
<html><head>
  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Feedback</title>

  
  
  <link rel="stylesheet" href="esassheet1" type="text/css">

</head><body>
<%@include file="CustomerMenu.jsp" %>

<br>
<h1>Items Needing Feedback</h1>
<div id="profile">
(<input id="buyer" type="button" value="Buyer" onclick="showBuyerFeedback();"/>/<input id="seller" type="button" value="Seller" onclick="showSellerFeedback();"/>)
<br><br>
<div id="buyerFeedback" style="display:none">
Unrated Buyers of Items Sold
<br>
<table border="1">
  <tbody>
    <tr>
 
<td>Item ID</td>
<td width="200px">
Item name</td>
      <td>Date Sold</td>
      <td> </td>
    </tr>
<% try{
    ResultSet rs = customer.getAllUnratedSoldItems();
    while (rs.next()) {
%>
    <tr><form method="post" action="RateBuyer.jsp">
      <td><input readonly="readonly" name="itemID" value="<%=rs.getString("itemID")%>"></td>
      <td><input readonly="readonly" name="itemName" value="<%=rs.getString("iName")%>"></td>
      <td><%=rs.getString("auctionEnd")%></td>
      <td>
<input name="buyerID" type="hidden" value ="<%=rs.getString("winnerID")%>"><input type="submit" value="Rate Buyer"></form></td>
    </tr>
<% }
rs.close();
}
catch(IllegalStateException ise) {
out.println(ise.getMessage());
}
%>
  </tbody>
</table>
</div>

<br>
<div id="sellerFeedback" style="display:none">
Unrated Sellers of Items Won
<br>
<table border="1">
  <tbody>
    <tr>
      <td>Item ID</td>
<td width="200px">
Item name</td>
      <td>Date Won</td>
	<td> </td>
    </tr>
<% try{
    ResultSet rs = customer.getAllUnratedBoughtItems(); 
    while (rs.next()) {
%>
<form method="post" action="RateSeller.jsp">
    <tr>
      <td><input readonly="readonly" name="itemID" value="<%=rs.getString("itemID")%>"></td>
      <td><input readonly="readonly" name="itemName" value="<%=rs.getString("iName")%>"></td>
      <td><%=rs.getString("auctionEnd")%></td>
      <td>

<input name="sellerID" type="hidden" value ="<%=rs.getString("sellerID")%>"><input type="submit" value="Rate Seller"></form></td>
    </tr>
<% }
rs.close();
} 
catch(IllegalStateException ise) {
out.println(ise.getMessage());
}
%>
  </tbody>
</table>
</div>
<a href="#">back to profile</a>
</div>

</body></html>
