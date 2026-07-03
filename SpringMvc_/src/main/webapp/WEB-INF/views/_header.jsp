<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management System</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<header class="topbar">
    <div class="brand">
        <span class="brand-mark">Employee&nbsp;Management</span>
        <span class="brand-tag">Spring MVC + JDBC + MySQL</span>
    </div>
    <a class="btn btn-outline btn-sm" style="color:#fff;border-color:#4a5b6c"
       href="${pageContext.request.contextPath}/employees">All Employees</a>
</header>

<div class="page">

    <c:if test="${not empty successMessage}">
        <div class="alert alert-success">${successMessage}</div>
    </c:if>
    <c:if test="${not empty errorMessage}">
        <div class="alert alert-error">${errorMessage}</div>
    </c:if>
