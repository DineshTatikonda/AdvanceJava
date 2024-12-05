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
      <h1><a href="addejewellery.jsp">Add Jewellery</a></h1>
      <h1><a href="searchejewellery.jsp">Search Jewellery</a></h1>
      <h1><a href=" findAll">View Jewellery</a></h1>      
      <hr>
      <form action='save'>
      <table>
           <% if(request.getAttribute("response")!=null){%>
          <tr>
              <td><%=request.getAttribute("response")%></td>
          </tr>
          <%}%>
         <tr>
           <td>Style</td>
           <td><input type='text' name='style' ></td>
         </tr>
         <tr>
           <td>Type</td>
           <td><input type='text' name='type' ></td>
         </tr>
         <tr>
           <td>Weight</td>
           <td><input type='weight' name='weight' ></td>
         </tr>
         <tr>
           <td>Price</td>
           <td><input type='text' name='price' ></td>
         </tr>
         <tr>
           <td>State</td>
           <td><input type='text' name='state' ></td>
         </tr>
         <tr>
           <td><input type='submit' value='Add Jewellery' ></td>
         </tr>
      </table>
     </form>
</center>
</body>
</html>