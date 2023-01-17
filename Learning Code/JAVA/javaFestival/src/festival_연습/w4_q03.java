package festival_연습;

import java.util.Scanner;

public class w4_q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();

		int[] arr = new int[num.length()];
		int[] refer = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		int ans = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num.charAt(i) - '0';

			// for(int j = 0; j < arr.length; j++)
			int j = 0;

			while (arr[i] != j - 1) {
				ans = refer[j];
				j++;
			}
			sum += ans;
		}
		System.out.println("대시('-')의 총 합 >> " + sum);
	}

}
