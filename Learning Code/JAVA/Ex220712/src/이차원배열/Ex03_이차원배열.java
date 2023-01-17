package 이차원배열;

public class Ex03_이차원배열 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		// 입력
		int cnt = 21;
		
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++;
			}
		}
		
		// 출력은 가로로 진행!!
		// 출력문장을 다 써보고
		// for문으로 줄이고
		// 다시 이중 for문으로 감싸고!!
		
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array[j].length; i++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
//		for(int j = 0; j < array.length; j++) {
//			for(int i = 0; i < array[j].length; i++) {
//				System.out.printf("%2d ", array[j][i]);
//			}
//			System.out.println();
//		}
	}
}
