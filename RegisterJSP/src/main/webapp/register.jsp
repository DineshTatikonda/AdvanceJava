<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="obj" class="com.beans.Student"></jsp:useBean>  
 <jsp:setProperty property="*" name="obj"/>    
<% 
                
        
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String pass="test123";
        try{
        	Class.forName(driver);
        	Connection connection=DriverManager.getConnection(url,user,pass);
        	String check="select count(*) from user where email= ?";
        	PreparedStatement cps=connection.prepareStatement(check);
        	cps.setString(1, obj.getEmail());
        	ResultSet set=cps.executeQuery();
        	int count=0;
        	if(set.next()){
        		count=set.getInt(1);
        		
        	}
        	if(count == 0){
        		String query="insert into user values(?,?,?,?,?)";
        		PreparedStatement ps=connection.prepareStatement(query);
        		ps.setString(1,obj.getName());
        		ps.setString(2,obj.getEmail());
        		ps.setString(3,obj.getPassword());
        		ps.setString(4,obj.getGender());
        		ps.setString(5,obj.getAddress());
              
        		ps.executeUpdate();
        		%>
        		<center><h1>Registration Complete please login</h1></center>
        		
        		<jsp:include page="login.html"></jsp:include>
        	<% }
        	else{
        		out.print("<h1>User Already Exist.....</h1>");
        		%>
        		<jsp:include page="Register.html"></jsp:include>
        	<%}
        }
        
    
        catch(Exception e){
        	out.print(e);
        	
        }
        
        




%>