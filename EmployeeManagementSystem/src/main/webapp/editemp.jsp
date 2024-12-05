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
      <form action='editemployee'>
      <table>
           <% if(request.getAttribute("response")!=null){%>
          <tr>
              <td><%=request.getAttribute("response")%></td>
          </tr>
          <%}%>
           <tr>
           <td>Id</td>
           <td><input type='text' name='id' value='<%=request.getParameter("id") %>'>></td>
         </tr>
         <tr>
           <td>Name</td>
           <td><input type='text' name='name' value='<%=request.getParameter("name") %>'>></td>
         </tr>
         <tr>
           <td>Email</td>
           <td><input type='text' name='email'value='<%=request.getParameter("email") %>'> ></td>
         </tr>
         <tr>
           <td>Password</td>
           <td><input type='password' name='password' ></td>
         </tr>
         <tr>
           <td>Location</td>
           <td><input type='text' name='location'value='<%=request.getParameter("location") %>'> ></td>
         </tr>
         <tr>
           <td><input type='submit' value='Update Employee' ></td>
         </tr>
      </table>
     </form>
</center>
</body>
</html>