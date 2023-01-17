package com.smhrd.model;

public class Chunsik extends Charac {

	// 생성자
	public Chunsik() {
		// 부모 생성자 호출
		// 기본생성자 호출
		super("춘식", 1, 50, 0, 9, 7);
	}

	@Override
	public void skill() {
		System.out.println("춘식이 스킬!");
	}

}
