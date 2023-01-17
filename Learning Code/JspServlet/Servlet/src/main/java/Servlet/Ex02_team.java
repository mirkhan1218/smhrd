package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_team")
public class Ex02_team extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String client_ip = request.getRemoteHost();
		System.out.println("들어온 사람 : " + client_ip);

		String[] team_ip = { "0:0:0:0:0:0:0:1", "211.228.61.248", "59.0.234.211", "119.200.31.78", "221.48.213.140","211.63.240.71" };

		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();

		for (int i = 0; i < team_ip.length; i++) {

//			System.out.println(team_ip[i]);
//			System.out.println(i);

			if (client_ip.equals(team_ip[i])) {
				out.print("<h1>현성없는 현성팀</h1>");
				out.print("<h4> (+경주) </h4>");
				out.print("<h1>환영합니다.</h1>");
				out.print("<img src='img/IMG_5047.JPG' width = 300px>");
				
				break;
				
			} else if (i == team_ip.length - 1) {
				out.print("<h1>우리 팀 염탐하러 오셨군요~</h1>");
				out.print("<img src='img/Screenshot＿20210804－110333＿Instagram.jpg' width = 300px>");
			}

		}

	}

}
