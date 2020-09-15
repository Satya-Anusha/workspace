package com.web;

import java.util.List;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.Employee;

@WebServlet("/DisplayEmployee")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		EmpDAO  empdao = new EmpDAO();
        List<Employee> empList = empdao.allDetails();
		if(empList != null) {
			request.setAttribute("empList", empList);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayEmployee.jsp");
			rd.include(request, response);
			}
		
	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}