package 반복문;

import java.util.Scanner;

public class Ex05_for문예제 {

	public static void main(String[] args) {

		// for문을 사용하여 구구단을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();

		System.out.println(num + "단 시작!!");

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
