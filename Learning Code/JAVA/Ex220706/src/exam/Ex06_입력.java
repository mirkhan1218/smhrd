package exam;

import java.util.Scanner;

public class Ex06_입력 {

	public static void main(String[] args) {
		
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// Import 단축키 : Ctrl + Shift + O
		
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.print("이름을 입력해주세요 >> ");
		String name = sc.next();
		System.out.println(name);

	}

}
