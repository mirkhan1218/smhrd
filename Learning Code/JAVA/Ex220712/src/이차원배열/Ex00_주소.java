package 이차원배열;

import java.util.Scanner;

public class Ex00_주소 {

	public static void main(String[] args) {
		
		String[] snack = {"맛동산", "짱구는못말려", "뿌셔뿌셔딸기맛"};
		String[] drink = {"솔의눈", "아침햇살", "맥콜"};
		
		System.out.println(snack[0]); // 맛동산
		System.out.println(drink[0]); // 솔의눈
		
		drink = snack;
		
		System.out.println(snack[0]); // 맛동산
		System.out.println(drink[0]); // 맛동산
		
		snack[0] = "뿌셔뿌셔메론맛";
		
		System.out.println(snack[0]); // 뿌셔뿌셔메론맛
		System.out.println(drink[0]); //
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(num);
		
	}

}
