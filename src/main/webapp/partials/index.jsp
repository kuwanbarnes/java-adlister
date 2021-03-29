<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Users</title>
</head>
<body>
<h1>Here are all the Users:</h1>

<c:forEach var="user" items="${userList}" >


    <div class="user">
        <h2>${user.getUsername}</h2>
        <p>ID: ${user.id}</p>
        <p>Description: ${user.getLastName()}</p>
    </div>
    <br>
</c:forEach>

</body>
</html>