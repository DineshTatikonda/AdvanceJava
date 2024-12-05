<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="emp" class="com.beans.Employee"></jsp:useBean>


<jsp:setProperty property="id" name="emp" value="101"/>
<jsp:setProperty property="name" name="emp" value="Dinesh"/>
<jsp:setProperty property="salary" name="emp" value="75000.00"/>



<h1><jsp:getProperty property="id" name="emp"/>
<jsp:getProperty property="name" name="emp"/>
<jsp:getProperty property="salary" name="emp"/></h1>

