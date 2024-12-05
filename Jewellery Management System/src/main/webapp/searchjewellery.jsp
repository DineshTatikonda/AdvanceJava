<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String status = (String) request.getAttribute("status"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <center>
        <h1>Welcome to Restaurant Management System</h1>
        <h1><a href='addjewellery.jsp'>Add Item</a></h1>
        <h1><a href='viewjewellery'>View All Items</a></h1>
        <h1><a href='searchjewellery.jsp'>Search item</a></h1>
        <hr>
        <form action='searchitem'>
            <table border='0'>
                 <% if(status != null){ %>
                    <tr>
                        <td colspan="2" class="status" align="center"><%= status %></td>
                    </tr>
                <% } %>
                 
                 
                  <tr>
                  
                    <td>Id</td>
                    <td><input type='text' name='id'></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type='submit' value='Search Item'>
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>

</html>