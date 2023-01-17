package 정렬;

import java.util.Arrays;

public class Ex01_버블정렬 {

	public static void main(String[] args) {

		int[] array = { 45, 7, 12, 82, 25 };

		// Bubble Sort(버블 정렬)
		// 오름차순 정렬

		// cycle 1 : 가장 큰 값이 맨 오른쪽으로

		// array[0]과 array[1]을 비교해서
		// 만약, array[0]이 더 크다면
		// 두 값을 치환(자리바꿈)

		for (int j = 0; j < array.length - 1; j++) { // cycle 횟수
			for (int i = 0; i < array.length - 1 - j; i++) // 해당 cycle에서 비교 횟수
				if (array[i] > array[i + 1]) {
//					int temp = array[i];
//					array[i] = array[i + 1];
//					array[i + 1] = temp;
					swap(array, i, i + 1);
				}
		}

		// for
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		// for-each
//		for (int num : array) {
//			System.out.print(num + " ");
//		}
		// Arrays.toString
		System.out.println(Arrays.toString(array));

	}

	public static void swap(int[] array, int num1, int num2) {
		int temp = array[num1];
		array[num1] = array[num2];
		array[num2] = temp;
	}
}
