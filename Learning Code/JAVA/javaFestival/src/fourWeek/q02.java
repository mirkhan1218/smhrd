package fourWeek;

import java.util.Scanner;

public class q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("X 입력 >> ");
		int num2 = sc.nextInt();
		
		int[] arr = new int[num1];
		
		for (int i = 0; i < num1; i++) {
			System.out.printf("%d번째 정수 입력 >> ", i + 1);
			arr[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < num1; i++) {
			if(arr[i] < num2) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
