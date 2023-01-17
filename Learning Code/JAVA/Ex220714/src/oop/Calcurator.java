package oop;

public class Calcurator {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	// double 형태의 두 실수를 더해서 double type return
	// 이 때, method 이름은 add_double()
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	// Method Overloading
	// 한 클래스 내에서 Method 이름을 중복정의
	// 1. 매개 변수 type이 달라야 함
	// 혹은, 2. 매개 변수 개수가 달라야 함
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public double add(int num1, double num2) {
		return num1 + num2;
	}
	public double add(double num1, int num2) {
		return num1 + num2;
	}
}
