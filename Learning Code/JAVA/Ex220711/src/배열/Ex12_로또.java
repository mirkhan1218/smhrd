package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex12_로또 {

	public static void main(String[] args) {

		Random rd = new Random();

		// 로또645

		int[] lotto = new int[6];

		// 6칸짜리 lotto라는 배열에 각 공간에
		// 1 ~ 45까지 숫자를 랜덤하게 뽑아서

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1; // 1 ~ 45까지 숫자 랜덤하게 생성

			// 중복체크
			// 만약, 지금 뽑은 값이
			// 이전에 한 번이라도 뽑힌 적이 있다면
			// 다시 뽑자

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}

			}

		}

		// 1차원 배열의 출력
		// Arrays.toString

		System.out.print(Arrays.toString(lotto));

	}

}
