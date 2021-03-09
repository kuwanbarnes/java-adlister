<%--
  Created by IntelliJ IDEA.
  User: bama
  Date: 3/8/21
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/guess">
    <label for="userGuess">Guess number between 1-3</label>

    <input type="text" id="userGuess" name="userGuess" required
           maxlength="3" size="10">
<button type="submit">Submit</button>
</form>
</body>
</html>
