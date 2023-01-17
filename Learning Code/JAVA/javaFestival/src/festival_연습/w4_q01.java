package festival_연습;

public class w4_q01 {

	public static void main(String[] args) {

		int num = 5;

		System.out.println("원본");
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print((5 * j) + i + 1 + " ");
			}
			System.out.println();

		}
		System.out.printf("%n90도 회전%n");
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print((5 - j) + (5 * i) + " ");
			}
			System.out.println();

		}

	}

}
