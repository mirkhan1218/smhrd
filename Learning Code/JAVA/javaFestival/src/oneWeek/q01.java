package oneWeek;

import java.util.Scanner;

public class q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int i = 0;

		do {
			i++;
			System.out.print(i + "주차 감량 몸무게 : ");
			weight -= sc.nextInt();
			if (weight <= goal) {
				break;
			}
		} while (true);
		System.out.print(weight + "kg 달성!! 축하합니다!");
	}

}
