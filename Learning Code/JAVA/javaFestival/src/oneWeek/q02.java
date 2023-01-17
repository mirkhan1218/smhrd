package oneWeek;

import java.util.Scanner;

public class q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = 0;
		
		if (time <= 8) {
			pay = 5000 * time;
		}else if (time > 8) {
			pay += (1.5 * 5000 * (time - 8)) + (5000 * 8);
		}
		System.out.print("총 임금은 " + pay + "원 입니다.");
	}

}
