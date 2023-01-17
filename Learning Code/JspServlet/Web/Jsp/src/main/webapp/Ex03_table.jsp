<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1행 10열  -->
	<table border=1 solid black>
		<tr>
			<%
			int num = 10;

			for (int i = 0; i < 10; i++) {
			%>
			<td><%=i + 1%></td>
			<%
			}
			%>
		</tr>
	</table>
</body>
</html>