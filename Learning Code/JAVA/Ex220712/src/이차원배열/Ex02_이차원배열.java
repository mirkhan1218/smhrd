package 이차원배열;

public class Ex02_이차원배열 {

	public static void main(String[] args) {
		// 5행(row) 5열(column)의 2차원 정수 배열
		int[][] array = new int[5][5];

		// 입력
		int cnt = 1; // cnt : count 약자
		
		for (int j = 0; j < array.length; j++) {
			for(int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++; 
			}
		}

		// 출력
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.printf("%2d ", array[j][i]);
			}
			System.out.println();
		}
	}
}