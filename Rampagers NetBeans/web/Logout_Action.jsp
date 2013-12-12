<%-- 
    Document   : Logout_Action
    Created on : Dec 2, 2013, 2:17:47 PM
    Author     : jespringer
--%>

<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RahalRampagers.User" scope="session"/>
<%
    try{
        user.logout();
    }
    catch(IllegalStateException ise){
        out.println(ise.getMessage());
    }
    response.sendRedirect("Login.jsp");
    
%>
