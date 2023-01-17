package twoWeek;

import java.util.Scanner;

public class q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		// 정수를 한번에 입력 받아서 문자열에 저장
		System.out.print("정수 입력 : ");
		String num = sc.next();

		// num 문자열의 자릿수 만큼 arr 정수형 배열 생성
		int[] arr = new int[num.length()];
		
		// num 문자열 한자리씩 arr 정수형 배열에 저장
		for (int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i) - '0';
//			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println("합은" + sum + "입니다.");
	}

}



