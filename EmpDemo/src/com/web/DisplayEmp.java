package com.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.Employee;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


@WebServlet("/DisplayEmp")
public class DisplayEmp extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
         
int empId=Integer.parseInt(request.getParameter("empId"));  
EmpDAO employeeDAO = new EmpDAO();
Employee employee = employeeDAO.getEmployee(empId);
if(employee != null) {
request.setAttribute("employee", employee);
RequestDispatcher rd = request.getRequestDispatcher("id.jsp");
rd.include(request, response);
}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}