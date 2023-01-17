package festival_연습;

import java.util.Scanner;

public class w1_q05 { // 걸린시간 : 02분 32초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int j = 0; j < num; j++) {
			for(int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
