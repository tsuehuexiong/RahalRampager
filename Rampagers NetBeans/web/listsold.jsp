<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
  <%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="customer" class="pjnowak.RahalRampagers.Customer" scope="session"/>
<jsp:useBean id="item" class="pjnowak.RahalRampagers.Item" scope="session"/>

  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>List Items Sold</title>

  
  
  <link rel="stylesheet" href="esassheet1" type="text/css">

</head><body>
<ul id="menu">

  <li><a href="#">Sign Out</a></li>
  <li><a href="#">My Profile</a>
    <ul>
      <li><a href="#">My Buyer Feedback</a></li>
      <li><a href="#">My Seller Feedback</a></li>
      <li><a href="#">Update Profile</a></li>
    </ul>
  </li>
  <li><a href="#">Feedback Management</a>
    <ul>
      <li><a href="#">Rate As Seller</a></li>
      <li><a href="#">Rate As Buyer</a></li>
    </ul>
  </li>
  <li><a href="#">Sales Management</a>
    <ul>
      <li><a href="#">List Of Items Sold</a></li>
      <li><a href="#">Add Items</a></li>
    </ul>
  </li>
  <li><a href="#">Bidding Management</a>
    <ul>
      <li><a href="#">Search Items</a></li>
      <li><a href="#">Check Status</a></li>
    </ul>
  </li>
  <li><a href="#">eSAS Home</a></li>
</ul>

<br>

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
      <td><br>
      </td>
      <td><br>
      </td>
      <td><br>
      </td>
    </tr>
        <%

            ResultSet rs = customer.getItemsSold();       
		 while(rs.next()){ %>
    <tr>
      <td style="vertical-align: top;"> <%=rs.getString("itemID")%></td><br>
<td style="vertical-align: top;"> <%=rs.getString("iName")%> </td><br>
<td style="vertical-align: top;"> <%=rs.getString("category")%> </td><br>
<td style="vertical-align: top;"> <%=rs.getString("auctionStart")%> </td><br>
<td style="vertical-align: top;"> <%=rs.getString("auctionEnd")%> </td><br>
<td style="vertical-align: top;"> <%=rs.getString("StartPrice")%> </td><br>
<td style="vertical-align: top;"> <%=rs.getString("status")%> </td><br>

            <br>

      <td><form method ="post" action = "iteminfo.jsp"><input name="itemID" type="hidden" value ="<%=rs.getString("itemID")%>">
	<input value="iteminfo" type="submit">
</form></td>
      <td><form method ="post" action = "bidderlist.jsp"><input name="itemID" type="hidden" value ="<%=rs.getString("itemID")%>">
	<input value="bidderList" type="submit">
</form></td>
      <td><a href="">Rate Buyer</a></td>
    </tr>
<%
} 
rs.close(); %>
  </tbody>
</table>

</body></html>
