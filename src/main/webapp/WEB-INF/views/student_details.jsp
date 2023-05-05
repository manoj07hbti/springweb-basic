<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>


<h2>Your Student name is : ${s1.getName()} </h2>
<h2>Your student roll no is :${s1.getRoll_no()}  </h2>
<h2>Your student branch  is : ${s1.getBranch()}</h2>

<h2>Your Student name is : ${s2.getName()} </h2>
<h2>Your student roll no is :${s2.getRoll_no()}  </h2>
<h2>Your student branch  is : ${s2.getBranch()}</h2>

<h2>Your Student name is : ${s3.getName()} </h2>
<h2>Your student roll no is :${s3.getRoll_no()}  </h2>
<h2>Your student branch  is : ${s3.getBranch()}</h2>

</body>
</html>