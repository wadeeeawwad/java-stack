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
<h1>Wadee is the best</h1>
	 <h1>${product.name}</h1>
	 <table>
		<c:forEach items="${product.getCategories()}" var="l">
			<tr>
				<td><c:out value="${l.name}" /></td>
		
	
			</tr>
		</c:forEach>
	</table>
<h1>Add Category</h1>
	<form:form action="/product/${product.id}" method="post" modelAttribute="acategories">
		<p>
		<form:input type="hidden" value="${product.id}" path="product"/>
			<form:select path="category">
				<c:forEach items="${category}" var="category">
					<form:option value="${category}"> ${category.name}   </form:option>
				</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="Create" />
	</form:form>

</body>
</html>