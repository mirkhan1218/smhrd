package festival_연습;

public class w3_q04 { // 걸린 시간 : 03분 40초

	public static void main(String[] args) {
		
		int num = 5;
		
		for (int j = 0; j < num; j++) {
			for (int i = 0; i< num; i++) {
				if (j + i > 3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
