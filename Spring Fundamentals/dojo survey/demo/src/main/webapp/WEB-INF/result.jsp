<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <body style="background-color:#8FBC8F;">
</head>
<body>
 
<form action="/" Method="POST">
  
 <h2>Name:<c:out value="${name}"/>  </h2>
  <br><br>
  <h2>Location: <c:out value="${city}"/></h2>
   <br><br>
   <h2>Favorite: <c:out value="${language}"/></h2>
    <br><br>
    <h2>Comment:<c:out value="${comment}"/></h2>
     <br><br>
     <input type="submit" value="Go Back">
     
     
</form>

</body>
</html>