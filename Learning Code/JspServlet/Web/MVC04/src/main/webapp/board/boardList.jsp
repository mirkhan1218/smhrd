<%@page import="java.util.List"%>
<%@page import="kr.board.dao.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="cpath" value="${pageContext.request.contextPath}"/>

<%
// String cpath = request.getContextPath();
// 객체바인딩된 list를 가져오기
// List<BoardVO> list = (List<BoardVO>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>${cpath}</h2>
		<div class="panel panel-default">
			<div class="panel-heading">BOARD</div>
			<div class="panel-body">
				<table class='table table-bordered table-hover'>
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
						<td><a href="${cpath}/boardDetail.do?idx=${vo.idx}">${vo.title}</a></td>
						<td>${vo.writer}</td>
						<td>${fn:split(vo.indate," ")[0]}</td>
						<td>${vo.count}</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="5">
							<button class="btn btn-sm btn-primary"
								onclick="location.href='${cpath}/boardWriteForm.do'">글쓰기</button>
						</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">인공지능 융합서비스 개발자과정(미리칸)</div>
		</div>
	</div>
</body>
</html>