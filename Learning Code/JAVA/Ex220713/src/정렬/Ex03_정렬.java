package 정렬;

import java.util.Arrays;

public class Ex03_정렬 {

	public static void main(String[] args) {
		int[] array = { 45, 7, 12, 82, 25, 33, 8, 17, 54, 4 };

		Arrays.sort(array); // 배열을 오름차순 정렬
		System.out.println(Arrays.toString(array));

		// 45가 어디에 있는 지 알고 싶다 (index)
		int key = 44;

		// Binary Search(이진 탐색)

		int lowIndex = 0;
		int highIndex = array.length - 1; // 9
		int midIndex = (lowIndex + highIndex) / 2; // 9
		int cnt = 0;

//		while (lowIndex <= highIndex) {
		while (key != array[midIndex]) {

			cnt++;

			if (cnt == 500) {
				System.out.printf("%d 값은 없습니다.", key);
				break;
			}

			midIndex = (lowIndex + highIndex) / 2;

			if (key == array[midIndex]) {
				System.out.printf("%d는 %d번째 있습니다.", key, midIndex + 1);
				break;
			} else if (key > array[midIndex]) {
				lowIndex = midIndex + 1;
				// midIndex부터 아래에 있는 값은 탐색 안해도 됨!
				// 따라서, lowIdex를 재조정!!
			} else if (key < array[midIndex]) {
				highIndex = midIndex - 1;
			}

		}

	}

}
