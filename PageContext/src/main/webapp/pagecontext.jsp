<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
      pageContext.setAttribute("student","Dinesh",pageContext.REQUEST_SCOPE);
      pageContext.setAttribute("trainer","Anand",pageContext.SESSION_SCOPE);
 
%>
 <jsp:forward page="one.jsp"></jsp:forward>   