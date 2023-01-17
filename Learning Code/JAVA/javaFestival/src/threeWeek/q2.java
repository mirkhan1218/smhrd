package threeWeek;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		String ans = "";
		
		while(num > 0) {
			ans = (num % 2) + " " + ans;
			num /= 2;

		}

		System.out.println(ans);
	}

}
