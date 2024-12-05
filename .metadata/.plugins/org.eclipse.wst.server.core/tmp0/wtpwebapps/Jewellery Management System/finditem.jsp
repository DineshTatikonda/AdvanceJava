<%@page import="com.model.Jewellery"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% Jewellery jl = (Jewellery) request.getAttribute("jl"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="Green">
     <center>
         <h1><font color='Gray'>Welcome Jewellery Management System</font></h1>
         <h1><a href='addjewellery.jsp'>Add Jewellery</a></h1>
         <h1><a href='viewjewellery'>View All Jewellery</a></h1>
         <h1><a href='searchjewellery.jsp'>Search Jewellery</a></h1>
         <hr>
           <% if (jl.getId() != 0) { %>
         
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Style</th>
                <th>Materialtype</th>
                <th>Weight</th>
                <th>Carats</th>
                 <th>Price</th>
                 <th>State</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <tr>
                <td><c:out value="${jewellery.id}"></c:out></td>
                <td><c:out value="${jewellery.style}"></c:out></td>
                <td><c:out value="${jewellery.materialtype}"></c:out></td>
                <td><c:out value="${jewellery.weight}"></c:out></td>
                <td><c:out value="${jewellery.carats}"></c:out></td>
                 <td><c:out value="${jewellery.price}"></c:out></td>
                 <td><c:out value="${jewellery.state}"></c:out></td>
                
                <td>
                    <a href="edititem.jsp?id=${jewellery.id}&style=${jewellery.style}&materialtype=${jewellery.materialtype}&weight=${jewellery.weight}&carats=${jewellery.carats}&price=${item.price}&state=${jewellery.state}">
                        Edit
                    </a>
                </td>
                <td>
                    <a href="deleteitem?id=${jewellery.id}">Delete</a>
                </td>
            </tr>
        </table>
        <% } else { %>
        <h1>Item not found...</h1>
        <% } %>
    </center>
</body>
</html>
     
     
     </center>
   

</body>
</html>