<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<jsp:useBean id="item" class="jespringer.RahalRampagers.Item" scope="session"/>
<jsp:useBean id="auction" class="jespringer.RahalRampagers.Auction" scope="session"/>
<jsp:useBean id="customer2" class="jespringer.RahalRampagers.Customer" scope="session"/>
  <%@ page language="java" import="java.sql.*"%>
<jsp:setProperty name="item" property="*"/>
<html><head>
  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Bidder List</title>
<%@include file="CustomerMenu.jsp" %>
<%auction.setItemID(item.getItemID());
ResultSet rs = item.getItemInfo();
rs.next();
 %>
  
  

</head><body>


<h1>Bidder List</h1>

<br>

<center>
<table style="text-align: center; width: 50%;" border="1">
  <tbody>
    <tr>
      <td>Item Name</td>
      <td>Item ID</td>
    </tr>
<tr>
     <td><%=rs.getString("iName")%></td>
      <td><%=rs.getString("itemID")%></td>
</tr>
  </tbody>
</table>
<br>
<br>
<table style="text-align: center; width: 50%;" border="1">
  <tbody>
    <tr>
      <td>Auction Start Date</td>
      <td>Auction End Date</td>
    </tr>
<tr><td><%=rs.getString("auctionStart")%>  </td> 
	<td><%=rs.getString("auctionEnd")%>  </td> 
</tr>
  </tbody>

</table>
<%%>
<br>
<br>
<%
ResultSet rs2 = auction.getBidders();

 %>
<table style="text-align: center; width: 75%;" border="1">
  <tbody>
    <tr>
      <td>Bidding Time</td>
      <td>Username</td>
      <td>Buyer Rating</td>
      <td>Max Bid</td>
    </tr>
<%while(rs2.next()){ %>
    <tr>
      <td>
        <%=rs2.getString("bidTime")%>
      </td>
      <td><%=rs2.getString("username")%><br>
      </td>
      <td><%=rs2.getString("buyerRating")%><br>
      </td>
      <td><%=rs2.getString("maxBid")%><br>
      </td>
    </tr>
<%}%>
  </tbody>
</table>
<br>
<br>
Current Bid/ Winner (changes depending on if the auction is completed)
<%
try{
customer2.setcID(item.getTopBidder()); 
ResultSet rs3 = customer2.getCustomerInfo2();
rs3.next();
%>
<table style="text-align: center; width: 50%;" border="1">
  <tbody>
    <tr>
      <td>Username</td>
      <td>Rating</td>
      <td>Winning Bid</td>
    </tr>
<tr>
<td><%=rs3.getString("username") %> </td>
<td><%=rs3.getString("buyerRating")%> </td>
<td><%=rs.getString("currentBid")%> </td>
</tr>
<%
rs.close();
rs2.close();
rs3.close();}

catch(Exception e){} %>
  </tbody>
</table>
<br>
<a href="listsold.jsp"><button type="button">Back</button></a>
</center>

<br>

<br>

</body></html>
