<%-- 
    Document   : SalesSummaryReport
    Created on : Dec 2, 2013, 2:18:05 PM
    Author     : jespringer
--%>
<%@include file="AdminMenu.jsp" %>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales Summary</title>
    </head>
    <body>

<h1 align="center">Sales Summary Report</h1>
<br>

<table style="text-align: left; width: 100%;" border="1" cellpadding="2" cellspacing="2">

  <tbody>
    <tr>
      <td style="vertical-align: top;">Category<br>
      </td>
      <td style="vertical-align: top;">Item ID<br>
      </td>
      <td style="vertical-align: top;">Item Name<br>
      </td>
      <td style="vertical-align: top;">Final Selling Price<br>
      </td>
      <td style="vertical-align: top;">Commission<br>
      </td>
    </tr>
    <% 
    try {
    ResultSet rs = user.getSalesSummaryReport();
    
    while (rs.next()){
    %>
    <tr>
      <td style="vertical-align: top;"><%=rs.getString("category") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("itemID") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("iName") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("currentBid") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("commission") %><br>
      </td>
    </tr>
    <% 
    }
    rs.close();
    }
    catch (Exception e){
    }
    %>
  </tbody>
</table>

</body></html>
