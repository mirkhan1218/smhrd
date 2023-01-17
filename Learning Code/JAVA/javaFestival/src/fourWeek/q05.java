package fourWeek;

import java.util.Scanner;

public class q05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		String word = sc.next();
		
		char[] arr = new char[word.length()];
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
			if(arr[i] == 'o') {
				sum ++;
			}else if(arr[i] == 'x') {
				sum = 0;
			}
			result += sum;
			
		}
		System.out.println(result);
	}

}
