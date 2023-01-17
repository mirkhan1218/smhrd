package 메서드;

public class Ex02_매o리o {

	public static void main(String[] args) {
		
		add(3,5);
		System.out.println(add(3, 5));
	}
	
	// main 밖에서 메서드 정의
	public static int add(int num1, int num2) {
		
		return num1 + num2;
	}

}
