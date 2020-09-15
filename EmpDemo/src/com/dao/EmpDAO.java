package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db.DbConnection;
import com.dto.Employee;

public class EmpDAO  {
public Employee getEmployee(String loginId, String password) {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
String SELECT = "select * from employee where loginId = ? and password = ?";
con = DbConnection.getConnection();
try {
pst = con.prepareStatement(SELECT);
pst.setString(1, loginId);
pst.setString(2, password);
rs = pst.executeQuery();
if(rs.next()) {
Employee employee = new Employee();
employee.setEmpId(rs.getInt(1));
employee.setEmpName(rs.getString(2));
employee.setSalary(rs.getDouble(3));
employee.setLoginId(rs.getString(4));
employee.setPassword(rs.getString(5));
return employee;
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;
}

public int register(Employee emp) {
Connection con = null;
PreparedStatement pst = null;
String INSERT="insert into employee values(?,?,?,?,?)";
try {
con = DbConnection.getConnection();
pst = (PreparedStatement) con.prepareStatement(INSERT);

pst.setInt(1, emp.getEmpId());
pst.setString(2, emp.getEmpName());
pst.setDouble(3,emp.getSalary());
pst.setString(4, emp.getLoginId());
pst.setString(5, emp.getPassword());

int x = pst.executeUpdate();

return x;
} catch (SQLException e) {
e.printStackTrace();
}
return 0;

}
public Employee getEmployee(int empId) {



Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

String SELECT = "select * from employee where empId = ?";
con = DbConnection.getConnection();

try {
pst = con.prepareStatement(SELECT);
pst.setInt(1, empId);

rs = pst.executeQuery();
if(rs.next()){
Employee employee = new Employee();
employee.setEmpId(rs.getInt(1));
employee.setEmpName(rs.getString(2));
employee.setSalary(rs.getDouble(3));
employee.setLoginId(rs.getString(4));
return employee;
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;



}

public List<Employee> allDetails() {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

String SELECT = "SELECT * FROM employee";

con = DbConnection.getConnection();
try {
pst = con.prepareStatement(SELECT);

rs = pst.executeQuery();
List<Employee> empList = new ArrayList<Employee>();
while(rs.next()){
Employee emp = new Employee();
emp.setEmpId(rs.getInt(1));
emp.setEmpName(rs.getString(2));
emp.setSalary(rs.getDouble(3));
emp.setLoginId(rs.getString(4));


empList.add(emp);
}
return empList;
}catch (SQLException e){
e.printStackTrace();
}
return null;
}

}