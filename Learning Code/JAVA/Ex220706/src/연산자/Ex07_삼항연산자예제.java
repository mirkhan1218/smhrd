package 연산자;

import java.util.Scanner;

public class Ex07_삼항연산자예제 {

	public static void main(String[] args) {
		
		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문
		System.out.print("첫 번째 수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력 : ");
		int num2 = sc.nextInt();
		
		// 3. 판단 : 어떤 숫자가 더 큰지! (기준 num1)
		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		
		// 4. 결과값
		System.out.print("두 수의 차 : " + result);
		
	}

}
