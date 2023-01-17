package 배열;

import java.util.Scanner;

public class Ex08_배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 수박 게임 Start!====");

		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();

		String[] array = new String[num];

		for (int i = 0; i < num; i++) {
			if ((i + 1) % 2 == 0) { // 짝수 = "박"
				array[i] = "박";
			} else {
				array[i] = "수"; // 홀수 = "수"
			}
			System.out.print(array[i]);
		}

	}

}
