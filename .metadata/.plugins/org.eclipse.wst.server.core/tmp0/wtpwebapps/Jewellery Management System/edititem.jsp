<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%   String status = (String)request.getAttribute("status");%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Employee</title>
    
</head>
<body>
	<center>
		
		<h1>Welcome to Employee Management System</h1>
		
		<h3><a href = "addjewellery.jsp">Add Employee</a></h3>
		<h3><a href = "viewjewellery">View all Employees</a></h3>
		<h3><a href = "searchjewellery.jsp">Search Employee</a></h3>
	</center>
   
        <form action='edititem'>
            <table>
                <% if (status != null) { %>
                <tr>
                    <td colspan='2' align='center'><%= status %></td>
                </tr>
                <% } %>
                <tr>
                    <td>ID</td>
                    <td><input type='text' name='id' value='<%= request.getParameter("id") %>'></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type='text' name='name' value='<%= request.getParameter("name") %>'></td>
                </tr>
                <tr>
                    <td>Material Type</td>
                    <td>
                        <input type='radio' name='materialtype' name='gold' 
                               <%= "gold".equals(request.getParameter("materialtype"))   %>> gold
                        <input type='radio' name='materialtype' name='diamond' 
                               <%= "diamond".equals(request.getParameter("materialtype"))  %>> diamond
                    </td>
                </tr>
                <tr>
                    <td>Weight</td>
                    <td><input type='text' name='weight' value='<%= request.getParameter("weight") %>'></td>
                </tr>
               
                <tr>
                    <td>Carats</td>
                    <td><input type='text' name='carats' value='<%= request.getParameter("carats") %>'></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type='text' name='state' value='<%= request.getParameter("price") %>'></td>
                </tr>
                <tr>
                    <td>State</td>
                    <td><input type='text' name='price' value='<%= request.getParameter("state") %>'></td>
                </tr>
                <tr>
                    <td colspan='2'><input type='submit' value='Update Item'></td>
                </tr>
            </table>
        </form>
    </center>
</body>