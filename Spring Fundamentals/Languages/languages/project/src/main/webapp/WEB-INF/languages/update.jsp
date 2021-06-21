<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/languages/${lang.id}" method="post" modelAttribute="lang">
	<input type="hidden" name="_method" value="put">
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
		<br>
		<input type="submit" value="Submit" />
	</form:form>
		<a href="/languages">Dashbord</a>
	

</body>
</html>