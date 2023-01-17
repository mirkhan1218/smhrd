package 배열;

import java.util.Scanner;

public class Ex07_배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d번째 입력 >> ", i + 1);
			array[i] = sc.nextInt();
		}

		System.out.print("입력된 점수 : ");

		int min = array[0];
		int max = array[0];
		int sum = 0;
		double avg = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}
		System.out.println();

		avg = (double) sum / array.length;

		System.out.printf("최고 점수 : %d%n", max);
		System.out.printf("최저 점수 : %d%n", min);
		System.out.printf("총합 : %d%n", sum);
		System.out.printf("평균 : " + avg);

	}

}
