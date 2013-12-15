<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<jsp:useBean id="item" class="jespringer.RahalRampagers.Item" scope="session"/>
  <%@ page language="java" import="java.sql.*"%>
<jsp:setProperty name="item" property="*"/>
<html><head>

  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Item Info</title>
<%@include file="CustomerMenu.jsp" %>

  

</head><body>

          <%
	
            ResultSet r = item.getItemInfo();
       r.next();
		 %>

<center>
<table style="text-align: left; width: 50%;" border="1">
  <tbody>

    <tr>
      <td>Item ID</td>
      <td style="vertical-align: top;"> <%=r.getString("itemID")%></td><br>
      
	
    </tr>
    <tr>
      <td>Item Name</td>
      <td style="vertical-align: top;"> <%=r.getString("iName")%><br>
      </td>
    </tr>
    <tr>
      <td>Category</td>
      <td style="vertical-align: top;"> <%=r.getString("category")%><br>
      </td>
    </tr>
    <tr>
      <td>Start Price</td>
      <td style="vertical-align: top;"> <%=r.getString("startPrice")%><br>
      </td>
    </tr>
    <tr>
      <td>Auction Start</td>
      <td style="vertical-align: top;"> <%=r.getString("auctionStart")%><br>
      </td>
    </tr>
    <tr>
      <td>Auction End</td>
      <td style="vertical-align: top;"> <%=r.getString("auctionEnd")%><br>
      </td>
    </tr>
    <tr>
      <td>Description</td>
      <td style="vertical-align: top;"> <%=r.getString("description")%><br>
      </td>
    </tr>
      <td>photo</td>
      <td style="vertical-align: top;"> <%=r.getString("photo")%><br>
      </td>
    </tr>
      <td>sellerID</td>
      <td style="vertical-align: top;"> <%=r.getString("sellerID")%><br>
      </td>
    </tr>
      <td>status</td>
      <td style="vertical-align: top;"> <%=r.getString("status")%><br>
      </td>
    </tr>
      <td>winnerID</td>
      <% String temp = r.getString("winnerID");
      if(temp.equals("0")){
          %>
          <td style="vertical-align: top;">No winner <br>
      <%} 
      else{ %>
      <td style="vertical-align: top;"> <%=r.getString("winnerID")%><br>
    <% } %>
      </td>
    </tr>
<%
 
r.close(); %>
  </tbody>
</table>
<br>
<a href="listsold.jsp"><button type="button">Back</button></a>
</center>

<br>

<br>

</body></html>
