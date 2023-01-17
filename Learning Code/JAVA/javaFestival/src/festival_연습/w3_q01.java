package festival_연습;

import java.util.Scanner;

public class w3_q01 { // 걸린 시간 : 04분 35초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int num = sc.nextInt();
		
		System.out.println("어느 수까지 출력 : ");
		int step = sc.nextInt();
		
		System.out.println(num + "단");
		
		for (int i = 0; i < step; i++) {
			System.out.printf("%d * %d = %d%n", num, i + 1, num * (i + 1));
		}
		
	}

}
