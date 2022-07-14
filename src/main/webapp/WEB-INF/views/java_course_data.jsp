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

<h2>This is my first key of Model object : ${java}</h2>
<h2>This is my Second key of Model object : ${spring}</h2>
<h2>This is my Third key of Model object : ${springboot}</h2>
<h2>Student Data: NAME  : ${std.getName()}</h2>
<h2>Student Data: Roll no  : ${std.getRoll_no()}</h2>
<h2>Student Data: Brnach  : ${std.getBranch()}</h2>


</body>
</html>