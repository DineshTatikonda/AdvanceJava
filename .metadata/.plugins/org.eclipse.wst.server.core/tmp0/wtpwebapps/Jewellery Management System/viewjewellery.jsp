<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body bgcolor="#E5E4E2 ">
	<center>
		
		<h1>Welcome to Jewellery Management System</h1>
		
		<h3><a href = "addjewellery.jsp">Add Jewellery</a></h3>
		<h3><a href = "viewjewellery">View all Jewellery</a></h3>
		<h3><a href = "searchjewellery.jsp">Search Jewellery</a></h3>
		<hr>
		<table border = 1 bgcolor = "white">
		<tr>
			<th>ID</th>
			<th>Style</th>
			<th>Materialtype</th>
			<th>Weight</th>
			<th>Carats</th>
			<th>Price</th>
			<th>State</th>
			<th>Edit</th>
			<th>Delete</th>
			
			
		
		</tr>
		<c:forEach items="${jewellery}" var="jewellery">
		
			<tr>
				<td><c:out value="${jewellery.id}"></c:out></td>
				<td><c:out value="${jewellery.style}"></c:out></td>
				<td><c:out value="${jewellery.materialType}"></c:out></td>
				<td><c:out value="${jewellery.weight}"></c:out></td>
				<td><c:out value="${jewellery.carats}"></c:out></td>
				<td><c:out value="${jewellery.price}"></c:out></td>
				<td><c:out value="${jewellery.state}"></c:out></td>
				<td><a href='edititem.jsp?id=${jewellery.id}&style=${jewellery.style}&materialType=${jewellery.materialType}&weight=${jewellery.weight}&carats=${jewellery.carats}&price=${emp.price}&state=${jewellery.state}'>Edit</a></td>
				<td><a href ='deleteitem?id=${jewellery.id}&name=${jewellery.style}&materialType=${jewellery.materialType}&weight=${jewellery.weight}&carats=${jewellery.carats}&price=${jewellery.carats}&state=${jewellery.state}'>Delete</a></td>
			</tr>
		</c:forEach>
		</table>
		
	</center>
</body>