<%-- 
    Document   : UserManagement
    Created on : Dec 2, 2013, 2:18:50 PM
    Author     : jespringer
--%>
<%@include file="AdminMenu.jsp" %>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Management</title>
    </head>
    <body>
        <h1 align="center">User List</h1>

<table style="text-align: left; margin-left: auto; margin-right: auto;" border="1" cellpadding="2" cellspacing="2">
  <tbody>
    <tr>
      <td>Customer ID<br>
      </td>
      <td style="vertical-align: top;">UserName<br>
      </td>
      <td style="vertical-align: top;">First Name<br>
      </td>
      <td style="vertical-align: top;">Last Name<br>
      </td>
      <td style="vertical-align: top;">Email<br>
      </td>
      <td style="vertical-align: top;">Password<br>
      </td>
      <td style="vertical-align: top;">Administrator<br>
      </td>
    </tr>
    <% 
    try {
    ResultSet rs = user.getAllUsers();
    
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
      <td style="vertical-align: top;"><%=rs.getString("password") %><br>
      </td>
      <td style="vertical-align: top;"><%=rs.getBoolean("isAdmin")== true %><br>
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

<h1 align="center">Add User</h1>

    <center>

<form method="post" action="AddUser_Action.jsp" name="AddUser">
<span> Username: </span> <input name="username" value=""><br>
<span> First Name: </span> <input name="fName" value=""><br>
<span> Last Name: </span> <input name="lName" value=""><br>
<span> Email: </span> <input name="email" value=""><br>
<span> Password: </span> <input name="password" value=""><br>
<span> Admin: </span> <input type ="radio" name="isAdmin" value="true">Yes <input type="radio" name="isAdmin" value="false">No<br> <br>
<input name="Submit" value="Submit" type="submit">
</form>
    </center>
</body></html>
