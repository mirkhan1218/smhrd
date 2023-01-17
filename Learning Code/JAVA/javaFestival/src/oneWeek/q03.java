package oneWeek;

public class q03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.print(i + " ");
			} else {
				sum -= i;
				System.out.print("-" + i + " ");
			}
		}
		System.out.printf("%n결과 : %d", sum);

	}

}
