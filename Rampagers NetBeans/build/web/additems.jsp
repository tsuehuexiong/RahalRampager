<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="item" class="jespringer.RahalRampagers.Item" scope="session"/>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope="session"/>
<jsp:setProperty name="item" property="*"/> 
<html><head>
  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title>Add Item</title>
<%@include file="CustomerMenu.jsp" %>

    </head>
    <body>

<h1>
Add Item
</h1>
<form method="post" action="AddItem_Action.jsp"><br>
<div id="pro"
<table style="text-align: left; width: 50%;" border="1">
  <tbody>
    <tr>
    <tr>
      <td>Item Name</td>
      <td><input name="iName" value =""><br>
      </td>
    </tr>
    <tr>
      <td>Category</td>
      <td><input name="category" value =""><br>
      </td>
    </tr>
    <tr>
      <td>Start Price</td>
      <td><input name="startPrice" value =""><br>
      </td>
    </tr>
<tr>
<td>
Action Length
</td>
<td>

<select name="aucLength">
<option value="1">12 hours</option>
<option value="2">One Day</option>
<option value="3">Two Days</option>
</select>

</td>
<br>
</tr>
<tr>
      <td>Description</td>
      <td><input cols="23" rows="2" name="description" value =""></textarea><br>
      </td>
    </tr>
    <tr>
      <td>photo</td>
      <td><select name="photo" >
<option value="0">No</option>
<option value="1">Yes</option>
</select><br>
      </td>
    </tr>
<input value="Add" type="submit">&nbsp; <button>Upload Photo</button>
</form>
  </tbody>
</table>

<br>
<br>

</div>

</body></html>
