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
// POJO
public class BoardListController implements Controller {
	// 프론트컬트롤러의 요청을 처리해주는 컨트롤러
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.allList();
		
		request.setAttribute("list", list);
		return "boardList";
		
	}
	
}
		
