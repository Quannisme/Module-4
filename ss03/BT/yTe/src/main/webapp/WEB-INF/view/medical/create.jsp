<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Khai Y Te</title>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js">
</head>
<body>
<h1>To Khai Y Te</h1>
<form:form action="/medical/create" method="post" modelAttribute="medical">
        <table>
            <tr>
                <td>ID :</td>
                <td>
                    <form:input path="id"/>
                </td>
            </tr>
            <tr>
                <td>Ho Ten :</td>
                <td>
                    <form:input path="fullName"/>
                </td>
            </tr>
            <tr>
                <td>Nam sinh</td>
                <td><form:input path="yearOfBirth" /></td>
            </tr>
            <tr>
                <td>Gioi tinh</td>
                <td>
                    <select name="general" class="form-select" aria-label="Default select example">
                        <c:forEach items="${general}" var="s">
                            <option name="general" value="${s}">${s}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Quoc Tich</td>
                <td>
                    <select name="national" class="form-select" aria-label="Default select example">
                        <c:forEach items="${national}" var="n">
                            <option value="${n}">${n}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>So ho chieu hoac cmnd</td>
                <td>
                    <form:input path="numberId"/>
                </td>
            </tr>
            <tr>
                <td>Thong tin di lai</td>
                <td>
                    <form:checkboxes path="informationTransport" items="${information}"/>
                </td>
            </tr>
            <tr>
                <td>So hieu phuong tien</td>
                <td>
                    <form:input path="numberCar"/>
                </td>
            </tr>
            <tr>
                <td>So ghe </td>
                <td>
                    <form:input path="numberChair"/>
                </td>
            </tr>
            <tr>
                <td>Ngay khoi hanh</td>
                <td>
                    <form:input path="star.date"/>
                </td>
                <td>
                    <form:input path="star.month"/>
                </td>
                <td>
                    <form:input path="star.year"/>
                </td>
            </tr>
            <tr>
                <td>Ngay ket thuc</td>
                <td>
                    <form:input path="end.date"/>
                </td>
                <td>
                    <form:input path="end.month"/>
                </td>
                <td>
                    <form:input path="end.year"/>
                </td>
            </tr>
            <tr>
                <td>Trong 14 ngay co den tinh thanh pho nao khong</td>
                <td>
                    <form:input path="destination"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Gui to khai">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>