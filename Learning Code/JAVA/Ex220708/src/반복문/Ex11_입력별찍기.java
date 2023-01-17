package 반복문;

import java.util.Scanner;

public class Ex11_입력별찍기 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****

		// 사용자로부터 정수를 입력
		// "찍을 별 개수를 입력 >> "
		// 입력받은 정수를 star라는 변수에 저장
		// 만약, 3을 입력받았다면
		// *
		// **
		// ***
		// 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("찍을 별 개수를 입력 >> ");
		int star = sc.nextInt();

		for (int j = 0; j < star; j++) {
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		for (int i = 0; i < 4; i++) {
//			System.out.println("*");
//		}
//		System.out.println();

	}

}
