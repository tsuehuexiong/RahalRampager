<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="item" class="pjnowak.RahalRampagers.Item" scope="session"/>
<jsp:useBean id="customer" class="pjnowak.RahalRampagers.Customer" scope="session"/>
<jsp:setProperty name="item" property="*"/> 
<%
item.setSellerID(customer.getcID());

//out.println(item.getSellerID()+"  ");
//out.println(item.getStartPrice()+"  ");
//out.println(item.getCategory()+"  ");
//out.println(item.getDescription()+"  ");
//out.println(item.getPhoto()+"  ");
//out.println(item.getiName());
//out.println(item.getAucLength()+"this one");

try{
 item.addItem();
}
catch(Exception e){
out.println(e);
}
    response.sendRedirect("listsold.jsp");
%>
