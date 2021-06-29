<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td,tr{
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<table>
				
			<tr>
			<td>	<c:out value="${thisevent.name}" /> </td>
			</tr>
			<tr> <td> <c:out value="${thisevent.date}" /> </td> </tr>
			<tr>  <td> <c:out value="${thisevent.state}" /> </td> </tr>
			<tr> <td>  <c:out value="${thisevent.hostess.first_name}" /> </td> </tr>
		
	</table>
	
	
</body>
</html>