package 연산자;

public class Ex05_논리연산자 {

	public static void main(String[] args) {
		
		// 1. 부정 연산자 : !(NOT)(아니면,)
		boolean result = false;
		System.out.println(!result);	//true
		
		// 2. AND 연산자 : &&(둘다만족할시, 그리고)
		// 두 개의 항 모두 true이면 결과값이 true
		// true && true ----> true
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1==num2&&num1>=num2);	//true && true ---> true
		System.out.println(num1==num2&&num1>num2);	//true && false ---> false
		System.out.println(num1!=num2&&num1>num2);	//false && false ---> false
		
		// 3. OR 연산자 : ||(또는)
		// 두 개의 항 중에서 하나라도 true이면 결과값이 true
		System.out.println(num1==num2||num1>=num2);	//true || true ---> true
		System.out.println(num1==num2||num1>num2);	//true || false ---> true
		System.out.println(num1!=num2||num1>num2);	//false || false  --->false
		
	}

}
