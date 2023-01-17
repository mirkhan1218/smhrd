package 반복문;

import java.util.Random;

public class Ex00_Random {

	public static void main(String[] args) {
		
		// 랜덤 기능
		Random rd = new Random();
		
		int num = rd.nextInt(10) + 1; // 1 ~ 10까지 랜덤한 숫자를 가지고 온다.
		System.out.println(num);
		
	}

}
