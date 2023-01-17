package 월급계산프로그램;

public class RegularEmployee extends Employee {
	
	//regularemployee의 월급계산 프로그램을 설계
	// 필드
	
	int bonus; // 보너스
	
	// 메서드
	// 1. 생성자
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		// 객체 생성시 받아온 매개변수로
		// 해당 클래스의 필드를 바로 초기화!!!
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	// 월 급여를 계산하는 메서드
	@Override // 개발자의 주석
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}
	
	// 사원의 정보를 보내주는 메서드
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}

}
