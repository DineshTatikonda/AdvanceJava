package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/springs")
public class Springs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String name=(String)session.getAttribute("name");
		String email=(String)session.getAttribute("email");
	    PrintWriter out=response.getWriter();	
	    out.print("<h1>Welcome : "+name+" : " +email+"</h1>");
	    out.print("<h1>"+session.getId()+"</h1>");
	    out.print("<h1>this is springs tutorial</h1>");
	    out.print("<h1><a href='home'>Home</h1>");
	    out.print("<h1><a href='java'>Java</h1>");
	    out.print("<h1><a href='python'>Python</h1>");
	    out.print("<h1><a href='springs'>Springs</h1>");
	    out.print("<h1><a href='logout'>Logout</h1>");

	
	}

}
