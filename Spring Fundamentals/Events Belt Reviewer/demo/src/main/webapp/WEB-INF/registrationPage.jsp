<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1>Register!</h1>
    
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="first_name">first_name:</form:label>
            <form:input path="first_name"/>
        </p>
        <p>
            <form:label path="last_name">last_name:</form:label>
            <form:input path="last_name"/>
        </p>
    
        <p>
            <form:label path="email">Email:</form:label>
            <form:input  path="email"/>
        </p>
         <p>
            <form:label path="state">state:</form:label>
            <form:input path="state"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/>
        </p>
        
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>