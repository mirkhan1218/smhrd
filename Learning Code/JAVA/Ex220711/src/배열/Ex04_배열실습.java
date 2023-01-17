package 배열;

public class Ex04_배열실습 {

	public static void main(String[] args) {

		int[] array = { 33, 25, 123, 10, 8, 4, 99, 341, 436, 34, 14 };

		System.out.print("array에 들어 있는 홀수 : ");

		// 예상되는 출력 결과
		// "array에 들어 있는 홀수 : 33 25 123 99"

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.printf("%d ", array[i]);
			}

		}

	}

}
