import java.util.Scanner;

public class Ex03_배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 >> ");
		int[] score = new int[sc.nextInt()];

		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.print("입력된 점수 : ");

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();

		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("점수 총합 : " + sum);
		System.out.println("점수 평균 : " + (sum / score.length));

	}

}
