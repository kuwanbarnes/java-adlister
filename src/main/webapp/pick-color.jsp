<%--
  Created by IntelliJ IDEA.
  User: bama
  Date: 3/7/21
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>

</head>
<body>
<form method="post" action="/pickcolor">
    <label for="userColor">Pick your favorite color</label>

    <input type="text" id="userColor" name="userColor" required
           maxlength="80" size="10">

</form>
</body>
</html>