package 조건문;

import java.util.Scanner;

public class Ex01_if문 {

	public static void main(String[] args) {
		
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		// age가 20살 이상인지 판단 : "성인입니다." 출력하기
		if(age>=20) {							// 단순 if문 --->	if(조건식) {
			System.out.println("성인입니다.");		//					실행코드
		}else {
			System.out.println("청소년입니다.");
		}
		
	}

}
