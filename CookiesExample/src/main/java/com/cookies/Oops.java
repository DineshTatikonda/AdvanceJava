package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/java")
public class Oops extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Cookie ck[]=request.getCookies();
			String name=ck[0].getValue();
			PrintWriter out=response.getWriter();
			out.print("<h1>Hello Welcome " +name+"<h1>");
			out.print("<h1>This is java tutorial <h1>");
			out.print("<h1><a href ='java'>Java</h1>");
			out.print("<h1><a href ='python'>Python</h1>");
			out.print("<h1><a href ='springs'>Springs</h1>");


			}

}
