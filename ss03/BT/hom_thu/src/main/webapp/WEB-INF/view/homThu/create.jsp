<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 07/08/2023
  Time: 9:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new Hom Thu</h1>
<form:form action="/homThu/create" method="post" modelAttribute="homThu">
    <table>
        <tr>
            <td>ID</td>
            <td>
                <c:choose>
                    <c:when test="${action == 'create'}">
                        <form:input path="id" />
                    </c:when>
                    <c:otherwise>
                        ${homThu.id}
                        <form:hidden path="id" />
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <tr>
            <td>Language</td>
            <td>
                <select name="language" >
                    <c:forEach items="${language}" var="la">
                        <option value="${la}">${la}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>Size</td>
            <td>
                <select name="pageSize">
                    <c:forEach items="${size}" var="s">
                        <option name="pageSize" value="${s}">${s}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>Spam</td>
            <td>
                <c:forEach items="${filter}" var="fi">
                    <input name="spamsFilter"  type="checkbox" value="${fi}">
                    ${fi}
                </c:forEach>
            </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>
                <form:input path="signature"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Create">
            </td>
        </tr>
    </table>
    <input type="hidden" name="action" value="${action}">
</form:form>
</body>
</html>
