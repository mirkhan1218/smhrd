package exam;

public class Ex04_형변환 {

	public static void main(String[] args) {
		
		int num;
		double num2 = 3.141592;
		num = (int)num2;	// 강제 형변환, 명시적 형변환 explicit casting
		System.out.println(num);
		
		double num3;
		int num4 = 18;
		num3 = num4;		// 자동 형변환, 묵시적 형변환 implicit casting
		System.out.println(num3);
		
	}

}
