package 메서드;

public class Ex06_메서드실습 {

	public static void main(String[] args) {
		
		// main 고정
		add(3, 5);
		// 매개변수가 int 자료형 2개
		// 출력하는 기능 ---> 리터타입이 void
		
		sum(3, 5);
		mul(3, 5);
		div(3, 5);
		
	}
	public static void add(int num1, int num2) {
		// num1과 num2를 더한 결과값을 출력하는 기능
		System.out.println(num1 + num2);
	}
	public static void sum(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
