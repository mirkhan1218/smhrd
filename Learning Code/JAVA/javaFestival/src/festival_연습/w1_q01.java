package festival_연습;

import java.util.Scanner;

public class w1_q01 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int pw = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int gw = sc.nextInt();
		
		int week = 0;
		
		while(pw > gw) {
			week ++;
			System.out.printf("%d주차 감량 몸무게 : ", week);
			pw -= sc.nextInt(); 
		}
		System.out.printf("%dkg 달성!! 축하합니다!", pw);
		
	}

}
