package oneWeek;

import java.util.Scanner;

public class q04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		System.out.printf("잔돈 : %d원%n", money);
		System.out.printf("10000원 : %d개%n", money / 10000);
		System.out.printf("5000원 : %d개%n", (money % 10000) / 5000);
		System.out.printf("1000원 : %d개%n", (money % 5000) / 1000);
		System.out.printf("500원 : %d개%n", (money % 1000) / 500);
		System.out.printf("100원 : %d개%n", (money % 500) / 100);

	}

}
