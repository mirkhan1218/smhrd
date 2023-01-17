package 반복문;

import java.util.Scanner;

public class Ex06_계산기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 ~ 5번 반복
		while (true) {
			// 1. 첫 번째 정수를 입력받는다.
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();

			// 2. 두 번째 정수를 입력받는다.
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();

			// 3. 연산자를 선택한다.
			System.out.print("[1]더하기	[2]빼기	>> ");
			int num3 = sc.nextInt();
			String word = "0";

			// 4. 연산을 한다
			int result = 0;
			if (num3 == 1) {
				word = "더하기";
				result = num1 + num2;
			} else if (num3 == 2) {
				word = "뺴기";
				result = num1 - num2;
			}

			// 5. 연산 결과 출력
			System.out.println(word + " 연산 결과는 " + result + "입니다.");

			// 6. 반복 여부 입력
			// Y or y : 처음부터 시작
			// N or n : 프로그램 종료
			// 그외 : "잘못 입력하셨습니다" 출력이후 "다시 실행하시겠습니까?" 선택 문구 출력
			String ans = "0";
			while (true) {
				System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
				ans = sc.next();

				if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}

			}

			if (ans.equalsIgnoreCase("N")) {
				break;
			}

		}

		// 6. "종료합니다." 출력
		System.out.println("종료합니다.");
	}

}
