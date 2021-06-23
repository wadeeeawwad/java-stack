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
<form:form action="/dashboard" method="post" modelAttribute="lokimodel">
		<p>
			<form:label path="title">title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="artist">artist</form:label>
			<form:errors path="artist" />
			<form:textarea path="artist" />
		</p>
		<p>
			<form:label path="rating">rating</form:label>
			<form:errors path="rating" />
			<form:input path="rating" />
		</p>
		<input type="submit" value="add song" />
	</form:form>
</body>
</html>