package kr.board.frontcontroller;

import java.util.HashMap;

import kr.board.controller.BoardDeleteController;
import kr.board.controller.BoardDetailController;
import kr.board.controller.BoardListController;
import kr.board.controller.BoardUpdateController;
import kr.board.controller.BoardUpdateFormController;
import kr.board.controller.BoardWriteController;
import kr.board.controller.BoardWriteFormController;
import kr.board.controller.Controller;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/boardList.do", new BoardListController());
		mappings.put("/boardWriteForm.do", new BoardWriteFormController());
		mappings.put("/boardWrite.do", new BoardWriteController());
		mappings.put("/boardDetail.do", new BoardDetailController());
		mappings.put("/boardDelete.do", new BoardDeleteController());
		mappings.put("/boardUpdateForm.do", new BoardUpdateFormController());
		mappings.put("/boardUpdate.do", new BoardUpdateController());

	}

	public Controller getController(String key) {
		return mappings.get(key);
	}

}
/*
 * if(command.equals("/boardList.do")) { controller = new BoardListController();
 * nextPath = controller.requestHandler(request, response);
 * 
 * }else if(command.equals("/boardWriteForm.do")) { controller = new
 * BoardWriteFormController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }else if(command.equals("/boardWrite.do")) { controller = new
 * BoardWriteController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }else if(command.equals("/boardDetail.do")) { controller = new
 * BoardDetailController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }else if(command.equals("/boardDelete.do")) { controller = new
 * BoardDeleteController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }else if(command.equals("/boardUpdateForm.do")) { controller = new
 * BoardUpdateFormController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }else if(command.equals("/boardUpdate.do")) { controller = new
 * BoardUpdateController(); nextPath = controller.requestHandler(request,
 * response);
 * 
 * }
 */
