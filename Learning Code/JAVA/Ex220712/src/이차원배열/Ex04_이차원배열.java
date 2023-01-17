package 이차원배열;

public class Ex04_이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int cnt = 21;

		// 입력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++;
			}
		}

		// 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.printf("%2d ", array[j][4 - i]);
			}
			System.out.println();
		}
	}
}
