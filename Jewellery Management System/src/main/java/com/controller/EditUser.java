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


@WebServlet("/edituser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Jewellery jewellery = new Jewellery();
		jewellery.setId(Integer.parseInt(request.getParameter("id")));
		jewellery.setStyle(request.getParameter("style"));
		jewellery.setMaterialtype(request.getParameter("materialType"));
		jewellery.setWeight(request.getParameter("weight"));
		jewellery.setCarats(request.getParameter("carats"));
	    jewellery.setPrice(request.getParameter("price"));
		jewellery.setState(request.getParameter("state"));
		JewelleryDAO dao = new JewelleryDAO();
		try {
			boolean status = dao.edit(jewellery);

			if(status) {
				dao.commit();
				request.setAttribute("status", "Jewellery updated");
			}
			else {
				dao.rollback();
				request.setAttribute("status", "Jewellery not updated");
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewjewellery.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
