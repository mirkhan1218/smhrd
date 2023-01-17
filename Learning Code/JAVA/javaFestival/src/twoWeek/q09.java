package twoWeek;

import java.util.Random;

public class q09 {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] lotto = new int[6];

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = rd.nextInt(99) + 1;

			for (int i = 0; i < j; i++) {
				if (lotto[j] == lotto[i]) {
					j--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의숫자 : " + lotto[i]);
		}
	}
}
