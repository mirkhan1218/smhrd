package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {

	// 자원 사용할수 있도록 만들어주자
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			conn = DriverManager.getConnection(url, id, pw);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터 베이스 연결 오류");
			e.printStackTrace();

		} finally {

		}

	}

	public void getClose() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("자원 반납 오류");
			e.printStackTrace();
		}
	}
	// 데이터베이스에 인접, 데이터베이스에 가장 먼저 contact하는 곳
	// db에 연결, insert, delete, select

	// 학생정보 추가
	public int insert(Student s1) {
		// 전역변수
		int row = 0; 

		try {
			getConn();

			String sql = "insert into smhrd values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, s1.getStdnum());
			psmt.setString(2, s1.getName());
			psmt.setInt(3, s1.getAge());
			psmt.setString(4, s1.getTel());
			psmt.setString(5, s1.getEmail());

			// insert, delete, update --> executeUpdate() : 실행
			// select --> executeQuery() : 커서
			row = psmt.executeUpdate(); // 영향을 받은 행이 있는지에 대해 결과값

		} catch (SQLException e) {
			System.out.println("자원 반납 오류");
			e.printStackTrace();

		} finally {
			getClose();

		}
		return row;

	}

	public Student selectOne(String stdnum) {
		Student std = new Student(null, null, 0, null, null);
		try {
			getConn();

			String sql = "select * from smhrd where stdnum=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, stdnum);

			rs = psmt.executeQuery();

			// 조건식에 해당하는 데이터가 있을때 
			if (rs.next()) {
				stdnum = rs.getString("STDNUM");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				String tel = rs.getString("TEL");
				String email = rs.getString("EMAIL");
				std = new Student(stdnum, name, age, tel, email);

			}

		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 오류");
			e.printStackTrace();

		} finally {
			getClose();

		}
		return std;

	}

	public int update(Student s1) {
		int row = 0;

		try {
			getConn();

			String sql = "update smhrd set name=?, age=?, tel=?, email=?  where stdnum=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, s1.getName());
			psmt.setInt(2, s1.getAge());
			psmt.setString(3, s1.getTel());
			psmt.setString(4, s1.getEmail());
			psmt.setString(5, s1.getStdnum());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 오류");
			e.printStackTrace();

		} finally {
			getClose();

		}
		return row;

	}

	public int delete(Student s1) {
		int row = 0;

		try {
			getConn();

			String sql = "delete from smhrd where name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, s1.getName());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 오류");
			e.printStackTrace();

		} finally {
			getClose();

		}
		return row;
	}

}
