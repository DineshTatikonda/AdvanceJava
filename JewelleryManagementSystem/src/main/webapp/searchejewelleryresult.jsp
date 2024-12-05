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
      <h1>Jewellery Management System</h1>
      <h1><a href="addjewellery.jsp">Add Jewellery</a></h1>
      <h1><a href="searchejewellery.jsp">Search Jewellery</a></h1>
      <h1><a href=" findAll">View Jewellery</a></h1>      
      <table border='1'>
          <tr>
              <th>Id</th>
              <th>Style</th>
              <th>Type</th>
              <th>Weight</th>
              <th>Price</th>
              <th>State</th>     
          </tr>
          <tr>
             <td>${jewellery.getId()}</td>
            <td>${jewellery.getStyle()}</td>
           <td>${jewellery.getType()}</td>
            <td>${jewellery.getWeight()}</td>
            <td>${jewellery.getPrice()}</td>
            <td>${jewellery.getState()}</td>
            
            </tr> 
      </table>
      
            </center>
      
      </form>

</body>
</html>