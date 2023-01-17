package exam;

public class Ex02_데이터타입 {

	public static void main(String[] args) {
		
		// Ctrl + Space : 자동완성!!
		
		// 1. 논리형 boolean
		// 자료의 크기 : 1bit or 1byte(= 8bit)
		boolean check = true;
		System.out.println(check);
		
		// 2. 문자형 char
		// 자료의 크기 : 2byte
		char grade = 'A';
		System.out.println(grade);
		
		// 3. 정수형		byte	short	int		long
		// 자료의 크기		1byte	2byte	4byte	8byte
		byte age = 36;
		short lunchPrice = 8000;
		int furtureSalary = 10000000;
		long popular = 7000000000L;

		// 한 줄 복사 : Ctrl + Alt + 위 or 아래 (↑/↓) 방향키
		System.out.println(age);
		System.out.println(lunchPrice);
		System.out.println(furtureSalary);
		System.out.println(popular);
		
		// 4. 실수형		float	double
		// 자료의 크기		4byte	8byte
		float inch = 2.5f;
		double weight = 74.5;
		System.out.println(inch);
		System.out.println(weight);
		
		double num1 = 1.1;
		double num2 = 2.2;
		System.out.println(num1 + num2);
		
	}

}
