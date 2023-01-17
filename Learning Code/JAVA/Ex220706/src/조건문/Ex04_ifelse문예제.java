package 조건문;

import java.util.Scanner;

public class Ex04_ifelse문예제 {

	public static void main(String[] args) {

		// 1. 입력도구
		Scanner sc = new Scanner(System.in);

		// 2. 출력
		System.out.println("사려는 상품 갯수를 입력하세요.");
		int num = sc.nextInt();

		float price = 0;
		float rate = 0.1f;
		float dc = 1 - rate;

		// 3. num이 11개이상인지 아닌지 판단 ---> 조건식
		if (num >= 11) {
			price = num * (10000 * dc);
		} else {
			price = num * 10000;
		}
		System.out.println("가격은 " + (int) price + "원 입니다.");

	}

}
