<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 07/08/2023
  Time: 8:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List students</h1>
<a href="/homThu/create">Create new student</a>
<table border="1">
  <tr>
    <th>ID</th>
    <th>language</th>
    <th>size</th>
    <th>spams filter</th>
    <th>signature</th>
  </tr>
  <c:forEach items="${homThu}" var="homThu">
    <tr>
      <td>${homThu.id}</td>
      <td>${homThu.language}</td>
      <td>${homThu.pageSize}</td>
      <td>${homThu.spamsFilter}</td>
      <td>${homThu.signature}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
