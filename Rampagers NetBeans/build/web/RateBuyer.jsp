<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" import="java.sql.*"%>
<html><head>

<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope="session"/>
<jsp:useBean id="bFeedback" class="jespringer.RahalRampagers.BuyerRating" scope="session"/>
<jsp:setProperty name="bFeedback" property="*"/>
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">

  <title>Rate Buyer</title>

  
  <link rel="stylesheet" href="esassheet1" type="text/css">

</head><body>
<br>
<h1>Leave Buyer Feedback</h1>
<table style="text-align: left; width: 350px;" border="1">
  <tbody>
    <tr>
      <td>Item Name<br>
      </td><td align="right"><%=bFeedback.getItemName()%></td></tr><tr>
      <td>Item ID</td><td align="right"><%=bFeedback.getItemID()%></td>
    </tr>
    <tr>
      <td>Overall Satisfaction<br>
      </td>
      <td align= "right"> <form method="post" action="RateBuyer_action.jsp">
      <select name="satisfaction" id="satisfaction">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
</select>
</td>
    </tr>
    <tr>
      <td>Quality<br>
      </td><td align= "right">
<select name="quality" id="payment">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
</select>

      </td>
    </tr>
    <tr>
      <td>Comments </td>
      <td> <textarea name="comment" rows="5" cols="50"></textarea></td>
    </tr>
  </tbody>
</table>
<br>
<br>
<input value="Submit" type="submit"></form> <input value="Back" type="button" onclick="window.close();"></button>
</center>

</body></html>
