package festival_연습;

import java.util.Scanner;

public class w3_q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		
		String ans = "";
		
		while(num > 0) {
			ans = (num % 2) + " " + ans;
			num = num / 2;
				
			}
		System.out.println(ans);
			
		}
		
	}
