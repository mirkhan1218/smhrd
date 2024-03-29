<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="kr.board.dao.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	BoardVO vo = new BoardVO();
	vo.setIdx(1);
	vo.setTitle("TEST");
	vo.setWriter("관리자");
	vo.setIndate("2022-08-30");
	vo.setCount(0);
	List<BoardVO> list = new ArrayList<BoardVO>();
	list.add(vo);
	list.add(vo);
	list.add(vo);
	request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.idx}</td>
			<td>${vo.title}</td>
			<td>${vo.writer}</td>
			<td>${vo.indate}</td>
			<td>${vo.count}</td>
		</tr>	
		</c:forEach>	
	</table>
</body>
</html>