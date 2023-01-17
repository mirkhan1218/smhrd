package 메서드;

public class Ex03_매o리x {

	public static void main(String[] args) {
		
		printAdd(3,5);
		// 값이 아닌 3 + 5를 바로 출력해주는 기능을 가지고 있는 메서드를
		// 호출하는 중
		// System.out.println(printAdd(3, 5));
		// 출력하는 기능을 출력하려고하면 오류발생(불가능!)
		
	}
	public static void printAdd(int num1, int num2) {
		// return xxx~!!!
		System.out.println(num1 + num2);
	}

}
