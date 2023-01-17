package festival_연습;

public class w2_q04 { // 걸린 시간 : 06분 37초

	public static void main(String[] args) {
		
		int num = 5;
		int[][] arr = new int[num][num];
		
		for(int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				if(j % 2 == 0) {
					arr[j][i] = (5 * j) + i + 1;
				}
				else {
					arr[j][i] = (5 * j) - i + 5;
				}
				System.out.print(arr[j][i] + " ");
				
			}
			System.out.println();
		}
		
	}

}
