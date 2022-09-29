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

  <h2>You have enter name  as  ${user_key}</h2>
  <h2>You have enter new name  as  ${name_key}</h2>

  <h2>Your Student name is  ${student_key.getName()}</h2>

  <h2>Your student branch  is ${ student_key.getBranch()}</h2>
  <h2>Your student roll no is  ${ student_key.getRoll_no()} </h2>

</body>
</html>