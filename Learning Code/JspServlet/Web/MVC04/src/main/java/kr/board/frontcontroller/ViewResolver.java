package kr.board.frontcontroller;

public class ViewResolver {
	public static String makeView(String view) {
		return "board/" + view + ".jsp";
	}
}
