<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
//	$(document).ready(function () {		// 익명함수
//		$("#btn").click(function () {
//			$("#msg").empty();
//			$("#msg").append("<font color='red'>클릭되었습니다.</font>");
//		});			// text, html
//	});

	$(document).ready(function () {		// 익명함수
		$("#btn").click(function () {
		var su1 = $("#su1").val();	
		var su2 = $("#su2").val();
		var sum = 0;
		
		for(let i = su1; i <= su2; i++){
			sum += parseInt(i);
		}
		//var sum = parseInt(su1) + parseInt(su2);
		$("#msg").html("<font color='red'>"+sum+"</font>");
		});
	});

</script>
</head>
<body>
<input type="text" id="su1"/>+<input type="text" id="su2"/>
<input type="button" value="클릭" id="btn"/>
<div id="msg"></div>
</body>
</html>