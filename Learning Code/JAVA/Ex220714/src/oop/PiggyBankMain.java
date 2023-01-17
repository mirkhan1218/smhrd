package oop;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		// PiggyBank 클래스를 통해
		// 저금통 pb1을 생성하고
		// 생성할 때, 2000원을 기본금액으로 설정!!
		PiggyBank pb1 = new PiggyBank(2000);
		// showMoney() 호출해서 잔액 확인!!
		pb1.showMoney();
		// 3000원 입금 (deposit())
		pb1.deposit(3000);
		// showMoney() 호출해서 잔액 확인!!
		pb1.showMoney();
		// 1000원 출금 (withdraw())
		pb1.withdraw(1000);
		// showMoney()호출해서 잔액 확인!!
		pb1.showMoney();
		
//		pb1.money = 2000000000;
		pb1.showMoney();

	}

}
