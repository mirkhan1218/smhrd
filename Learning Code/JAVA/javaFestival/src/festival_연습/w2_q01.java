package festival_연습;

import java.util.Scanner;

public class w2_q01 { // 걸린 시간 : 05분 17초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = j + (5 * i) + 1;
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}

	}

}
