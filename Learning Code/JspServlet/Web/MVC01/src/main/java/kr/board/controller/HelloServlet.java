package kr.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.util.MyUtil;

// 웹에서 실행가능한 클래스 => 서블릿(Servlet)
@WebServlet("/hs.do")
public class HelloServlet extends HttpServlet {

	// override(재정의)
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 클라이언트 폼에서 넘어온 파라메터를 얻어오기
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		// 비즈니스(처리) 로직? Model(Java)
		// 객체생성
		MyUtil my = new MyUtil();
		int sum = my.hap(num1, num2);
		
		// MIME Type : Multipurpose Internet Mail Extensions
		resp.setContentType("text/html; charset = UTF-8");
		
		// 프리젠테이션 로직? => View(JSP)
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("총합 : " + sum);
		out.print("</body>");
		out.print("</html>");
		
	}

}
