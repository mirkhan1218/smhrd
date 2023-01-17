package festival_연습;

import java.util.Random;

public class w2_q09 { // 걸린 시간 : 15분 12초

	public static void main(String[] args) {

		Random rd = new Random();

		int[] lotto = new int[3];

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = rd.nextInt(3) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[j] == lotto[i]) {
					j--;
					break;

				}

			}
			
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
			
		}

	}

}
