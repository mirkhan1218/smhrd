<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>두 수 사이의 총합 구하기</h2>
  <form class="form-inline" action="/MVC01/hs.do" method="post">
    <div class="form-group">
      <label for="num1">num1:</label>
      <input type="text" class="form-control" placeholder="num1을 입력하세요" name="num1">
    </div>
    <div class="form-group">
      <label for="num2">num2:</label>
      <input type="text" class="form-control" placeholder="num2를 입력하세요" name="num2">
    </div>
    <button type="submit" class="btn btn-info">계산</button>
  </form>
</div>

</body>
</html>