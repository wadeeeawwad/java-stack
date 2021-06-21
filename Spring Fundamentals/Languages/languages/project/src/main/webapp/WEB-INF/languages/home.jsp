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

	<table>
		<c:forEach items="${languages}" var="l">
			<tr>
				<td><c:out value="${l.name}" /></td>
				<td><c:out value="${l.creation}" /></td>
				<td><c:out value="${l.version}" /></td>
				<td><a href="/languages/${l.id}/update">Update</a></td>
				<td><a href="/languages/${l.id}/delete">DElete</a></td>
	
			</tr>
		</c:forEach>
	</table>

	<form:form action="/languages" method="post" modelAttribute="lang">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creation">Creator</form:label>
			<form:errors path="creation" />
			<form:textarea path="creation" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>