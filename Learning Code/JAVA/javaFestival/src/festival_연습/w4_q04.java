package festival_연습;

import java.util.Scanner;

public class w4_q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int num = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >> ");
		String word = sc.next();

		int[] arr = new int[word.length()];
		int sum = 0;
		int result = 0;
		int binary = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i) - '0';
		}
		for (int i = 0; i < arr.length; i++) {

			sum = num * arr[arr.length - i - 1] * binary;
			result += sum;
			binary *= 10;

			System.out.println(num * arr[arr.length - i - 1]);
		}
		System.out.println(result);
	}

}
