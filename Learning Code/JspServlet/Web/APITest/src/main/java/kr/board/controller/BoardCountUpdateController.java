package kr.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardCountUpdateController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		dao.countUpdate(idx); // 조회수가 없데이트
		BoardVO vo = dao.getByIdx(idx);
		
		PrintWriter out = response.getWriter();
		out.println(vo.getCount());
		
		return null;
	}

}
