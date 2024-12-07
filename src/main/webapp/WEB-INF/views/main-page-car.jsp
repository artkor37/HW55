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
    </tr>
    <c:forEach var="cars" items="${cars}">
        <tr>
            <td>${cars.name}</td>
            <td>${cars.mileage}</td>
            <td>${cars.type}</td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Добавить" onclick="window.location.href='add'">
</body>
</html>
