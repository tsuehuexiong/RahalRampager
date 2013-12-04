<%-- 
    Document   : AdminMenu
    Created on : Oct 11, 2013, 6:06:47 PM
    Author     : jespringer
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="eSASsheet.css" rel="stylesheet" type="text/css">
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
</head>
<body>
<ul id="menu">
<li><a href="Logout_Action.jsp">Sign Out</a></li>
<li><a href="Reports.jsp">Reports</a>
<ul>
<li><a href="OverallCommissionReport.jsp">Overall Commission</a></li>
<li><a href="SalesSummaryReport.jsp">Sales Summary</a></li>
</ul>
</li>
<li><a href="UserManagement.jsp">User Management</a></li>
<li><a href="AdminHome.jsp">eSAS Home</a></li>
</ul>
</body>
</html>
