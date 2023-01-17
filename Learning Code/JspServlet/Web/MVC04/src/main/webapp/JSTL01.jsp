<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="5" step="1">
	<font size="${i}">야호~</font><br/>
</c:forEach>

<c:set var="a" value="9"/>
<c:if test="${a%2==0}">
	${a}는 짝수입니다.
</c:if>
<c:if test="${a%2!=0}">
	${a}는 홀수입니다.
</c:if>
</body>
</html>