package oop;

public class clacuratorMain2 {

	public static void main(String[] args) {
		
		double num1 = 1.1;
		double num2 = 2.2;
		
		Calcurator cal = new Calcurator();
		System.out.println("두 수의 합 : " + cal.add(num1, num2));
		System.out.println("두 수의 합 : " + cal.add(3, 5));
		System.out.println("세 수의 합 : " + cal.add(3, 5, 7));
		
		
	}

}
