package 메서드;

import java.util.Scanner;

public class Ex07_메서드실습 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '*';

		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, char op) {
		int result = 0; // nullPoint 오류를 없애기 위해 초기화 한다.
		
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if(op =='/'){
			result = num1 / num2;
		}

		// return이 if문 안에 있으면 else문으로
		// 모든 경우에 대해서 return을 해줘야 한다.
		// 메서드 사용할떄 모든 경우에 대해서 꼭!!!!!
		// 어떤 값이 리턴외어야 한다.
		return result;
	}

}
