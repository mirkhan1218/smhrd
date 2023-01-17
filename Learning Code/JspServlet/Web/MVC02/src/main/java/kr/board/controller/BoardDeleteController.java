package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;

public class BoardDeleteController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		int idx = Integer.parseInt(request.getParameter("idx"));

		dao.boardDelete(idx);

		return "redirect:" + "/boardList.do";
	}

}
