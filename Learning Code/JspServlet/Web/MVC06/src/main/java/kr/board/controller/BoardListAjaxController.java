package kr.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.board.dao.BoardMyBatisDAO;
import kr.board.dao.BoardVO;

public class BoardListAjaxController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// BoardDAO dao = new BoardDAO();
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		List<BoardVO> list = dao.allList();
		// List<BoardVO> ---Gson API---> String(JSON)
		Gson g = new Gson();
		String json = g.toJson(list);
		
		response.setContentType("text/json;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(json);
		
		return null;
	}

}
