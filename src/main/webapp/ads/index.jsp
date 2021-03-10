<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${adList}">


    <div class="ad">
        <h1>${ad.getTitle()}</h1>
        <p> ${ad.getDescription()}</p>
    </div>
</c:forEach>

</body>
</html>