<%-- 
    Document   : Login_Action
    Created on : Nov 7, 2013, 10:40:21 AM
    Author     : jespringer
--%>

<%@ page language="java" import="java.sql.*"%>

<% 
    String username = "request.getParameter(Username)";
    String password = "request.getParameter(Password)";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConnection = DriverManager.getConnection("jdbc:mysql://devsrv.cs.csbsju.edu:3306/RahalRampagers", "JSpringer", "JSpringer");
        
        Statement stmt = myConnection.createStatement();
        String queryString = "Select username, password From User Where username = '" + username + "' and password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(queryString);
        if (!rs.next()){
            response.sendRedirect("Login.jsp?error=1");
        }
        else {
            response.sendRedirect("AdminHome.jsp");
            
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    
    
    
    response.sendRedirect("AdminHome.jsp");
%>