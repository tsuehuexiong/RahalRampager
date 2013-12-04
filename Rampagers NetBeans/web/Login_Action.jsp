<%-- 
    Document   : Login_Action
    Created on : Nov 7, 2013, 10:40:21 AM
    Author     : jespringer
--%>

<%@ page language="java" import="java.sql.*"%>
<jsp:useBean id="user" class="jespringer.RRbeans.User" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<% 
    int state = user.login();
    if (state == 0){
        response.sendRedirect("CustomerHome.jsp");
    }
    else if (state == 1){
        response.sendRedirect("AdminHome.jsp");
    }
    else if (state == 2){
        response.sendRedirect("Login.jsp?error=0");
    }
    else {
        response.sendRedirect("Login.jsp?error=1");
    }
    
    
%>
