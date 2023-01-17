package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet을 대체하는 문자열(필수)
@WebServlet("/HelloWeb")
public class Ex03_urlMapping extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().print("<h1> URL Mapping </h1>");
		
		
	}

}
