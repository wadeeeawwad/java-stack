<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<div>
	<table>
		<c:forEach items="${eventIn}" var="l">
			<tr>
				<td><c:out value="${l.name}" /></td>
				<td><c:out value="${l.date}" /></td>
				<td><c:out value="${l.state}" /></td>
				<td><c:out value="${l.hostess.first_name}" /></td>
			
				
	
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	
	<table>
		<c:forEach items="${eventNotInState}" var="l">
			<tr>
				<td><c:out value="${l.name}" /></td>
				<td><c:out value="${l.date}" /></td>
				<td><c:out value="${l.state}" /></td>
				<td><c:out value="${l.hostess.first_name}" /></td>
		
				
	
			</tr>
		</c:forEach>
	</table>

	<h1>Create an Event</h1>
	<form:form action="/events" method="post" modelAttribute="event">
	
		<p>
			<form:label path="name">name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		
		<p>
			<form:label path="date"> Date</form:label>
			<form:errors path="date" />
			<form:input type="date" path="date" />
		</p>
		
		 <p>
            <form:label path="state">state:</form:label>
            <form:input path="state"/>
        </p>
		
		
		<input type="submit" value="Create" />
	</form:form>

</body>
</html>