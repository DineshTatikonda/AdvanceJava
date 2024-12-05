package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.model.Employee;


@WebServlet("/saveuser")
public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              Employee emp=new Employee();
              emp.setName(request.getParameter("name"));
              emp.setEmail(request.getParameter("email"));
              emp.setGender(request.getParameter("gender"));
              emp.setDept(request.getParameter("department"));
              emp.setSalary(request.getParameter("salary"));
              emp.setMobile(request.getParameter("mobile"));
              emp.setAddress(request.getParameter("address"));
              EmployeeDAO dao=new EmployeeDAO();
             try {
				boolean status= dao.save(emp);
				if(status) {
					dao.commit();
					request.setAttribute("status", "Employee Added...");
				}
				else {
					dao.rollback();
					request.setAttribute("status", "Employee Not Added...");

				}
				RequestDispatcher dispatcher=request.getRequestDispatcher("addemp.jsp");
				dispatcher.forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
}
