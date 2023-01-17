<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
public int total(int a, int b){
	return a+b;
}
%>
<%-- JSP주석 --%>
<%
	Date d = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	현재시간 : <%= d.toString() %>
	<br>
	<%= total(10,50) %>
</body>
</html>