package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		// 만든 프로그램의 설계도를 가지고와서 실행을 시키는 부분
		
		// 1. regular 객체를 만들기
		RegularEmployee re = new RegularEmployee("SMHRD002", "홍길동", 4000, 400);
		
		// 2. temp 객체를 만들기
		TempEmployee te = new TempEmployee("SMHRD001", "박문수", 3000);
		
		// 3. partTime 객체를 만들기
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "김장독", 10, 10);
		
		System.out.printf("%s : %d 만원%n", te.print(), te.getMoneyPay());
		System.out.printf("%s : %d 만원%n", re.print(), re.getMoneyPay());
		System.out.printf("%s : %d 만원%n", pe.print(), pe.getMoneyPay());
		
		
	}

}
