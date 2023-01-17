package twoWeek;

import java.util.Scanner;

public class q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 10;
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("%d번 째 정수 입력>>", i + 1);
			arr[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < num; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
			
		}

	}

}
