package twoWeek;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 5;
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("%d : ", arr[j]);
			for (int i = 0; i < arr[j]; i++) {
				System.out.print("* ");
			}System.out.println();
			
		}
		
	}

}
