package 반복문;

import java.util.Scanner;

public class Ex10_while문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num = 0;
//		
//		while (num <= 10) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//		}

		while (true) {

			int num = 0;

			System.out.print("정수 입력 : ");
			num = sc.nextInt();

			if (num > 10) {
				break;
			}

		}
		System.out.println("종료되었습니다.");

	}

}
