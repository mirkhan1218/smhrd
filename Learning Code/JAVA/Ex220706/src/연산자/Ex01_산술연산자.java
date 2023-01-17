package 연산자;

import java.util.Scanner;

public class Ex01_산술연산자 {

	public static void main(String[] args) {
		
		// +, -, *, /, %
		
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력해주세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요 >> ");
		int num2 = sc.nextInt();
		
		// 더하기 결과 : __
		System.out.println("더하기 결과 : " + (num1 + num2));
		// 빼기 결과 : __
		System.out.println("빼기 결과 : " + (num1 - num2));
		// 곱하기 결과 : __
		System.out.println("곱하기 결과 : " + num1 * num2);
		// 몫 결과 : __
		System.out.println("몫 결과 : " + num1 / num2);
		// 나머지 결과 : __
		System.out.println("나머지 결과 : " + num1 % num2);
		
	}

}
