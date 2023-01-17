package 월급계산프로그램;

public class PartTimeEmployee extends Employee{
	
//	String empno;
//	String name;
//	int pay;
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		// super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}
//	public String print() {
//		return empno + " : " + name + " : " + pay;
	}
//}
