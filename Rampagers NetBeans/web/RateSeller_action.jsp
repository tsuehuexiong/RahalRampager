<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="customer" class="kakutzke.RahalRampagers.Customer" scope ="session"/>
<jsp:useBean id="sFeedback" class="kakutzke.RahalRampagers.SellerRating" scope="session"/> 

<jsp:setProperty name="sFeedback" property="*"/> 
<% 
    sFeedback.setBuyerID(customer.getcID());
    sFeedback.addSellerRating();
    response.sendRedirect("Feedback.jsp");
%>
