package 연산자;

import java.util.Scanner;

public class Ex02_산술예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세자리 숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		System.out.println("백의 자리 : " + num / 100);
		System.out.println("십의 자리 : " + (num % 100) / 10);
		System.out.println("일의 자리 : " + num % 10);
		
	}

}
