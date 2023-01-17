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
<script type="text/javascript">
	function goDel(idx) {
		location.href="/MVC01/boardDelete.do?idx="+idx;
	}
	function goUpdate(idx) {
		location.href="/MVC01/boardUpdateForm.do?idx="+idx;
	}
</script>
</head>
<body>
	<div class="container">
		<h2>MVC01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">BOARD</div>
			<div class="panel-body">
				<table class="table table-bordered">
					<tr>
						<td width="70px">제목</td>
						<td><%=vo.getTitle()%></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><%=vo.getContent().replaceAll("\n", "<br>")%></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><%=vo.getWriter()%></td>
					</tr>
					<tr>
						<td>작성일</td>
						<td><%=vo.getIndate().split(" ")[0]%></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<button class="btn btn-sm btn-success" onclick="goUpdate(<%=vo.getIdx()%>)">수정</button>
							<button class="btn btn-sm btn-warning" onclick="goDel(<%=vo.getIdx()%>)">삭제</button>
							<button class="btn btn-sm btn-info"
								onclick="location.href='/MVC01/boardList.do'">리스트</button>
						</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">인공지능 융합서비스 개발자과정(미리칸)</div>
		</div>
	</div>
</body>
</html>