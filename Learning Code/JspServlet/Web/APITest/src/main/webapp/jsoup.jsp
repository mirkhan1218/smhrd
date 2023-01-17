<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="cpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(()=>{
		$("#btn").click(()=>{
			$.ajax({
				url : "${cpath}/bible.do",
				type : "get",
				success : bibleHtml,
				error : function () {alert("error~!");}
			});
		});
	});
	function bibleHtml(data) {
		var bt = $(data).find(".bible_text").eq(0).text().trim();
		var bi = $(data).find(".bibleinfo_box").eq(0).text().trim();
		var list = $(data).find(".body_list > li");
		// var count = $(data).find(".body_list > li").length;
		
		
		var html = "<table class='table table-bordered'>";
		html += "<tr>";
		html += "<td>제목</td>";
		html += "<td>"+bt+"</td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td>본문</td>";
		html += "<td>"+bi+"</td>";
		html += "</tr>";
		
		$.each(list, function(index, obj) {
			var num = $(obj).find(".num").text().trim();
			var info = $(obj).find(".info").text().trim();
			html += "<tr>";
			html += "<td>"+num+"</td>";
			html += "<td>"+info+"</td>";
			html += "</tr>";
		});
		
		html += "</table>";
		$("#msg").html(html);
	}
</script>
</head>
<body>
	<button id="btn">데이터로드</button>
	<div id="msg">출력</div>
</body>
</html>