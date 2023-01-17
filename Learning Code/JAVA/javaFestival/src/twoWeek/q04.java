package twoWeek;

public class q04 {

	public static void main(String[] args) {

		int num = 5;

		int[][] arr = new int[num][num];

		for (int j = 0; j < arr.length; j++) {
			if (j % 2 == 0) { // 홀수줄
				for (int i = 0; i < arr[j].length; i++) {
					arr[j][i] = 5 * j + i + 1;
					System.out.printf("%2d ", arr[j][i]);
				}
			} else { // 짝수줄
				for (int i = 0; i < arr[j].length; i++) {
					arr[j][i] = 5 * j - i + 5;
					System.out.printf("%2d ", arr[j][i]);
				}

			}
			System.out.println();

		}

	}

}
