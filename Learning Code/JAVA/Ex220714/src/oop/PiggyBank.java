package oop;

public class PiggyBank {
	
	// 접근 제한자(Access Modifiers)
	// public : 어디에서나 접근 가능
	// protected : 상속 혹은 같은 패키지에서 접근 가능
	// (default) : 같은 패키지에서 접근 가능
	// private : 같은 클래스내에서만 접근 가능
	private int money;
	
	// 생성자 메소드
	// 1. 메소드의 이름은 클래스의 이름과 동일
	// 2. 리턴 타입을 지정할 수 없다
	// 3. new 키워드를 통해 생성될 때 호출된다
	// 4. 반드시 하나 이상 선언되어야 한다
	// 단, 생성하지 않았다면 compile시 기본 생성자가 만들어짐
	public PiggyBank(int money) {
		this.money = money;
	}
	
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void showMoney() {
		System.out.printf("현재 잔고 : %d원%n", this.money);
	}
}
