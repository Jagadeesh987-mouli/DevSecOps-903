<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        Date d =(Date) request.getAttribute("date");
    %>
    <h1>Date and Time ::<%= d %></h1>
    <a href="index.html">Home</a>
</body>
</html>