package kr.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.dao.BoardVO;

@WebServlet("/boardList.do")
public class BoardListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 클라이언트의 요청을 받는다. ?
		// 2. Model과 연동을 한다.
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.allList();
		
		// 3. 응답하기(View와 연동)
		// 3-1. 객체바인딩(*****)
		request.setAttribute("list", list);
		
		// 3-2. 어떤 View로 요청을 의뢰(=부탁=포워딩)할건지 JSP를 선택
		// RequestDispatcher(요청의뢰객체)
		RequestDispatcher rd = request.getRequestDispatcher("board/boardList.jsp");
		rd.forward(request, response);	// ----------------------------▲
		
	}
	
}
		
