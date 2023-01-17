package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.dao.BoardVO;

public class BoardDetailController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		int idx = Integer.parseInt(request.getParameter("idx"));

		BoardVO vo = dao.getByIdx(idx);

		// 조회수 누적
		dao.countUpdate(idx);

		// 객체바인딩
		request.setAttribute("vo", vo);
		return "boardDetail";
	}

}
