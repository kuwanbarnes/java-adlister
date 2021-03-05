<%--
  Created by IntelliJ IDEA.
  User: bama
  Date: 3/4/21
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("message", "Hello, World!"); %>

<html lang="en">
<head>
    <title>Implicit Object Example</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<jsp:include page="partials/navbar.jsp"></jsp:include>

<% request.getAttribute("message"); %>
<h1>${message}</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"name" parameter with EL: ${param.name}</p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<p>"search" parameter with EL: ${param.term}</p>

<script src ="js/main.js"></script>
</body>
</html>