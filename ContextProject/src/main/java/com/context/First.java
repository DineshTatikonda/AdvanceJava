package com.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		String driver=context.getInitParameter("driver");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String pass=context.getInitParameter("pass");
		PrintWriter out=response.getWriter();
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, pass);
			if(conn!=null) {
				out.print("<h1>connect!</h1>");
			}
			}
		catch(Exception e) {
			out.print(e);
		}



		
		
	}

}
