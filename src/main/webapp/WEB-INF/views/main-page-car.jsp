<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 6.12.2024
  Time: 12.00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        <%@include file="/WEB-INF/css/style_main.css"%>
    </style>
    <title>Title</title>
</head>

<body>

<h2>Cars information</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Mileage</th>
        <th>Type</th>
        <th>InstructorId</th>
        <th>studentsCount</th>
        <th>allPrice</th>
        <th>pricePerTrip</th>
    </tr>

    <c:forEach var="cars" items="${cars}">
        <c:url var="delete" value="/delete">
            <c:param name="id" value="${cars.id}"/>
        </c:url>
        <c:url var="update" value="/update">
            <c:param name="id" value="${cars.id}"/>
        </c:url>
        <tr>

            <td>${cars.name}</td>
            <td>${cars.mileage}</td>
            <td>${cars.type}</td>
            <td>${cars.instructorId}</td>
            <td>${cars.studentsCount}</td>
            <td>${cars.allPrice}</td>
            <td>${cars.pricePerTrip}</td>
            <td>
                <input type="button" value="Change" onclick="window.location.href='${update}'">
            </td>
            <td>
                <input type="button" value="Delete" onclick="window.location.href='${delete}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Добавить" onclick="window.location.href='add'">
</body>
</html>
