package kr.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;

@WebServlet("/boardDelete.do")
public class BoardDeleteController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?idx=10
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(idx);    // 성공
		
		// redirect
		response.sendRedirect("/MVC01/boardList.do");
	}

}
