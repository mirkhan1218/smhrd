package 조건문;

import java.util.Scanner;

public class Ex08_복습 {

	public static void main(String[] args) {

		// 오늘의 날짜를 입력 받아
		// 날짜가 20~31일이라면
		// "점심 메뉴는 짜장면" 출력
		// 날짜가 10~19일이라면
		// "점심 메뉴는 볶음밥" 출력
		// 날짜가 1~9일이라면
		// "점심 메뉴는 짬뽕" 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("오늘의 날짜? ");
		int days = sc.nextInt();

		if (days >= 20) {
			System.out.println("점심 메뉴는 짜장면");
		} else if (days >= 10) {
			System.out.println("점심 메뉴는 볶음밥");
		} else {
			System.out.println("점심 메뉴는 짬뽕");
		}

	}

}
