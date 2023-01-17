package 반복문;

import java.util.Scanner;

public class Ex11_while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("누적결과 : " + sum);

			if (num == -1) {
				break;
			}

		}
		System.out.println("종료되었습니다.");

	}

}
