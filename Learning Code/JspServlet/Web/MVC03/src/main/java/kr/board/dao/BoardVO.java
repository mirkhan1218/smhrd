package kr.board.dao;
// 게시판(Object) -> 번호, 제목, 내용, 작성자, 작성일, 조회수, 유형,,,,,
public class BoardVO {

	private int idx;
	private String title;
	private String content;
	private String writer;
	private String indate; // Date -> String
	private int count;
	
	public BoardVO() {  } // 디폴트 생성자
	public BoardVO(int idx, String title, String content, String writer, String indate, int count) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.indate = indate;
		this.count = count;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer + ", indate="
				+ indate + ", count=" + count + "]";
	}
	
	
	
	
}
