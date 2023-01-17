package 조건문;

import java.util.Scanner;

public class Ex02_단순if문예제 {

	public static void main(String[] args) {

		// 사용자로부터 숫자 한개 입력받기!!
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 입력받은 숫자가 3의 배수도 만족하고, 5의 배수도 만족한다면,
		// "3과 5의 배수입니다."를 출력하기
		if ((num % 3 == 0) && (num % 5 == 0)) {
			System.out.println("3과 5의 배수입니다.");
		}

	}

}
