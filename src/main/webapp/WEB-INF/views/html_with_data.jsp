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

<h2>This is my first key of Model object : ${J}</h2>
<h2>This is my Second key of Model object : ${S}</h2>
<h2>This is my Third key of Model object : ${SB}</h2>
<h2>This is my Fourth key of Model object : ${MS}</h2>

<h2>This is my Student NAME :  ${student.getName()}</h2>
<h2>This is my Student RollNo :  ${student.getRoll_no()}</h2>
<h2>This is my Student BRANCH :  ${student.getBranch()}</h2>


</body>
</html>