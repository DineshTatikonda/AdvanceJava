package com.rd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String name=request.getParameter("name");
     String password=request.getParameter("password");
     String mobile=request.getParameter("mobile");
     String dob=request.getParameter("dob");
     String address=request.getParameter("address");


     String driver="com.mysql.cj.jdbc.Driver";
     String url="jdbc:mysql://localhost:3306/test";
     String user="root";
     String pass="test123";
     try {
    	 Class.forName(driver);
    	 Connection connection=DriverManager.getConnection(url, user, pass);
    	String query="select count(*) from user where name = ? and password = ?";
    	PreparedStatement statement=connection.prepareStatement(query);
    	statement.setString(1, name);
    	statement.setString(2, password);
    	statement.setString(3, mobile);
    	statement.setString(4, dob);
    	statement.setString(5, address);

    	


    	ResultSet rs=statement.executeQuery();
    	int count=0;
    	if(rs.next()) {
    		count=rs.getInt(1);
    	}
    	if(count!=0) {
   		 RequestDispatcher dispatcher=request.getRequestDispatcher("success");
		 dispatcher.forward(request, response);


    		
    	}
    	 else {
    		 PrintWriter out=response.getWriter();
    		 out.print("<h1>Credentials Validated</h1>");
    		 RequestDispatcher dispatcher=request.getRequestDispatcher("fail");
    		 
    	 }
     }
    		 catch(Exception e) {
    			 System.out.println(e);
    		 }
    		 
    	 
    	 
 
	}

}
