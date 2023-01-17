package festival_연습;

import java.util.Arrays;

public class w3_q03 { // 걸린 시간 : 08분 57초

	public static void main(String[] args) {

		int[] point = { 92, 35, 52, 9, 81, 2, 68 };
		
		int[] resultIndex = new int[2];
		int temp = point[0] - point[1];
		int sub = 0;

		for (int j = 0; j < point.length; j++) {
			for (int i = j + 1; i < point.length; i++) {
				if (point[i] > point[j]) {
					sub = point[i] - point[j];
				} else {
					sub = point[j] - point[i];
				}
				
				if (temp > sub) {
					temp = sub;
					
					resultIndex[0] = j;
					resultIndex[1] = i;
				}

			}

		}
		System.out.print("result = ");
		System.out.println(Arrays.toString(resultIndex));

	}

}
