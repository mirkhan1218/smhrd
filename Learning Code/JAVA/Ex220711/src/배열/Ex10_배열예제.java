package 배열;

import java.util.Scanner;

public class Ex10_배열예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==채점하기==");

		int[] arr = { 1, 4, 3, 2, 1 };
		int[] ans = new int[arr.length];
		int sum = 0;

		System.out.println("답을 입력하세요");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번답 >> ");
			ans[i] = sc.nextInt();

		}

		System.out.println("정답확인");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ans[i]) {
				System.out.print("O ");
				sum += 20;
			} else {
				System.out.print("X ");
				sum += 0;
			}

		}
		System.out.println("총 점 : " + sum);

	}

}
