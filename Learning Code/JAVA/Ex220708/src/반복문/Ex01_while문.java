package 반복문;

import java.util.Scanner;

public class Ex01_while문 {

	public static void main(String[] args) {

		// 사용자로부터 숫자를 입력받아
		// 짝/홀수가 몇개인지 카운트

		// 1. 사용자에게 정수하나 입력
		Scanner sc = new Scanner(System.in);

		// 짝수/홀수의 갯수를 담을 공간
		int even = 0;
		int odd = 0;

		while (true) {

			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();

			// 2. num이 짝수? 홀수? -1?
			if (num % 2 == 0) {
				// even++;
				even += 1;
			} else if (num % 2 == 1) {
				// odd++;
				odd += 1;
			} else if (num == -1) {
				// 3을 실행시키지 않고 바로 종료
				break;
			}

			// 3. 짝수/홀수의 갯수 출력
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
