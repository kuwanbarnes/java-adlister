<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD:src/main/webapp/WEB-INF/profile.jsp
    <jsp:include page="../partials/head.jsp">
=======
    <jsp:include page="/WEB-INF/partials/head.jsp">
>>>>>>> main:src/main/webapp/profile.jsp
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>

    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome to your profile, ${user}.</h1>

    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>

    </div>
<a href="/logout">log out</a>
</body>
</html>
