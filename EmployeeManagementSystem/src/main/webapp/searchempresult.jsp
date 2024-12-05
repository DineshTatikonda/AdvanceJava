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
      </center>
      <table border='1'>
          <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Email</th>
              <th>Location</th>     
          </tr>
          <tr>
            <td>${employee.getId()}</td>
           <td>${employee.getName()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getLocation()}</td>
            </tr> 
      </table>
      
      
      </form>

</body>
</html>