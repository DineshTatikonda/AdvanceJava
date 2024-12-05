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


@WebServlet("/save")
public class Register extends HttpServlet {
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
	     PrintWriter out=response.getWriter();
	     try {
	    	 Class.forName(driver);
	    	 Connection connection=DriverManager.getConnection(url, user, pass);
	    	
	    	String checkquery="select count(*) from user1 where name= ?";
	    	PreparedStatement cps=connection.prepareStatement(checkquery);
	    	cps.setString(1, name);
	    	ResultSet rs=cps.executeQuery();
	    	int count=0;
	    	if(rs.next()) {
	    	
	    		count=rs.getInt(1);
	    	}
	    	if(count==0) {
	    	 String query="insert into user1 values (?,?,?,?,?)";
	    	PreparedStatement ps=connection.prepareStatement(query);
	    	ps.setString(1, name);
	    	ps.setString(2, password);
	    	ps.setString(3, mobile);
	    	ps.setString(4, dob);
	    	ps.setString(5, address);
	    	ps.executeUpdate();
	    	out.print("<h1>Registered Successfull");
	   		 RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
	   		 dispatcher.include(request, response);
	    	
	    	}
	    	else {
	    		out.print("<h1>User Already exist</h1>");
		   		 RequestDispatcher dispatcher=request.getRequestDispatcher("Register.html");
		   		 dispatcher.include(request, response);

	    		
	    	}
	     }
	    	 catch(Exception e) {
	    		 System.out.println(e);
	    		 
	    	 }
	     }




	
}
