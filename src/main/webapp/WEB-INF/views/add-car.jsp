<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 6.12.2024
  Time: 12.27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@include file="/WEB-INF/css/style_add.css"%>
    </style>
    <title>Добавление машины</title>
</head>
<body>
<h1>Добавление машины</h1>
<br>
<br>
<form:form action="save" modelAttribute="saveCarDto">
    <form:hidden path="id"/>

    Name: <form:input path="name"/>
    <form:errors path="name"/><br><br>
    Mileage(km): <form:input path="mileage"/>
    <form:errors path="mileage"/><br><br>

    Type: <form:select path="type">
        <form:options items="${saveCarDto.carTypes}"/>
    </form:select>
    <form:errors path="type"/><br><br>

    InstructorId: <form:input path="instructorId"/>
    <form:errors path="instructorId"/><br><br>

    studentsCount: <form:input path="studentsCount"/>
    <form:errors path="studentsCount"/><br><br>

    allPrice: <form:input path="allPrice"/>
    <form:errors path="allPrice"/><br><br>

    pricePerTrip: <form:input path="pricePerTrip"/>
    <form:errors path="pricePerTrip"/><br><br>

    <input type="submit" value="Сохранить">
    <br>
</form:form>
</body>
</html>
