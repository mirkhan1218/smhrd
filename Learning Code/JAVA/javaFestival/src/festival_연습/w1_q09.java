package festival_연습;

import java.util.Scanner;

public class w1_q09 { // 걸린 시간 : 04분 19초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num % 10 < 5) {
			num = (num / 10) * 10;
		} else {
			num = ((num / 10) + 1) * 10;
		}
		System.out.printf("반올림 수 : %d", num);

	}

}
