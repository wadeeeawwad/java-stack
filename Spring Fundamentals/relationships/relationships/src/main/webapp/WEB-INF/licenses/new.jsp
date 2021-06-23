<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New License</h1>
	<form:form action="/licenses" method="post" modelAttribute="license">
		<p>
			<form:select path="person">
				<c:forEach items="${persons}" var="person">
					<form:option value="${person}"> ${person.firstName}  ${person.lastName} </form:option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="state">State</form:label>
			<form:errors path="state" />
			<form:input path="state" />
		</p>
		
		<h1>
		date will raise an error due to format
		</h1>
		<p>
			<form:label path="expirationDate">Expiration Date</form:label>
			<form:errors path="expirationDate" />
			<form:input type="date" path="expirationDate" />
		</p>
		
		
		<input type="submit" value="Create" />
	</form:form>
</body>
</html> 