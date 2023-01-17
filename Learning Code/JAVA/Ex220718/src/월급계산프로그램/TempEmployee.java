package 월급계산프로그램;

public class TempEmployee extends Employee {
	// 설계도
	// 필드
//	String empno;
//	String name;
//	int pay;

	public TempEmployee(String empno, String name, int pay) {
		// super(); ---> 부모클래스
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public int getMoneyPay() {
		return pay / 12;
	}

//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}
}
