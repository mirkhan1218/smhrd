package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04_get")
public class Ex04_get extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Ex04_send에서 보낸 데이터를 받는 곳
		
		// 1. 데이터 받아오기
		String data = request.getParameter("data");
		System.out.println("입력한 데이터 : " + data);
		
		// 한글로 받고 싶을 때 : get방식 인코딩
		// Servers폴더 - server.xml -> 63번째줄 Connector태그 -> URIEncoding="인코딩방식"
		// 
		
	}

}
