<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<% String loginId = (String)session.getAttribute("loginId"); %>


<body bgcolor=yellow text=red>

<h1>Hi: <%=loginId %><center>Welcome to Employee Home page</center></h1>
<h3><center><a href='Profile.jsp'>View Employee Profile</a><br>
</center>

</body>
</html>