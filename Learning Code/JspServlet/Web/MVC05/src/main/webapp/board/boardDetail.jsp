<%@page import="kr.board.dao.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<c:set var="newLine" value="<%='\n'%>"/>

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
<script type="text/javascript">
	function goDel(idx) {
		location.href="${cpath}/boardDelete.do?idx="+idx;
	}
	function goUpdate(idx) {
		location.href="${cpath}/boardUpdateForm.do?idx="+idx;
	}
</script>
</head>
<body>
	<div class="container">
		<h2>${cpath}</h2>
		<div class="panel panel-default">
			<div class="panel-heading">BOARD</div>
			<div class="panel-body">
				<table class="table table-bordered">
					<tr>
						<td width="70px">제목</td>
						<td>${vo.title}</td>
					</tr>
					<tr>
						<td>내용</td>
						<td>${fn:replace(vo.content, newLine, "<br>")}</td>
					</tr>
					<tr>
						<td>작성자</td>
						<td>${vo.writer}</td>
					</tr>
					<tr>
						<td>작성일</td>
						<td>${fn:split(vo.indate," ")[0]}</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<c:if test="${mvo.memId eq vo.memId}">
							<button class="btn btn-sm btn-success" onclick="goUpdate(${vo.idx})">수정</button>
							<button class="btn btn-sm btn-warning" onclick="goDel(${vo.idx})">삭제</button>
						</c:if>
						<c:if test="${mvo.memId ne vo.memId}">
							<button class="btn btn-sm btn-success" disabled="disabled" onclick="goUpdate(${vo.idx})">수정</button>
							<button class="btn btn-sm btn-warning" disabled="disabled" onclick="goDel(${vo.idx})">삭제</button>
						</c:if>
							<button class="btn btn-sm btn-info"
								onclick="location.href='${cpath}/boardList.do'">리스트</button>
						</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">인공지능 융합서비스 개발자과정(미리칸)</div>
		</div>
	</div>
</body>
</html>