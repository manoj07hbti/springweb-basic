<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>
<h1>Spring Boot - MVC web application example</h1>
<hr>


<ul>
    <c:forEach var="listValue" items="${emp_list}">
        <li>${listValue.getName()}</li>
        <li>${listValue.getEmpId()}</li>
        <li>${listValue.getDept()}</li>

    </c:forEach>
</ul>


</body>
</html>