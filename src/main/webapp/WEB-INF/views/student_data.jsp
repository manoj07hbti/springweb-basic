<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>


<h2>Your Student name is  ${std1.getName()}</h2>

<h2>Your student branch  is ${ std1.getBranch()}</h2>
<h2>Your student roll no is  ${ std1.getRoll_no()} </h2>

<h2>Your Student name is  ${std2.getName()}</h2>

<h2>Your student branch  is ${ std2.getBranch()}</h2>
<h2>Your student roll no is  ${ std2.getRoll_no()} </h2>

</body>
</html>