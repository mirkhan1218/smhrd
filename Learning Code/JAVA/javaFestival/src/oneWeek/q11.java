package oneWeek;

import java.util.Random;

public class q11 {

	public static void main(String[] args) {

		// 랜덤 함수 불러오기
		Random rd = new Random();

		// 크기 8짜리 정수형 arr[] 생성
		int[] arr = new int[8];

		// 1 ~ 99까지 랜덤 정수 초기화
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(99) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		System.out.printf("가장 큰 값 : %2d%n", arr[maxIndex]);
		System.out.printf("가장 작은 값 : %2d%n", arr[minIndex]);

	}

}
