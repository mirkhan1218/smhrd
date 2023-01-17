package festival_연습;

import java.util.Scanner;

public class w4_q09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");

		String word = sc.nextLine();
		char[] arr = new char[word.length()];
		int[] refer = new int[(int) ('z' - 'a') + 1];
		int[] result = new int[refer.length];
//		System.out.println(refer.length);

		for (int i = 0; i < refer.length; i++) {
			refer[i] = i + 'a';
//			System.out.print(refer[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
//			System.out.print(Arrays.toString(arr));
			String a = String.valueOf(arr[i]);

			int j = 0;
			while (true) {
				String b = String.valueOf((char) refer[j]);
				if (b.equalsIgnoreCase(a)) {
					result[j]++;
					break;
				} else if (a.equalsIgnoreCase(" ")) {
					break;
				}
				j++;

			}

		}
		for (int i = 0; i < refer.length; i++) {
			System.out.printf("%s : %d%n", (char) refer[i], result[i]);

		}
	}

}
