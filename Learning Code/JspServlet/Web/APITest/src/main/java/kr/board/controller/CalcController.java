package kr.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// su1, su2 => su1 ~ su2 =?
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		
		int sum = su1 + su2;
		
		PrintWriter out = response.getWriter();
		out.println(sum);
		
		return null; // calc.jsp
	}

}
