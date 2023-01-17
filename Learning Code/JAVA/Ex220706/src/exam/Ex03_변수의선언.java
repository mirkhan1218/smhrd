package exam;

public class Ex03_변수의선언 {

	public static void main(String[] args) {
		// 한 줄 제거 : Ctrl + D
		
		int age;	// 변수의 선언
		age = 21;	// 변수의 할당 (단, 최초 할당 -> 초기화)
		
		age = 22;	// 변수의 재할당
		System.out.println(age);
		
		// int age; 변수의 재선언 불가(JAVA에서)
		
		// 상수 (대문자로 표현)
		final double PI = 3.141592;
		// PI = 5.8; 상수는 재할당 불가!!
		System.out.println(PI);
	}

}
