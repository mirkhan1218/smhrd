<%@ page import="java.util.List"%>
<%@ page import="kr.board.dao.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="cpath" value="${pageContext.request.contextPath}" />
<c:set var="newLine" value="<%='\n'%>" />

<%
// String cpath = request.getContextPath();
// 객체바인딩된 list를 가져오기
// List<BoardVO> list = (List<BoardVO>) request.getAttribute("list");
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
function contentView(idx){
	if($("#ct"+idx).css("display")!="none"){
		$("#ct"+idx).css("display","none");
	}else{
		$("#ct"+idx).css("display","table-row");
		$.ajax({
			url : "${cpath}/boardCountUpdate.do",
			type : "get",
			data : {"idx":idx},
			success : function(count){
				// 조회수를 출력
				$("#c"+idx).text(count);
			},
			error : function(){alert("error~!");}
		});
	}
	$("#ta"+idx).attr("readonly", true);
}
function goDel(idx){
	$.ajax({
		url : "${cpath}/boardDelete.do",
		type : "get",
		data : {"idx":idx},
		success : function(){
			// 메인페이지로 feflash
			location.href="${cpath}/boardList.do";
		},
		error : function(){alert("error~!");}
	});
}
function goUpdateForm(idx){
	$("#ta"+idx).attr("readonly", false);
	var tmpTitle = $("#t"+idx).text();
	var newTitle = "<input type='text' id='nt"+idx+"' class='form-control' value='"+tmpTitle+"'/>";
	$("#t"+idx).html(newTitle);
	var newBtn = "<button calss='btn btn-sm btn-primary' onclick='goUpdate("+idx+")'>수정하기</button>";
	$("#b"+idx).html(newBtn);
}
function goUpdate(idx){
	var title = $("#nt"+idx).val();
	var content = $("#ta"+idx).val();
	$.ajax({
		url : "${cpath}/boardUpdate.do",
		type : "post",
		data : {"idx":idx, "title":title, "content":content},
		success : function(){
			location.href="${cpath}/boardList.do"
		},
		error : function(){alert("error~!");}
	});
}
function goWrite(){
	$("#vfrm").css("display","none")
	$("#wfrm").css("display","block")
}
function goInsert(){
	// frm -> memId, title, content, writer
	var frmData = $("#frm").serialize();
	// alert(frmData);
	$.ajax({
		url : "${cpath}/boardWrite.do",
		type : "post",
		data : frmData,
		success : function(){
			location.href="${cpath}/boardList.do";
		},
		error : function(){alert("error~!");}
	});
}
</script>
</head>
<body>
	<div class="container">
		<h2>${cpath}</h2>
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:if test="${empty mvo}">
					<form class="form-inline" action="${cpath}/login.do">
						<div class="form-group">
							<label for="memId">ID:</label> <input type="text"
								class="form-control" name="memId">
						</div>
						<div class="form-group">
							<label for="memPwd">Password:</label> <input type="password"
								class="form-control" name="memPwd">
						</div>
						<button type="submit" class="btn btn-default">로그인</button>
					</form>
				</c:if>
				<c:if test="${!empty mvo}">
					<form class="form-inline" action="${cpath}/logout.do">
						<div class="form-group">
							<label>${mvo.memName}님 환영합니다.</label>
						</div>
						<button type="submit" class="btn btn-default">로그아웃</button>
					</form>
				</c:if>
			</div>
			<div id="vfrm" class="panel-body">
				<table class='table table-bordered table-hover'>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>작성일</td>
						<td>조회수</td>
					</tr>
					<c:forEach var="vo" items="${list}">
						<tr>
							<td>${vo.idx}</td>
							<td id="t${vo.idx}"><a
								href="javascript:contentView(${vo.idx})">${vo.title}</a></td>
							<td>${vo.writer}</td>
							<td>${fn:split(vo.indate," ")[0]}</td>
							<td id="c${vo.idx}">${vo.count}</td>
						</tr>
						<tr id="ct${vo.idx}" style="display: none">
							<td>내용</td>
							<td colspan="4"><textarea id="ta${vo.idx}" rows="7"
									readonly="readonly" class="form-control">${vo.content}</textarea>
								<br> <c:if test="${!empty mvo && vo.memId eq mvo.memId}">
									<span id="b${vo.idx}"><button
											class="btn btn-sm btn-success"
											onclick="goUpdateForm(${vo.idx})">수정</button></span>
									<button class="btn btn-sm btn-warning"
										onclick="goDel(${vo.idx})">삭제</button>
								</c:if> <c:if test="${empty mvo || vo.memId ne mvo.memId}">
									<button disabled="disabled" class="btn btn-sm btn-success">수정</button>
									<button disabled="disabled" class="btn btn-sm btn-warning">삭제</button>
								</c:if></td>
						</tr>
					</c:forEach>
					<c:if test="${!empty mvo}">
						<tr>
							<td colspan="5">
								<button class="btn btn-sm btn-primary" onclick="goWrite()">글쓰기</button>
							</td>
						</tr>
					</c:if>
				</table>
			</div>
			<div id="wfrm" class="panel-body" style="display: none">
				<form id="frm" class="form-horizontal">
					<input type="hidden" name="memId" value="${mvo.memId}" />
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="title"
								placeholder="Enter title">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="content">내용:</label>
						<div class="col-sm-10">
							<textarea rows="10" class="form-control" name="content"></textarea>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="writer">작성자:</label>
						<div class="col-sm-10">
							<input type="text" readonly="readonly" class="form-control"
								name="writer" value="${mvo.memName}">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="button" class="btn btn-sm btn-success" onclick="goInsert()">등록</button>
							<button type="reset" class="btn btn-sm btn-info"
								onclick="location.href='${cpath}/boardList.do'">취소</button>
							<button type="button" class="btn btn-info btn-sm"
								onclick="location.href='${cpath}/boardList.do'">리스트</button>
						</div>
					</div>
				</form>
			</div>
			<div class="panel-footer">인공지능 융합서비스 개발자과정(미리칸)</div>
		</div>
	</div>
</body>
</html>