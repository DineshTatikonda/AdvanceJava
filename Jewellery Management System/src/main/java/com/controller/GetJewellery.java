package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.JewelleryDAO;
import com.model.Jewellery;

@WebServlet("/viewjewellery")
public class GetJewellery extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			JewelleryDAO jewelleries=new JewelleryDAO();
			try {
			List<Jewellery> jewellery=jewelleries.findAll();
			request.setAttribute("jewellery",jewellery);
			RequestDispatcher dispatcher=request.getRequestDispatcher("viewjewellery.jsp");
		    dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


		}

}
