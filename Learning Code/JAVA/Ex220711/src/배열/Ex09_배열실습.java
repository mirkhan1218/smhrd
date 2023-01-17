package 배열;

import java.util.Scanner;

public class Ex09_배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		int[] starArr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print(i + 1 + "번째 별의 개수를 입력 >> ");
			starArr[i] = sc.nextInt();
		}

		for (int j = 0; j < starArr.length; j++) {
			System.out.print(starArr[j] + " : ");
			for (int i = 0; i < starArr[j]; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
