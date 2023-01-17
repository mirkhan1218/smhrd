package kr.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.dao.BoardVO;

@WebServlet("/boardWrite.do")
public class BoardWriteController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라메터수집(VO)
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		BoardVO vo = new BoardVO();
		
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		
		// 2. Model연동
		BoardDAO dao = new BoardDAO();
		dao.boardInsert(vo);	// 저장
		
		// 3. 리스트 페이지 이동 -> 응답을 받아볼려면 BoardListController로 가야된다.
		// redirect기법
		response.sendRedirect("/MVC01/boardList.do");
	}

}
