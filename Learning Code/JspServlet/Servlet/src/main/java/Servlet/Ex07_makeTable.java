package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07_makeTable")
public class Ex07_makeTable extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String color = request.getParameter("color");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<style> td{ background-color : " + color + " }</style>");
		out.print("<table border=\"1px solid black\" align=\"center\"><br>");
		for (int j = num1; j <= num2; j++) {
			out.print("<tr align=\"center\">");
			for (int i = 0; i < 9; i++) {
				out.print("<td>");
				out.print(j + " * " + (i + 1) + " = " + (j * (i + 1)));
				out.print("</td>");
			}
			out.print("</tr>");
		}
		out.print("</td></table>");
	}

}
