package view;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.Scanner;

import controller.Controller;
import model.Student;
//import model.StudentDAO;

public class Main {

	public static void main(String[] args) {

		// 도구 모음
		Scanner sc = new Scanner(System.in);
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
		Student s1 = new Student(null, null, 0, null, null);
		Controller con = new Controller();

		System.out.println("========SMHRD학생관리프로그램========");

		while (true) {
			System.out.print("[1]학생정보추가 [2]학생정보조회 [3]학생정보수정 [4]학생정보삭제 [5]프로그램 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 학생정보추가
				System.out.println("*등록할 학생의 정보를 입력하세요*");
				// 학번, 이름, 나이, 전화번호, 이메일
				System.out.print("학번 : ");
				String stdnum = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String tel = sc.next();
				System.out.print("이메일 : ");
				String email = sc.next();

				// 사용자가 입력한 데이터값으로 s1 초기화(생성자 사용)
				s1 = new Student(stdnum, name, age, tel, email);

//				StudentDAO dao = new StudentDAO();
				con.insert(s1);

			} else if (menu == 2) {
				// 학생정보조회
				// stdnum을 입력받아서 학생정보가 출력되도록 만들자
				System.out.println("*조회할 학생의 학번을 입력하세요*");
				System.out.print(">> ");
				String stdnum = sc.next();
				
				con.selectOne(stdnum);

//				Student s1 = new Student(stdnum, null, 0, null, null);
//				Controller con = new Controller();

				con.selectOne(stdnum);

			} else if (menu == 3) {
				// 학생정보수정
				// stdnum을 입력받아서 이름, 나이, 전화번호, 이메일 수정할 수 있도록 만들자
				System.out.println("*수정할 학생의 학번을 입력하세요*");
				System.out.print(">> ");
				String stdnum = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String tel = sc.next();
				System.out.print("이메일 : ");
				String email = sc.next();

				s1 = new Student(stdnum, name, age, tel, email);

				con.update(s1);

			} else if (menu == 4) {
				// 학생정보삭제
				// 이름을 입력받아서 해당하는 학생의 정보를 전부 삭제
				System.out.println("*삭제할 학생의 이름을 입력하세요*");
				System.out.print(">> ");
				String name = sc.next();

				s1 = new Student(null, name, 0, null, null);
				con.delete(s1);

			} else if (menu == 5) {
				System.out.println("프로그램을 종료하겠습니다");
				break;

			} else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}

		}

	}

}
