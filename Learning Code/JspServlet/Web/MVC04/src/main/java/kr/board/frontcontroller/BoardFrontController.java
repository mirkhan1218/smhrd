package kr.board.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.controller.Controller;
import kr.board.dao.BoardMyBatisDAO;

@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		// 1. 어떤 요청인지 파악하는것(command 구하기)
		String reqPath = request.getRequestURI();
		// System.out.println(reqPath);
		String cpath = request.getContextPath();
		// System.out.println(cpath); // /MVC02
		String command = reqPath.substring(cpath.length());
		// System.out.println(command);

		// 2. command에 따른 처리(if ~ else)
		BoardMyBatisDAO dao = new BoardMyBatisDAO();
		String nextPath = null;
		Controller controller = null;

		// HandlerMapping
		HandlerMapping mappings = new HandlerMapping();
		controller = mappings.getController(command);
		nextPath = controller.requestHandler(request, response);

		// 3. 다음페이지로 이동하기(forward, redirect)
		if (nextPath != null) {
			if (nextPath.indexOf("redirect:") == -1) {
				// forward
				RequestDispatcher rd = request.getRequestDispatcher(ViewResolver.makeView(nextPath));
				rd.forward(request, response);

			} else {
				// redirect
				response.sendRedirect(cpath + nextPath.split(":")[1]); // /MVC02/boardList.do

			}

		}

	}
}
