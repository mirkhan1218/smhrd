package 이차원배열;

public class Ex00_치환 {

	public static void main(String[] args) {
		
		// 치환
		
		int num1 = 10;
		int num2 = 20;
		
		// num1 값과 num2의 값을 바꾸고 싶다
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1); // 10 -> 20 출력
		System.out.println(num2); // 20 -> 10 출력
		
	}

}
