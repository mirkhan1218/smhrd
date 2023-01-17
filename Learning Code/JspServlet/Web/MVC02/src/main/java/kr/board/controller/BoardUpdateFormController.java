package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.dao.BoardVO;

public class BoardUpdateFormController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		int idx = Integer.parseInt(request.getParameter("idx"));

		BoardVO vo = dao.getByIdx(idx);

		request.setAttribute("vo", vo);

		return "boardUpdate";
	}

}
