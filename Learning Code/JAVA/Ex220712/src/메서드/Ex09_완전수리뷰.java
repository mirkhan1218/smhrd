package 메서드;

public class Ex09_완전수리뷰 {

	public static void main(String[] args) {
		// 완전수 : 자기 자신을 제외한 약수의 합이
		// 자기 자신과 같을 떄
		// 예) 6 : 1 + 2 + 3 = 6
		// 예) 12 : 1 + 2 + 3 + 4 + 6 = (16) != 12
		System.out.println(getSumOfDivisors(6)); // 12
		System.out.println(getSumOfDivisors(12)); // 28
		
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(12));
		
		printPerfectNumber(2, 1000);
		
	}

	// isDivisor(6, 3) => 3이 6의 약수니? boolean type
	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		}
		return false;
	}

	// getSumOfDivisors(12) => 16
	public static int getSumOfDivisors(int num) {
		int sum = 0;
		
		// 자기 자신(num)을 제외한
		// 가장 큰 약수는 num/2이다.
		// 따라서, num/2까지만 검사하고
		// 자기 자신은 무조건 약수니까
		// 마지막에 추가적으로 더해주자
		for (int i = 1; i <= num/2; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		sum += num;
		return sum;
	}
	
	// isPefectNumber(6) => 6이 완전수니? boolean type
	public static boolean isPerfectNumber(int num) {
		if (getSumOfDivisors(num) == 2*num) {
			return true;
		}
		return false;
	}
	
	// printPerfectNumber(2, 1000) => 2 ~ 1000 사이의 완전수 출력!!
	public static void printPerfectNumber(int start, int end) {
		String result = " ";
		
		for (int i = start; i <= end; i++) {
			if(isPerfectNumber(i)) {
				result += i + " ";
			}
		}
		System.out.printf("%d ~ %d 사이의 완전수 : %s", start, end, result);
	}
}
