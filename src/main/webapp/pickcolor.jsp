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

    <script type="text/javascript">
        "use strict";
        let favColor="";
        window.onload=function() {
            favColor = prompt("Whats your favorite color?");
            if(favColor != null) {
                window.open("localhost8080/favcolor.jsp", "");
            }



        }
    </script>
</head>
<body>




</body>
</html>
