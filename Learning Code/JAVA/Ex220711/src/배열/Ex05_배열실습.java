package 배열;

public class Ex05_배열실습 {

	public static void main(String[] args) {

		int[] array = { 10, 44, 55, 7, 81 };

		int max = array[0]; // 최댓값을 저장하는 변수

		// "array안에 가장 근 값은 : 81"

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.printf("array안에 가장 큰 값은 : %d", max);

	}

}
