package 반복문;

import java.util.Scanner;

public class Ex08_for문예제 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수의 약수를 구해보자.
		// 1) 입력하는 도구
		Scanner sc = new Scanner(System.in);

		String yaksoo = "";

		// 2) 사용자에게 정수 하나를 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		yaksoo += (num + "의 약수 : ");
		// 3) num의 약수를 구하자 == num을 나누어 떨어지게하는 수

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				yaksoo += i + " ";
			}

		}
		System.out.println(yaksoo);

	}

}
