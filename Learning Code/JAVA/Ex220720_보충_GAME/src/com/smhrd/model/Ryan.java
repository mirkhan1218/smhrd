package com.smhrd.model;

public class Ryan extends Charac {
	// 라이언 객체 생성
	// 속성 -> 기본값 가지고 있어야 될때?
	// type : 라이언
	// level : 1
	// hp : 50
	// xp : 0
	// atk : 10
	// def : 5

	// 생성자
	public Ryan() {
		// 부모 생성자 호출
		// 기본생성자 호출
		super("라이언", 1, 50, 0, 10, 5);
	}

	@Override
	public void skill() {
		System.out.println("라이언 스킬!");
	}

}
