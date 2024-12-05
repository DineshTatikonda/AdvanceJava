<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
   String driver=config.getInitParameter("driver");
   String url=config.getInitParameter("url");
   
   String u=application.getInitParameter("username");
   String p=application.getInitParameter("password");

   

%>
<h1><%=driver %></h1>
<h1><%=url %></h1>
<h1><%=u %></h1>
<h1><%=p %></h1>

