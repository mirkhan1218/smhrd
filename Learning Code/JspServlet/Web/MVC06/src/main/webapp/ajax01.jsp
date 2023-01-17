<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function go() {
		// alert("클릭했습니다.");
		// var msg = document.getElementById("msg");
		// msg.innerHTML = "클릭했습니다.";
		
		var su1 = parseInt(document.getElementById("su1").value);
		var su2 = parseInt(document.getElementById("su2").value);
		
		var sum = document.getElementById("msg");
		
		let total = 0;
		
		for(let i = su1; i <= su2; i++){
			total += i;
		}
		
		sum.innerHTML = "<font color='red'>" + total + "</font>";
		
	}
	
</script>
</head>
<body>
	<input type="text" id="su1"/> ~ <input type="text" id="su2"/>
	<input type="button" value="계산" onclick="go()" />
	<div id="msg"></div>
</body>
</html>