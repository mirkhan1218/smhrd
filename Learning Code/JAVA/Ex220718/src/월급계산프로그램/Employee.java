package 월급계산프로그램;

public abstract class Employee {
	// 클래스안에 추상메서드가 하나라도 있으면 추상클래스로 만들어줘야한다.
	
	// 클래스
	// 필드
	String empno; // 사번
	String name; // 이름
	int pay; // 연봉(일당)

	// 메서드
	// getMoneyPay ---> 추상메서드
	// ---> {}(body)가 3개 다 달라
	// getMoneyPay를 오버라이딩 할 수 있게만 해주자
	public abstract int getMoneyPay(/*매개변수 없음*/);
	
	// print ---> 일반메서드
	// ---> {}(body)까지 똑같은 메서드
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
