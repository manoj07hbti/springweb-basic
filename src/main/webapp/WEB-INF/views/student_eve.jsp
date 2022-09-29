<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>


<h2>Your Student name is  ${student.getName()}</h2>

<h2>Your student branch  is ${ student.getBranch()}</h2>
<h2>Your student roll no is  ${ student.getRoll_no()} </h2>


<h2>Your Student name is  ${student2.getName()}</h2>

<h2>Your student branch  is ${ student2.getBranch()}</h2>
<h2>Your student roll no is  ${ student2.getRoll_no()} </h2>


</body>
</html>