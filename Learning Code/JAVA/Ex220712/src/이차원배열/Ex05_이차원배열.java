package 이차원배열;

public class Ex05_이차원배열 {

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
				if (j % 2 == 1) { // 홀수행
					System.out.printf("%2d ", array[j][4 - i]);
				} else { // 짝수행
					System.out.printf("%2d ", array[j][i]);
				}
			}
			System.out.println();
		}

//		// 출력부
//		for(int j = 0; j < 5; j++) {
//			for(int i = 0; i < 5; i++) {
//				System.out.printf("%2d ", array[4 - i][4 - j]);
//			}
//			System.out.println();
//		}

//		// 출력부
//		for (int j = 0; j < array.length; j++) {
//			for (int i = 0; i < array[j].length; i++) {
//				System.out.printf("%2d ", array[4 - i][j]);
//			}
//			System.out.println();
//		}
	}
}
