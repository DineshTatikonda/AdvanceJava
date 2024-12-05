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


@WebServlet("/saveitem")
public class SaveItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Jewellery jl=new Jewellery();
		jl.setStyle(request.getParameter("style"));
		jl.setMaterialtype(request.getParameter("materialtype"));
		jl.setWeight(request.getParameter("weight"));
		jl.setCarats(request.getParameter("carats"));
		jl.setPrice(request.getParameter("price"));
		jl.setState(request.getParameter("state"));
         JewelleryDAO obj=new JewelleryDAO();
        		 try {
			boolean status=obj.save(jl);
			if(status) {
				obj.commit();
				request.setAttribute("status", "Jewellery Added.....");
			}
			else {
				obj.rollback();
				request.setAttribute("status", "Jewellery not added.....");

			}
            RequestDispatcher dispatcher=request.getRequestDispatcher("addjewellery.jsp");
			dispatcher.forward(request, response);

 		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
 		}
	}
}
		

		
		
        
