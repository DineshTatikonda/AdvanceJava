package com.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/test";
			String user="root";
			String pass="test123";
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, pass);
			PrintWriter out=response.getWriter();
			if(conn!=null)
			out.print("<h1>Connect!</h1>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}