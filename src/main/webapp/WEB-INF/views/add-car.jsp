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
    <title>Добавление машины</title>
</head>
<body>
<br>
<br>
<form:form action="save" modelAttribute="saveCarDto">
    Name: <form:input path="name"/><br><br>
    Mileage: <form:input path="mileage"/><br><br>
    Type: <form:input path="type"/><br><br>
    <input type="submit" value="Сохранить">
    <br>
</form:form>
</body>
</html>
