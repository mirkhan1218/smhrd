package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06_plus")
public class Ex06_plus extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 두 수 입력받기
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = num1 + num2;
		
		// 2. 웹에 출력하기
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(num1 + "과 " + num2 + "의 합은 " + sum + "입니다.");
	}

}
