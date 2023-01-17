package oneWeek;

import java.util.Scanner;

public class q05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("*");
			}System.out.println();

		}

	}

}
