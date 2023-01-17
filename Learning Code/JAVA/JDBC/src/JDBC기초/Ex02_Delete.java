package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_Delete {

	public static void main(String[] args) {
		// 도구 모음집
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;

		// 이름을 입력받아서 해당하는 아이디와 비밀번호, 이름을 삭제하는 작업

		// 1. 사용자로부터 이름을 입력
		System.out.print("삭제할 이름을 입력하세요 >> ");
		String name = sc.next();

		// 2. JDBC를 사용해서 삭제를 진행
		try {
			// 순서
			// 1. JDBC드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 예외상황
			// try ~ catch
			// try : 실행할 로직
			// catch : 실행하는 로직의 예외상황을 잡아주는 역할
			// finally : 무조건 실행을 한번은 시키는 구문
			
			// 2. DB 연결 (준비물 3개)
			// 준비물 3가지 꾸려주자
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			// 권한 확인
			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 3. 실행할 SQL문 정의 및 전송
			// sql문 (조건식 where)
			// ex) where id = '배미리칸'; ---> 아이디가 배미리칸이라면
			// delete from mem where name = "입력받은 이름"

			// sql문을 준비
			String sql = "delete from mem where name = ?";
			psmt = conn.prepareStatement(sql);

			// psmt에 ?인자를 채워주는 작업을 하자
			// 매개변수 오류는 ?인자의 값을 채웠는지 확인
			// ?가 몇번쨰인지 확인을 해야합니다.
			psmt.setString(1, name);

			// sql문을 전송하자
			int row = psmt.executeUpdate();
			// excuteUpdate로 실행 ---> int형 결과값
			// 영향을 받은 행이 있는지 없는지에 대한 결과값
			
			// 3-1. 업데이트(실행)가 잘 됬는지 확인하기
			// row가 어떤값을 가지고 왔는지 판단
			if (row > 0) {
				System.out.println("데이터 삭제 성공");
				
			} else {
				System.out.println("데이터 삭제 실패");
				
			}

		} catch (ClassNotFoundException | SQLException e) {
			// - ojdbc6.jar 들어와있는지 확인
			// - ""클래스명이 잘 작성되어있는지 확인
			// - ojdbc6.jar 삭제하고 다시 넣자!!
			System.out.println("데이터베이스 접속 오류");
			e.printStackTrace();
			
			// 4. 사용한 자원(객체) 닫아주기
		} finally {
			// 예외상황이 발생해도 conn, psmt를 닫아줄수 있도록
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
