package festival_연습;

import java.util.Scanner;

public class w1_q02 { // 걸린시간 : 03분 21초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int workHr = sc.nextInt();
		int pay = 0;
		
		if (workHr <= 8) {
			pay = 5000 * workHr;
		}else {
			pay = (int)((workHr - 8) * 5000 * 1.5 + 40000);
		}
		System.out.printf("총 임금은 %d원 입니다.", pay);
		
	}

}
