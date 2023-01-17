<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1~100까지의 합을 구해서 Web에 출력하기</h1>
	<%
	int sum = 0;

	for (int i = 0; i < 100; i++) {
		sum += (i + 1);
	}
	System.out.println(sum);
	%>
	<h1>
	1 ~ 100까지의 합 :
	<%=sum%>
	</h1>

</body>
</html>