package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04_Select {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC 드라이버 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 준비물 3개 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			// 3. 준비물 가지고갈 매니저(내권한을 확인)
			conn = DriverManager.getConnection(url, id, pw);

			// 4. sql문 준비
			String sql = "select * from mem";

			psmt = conn.prepareStatement(sql);

			// select 구문을 쓸때는 executeQuery()를 사용한다!!!
			rs = psmt.executeQuery();

			// rs.next(); : 테이블 내에 커서를 한칸 움직이는 기능 (true/false 출력)
			while (rs.next()) {
				// rs.next()가 false가 될떄까지 작동
				// false -> 데이터가 더이상 없다

				String id1 = rs.getString("ID");
				String pw1 = rs.getString("PW");
				String name1 = rs.getString("NAME");

				System.out.println(id1 + "\t" + pw1 + "\t" + name1);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터 베이스 연결 오류");
			e.printStackTrace();

		} finally {
			// 자원을 사용한 역순으로 닫아주자
			try {
				if (rs != null)
					rs.close();

				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();

			}

		}

	}

}
