package oneWeek;

import java.util.Scanner;

public class q09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if((num % 10) >= 5) {
			num = 10 * ((num / 10) + 1);
		}else {
			num = (num / 10) * 10;
		}
		System.out.printf("반올림 수 : %d", num);
	}

}
