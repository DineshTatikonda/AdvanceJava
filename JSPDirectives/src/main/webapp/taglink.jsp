<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
<c:out value="${requestScope.name}"></c:out></h1>
<c:forEach items="${requestScope.list}" var="item">
<h1><c:out value="${item}"></c:out></h1>
</c:forEach>


    