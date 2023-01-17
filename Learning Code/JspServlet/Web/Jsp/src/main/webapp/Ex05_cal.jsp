<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1. Ex05_cal.html에서 입력한 데이터 받아와서
	2. +, -, *, /를 계산하는 메소드를 선언
	3. 해당 메소드 결과를 Web에 출력
-->
<%
	// 1. 입력한 데이터 받아오기
	int num1 = Integer.parseInt(request.getParameter("num1")) ;
	int num2 = Integer.parseInt(request.getParameter("num2")) ;
%>
<%!
	// 2. 메소드 선언
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int minus(int num1, int num2){
		return num1-num2;
	}
	
	public int multi(int num1, int num2){
		return num1*num2;
	}
	
	public int div(int num1, int num2){
		return num1/num2;
	}
%>
<!-- 3. Web에 출력 -->
<%= num1 %> + <%= num2 %> = <%= add(num1, num2) %> <br>
<%= num1 %> - <%= num2 %> = <%= minus(num1, num2) %> <br>
<%= num1 %> * <%= num2 %> = <%= multi(num1, num2) %> <br>
<%= num1 %> / <%= num2 %> = <%= div(num1, num2) %> <br>

</body>
</html>