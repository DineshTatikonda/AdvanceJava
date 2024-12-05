package com.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	private String msg="";
	public void init(ServletConfig config) throws ServletException {
		msg=msg + "init() called";
	}

	
	public void destroy() {
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		msg=msg + "service() called";
		PrintWriter out=response.getWriter();
		out.print(msg);

	}

}
