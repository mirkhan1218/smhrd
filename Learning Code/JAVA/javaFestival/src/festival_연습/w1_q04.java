package festival_연습;

import java.util.Scanner;

public class w1_q04 { // 걸린시간 : 04분 27초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int cash = sc.nextInt();
		
		System.out.printf("잔돈 : %d원%n", cash);
		
		System.out.println("10000원 : " + cash / 10000 + "개");
		System.out.println("5000원 : " + (cash % 10000) / 5000 + "개");
		System.out.println("1000원 : " + (cash % 5000) / 1000 + "개");
		System.out.println("500원 : " + (cash % 1000) / 500 + "개");
		System.out.println("100원 : " + (cash % 500) / 100 + "개");
		
	}

}
