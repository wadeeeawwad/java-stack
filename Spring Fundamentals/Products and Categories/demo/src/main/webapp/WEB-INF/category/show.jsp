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
	 <h1>${category.name}</h1>
	 <table>
		<c:forEach items="${category.products}" var="l">
			<tr>
				<td><c:out value="${l.name}" /></td>
		
	
			</tr>
		</c:forEach>
	</table>
<h1>Add product</h1>
	<form:form action="/category/${category.id}" method="post" modelAttribute="acategories">
		<p>
		<form:input type="hidden" value="${category.id}" path="category"/>
			<form:select path="product">
				<c:forEach items="${product}" var="product">
					<form:option value="${product}"> ${product.name}   </form:option>
				</c:forEach>
			</form:select>
		</p>
		<input type="submit" value="Create" />
	</form:form>

</body>
</html>