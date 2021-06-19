<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <body style="background-color:#66CDAA;">
</head>
<body>
 
<form action="/data" Method="POST">

  
 your name: <input type="text" id="name" name="name" ><br><br>
  

  <select name="city">

    <option value="san jose1"> san jose </option>

    <option value="LA">LA</option>

    <option value="newyork">New York</option>

 </select>
 <br><br>
 <select name="language">

    <option value="python"> python </option>

    <option value="java"> Java </option>

    <option value="c++"> C++ </option>

 </select>
 <br><br>
 <textarea id="Comment" name="comment" ></textarea>
  <br><br>
  
    <input type="submit" value="Submbit">
</form>


</body>
</html>