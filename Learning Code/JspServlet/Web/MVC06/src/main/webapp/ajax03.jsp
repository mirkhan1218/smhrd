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
	$(document).ready(function () {		// 익명함수
		$("#btn").click(function () {
			var su1 = $("#su1").val();
			var su2 = $("#su2").val();
			
			// server(Flask)와 통신 => calc.do : CalcController
			// $.ajax({}); => jquery-3.6.1.min.js에 있는 함수를 바로 쓸때
			// 			   => 비동기식 전송 함수
			$.ajax({
				url : "${cpath}/calc.do",
				type : "get",
				data : {"su1":su1, "su2":su2},
				success : result,
				error : function(){ alert("error"); }
			});
		});
	});
	// callback 함수 : 서버로부터 받은 데이터를 처리
	function result(data) {
		$("#msg").html("<font color='blue'>"+data+"</font>");
	}

</script>
</head>
<body>
<input type="text" id="su1"/>+<input type="text" id="su2"/>
<input type="button" value="클릭" id="btn"/>
<div id="msg"></div>
</body>
</html>