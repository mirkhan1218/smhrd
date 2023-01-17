package festival_연습;

import java.util.Scanner;

public class w2_q06 { // 걸린 시간 : 04분 50초

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		String num = sc.next();
		
		int[] arr = new int[num.length()];
		int result = 0;
		
		for (int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i) - '0';
			result += arr[i];
		}
		System.out.printf("합은 %d입니다.", result);

	}

}
