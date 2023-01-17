package festival_연습;

import java.util.Scanner;

public class w2_q05 { // 걸린 시간 : 6분 56초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		int[] result = new int[num];
		for (int i = 0; i < result.length; i++) {
			if(i == 0) {
				result[i] = 1;
			}else{
				result[i] = result[i - 1] + i; 
			}
			System.out.print(result[i] + " ");
		}
		
		
	}

}
