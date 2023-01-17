package 조건문;

import java.util.Scanner;

public class Ex03_if_else문 {

	public static void main(String[] args) {

		// 1. 입력하는 도구
		Scanner sc = new Scanner(System.in);

		// 2. 출력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		// 3. num이 짝수인지 홀수인지 판단
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");

		} else {
			System.out.println("홀수입니다.");

		}
		// Ctrl + A ---> 전체 코드 선택
		// Ctrl + Shift + F ---> 코드 자동 정리
	}

}
