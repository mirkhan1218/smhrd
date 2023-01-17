package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex10_PlusGame {

	public static void main(String[] args) {
		
		/* 랜덤으로 정수 2개를 뽑아 아래와 같이 출력
		 * 사용자는 두수의 합을 입력
		 * 두 수의 합과 입력한 수가 일치하면 "Success"
		 * 두 수의 합과 입력한 수가 일치하지 않으면 "Fail" 출력
		 */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Plus Game===");
		String ing = "Y";
		
		do {
			int num1 = rd.nextInt(9) + 1; // 1 ~ 9까지 랜덤한 정수 출력
			int num2 = rd.nextInt(9) + 1; // 1 ~ 9까지 랜덤한 정수 출력
			
			// printf : print format
			// 출력하고자 하는 문장 작성
			// 만약, 랜덤한 두 정수가 3과 5라면
			// 우리가 출력하고자 하는 문장 : "3 + 5 = "
			System.out.printf("%d + %d = ", num1, num2);
			// 들어가는 data가 정수 : %d (decimal)
			// 들어가는 data가 실수 : %f (float)
			// 들어가는 data가 문자열 : %s (String)
			// 추가 기능 : 엔터를 치고 싶다(개행) : %n (new)
			
			int input = sc.nextInt();
			
			if(num1 + num2 == input) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				
				System.out.print("계속 하시겠습니까? [Y/N] >> ");
				ing = sc.next();
				
			}
			
		} while(ing.equalsIgnoreCase("Y"));
		// == : 실제 값을 비교
		// 기본 데이터 타입 8개 : call by value (실제 값이 메모리에 저장)
		// Reference data type : call by reference (주소 값이 메모리에 저장)

	}

}
