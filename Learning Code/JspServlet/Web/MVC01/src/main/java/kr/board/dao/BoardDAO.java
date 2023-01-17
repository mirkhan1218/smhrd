package kr.board.dao;

// JDBC(Java+SQL) -> MyBatis Framework(O) : Java<--분리-->SQL
import java.sql.*;
import java.util.ArrayList;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String password = "hr";

		try {
			// 오라클접속 드라이버(class)를 메모리로 로딩 : ojdbc6.jar
			// 정적로딩(컴파일시점에서 사용할 클래스가 반드시 존재해야된다.)
			// 1. 다른 DB로 변경하기가 어렵다.
			// 2. 컴파일시점에서 해당 드라이버가 미리 설치되어있어야된다.
			// DriverManager dm = new oracle.jdbc.driver.OracleDriver();
			// 동적로딩(실행시점에서 클래스를 메모리에 로딩)

			Class.forName("oracle.jdbc.driver.OracleDriver"); // ? new Oracle(); x
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	// 게시판 전체(ArrayList<BoardVO>)리스트를 가져오기
	public ArrayList<BoardVO> allList() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		String SQL = "select * from board order by idx desc";

		conn = getConnect();
		// SQL문장 전송하는 객체(Statement, PreparedStatement)
		try {
			ps = conn.prepareStatement(SQL);
			// rs -> 커서
			rs = ps.executeQuery();
			while (rs.next()) {
				int idx = rs.getInt("idx");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String indate = rs.getString("indate");
				int count = rs.getInt("count");

				// 묶고 -> 담고
				BoardVO vo = new BoardVO(idx, title, content, writer, indate, count);
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public void boardInsert(BoardVO vo) { // 1, 2, 3
		String SQL = "insert into board(idx, title, content, writer) values(idx_seq.nextval, ?, ?, ?)";
		conn = getConnect();

		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());

			ps.executeUpdate(); // 실행(성공)

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public BoardVO getByIdx(int idx) {
		BoardVO vo = null;
		String SQL = "select * from board where idx=?";
		conn = getConnect();

		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				idx = rs.getInt("idx");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String indate = rs.getString("indate");
				int count = rs.getInt("count");

				// 묶고 -> 담고
				vo = new BoardVO(idx, title, content, writer, indate, count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return vo;
	}
	// boardDelete(int idx)
	public void boardDelete(int idx) {
		String SQL = "delete from board where idx = ?";
		conn = getConnect();

		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, idx);
			ps.executeUpdate(); // 실행(성공)

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	// boardUpdate(BoardVO vo)
	public void boardUpdate(BoardVO vo) { // 1, 2, 3
		String SQL = "update board set title=?, content=? where idx=?";
		conn = getConnect();

		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setInt(3, vo.getIdx());

			ps.executeUpdate(); // 실행(성공)

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void countUpdate(int idx) {
		String SQL = "update board set count=count+1 where idx=?";
		conn = getConnect();
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, idx);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
