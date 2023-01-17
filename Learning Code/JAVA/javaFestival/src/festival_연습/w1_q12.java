package festival_연습;

public class w1_q12 { // 걸린 시간 : 04분 01초

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		
	}
	public static boolean isDivide(int num1, int num2) {
		boolean result = false;
		
		if(num1 % num2 == 0) {
			result = true;
		}
		return result;
	}

}
