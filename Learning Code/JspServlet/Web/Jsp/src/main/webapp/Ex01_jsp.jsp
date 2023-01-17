<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp 기본문법</h1>
	<p>1. 스크립트릿 : Jsp문서 내에서 Java코드를 작성하기 위한 문법</p>
	<%
	// Java언어
	int a = 1;
	int b = 3;
	int result = a + b;
	System.out.println("a+b의 결과값 : " + result);
	%>

	<p>2. 표현식 : Web에 결과값을 출력하기 위해서 사용하는 문법</p>
	a+b의 결과값 : <%=result%>


</body>
</html>