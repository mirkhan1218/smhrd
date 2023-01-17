package 메서드;

import java.util.Arrays;

public class Ex11_배열넣기 {

	public static void main(String[] args) {
		// 정수형 배열을 만드는 메소드 정의!!
		// 배열의 크기, 첫 번째 값

		// make(5, 22)
		int[] arr = make(5, 22);
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

	public static int[] make(int length, int start) {
		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {
			array[i] = start++;
		}
		return array;
	}

}
