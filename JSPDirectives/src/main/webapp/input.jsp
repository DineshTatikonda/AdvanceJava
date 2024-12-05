<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String name="Fruits JSP";
    ArrayList<String> list=new ArrayList<String>();
    list.add("Apple");   
    list.add("Mango");
    list.add("Banana");
    request.setAttribute("name", name);
    request.setAttribute("list", list);
%>
<jsp:forward page="taglink.jsp"></jsp:forward>
