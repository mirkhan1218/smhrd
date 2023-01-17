<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="cpath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() { // 익명함수
		$("#btn").click(function() {
			$.ajax({
				url : "${cpath}/boardListAjax.do",
				type : "get",
				success : result,
				error : function() {
					alert("error~!");
				}

			});
		});
	});
	// callback 함수 : 서버로부터 받은 데이터를 처리
	function result(data) {
		var html = "<table border='1'>";
		html += "<tr>";
		html += "<td>번호</td>";
		html += "<td>제목</td>";
		html += "<td>작성자</td>";
		html += "<td>작성일</td>";
		html += "<td>조회수</td>";
		html += "</tr>";
		$.each(data, function(index, obj) {
			html += "<tr>";
			html += "<td>"+obj.idx+"</td>";
			html += "<td>"+obj.title+"</td>";
			html += "<td>"+obj.writer+"</td>";
			html += "<td>"+obj.indate+"</td>";
			html += "<td>"+obj.count+"</td>";
			html += "</tr>";
		});

		html += "</table>";
		$('#msg').html(html);
	}
	
</script>
</head>
<body>
	<input type="button" value="클릭" id="btn" />
	<div id="msg">여기에 게시판 리스트를 출력하시오.</div>
</body>
</html>