package com.smhrd.view;

import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class TestMain {

	public static void main(String[] args) {
		// 라이언 생성
		Ryan ryan = new Ryan();
		System.out.println(ryan.getType());
		ryan.skill();
		
		// 춘식이 생성
		Chunsik cs = new Chunsik();
		System.out.println(cs.getType());
		cs.skill();
		
	}

}
