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

<div id="profile">
Feedback for <b><%=customer.getUsername()%></b> (<%=customer.getBuyerRating()%>/<%=customer.getSellerRating()%>)<br>
<br>
(<input id="buyer" type="button" value="Buyer" onclick="showBuyerFeedback();"/>/<input id="seller" type="button" value="Seller" onclick="showSellerFeedback();"/>)
<br><br>
<div id="buyerFeedback" style="display:none">
Buyer Feedback
<br>
<table border="1">
  <tbody>
    <tr>
      <td width="200px"><b>Item name</b></td>
      <td>Overall Satisfaction</td>
      <td>Payment promptness</td>
      <td>Comments</td>
    </tr>
<% try{
    ResultSet rs = customer.getAllBuyerRatings(); 
    while (rs.next()) {
%>
    <tr>
      <td><%=rs.getString("itemName")%></td>
      <td><%=rs.getString("satisfaction")%></td>
      <td><%=rs.getString("payment")%></td>
      <td><%=rs.getString("comment")%></td>
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
Seller Feedback
<br>
<table border="1">
  <tbody>
    <tr>
      <td width="200px"><b>Item name</b></td>
      <td>Overall Satisfaction</td>
      <td>Quality</td>
	<td>Delivery</td>
      <td>Comments</td>
    </tr>
<% try{
    ResultSet rs = customer.getAllSellerRatings(); 
    while (rs.next()) {
%>
    <tr>
      <td ><%=rs.getString("itemName")%></td>
      <td><%=rs.getString("satisfaction")%></td>
      <td><%=rs.getString("quality")%></td>
      <td><%=rs.getString("delivery")%></td>
      <td><%=rs.getString("comment")%></td>
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
