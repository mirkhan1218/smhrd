package kr.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardWriteController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		// 1. 파마메터 수집(VO)
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");

		BoardVO vo = new BoardVO();

		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);

		// 2. Model연동
		dao.boardInsert(vo); // 저장

		return "redirect:" + "/boardList.do";
	}

}
