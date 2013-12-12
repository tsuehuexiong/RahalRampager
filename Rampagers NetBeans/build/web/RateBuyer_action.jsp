<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="customer" class="jespringer.RahalRampagers.Customer" scope ="session"/>
<jsp:useBean id="bFeedback" class="jespringer.RahalRampagers.BuyerRating" scope="session"/> 

<jsp:setProperty name="bFeedback" property="*"/> 
<% 
    bFeedback.setSellerID(customer.getcID());
    bFeedback.addBuyerRating();
    response.sendRedirect("Feedback.jsp");
%>
