package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/check")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String username=request.getParameter("username");
	 String password=request.getParameter("password");
	 if(username.equals("admin") && password.equals("admin")) {
		 response.sendRedirect("Success.html");
	 }
	 else {
		 response.sendRedirect("Failure.html");

		 
	 }

	}

}