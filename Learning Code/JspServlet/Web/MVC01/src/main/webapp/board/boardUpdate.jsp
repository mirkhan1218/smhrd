<%@page import="kr.board.dao.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
BoardVO vo = (BoardVO) request.getAttribute("vo");
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
		<h2>MVC01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">BOARD</div>
			<div class="panel-body">
				<form class="form-horizontal" action="/MVC01/boardUpdate.do"
					method="post">
					<input type="hidden" name="idx" value="<%=vo.getIdx()%>">
					<table class="table table-bordered">
						<tr>
							<td>제목</td>
							<td><input type="text" name="title"
								value="<%=vo.getTitle()%>"></td>
						</tr>
						<tr>
							<td>내용</td>
							<td><textarea rows="10" class="form-control" name="content"><%=vo.getContent()%></textarea></td>
						</tr>
						<tr>
							<td>작성자</td>
							<td><%=vo.getWriter()%></td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<button type="submit" class="btn btn-success btn-sm">수정</button>
								<button type="reset" class="btn btn-warning btn-sm" onclick="location.href='/MVC01/boardList.do'">취소</button>
								<button type="button" class="btn btn-info btn-sm"
									onclick="location.href='/MVC01/boardList.do'">리스트</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div class="panel-footer">인공지능 융합서비스 개발자과정(미리칸)</div>
		</div>
	</div>
</body>
</html>