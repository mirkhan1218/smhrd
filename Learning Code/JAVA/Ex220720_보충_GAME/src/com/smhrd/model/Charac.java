package com.smhrd.model;

public abstract class Charac {
	// 필드(속성)
	private String type; // 타입
	private int level; // 레벨
	private int hp; // 체력
	private int xp; // 경험치
	private int atk; // 공격력
	private int def; // 방어력
	
	public Charac(String type, int level, int hp, int xp, int atk, int def) {
		this.type = type;
		this.level = level;
		this.hp = hp;
		this.xp = xp;
		this.atk = atk;
		this.def = def;
	}
		
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	// 공격기능 - 상대방 데미지 입혀야함 -> 상대방 명시!!!
	public void attack(Charac c) {
		// 라이언(type)이 춘식(type)이 공격
		// .type
		System.out.println(this.type + "이 " + c.type + "을 공격!");
		// this.getType()
//		c.hp = c.hp - this.atk + c.def;
		c.setHp(c.getHp() - this.atk + c.def);
	}
	// 방어기능
	public void defence() {
		System.out.println("방어!");
	}
	// 스킬기능
	public abstract void skill();
}
