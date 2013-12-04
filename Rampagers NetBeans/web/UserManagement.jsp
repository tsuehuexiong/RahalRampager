<%-- 
    Document   : UserManagement
    Created on : Dec 2, 2013, 2:18:50 PM
    Author     : jespringer
--%>
<%@include file="AdminMenu.jsp" %>

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
      <td>User ID<br>
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
    </tr>
    <tr>
      <td style="vertical-align: top;">1<br>
      </td>
      <td style="vertical-align: top;">User'sName<br>
      </td>
      <td style="vertical-align: top;">First<br>
      </td>
      <td style="vertical-align: top;">Last<br>
      </td>
      <td style="vertical-align: top;">Email@email.com<br>
      </td>
      <td style="vertical-align: top;">********<br>
      </td>
    </tr>
  </tbody>
</table>

<h1 align="center">Add User</h1>

    <center>

<form method="post" action="AddUser_Action.jsp" name="AddUser">
<span> Username: </span> <input name="username" value=""><br>
<span> First Name: </span> <input name="firstName" value=""><br>
<span> Last Name: </span> <input name="lastName" value=""><br>
<span> Email: </span> <input name="email" value=""><br>
<span> Password: </span> <input name="password" value=""><br> <br>
<input name="Submit" value="Submit" type="submit">
</form>
    </center>
</body></html>
