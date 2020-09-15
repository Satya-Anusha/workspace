package com.web;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmpDAO;

import com.dto.Employee;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		session.setAttribute("loginId", loginId);


		out.print("<html>");
		if(loginId.equalsIgnoreCase("hr") && password.equalsIgnoreCase("hr")) {

			RequestDispatcher rd = request.getRequestDispatcher("HrHomePage.jsp");
			rd.include(request, response);
		}
		else {
			EmpDAO empDao = new EmpDAO();
			Employee emp = empDao.getEmployee(loginId,password);
			if(emp != null) {
				session.setAttribute("employee", emp);

				RequestDispatcher rd = request.getRequestDispatcher("EmpHomePage.jsp");
				rd.include(request, response);
			} else {
				out.print("<body bgcolor=yellow text=green>");
				out.print("<h1><center>InvalidCredintals</center></h1>");
				out.print("</body>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}

		}
		out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}