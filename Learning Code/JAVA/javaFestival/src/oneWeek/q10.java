package oneWeek;

public class q10 {

	public static void main(String[] args) {
		System.out.printf("10진수\t16진수\t문자%n");

		for (int i = 65; i <= 90; i++) {
			System.out.printf("%2d	0x%2h	%s%n", i, i, (char)i);
		}

	}

}
