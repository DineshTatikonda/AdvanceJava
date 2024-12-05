package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		out.print("<h1>Hello Welcome " + name +"<h1>");
		out.print("<h1><a href ='Java'>java</h1>");
		out.print("<h1><a href ='Python'>python</h1>");
		out.print("<h1><a href ='Springs'>springs</h1>");
		Cookie ck1=new Cookie("n",name);
		Cookie ck2=new Cookie("p",name);
		response.addCookie(ck1);
		response.addCookie(ck2);
			}

}
