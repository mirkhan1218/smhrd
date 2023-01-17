package 반복문;

public class Ex01_for문 {

	public static void main(String[] args) {

		int i = 1;
		// 1. 21 ~ 57까지 출력
		for (i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. 96 ~ 53까지 출력
		for (i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. 21 ~ 57까지 중 홀수만 출력
		for (i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");

			}
			
		}

	}

}
