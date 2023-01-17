package 반복문;

import java.util.Scanner;

public class Ex03_while_다이어트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int pw = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int tw = sc.nextInt();

		int week = 1;

		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			pw -= sc.nextInt();
			week += 1;

			if (tw >= pw) {
				break;
			}
		}

		System.out.println(pw + "kg 달성!! 축하합니다!!");

	}

}
