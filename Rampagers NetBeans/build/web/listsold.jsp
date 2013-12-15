<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
  <%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope="session"/>
<jsp:useBean id="item" class="jespringer.RahalRampagers.Item" scope="session"/>

  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>List Items Sold</title>
<%@include file="CustomerMenu.jsp" %>

  

</head><body>

<h1>List Items Sold</h1>

<table style="border: 1px solid black; text-align: center; width: 100%;" border="1">

  <tbody>
    <tr>
      <td>Item ID</td>
      <td>Item Name</td>
      <td>Category</td>
      <td>Auction Start Time</td>
      <td>Auction End Time</td>
      <td>Start Price</td>
      <td>Status</td>
      <td>
      </td>
      <td>
      </td>
      <td>
      </td>
    </tr>
        <%

            ResultSet rs = customer.getItemsSold();       
		 while(rs.next()){ %>
    <tr>
      <td style="vertical-align: top;"> <%=rs.getString("itemID")%></td>
<td style="vertical-align: top;"> <%=rs.getString("iName")%> </td>
<td style="vertical-align: top;"> <%=rs.getString("category")%> </td>
<td style="vertical-align: top;"> <%=rs.getString("auctionStart")%> </td>
<td style="vertical-align: top;"> <%=rs.getString("auctionEnd")%> </td>
<td style="vertical-align: top;"> <%=rs.getString("StartPrice")%> </td>
<%String temp =  rs.getString("status");
if(temp.equals("1")){ %>
<td style="vertical-align: top;"> did not sell </td><br>
<%}%>
<% if(temp.equals("2")){ %>
<td style="vertical-align: top;"> sold </td><br>
<%}%>
<% if(temp.equals("0")){ %>
<td style="vertical-align: top;"> on auction </td><br>
<%}%>


      <td><form method ="post" action = "iteminfo.jsp"><input name="itemID" type="hidden" value ="<%=rs.getString("itemID")%>">
	<input value="Item Info" type="submit">
</form></td>
      <td><form method ="post" action = "bidderlist.jsp"><input name="itemID" type="hidden" value ="<%=rs.getString("itemID")%>">
	<input value="Bidder List" type="submit">
</form></td>
      <td><form method ="post" action = "RateBuyer.jsp"><input name="buyerID" type="hidden" value ="<%=rs.getString("winnerID")%>">
              <input type="hidden" name="itemName" value="<%=rs.getString("iName")%>">
        <input type="submit" value="Rate Buyer">
</form></td>
    </tr>
<%
} 
rs.close(); %>
  </tbody>
</table>

</body></html>
