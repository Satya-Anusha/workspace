<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.dto.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="EmpHomePage.jsp"/>

<table align = center border=2>
   <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Salary</th>
   </tr>
   <tr>
      <td>${employee.empId}</td>
      <td>${employee.empName}</td>
      <td>${employee.salary}</td>
   </tr>
</table>

</body>
</html>