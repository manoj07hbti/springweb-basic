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

  <h2>You have enter USER_ID  as  ${USER_ID}</h2>

  <h2>Your Student name is  ${Student.getName()}</h2>

  <h2>Your student branch  is ${ Student.getBranch()}</h2>
  <h2>Your student roll no is  ${ Student.getRoll_no()} </h2>

</body>
</html>