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
      <form action='editjewellery'>
      <table>
           <% if(request.getAttribute("response")!=null){%>
          <tr>
              <td><%=request.getAttribute("response")%></td>
          </tr>
          <%}%>
          <tr>
           <td>Id</td>
           <td><input type='text' name='id' value="<%= request.getParameter("id") %>"></td>
         </tr>
         <tr>
           <td>Style</td>
           <td><input type='text' name='style'  value="<%= request.getParameter("style") %>" ></td>
         </tr>
         <tr>
           <td>Type</td>
           <td><input type='text' name='type'  value="<%= request.getParameter("type") %>" ></td>
         </tr>
         <tr>
           <td>Weight</td>
           <td><input type='weight' name='weight'  value="<%= request.getParameter("weight") %>" ></td>
         </tr>
         <tr>
           <td>Price</td>
           <td><input type='text' name='price'  value="<%= request.getParameter("price") %>" ></td>
         </tr>
         <tr>
           <td>State</td>
           <td><input type='text' name='state'  value="<%= request.getParameter("price") %>"></td>
         </tr>
         <tr>
           <td><input type='submit' value='Update Jewellery' ></td>
         </tr>
      </table>
     </form>
</center>
</body>
</html>