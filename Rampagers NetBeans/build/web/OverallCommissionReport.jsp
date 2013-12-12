<%-- 
    Document   : OverallCommissionReport
    Created on : Dec 2, 2013, 2:18:37 PM
    Author     : jespringer
--%>
<%@include file="AdminMenu.jsp" %>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overall Commission</title>
    </head>
    <body>

<h1 align="center">Overall Commission</h1>

<br>

<table style="text-align: left; width: 100%;" border="1" cellpadding="2" cellspacing="2">

  <tbody>
    <tr>
      <td style="vertical-align: top;">User ID<br>
      </td>
      <td style="vertical-align: top;">Username<br>
      </td>
      <td style="vertical-align: top;">First Name<br>
      </td>
      <td style="vertical-align: top;">Last Name<br>
      </td>
      <td style="vertical-align: top;">Email<br>
      </td>
      <td style="vertical-align: top;">Seller Rating<br>
      </td>
      <td style="vertical-align: top;">Commissions<br>
      </td>
    </tr>
    
    <% 
    try {
    ResultSet rs = user.getCommissionReport();
    ResultSet rs2 = user.getOverallCommission();
    while (rs.next()){
    %>
    
    <tr>
      <td style="vertical-align: top;"><%=rs.getString("cID") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("username") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("fName") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("lName") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("email") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("sellerRating") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getString("commission") %><br>
      </td>
    </tr>
    
    <% 
    }
    rs.close();
    
    %>
  </tbody>
</table>

<br>
<% while(rs2.next()){
    %>
    Total Income  <span><%=rs2.getString("sum(commission)")%></span><br>
<%
    }
    rs2.close();
    }
    catch (Exception e){
    }
    %>
</body></html>
