<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${error}"/>
<h2> What is the code?    </h2>
<form action="/login" method="POST">
  
  <input type="text" id="code" name="code"><br><br>
 
  <input type="submit" value="TRy Code">
</form>
</body>
</html>