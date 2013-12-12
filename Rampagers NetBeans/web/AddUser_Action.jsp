<%-- 
    Document   : AddUser_Action
    Created on : Dec 4, 2013, 2:38:45 PM
    Author     : jespringer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>%>
<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="newUser" class="jespringer.RahalRampagers.User" scope="session"/>
<jsp:setProperty name="newUser" property="*"/>
<jsp:useBean id="newCustomer" class="jespringer.RahalRampagers.Customer" scope="session"/>
<jsp:setProperty name="newCustomer" property="*"/>

<%
    newUser.addUser();
    if (newUser.getIsAdmin() == false){
        newCustomer.addCustomer();
    }
    response.sendRedirect("UserManagement.jsp");
%>
