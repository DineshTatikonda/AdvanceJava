package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.JewelleryDAO;
import com.model.Jewellery;



@WebServlet("/searchitem")
public class SearchItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Object jewelleries = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id").trim());
		JewelleryDAO dao = new JewelleryDAO();
		try {
			Jewellery item = dao.findById(id);
			request.setAttribute("jewellery", jewelleries);
			RequestDispatcher dispatcher = request.getRequestDispatcher("finditem.jsp");
			dispatcher.forward(request, response);
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}