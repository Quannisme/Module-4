<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 02/08/2023
  Time: 8:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SandWich Condiments</title>
</head>
<body>
<form method="post" action="/save">
  <input type="checkbox" value="lettuce" name="condiment">Lettuce
  <input type="checkbox" value="Tomato" name="condiment">Tomato
  <input type="checkbox" value="Mustard" name="condiment">Mustard
  <input type="checkbox" value="Sprouts" name="condiment">Sprouts<br>
  <input type="submit" value="save" >
  <p>Result : ${result}</p>
</form>
</body>
</html>
