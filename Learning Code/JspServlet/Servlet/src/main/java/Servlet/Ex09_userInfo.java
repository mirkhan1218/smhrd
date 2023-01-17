package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09_userInfo")
public class Ex09_userInfo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// post방식 디코딩
		request.setCharacterEncoding("UTF-8");

		// 데이터 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String rpw = request.getParameter("rpw");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birth = request.getParameter("birth");
		String[] sport = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String talk = request.getParameter("talk");

		// 웹에 출력
		// 응답할 페이지에 대한 설정
		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();
		
		out.print("id : " + id + "<br>");
		out.print("pw : " + pw + "<br>");
		out.print("rpw : " + rpw + "<br>");
		out.print("성별 : " + gender + "<br>");
		out.print("blood : " + blood + "<br>");
		out.print("birth : " + birth + "<br>");
		out.print("sport :");
		
		for (int i = 0; i < sport.length; i++) {
			out.print(" " + sport[i]);
		}
		out.print("<br>");
		out.print("color : " + color + "<br>");
		out.print("talk : " + talk + "<br>");

	}

}
