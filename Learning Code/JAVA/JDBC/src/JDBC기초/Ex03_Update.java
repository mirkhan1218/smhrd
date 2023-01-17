package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		// 사용자로부터 id값을 입력받아서 pw를 변경하자!
		// id
		System.out.print("ID를 입력하세요 >> ");
		String id = sc.next();
		
		// 변경할 pw값을 입력 받아야한다.
		System.out.print("변경할 PW를 입력하세요 >> ");
		String pw = sc.next();

		// mem 테이블에서 사용자가 입력한 아이디값에 해당하는
		// 행의 pw를 사용자가 입력한 pw로 바꾸자(수정하자

		// 조건식에 맞는 행이 없으면 오류가 발생
		
		// JDBC 연결


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 준비물 3개
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			// update mem set pw = 사용자가 입력한 pw where id = 사용자id
			String sql = "update mem set pw = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			// ?인자를 채우자
			psmt.setString(1, pw);
			psmt.setString(2, id);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("데이터 수정 성공");
			} else {
				System.out.println("데이터 수정 실패");
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 접속 오류");
			e.printStackTrace();
			
		} finally {
			// finally -> 무조건 거치는 부분 (자원 반납)
			// 예외상황이 발생하더라도 한번은 실행되는 부분
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원반납시 생긴 오류");
				e.printStackTrace();
			}
			
		}

	}

}
