package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05_getData")
public class Ex05_getData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 데이터 받아오기
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		// 2. 웹에 출력하기
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println(name);
		System.out.println(age);
		
		out.print("제 이름은 " + name + "입니다</br>");
		out.print("제 나이은 " + age + "살 입니다");
		
	}

}
