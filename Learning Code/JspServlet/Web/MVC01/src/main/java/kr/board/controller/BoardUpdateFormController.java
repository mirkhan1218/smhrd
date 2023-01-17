package kr.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.dao.BoardVO;

@WebServlet("/boardUpdateForm.do")
public class BoardUpdateFormController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.getByIdx(idx);
		
		// 객체바인딩
		request.setAttribute("vo", vo);
		// boardDtail.jsp
		RequestDispatcher rd = request.getRequestDispatcher("board/boardUpdate.jsp");
		rd.forward(request, response);
		
	}

}
