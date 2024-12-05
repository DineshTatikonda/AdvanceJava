<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String status=(String)request.getAttribute("status");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#365588">
       <center>
      <h1><font color='#fadfad'>Welcome Jewellery Management System</font></h1>
         <h1><a href='addjewellery.jsp'>Add Jewellery</a></h1>
         <h1><a href='viewjewellery.jsp'>View All Jewellery</a></h1>
         <h1><a href='searchjewellery.jsp'>Search Jewellery</a></h1>
         <hr>
         <form action="saveitem">
              <table border='1'>
                 
                 <tr>
                   <td>Style</td>
                   <td><input type='text' name='style'/></td>
                 </tr>
                <tr>
            <td>Materialtype</td>
                <td>
                      <select name='materialtype'>
                        <option name ="Gold">Gold</option>
                        <option name ="Diamond">DIAMOND</option>
                   </select>
                   </td>   
        </tr>
                 <tr>
                 <td>Weight</td>
                      <td><input type='text' name='weight'></td>
                 </tr>
                 <tr>
                 <td>Carats</td>
                 <td><input type='text' name='carats'></td>
                 </tr>
                 
                   <tr>
                     <td>Price</td>
                     
                 <td><input type='text' name='price'></td>
                     
                    
                   </tr>
                   <tr>
                     <td>State</td>
                     
                 <td><input type='text' name='state'></td>
                     
                    
                   </tr>
                   
                   <tr>
                  <td colspan='2' align='center'><input type='submit' value="Add Jewellery"></td>
                   </tr> 
              </table>
         </form>
       </center>
</body>
</html>