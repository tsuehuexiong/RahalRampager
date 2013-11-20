<%@ page language="java" import="java.sql.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection myConnection = DriverManager.getConnection("jdbc:mysql://devsrv.cs.csbsju.edu:3306/RahalRampagers", "JSpringer", "JSpringer");
%>