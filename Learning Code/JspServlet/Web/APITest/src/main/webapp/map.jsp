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
			var address = $("#address").val();
			$.ajax({
				url : "${cpath}/map.do",
				type : "post",
				data : {"address" : address},
				dataType : "xml", // 서버가 보내주는 dataType 기본은 text
				success : mapHtml,
				error : function(){alert("error~!");}
			});
		});
	});
	function mapHtml(data) {
		alert(data);
	}
</script>
</head>
<body>
	<table class="table">
	<tr>
		<td>주소입력</td>
		<td><input type="text" name="address" id="address" class="form-control"></td>
		<td><button id="btn">지도보기</button></td>
	</tr>
	</table>
	<div id="msg">지도출력</div>
</body>
</html>