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
	<td><a href="/songs/new">Add New</a></td>
	<br>
	<br>
	<form action="/dashboard/search" method="POST">
  <label for="search">search:</label>
  <input type="text" id="search" name="search">
  <input type="submit" value="Search">
</form>
<br>
	<br>
	<table>
		<c:forEach items="${lokiobject}" var="l">
			<tr>
				<td><a href="/songs/${l.id}">${l.title}</a></td>
				<td><c:out value="${l.rating}" /></td>
				<td><c:out value="${l.id}" /></td>

				<td><a href="/dashboard/${l.id}/delete">DElete</a></td>


			</tr>
		</c:forEach>
	</table>
</body>
</html>