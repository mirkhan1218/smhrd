package twoWeek;

import java.util.Scanner;

public class q05 {

	public static void main(String[] args) {
		
		// 입력부
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		// 1, 2, 4, 7, 11과 같은 수열의
		// n번째 항까지 출력하시오.
		
		int[] sum = new int[num];
		
		for(int i = 0; i < sum.length; i++) {
			if(i == 0) {
				sum[i] = 1;

			}else {
				sum[i] = sum[i - 1] + i;			
			}
			System.out.print(sum[i] +  " ");
		}
		
	}

}
