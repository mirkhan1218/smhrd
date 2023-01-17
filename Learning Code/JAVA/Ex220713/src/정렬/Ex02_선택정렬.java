package 정렬;

public class Ex02_선택정렬 {

	public static void main(String[] args) {

		int[] array = { 45, 7, 12, 82, 25 };
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// Selection Sort(선택정렬)
		// 오름차순 정렬
		for (int j = 0; j < array.length; j++) {
			// cycle 1 : 가장 큰 값을 가지고 있는 요소의 인덱스를 maxIndex에 저장하자
			maxIndex = 0; // cycle 돌 때마다 maxIndex 재설정

			// 만약, array[0]이 array[maxIndex]보다 크다면
			// maxIndex를 0으로 대입
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			// maxIndex 가장 큰 값의 index
			// array[maxIndex]와 array[4]를 치환
			int temp = array[maxIndex];
			array[maxIndex] = array[array.length - 1 - j];
			array[array.length - 1 - j] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
