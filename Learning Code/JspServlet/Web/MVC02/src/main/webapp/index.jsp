<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String cpath = request.getContextPath();
response.sendRedirect(cpath + "/boardList.do");
%>