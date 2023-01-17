package 메서드;

public class Ex08_완전수 {

	public static void main(String[] args) {
		// 1. num2가 num1의 약수인지 확인하여 true 또는 flase를 반화하는
		// isDivisor()메소드를 구현
//		int num1 = 9;
//		int num2 = 2;
//		boolean divisor = isDivisor(num1, num2);
//
//		System.out.println(divisor);

		// 2. 약수를 구하는 getDivisor()메소드를 구현하세요.
//		getDivisor(10);
//		getDivisor(16);
//		getDivisor(24);

		// 3. 약수의 합을 구하여 반환하는 getSumOfDivisors()메소드를 구현하세요.
//		int num = 10;
//		int result = getSumOfDivisors(num);
//
//		System.out.println(num + "의 약수의 합 : " + result);
//
//		getDivisor(num);
		
		// 4. starVlaue ~ endValue까지의 숫자 중 완전수를 출력하는
		//    getPerfectNumber() 메소드를 구현하세요.
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	// 메스드 명앞에 is라는 키워드가 붙어있으면
	// 리턴타입이 boolean입니다.
	// 1. isDivisor()
	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	// 2. getDivisor()
	public static void getDivisor(int num) {
		System.out.printf("%d의 약수 : ", num);

		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	// 3. getSumOfDivisors()
	public static int getSumOfDivisors(int num) {
		int sum = 0;

		for (int i = 1; i <= num/2; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum + num;
	}
	// 4. getPerfectNumber()
	public static void getPerfectNumber(int num1, int num2) {
		System.out.print(num1 + " ~ " + num2 + "까지의 완전수 : ");
		for (int i = num1; i <= num2; i++) {
			if((getSumOfDivisors(i) - i) == i) {
				System.out.print(i + " ");
			}
		}
	}
}
