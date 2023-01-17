package 조건문;

import java.util.Scanner;

public class Ex05_ifelseif문 {

	public static void main(String[] args) {
		
		// 짝수인지, 홀수인지, 0
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		
		// num이 짝수인지, 홀수인지, 0인지 판단
		if(num == 0) {
			System.out.println("0입니다.");
		} else if (num % 2 != 0) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
	}

}
