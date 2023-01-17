package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardUpdateController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		// idx, title, content
		// 1. 파라메터수집(VO)
		request.setCharacterEncoding("utf-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		BoardVO vo = new BoardVO();

		vo.setIdx(idx);
		vo.setTitle(title);
		vo.setContent(content);

		// 2. Model연동
		dao.boardUpdate(vo); // 저장

		return "redirect:" + "/boardList.do";
	}

}
