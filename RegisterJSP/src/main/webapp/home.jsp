<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");


String driver="com.mysql.cj.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/test";
String user="root";
String pass="test123";
try {
	 Class.forName(driver);
	 Connection connection=DriverManager.getConnection(url, user, pass);
	String query="select count(*) from user where email = ? and password = ?";
	PreparedStatement statement=connection.prepareStatement(query);
	statement.setString(1, email);
	statement.setString(2, password);
	

	


	ResultSet rs=statement.executeQuery();
	int count=0;
	if(rs.next()) {
		count=rs.getInt(1);
	}
	if(count!=0) {
		 RequestDispatcher dispatcher=request.getRequestDispatcher("Register.html");
	     dispatcher.forward(request, response);


		
	}
	 else {
		 out.print("<h1>Credentials Validated</h1>");
		 RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
		 dispatcher.include(request, response);
		 
	 }
}
		 catch(Exception e) {
			 System.out.println(e);
		 }






%>>