package 조건문;

import java.util.Scanner;

public class Ex01_스위치 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 월인가요?>> ");
		int month = sc.nextInt();

		// break
		// 가장 가까운 switch문, for문, while문을 탈출하는 키워드!

		switch (month) {

		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;

		}

	}

}
