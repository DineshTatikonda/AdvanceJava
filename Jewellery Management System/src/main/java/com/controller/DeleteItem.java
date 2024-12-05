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

/**
 * Servlet implementation class DeleteItem
 */
@WebServlet("/deleteitem")
public class DeleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		JewelleryDAO dao=new JewelleryDAO();
		try {
			boolean status = dao.deleteById(id);
			if(status) {
				dao.commit();
				request.setAttribute("status", "Deleted successfully...");
			}
			else {
				dao.rollback();
				request.setAttribute("status", "not deleted...");
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewjewellery");
			dispatcher.forward(request, response);
			       
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		

	}

}
