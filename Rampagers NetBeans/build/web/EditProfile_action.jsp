<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope ="session"/>

<jsp:setProperty name="customer" property="*"/> 
<% 
//show error message if it doesn't work or something
if(request.getParameter("password").equals(user.getPassword()) && request.getParameter("newpassword").equals(request.getParameter("newpassword2"))) {
    customer.editCustomerInfo();
    response.sendRedirect("EditProfile.jsp?s=1");
}
else {
response.sendRedirect("EditProfile.jsp?s=0");
}
%>
