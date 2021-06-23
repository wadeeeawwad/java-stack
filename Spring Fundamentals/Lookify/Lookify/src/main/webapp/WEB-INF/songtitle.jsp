<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<td><a href="/dashboard">dashboard</a></td>
<br>
<br>
	
<form action="/dashboard/search" method="POST">
  <label for="search">search:</label>
  <input type="text" id="search" name="search">
  <input type="submit" value="Search">
</form>

	
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Artist</th>
            <th>Rating</th>
         
        </tr>
    </thead>
    <tbody>
    
        <c:forEach items="${objectsong}" var="song">
        <tr>
        <h1>Songs By <c:out value="${song.artist}"/> </h1>
            <td><c:out value="${song.title}"/></td>
            <td><c:out value="${song.artist}"/></td>
            <td><c:out value="${song.rating}"/></td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>