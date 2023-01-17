package festival_연습;

import java.util.Random;

public class w1_q11 { // 걸린 시간 : 06분 07초

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[8];
		
		System.out.print("배열에 있는 모든값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(99) + 1;
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}

}
