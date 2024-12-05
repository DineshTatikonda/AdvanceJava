<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <center>
      <h1>Employee Management System</h1>
      <h1><a href="addemployee.jsp">Add Employee</a></h1>
      <h1><a href="searchemployee.jsp">Search Employee</a></h1>
      <h1><a href=" findAll">View Employee</a></h1>      
      <table border='1'>
          <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Email</th>
              <th>Location</th>  
              <th>Edit</th>
              <th>Delete</th>   
          </tr>
          <c:forEach items="${emplist}" var="employee">
           <tr>
             <td>${employee.getId()}</td>
            <td>${employee.getName()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getLocation()}</td>
            <td><a href='editemp.jsp?id=${employee.getId()}&name=${employee.getName()}&email=${employee.getEmail()}&location=${employee.getLocation()}'>Edit</td>
            <td><a href='deletebyid?id=${employee.getId()}'>Delete</td>       
           </tr> 
          </c:forEach>        
      </table>
      </center>  
      </form>
</body>
</html>