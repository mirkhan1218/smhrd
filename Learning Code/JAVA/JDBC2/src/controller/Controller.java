package controller;

import java.util.ArrayList;

import model.Student;
import model.StudentDAO;

public class Controller {
	StudentDAO dao = new StudentDAO();

	// dao로 s1을 보내주는 메서드를 만들자
	public void insert(Student s1) {
		// s1 ---> dao
		// s1을 전달인자로 사용해서 dao에 있는 insert로 보내줘야한다.
		int row = dao.insert(s1);

		if (row > 0) {
			System.out.println("데이터 추가 성공");
		} else {
			System.out.println("데이터 추가 실패");
		}

	}

	public void selectOne(String stdnum) {
		Student std = dao.selectOne(stdnum);

		ArrayList<Student> list = new ArrayList<>();
		list.add(std);

		if (std != null) {
			for (Student std1 : list) {
				// std1에서 차례대로 Student를 꺼내서 list
				// 주소값이 아니라 std에 담겨있는 데이터가 그대로
				System.out.println(std1);
			}

		} else {
			System.out.println("학생정보가 없습니다.");

		}

	}

	public void update(Student s1) {
		int row = dao.update(s1);

		if (row > 0) {
			System.out.println("데이터 수정 성공");
		} else {
			System.out.println("데이터 수정 실패");
		}

	}

	public void delete(Student s1) {
		int row = dao.delete(s1);

		if (row > 0) {
			System.out.println("데이터 삭제 성공");

		} else {
			System.out.println("데이터 삭제 실패");

		}

	}

}
