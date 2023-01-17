package fourWeek;

import java.util.Random;
import java.util.Scanner;

public class q08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int i = 0;

		while (i < 5) {
			int num1 = rd.nextInt(9);
			int num2 = rd.nextInt(9);

			int sum = num1 + num2;

			System.out.printf("%d + %d = ", num1, num2);
			int ans = sc.nextInt();

			if (sum == ans) {
				System.out.println("SUCCESS!");
			} else {
				i++;
				System.out.println("Fail...");

			}

		}
		System.out.println("GAME OVER!");

	}

}
