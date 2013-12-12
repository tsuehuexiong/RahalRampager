<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope ="session"/>
<jsp:useBean id="sFeedback" class="jespringer.RahalRampagers.SellerRating" scope="session"/> 

<jsp:setProperty name="sFeedback" property="*"/> 
<% 
    sFeedback.setBuyerID(customer.getcID());
    sFeedback.addSellerRating();
    response.sendRedirect("Feedback.jsp");
%>
