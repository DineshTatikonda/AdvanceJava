<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <hr>
      <form action="findbyid">
      <table>
           <% if(request.getAttribute("response")!=null){%>
          <tr>
              <td><%=request.getAttribute("response")%></td>
          </tr>
          <%}%>
         <tr>
           <td>Id</td>
           <td><input type="text" name='id' ></td>
         </tr>
         
         <tr>
           <td><input type="submit" value="Search Employee" ></td>
         </tr>
      
      
      
      
      
      </table>
      
      </form>

</body>
</html>