package 조건문;

import java.util.Scanner;

public class Ex09_자판기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입해주세요>>");

		int money = sc.nextInt();

		System.out.println("[1]데자와(500원) [2]실론티(1000원) [3]솔의눈(1500원)");
		System.out.print("메뉴를 골라주세요>>");

		int menu = sc.nextInt();
		// 2000원을 투입, 1번 골랐을 때,
		// "데자와 뗑그르르"
		// "잔돈 : 1500원"
		// 투입한 금액 1000원이
		// 음료의 값(1500원)보다 작다면
		// "금액이 부족합니다" 출력

		int change = 0; // 잔돈을 저장하는 변수
		if (menu == 1 && money >= 500) {
			System.out.println("데자와 뗑그르르");
			change = money - 500;

		} else if (menu == 2 && money >= 1000) {
			System.out.println("실론티 뗑그르르");
			change = money - 1000;

		} else if (menu == 3 && money >= 1500) {
			System.out.println("솔의눈 뗑그르르");
			change = money - 1500;

		} else if (menu == 1 || menu == 2 || menu == 3) {
			System.out.println("금액이 부족합니다");
			change = money;
		} else {
			System.out.println("잘못 입력하셨습니다");
			change = money;
		}

		System.out.println("잔돈 : " + change + "원");

		// 잔돈 : 18300원
		// 만원 : 1개
		// 오천원 : 1개
		// 천원 : 3개
		// 오백원 : 0개
		// 백원 : 3개
		System.out.println("만원 : " + (change / 10000) + "개");
		System.out.println("오천원 : " + (change % 10000) / 5000 + "개");
		System.out.println("천원 : " + (change % 5000) / 1000 + "개");
		System.out.println("오백원 : " + (change % 1000) / 500 + "개");
		System.out.println("백원 : " + (change % 500) / 100 + "개");

	}

}
