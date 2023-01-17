package threeWeek;

public class q4 {

	public static void main(String[] args) {

		int num = 5;

		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				if (i > (3 - j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
