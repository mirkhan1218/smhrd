package 반복문;

public class Ex02_for문 {

	public static void main(String[] args) {

		// 1. 1 ~ 100까지 숫자중 3의 배수 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		// 2. 1 ~ 100까지 숫자중 3의 배수 이면서 5의 배수 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		// 1-2. 1 ~ 100까지 출력
		// 만약, 3의 배수라면 "짝" 출력
		// 1-3. 10의 배수라면 "만세" 출력
		// 단, 30처럼 3의 배수 이면서 10의 배수일 경우에는
		// 그냥 "만세"만 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.print("만세 ");

			} else if (i % 3 == 0) {
				System.out.print("짝 ");

			} else {
				System.out.print(i + " ");

			}

		}
		System.out.println();

	}

}
