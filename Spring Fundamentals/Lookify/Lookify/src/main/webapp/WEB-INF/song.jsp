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
title:------><c:out value="${song.title}" />
<br>
<br>

artist:------><c:out value="${song.artist}" />

<br>
<br>
rating:------><c:out value="${song.rating}" />

<br>
<br>
id:------><c:out value="${song.id}" />

<td><a href="/dashboard/${song.id}/delete">DElete</a></td>


</body>
</html>