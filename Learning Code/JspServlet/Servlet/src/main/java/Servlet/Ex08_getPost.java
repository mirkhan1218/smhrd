package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08_getPost")
public class Ex08_getPost extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// post방식 디코딩
		// 데이터가 들어있는 request 객체에 디코딩 방식 지정
		request.setCharacterEncoding("UTF-8");
		
		String method = request.getMethod();
		System.out.println("방식 : " + method);
		
		String data = request.getParameter("data");
		System.out.println("data : " + data);
		
	}

}
