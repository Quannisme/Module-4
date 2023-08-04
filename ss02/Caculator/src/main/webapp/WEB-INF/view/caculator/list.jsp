<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 02/08/2023
  Time: 9:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form method="get" action="/submit">
    <input type="text" name="first">
    <input type="text" name="second">
    <input type="submit" value="tru" name="submit">
    <input type="submit" value="cong" name="submit">
    <input type="submit" value="nhan" name="submit">
    <input type="submit" value="chia" name="submit">
    <p>Ket qua : ${result}</p>
</form>
</body>
</html>
