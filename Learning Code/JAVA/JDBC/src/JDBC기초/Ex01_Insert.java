package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Insert {

	public static void main(String[] args) {

		// 도구 모음집
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;

		// JDBC를 이용하는 가장 대표적인 예 "회원가입"을 구현해 보자

		// Id(Varchar), pw(Varchar), name(Varchar)
		// table name : mem

		// 사용자로부터 아이디, 비밀번호, 이름을 입력받아서 데이터 베이스에 저장!
		System.out.print("ID를 입력해주세요 >> ");
		String id = sc.next();
		System.out.print("PW를 입력해주세요 >> ");
		String pw = sc.next();
		System.out.print("이름을 입력해주세요 >> ");
		String name = sc.next();

		try {
			// 1. JDBC Driver 로딩
			// 1-1. 드라이버 동적 로딩
			// : 실행하는 순간 자료형이 결정되는 것!(Oracle의 자료형이 된다)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// -> 어떤 데이터베이스의 드라이버를 가져올 건지 정해주는 코드
			// oracle.jdbc.driver ---> 패키지명
			// OracleDriver ---> class명

			// 1-2. 데이터베이스 연결
			// 연결하기위한 준비물
			// url, id, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
			// jdbc:oracle:thin ---> 오라클 드라이버
			// @localhost ---> ip주소(내 컴퓨터 ip주소의 키워드)
			// 1521 ---> port번호
			// xe ---> DB의 이름
			String db_id = "hr"; // 데이터베이스 계정
			String db_pw = "hr"; // 비밀번호

			// Connection 객체에 드라이버 매니저 담아놓고 사용하기
			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 2. Query문(SQL) 전송
			// mem이라는 테이블에 id, pw, name을 입력하는 구문
			String sql = "insert into mem values(?,?,?)";

			// 2-1. SQL문 전송
			psmt = conn.prepareStatement(sql);

			// ?인자를 채워주는 작업
			// setString(몇 번째 물음표인지, 어떤값을 넣어줄건지)
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);

			// 전송하기 전에 ?가 다 채워져있는지 확인하기!!!
			int row = psmt.executeUpdate();
			// SQL문을 전송해서 테이블을 업데이트(실행)시켜준다.

			// row에 어떤값이 담겨있는지 == executeUpdate()가 가지고 온값이 있는지
			// 영향을 받은 행이 있는지 판단!
			if (row > 0) {
				// 영향을 받은 행이 있는 상태 / sql문 전송에 성공
				System.out.println("데이터 추가 성공");
			} else {
				System.out.println("데이터 추가 실패");
			}

		} catch (ClassNotFoundException e) {
			// catch(예외의 클래스명 변수명)
			// 예외상황(exception)이 발생하면 작아주는 역할
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		} finally {
			// try문이 실행되도, catch문이 실행되도 한번은 거쳐가는 곳
			// 오류상황이 생기더라도 psmt, conn이 열려있는지 아닌지를 확인한 후에
			// 프로그램이 종료되도록 만들기 위해
			// *** try ~ catch ~ finally
			// 4. 역순으로 닫아줘야한다.
			try {
				if (psmt != null)
					psmt.close();
				// 실행문장이 한줄이면 중괄호 생략 가능
				
				if (conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("자원반납시 오류");
				e.printStackTrace();
			}
			
		}

	}

}
