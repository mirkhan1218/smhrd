package festival_연습;

import java.util.Scanner;

public class w2_q08 { // 걸린 시간 : 08분 12초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번 째 정수 입력>>", i + 1);
			arr[i] = sc.nextInt();
		}

		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}

		}

	}

}
