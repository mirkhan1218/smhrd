package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex09_과제 {

	public static void main(String[] args) {

		// 랜덤 도구 불러오기
		Random rd = new Random();

		// 입력 도구 불러오기
		Scanner sc = new Scanner(System.in);

		// 시작 메세지 출력
		System.out.println("===Plus Game===");

		// 랜덤으로 정수 2개 출력
		// 결과값 입력

		do {
			int rnum1 = rd.nextInt(9) + 1;
			int rnum2 = rd.nextInt(9) + 1;

			int sum = rnum1 + rnum2;
			System.out.print(rnum1 + " + " + rnum2 + " = ");
			int ans = sc.nextInt();

			// 게임 결과 출력 (Success or Fail)
			// Success 일때, 계속 게임 진행
			if (sum == ans) {
				System.out.println("Success");

			} else if (sum != ans) {
				System.out.println("Fail");

				// 6. 반복 여부 입력
				// Fail 일때, 게임 진행 여부 출력
				// Y or y : 처음부터 시작
				// N or n : 프로그램 종료
				// 그외 : "잘못 입력하셨습니다" 출력이후 "계속 하시겠습니까?" 선택 문구 출력
				String select = "0";
				do {
					System.out.println("계속 하시겠습니까? [Y/N]");
					select = sc.next();

					if (select.equalsIgnoreCase("y") || select.equalsIgnoreCase("n")) {
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				} while (true);

				if (select.equalsIgnoreCase("n"))
					break;

			}

		} while (true);
		System.out.println("종료합니다.");

	}

}
