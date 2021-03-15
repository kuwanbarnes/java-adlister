<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bama
  Date: 3/15/21
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value="/register"/>">


    <label>
        <input id ="username" name="username" placeholder="username" type="text">
    </label>

    <label>
        <input id="email" name="email" type="text" placeholder="email">
    </label>
    <label>
        <input name="password" type="text" placeholder="password">
    </label>
    <button>submit</button>

</form>
</body>
</html>
