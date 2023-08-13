<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 09/08/2023
  Time: 12:57 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Medical</title>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js">
</head>
<body>
<h1>List Medical</h1>
<a href="/medical/create">Create new Medical</a>
<table border="1" class="table">
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Year of BirthDay</th>
        <th>General</th>
        <th>National</th>
        <th>Number Id</th>
        <th>Information Transport</th>
        <th>Number Car</th>
        <th>Number chair</th>
        <th>Star</th>
        <th>End</th>
        <th>Destination</th>
    </tr>
    <c:forEach items="${medical}" var="medical">
        <tr>
            <td>${medical.id}</td>
            <td>${medical.fullName}</td>
            <td>${medical.yearOfBirth}</td>
            <td>${medical.general}</td>
            <td>${medical.national}</td>
            <td>${medical.numberId}</td>
            <td>${medical.informationTransport}</td>
            <td>${medical.numberCar}</td>
            <td>${medical.numberChair}</td>
            <td>${medical.star.getFullDate()}</td>
            <td>${medical.end.getFullDate()}</td>
            <td>${medical.destination}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
