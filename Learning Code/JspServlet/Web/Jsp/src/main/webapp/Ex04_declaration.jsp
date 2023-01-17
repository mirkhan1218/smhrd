<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp문법</h1>
	<p>3. 선언문 : static 변수나 메소드 등 클래스 영역에 선언하기 위해서 사용</p>
	<%!// 합을 구하는 메소드
	public int addNumber(int num1, int num2) {
		return num1 + num2;
	}%>

	<%
	int result = addNumber(1, 2);
	System.out.println(result);
	%>
	
	<%=result %>
	<%=addNumber(1, 2) %>
</body>
</html>