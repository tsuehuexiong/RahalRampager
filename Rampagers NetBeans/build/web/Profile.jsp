<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html><head>
<%@ page language="java" import="java.sql.*"%>

<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope ="session"/>

<title>User Profile</title>
<%@include file="CustomerMenu.jsp" %>
<h1>Profile for <%=request.getParameter("user")%></h1>

<div id="profile">
<%
    
int cID=0;
try {
ResultSet rs=customer.getOtherCustomerInfo(request.getParameter("user"));
if(!rs.next()) {
out.println("No such user<br>");
} else {
do {
cID = rs.getInt("cID");

%>

<table>
<tr><td>
Buyer Rating</td><td><%=rs.getString("buyerRating")%></td></tr>
<tr><td>Seller Rating</td><td><%=rs.getString("sellerRating")%></td></tr>
</table>
<br><br>
<b>Items For Sale</b>
<br><br>

<%
    
} 
while(rs.next());
}
rs.close();
} 
catch(IllegalStateException ise) {
out.println(ise.getMessage());
}
try {
ResultSet rs = customer.getItemsForSale(cID);
if(!rs.next()) {
out.println("No Items for Sale");
} 
else {
int count=0;
do { 

%>
<td>
<img height=80 width=80 src="<%=rs.getString("photo")%>">
<br>
<%=rs.getString("iName")%>;

</td>
<%
count++;
}
while(rs.next());
}
rs.close();
} 
catch(IllegalStateException ise) {
out.println(ise.getMessage());
}
%>
</div>
