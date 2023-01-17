package kr.board.util;

// Model(Utility)
public class MyUtil {
	// 1 ~ 10 = ?
	public int hap() {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += i + 1;
		}
		return sum;
	}

	public int hap(int num1, int num2) {
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		return sum;
	}

}
