package 배열;

public class Ex02_배열동시 {

	public static void main(String[] args) {

		// 배열 선언 및 생성
		int[] array = new int[5];

		// 배열 선언 및 생성과 동시에 초기화
		// int[] scores = new int[] {10, 20, 30, 40, 50, 60, 70}; <--- new int[] 생략 가능
		int[] scores = { 10, 20, 30, 40, 50, 60, 70 };
		
		// 배열.length : 배열의 크기를 return

		// 반복문(for문)
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}
