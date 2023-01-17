package 조건문;

import java.util.Scanner;

public class Ex06_ifelseif문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		char grade;

		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >= 80) {
			grade = 'B';
		} else if (totalScore >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println(grade + "학점입니다");

	}

}
