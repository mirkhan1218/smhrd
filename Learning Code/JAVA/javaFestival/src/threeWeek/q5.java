package threeWeek;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 5;
		int[] arr = new int[num];
//		int maxIndex = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			int maxIndex = 0;
			for (int i = 0; i < arr.length - j; i++) {
				if(arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[arr.length - j - 1];
			arr[arr.length - j - 1] = temp;
			
		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
