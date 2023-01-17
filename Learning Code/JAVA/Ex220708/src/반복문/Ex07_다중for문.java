package 반복문;

public class Ex07_다중for문 {

	public static void main(String[] args) {

		for (int j = 2; j <= 30; j++) {
			System.out.print(j + "의 약수 : ");

			int k = 0;
			
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					k += 1;
					System.out.print(i + "  ");
				}

			}
			System.out.println("[" + k + "개]");

		}

	}

}
