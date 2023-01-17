package twoWeek;

public class q01 {

	public static void main(String[] args) {

		int n = 5;

		int[][] arr = new int[n][n];
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = j + 5 * i + 1;
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}

	}

}
