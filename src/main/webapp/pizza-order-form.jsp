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
<form method="post" action="pizza-order">
<div>
    <label for="Crust-select">Choose a crust:</label>

    <select name="crust" id="Crust-select">
        <option value="">--Please choose an option--</option>
        <option value="thin">Thin</option>
        <option value="hand">Hand Tossed</option>
        <option value="pan">Pan</option>
        <option value="stuff">Stuff Crust</option>
    </select>
</div>
<div>
    <label for="sauce-select">Choose a sauce:</label>
    <select name="sauce" id="sauce-select">
        <option value="">--Please choose an option--</option>
        <option value="pesto">Pesto</option>
        <option value="alfredo">Alfredo Sauce</option>
        <option value="salsa">Salsa</option>
        <option value="bbq">BBQ Sauce</option>
    </select>
</div>
    <p>Choose your toppings:</p>

    <div>
        <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
        <label for="pepperoni">Pepperoni</label>
    </div>

    <div>
        <input type="checkbox" id="ham" name="ham" value="ham">
        <label for="ham">Ham</label>
    </div>
    <div>
        <input type="checkbox" id="beef" name="beef" value="beef">
        <label for="beef">Beef</label>
    </div>

    <label for="Address">Delivery Address:</label>

    <input type="text" id="Address" name="Address" required
            maxlength="8000" size="10">

<button type="submit" name="submit">Submit</button>

</form>
</body>
</html>