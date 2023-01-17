package 조건문;

import java.util.Scanner;

public class Ex07_복습 {

	public static void main(String[] args) {

		// 문제 정의
		// 오늘의 날짜를 입력!!
		// 날짜가 짝수라면
		// "Java 공부하기"
		// 날짜가 홀수라면
		// "뒹굴뒹굴 하기"

		// 1. Scanner 도구를 불러온다(import)
		Scanner sc = new Scanner(System.in); // Scanner는 레퍼런스(class) 데이터 타입

		// 2. "오늘의 날짜는?" 문구를 출력
		System.out.print("오늘의 날짜는? ");

		// 3. 사용자로부터 입력받은 값을 정수형 변수 days에 대입
		int days = sc.nextInt();

		// 4. days가 짝수라면 "Java 공부하기"
		// 5. days가 홀수라면 "뒹굴뒹굴 하기" 출력!
		if (days % 2 == 0) {
			System.out.println("Java 공부하기");
		} else {
			System.out.println("뒹굴뒹굴 하기");
		}

	}

}
