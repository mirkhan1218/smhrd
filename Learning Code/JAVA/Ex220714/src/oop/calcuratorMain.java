package oop;

import java.util.Scanner;

public class calcuratorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// "첫 번째 정수를 입력>>"
		// "두 번째 정수를 입력>>"
		System.out.print("첫 번째 정수를 입력 >> ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수를 입력 >> ");
		int num2 = sc.nextInt();

		Calcurator cal = new Calcurator();
		// 다음과 같은 결과를 내 주세요
		// 두 수의 합 : 7
		System.out.println("두 수의 합 : " + cal.add(num1, num2));
		// 두 수의 차 : 3
		System.out.println("두 수의 차 : " + cal.sub(num1, num2));
		// 두 수의 곱 : 10
		System.out.println("두 수의 곱 : " + cal.mul(num1, num2));
		// 두 수의 몫 : 2
		System.out.println("두 수의 몫 : " + cal.div(num1, num2));

	}

}
