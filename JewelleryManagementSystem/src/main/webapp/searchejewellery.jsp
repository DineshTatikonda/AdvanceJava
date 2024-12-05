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
        <h1>Jewellery Management System</h1>
      <h1><a href="addjewellery.jsp">Add Jewellery</a></h1>
      <h1><a href="searchejewellery.jsp">Search Jewellery</a></h1>
      <h1><a href=" findAll">View Jewellery</a></h1> 
       <form action='findbyid'>
      <table>
           <% if(request.getAttribute("response")!=null){%>
          <tr>
              <td><%=request.getAttribute("response")%></td>
          </tr>
          <%}%>
         <tr>
           <td>Id</td>
           <td><input type='text' name='id' ></td>
         </tr>
         <tr>
         <td><input type='submit' value='Search Jewellery'>
         </tr>
      </table>
     </form>  
   </center>
</body>
</html>