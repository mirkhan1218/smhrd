package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping : Servlet을 대체하는 문자열
@WebServlet("/Ex01_request_response")
								// HttpServlet클래스를 상속받음
public class Ex01_request_response extends HttpServlet {
				// Java의 main메소드와 같은 역할
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. request객체 : 사용자가 요청을 했을 때, 요청에 대한 정보를 담고 있는 객체
		// ex) 요청이 들어온 주소, 요청 시 작성한 데이터(id, pw 등)
		
		// 실습1. 내 servlet에 요청이 들어온 ip주소 확인해보기
		String client_ip = request.getRemoteHost();
		System.out.println("들어온 사람 : " + client_ip);
		
		// 2. respose객체 : 사용자에게 응답할 때 사용하는 객체
		// ex> html문서, text, 페이지 이동
		
		// 응답할 html문서에 대한 설정
		response.setContentType("text/html; charset = UTF-8");
		
		// 웹에 출력하기
		PrintWriter out = response.getWriter();
		out.print("안녕하세요~!");
		out.print("<h1> 미리칸의 페이지입니다. </h1>");
		
		// Servlet이 실행되는 위치 : webapp
		// ./ : 현재폴더
		// ../ : 상위폴더
		// / : 최상위폴더
		out.print("<img src='img/텅텅.jpg' width = 200px>");
		
	}

}
