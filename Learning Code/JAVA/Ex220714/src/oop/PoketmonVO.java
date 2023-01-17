package oop;

public class PoketmonVO {
	private String name; // 이름
	private String type; // 타입
	private int hp; // 생명력
	private int atk; // 공격력
	private int def; // 방어력
	
	// 생성자 메소드
	// 마우스 우클릭 > Source > Generate Constructor using Fields
	public PoketmonVO(String name, String type, int hp, int atk, int def) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	public void attack() {
		System.out.printf("%s은(는) %d의 공격력으로 공격!!", name, atk);
	}
	public void showInfo() {
		System.out.printf("이름 : %s\t타입 : %s\thp : %3d\tatk : %3d\tdef : %3d%n", name, type, hp, atk, def);
	}
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
