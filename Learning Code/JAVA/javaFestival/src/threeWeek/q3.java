package threeWeek;

import java.util.Arrays;

public class q3 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int[] pointIndex = new int[2];
		int subMin = point[0] - point[1];

		for (int j = 0; j < point.length; j++) {
			for (int i = j + 1; i < point.length; i++) {
				int sub = point[j] - point[i];

				if (point[j] < point[i]) {
					sub = point[i] - point[j];
				}

				if (sub < subMin) {
					subMin = sub;

					pointIndex[0] = j;
					pointIndex[1] = i;
				}

			}

		}
		System.out.println("result = " + Arrays.toString(pointIndex));

	}

}
