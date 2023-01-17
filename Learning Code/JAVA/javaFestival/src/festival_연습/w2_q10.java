package festival_연습;

import java.util.Scanner;

public class w2_q10 { // 걸린 시간 : 08분 34초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] star = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			star[i] = sc.nextInt();
		}
		for (int j = 0; j < star.length; j++) {
			System.out.print(star[j] + " : ");
			for (int i = 0; i < star[j]; i++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
