<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>
<h1>Spring Boot - Doctor web application example</h1>
<hr>

<h2>Doctor Name: ${doc.getName()}</h2>
<h2>Age : ${doc.getAge()}</h2>
<h2>Department : ${doc.getDept()}</h2>


</body>
</html>