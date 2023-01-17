package festival_연습;

public class w1_q03 { // 걸린시간 : 03분 26초

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.print(i + " ");
			}else {
				sum -= i;
				System.out.print(-i + " ");
			}
		}
		System.out.println();
		System.out.printf("결과 : %d", sum);
	}

}
