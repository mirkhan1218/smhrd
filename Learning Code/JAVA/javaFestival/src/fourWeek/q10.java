package fourWeek;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int ans = 1;
		
		for(int i = 0; i < num; i++) {
			ans *= i + 1;
		}
		System.out.printf("출력 : %d", ans);
		
	}

}
