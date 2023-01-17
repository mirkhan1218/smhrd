package 객체배열;

import java.util.ArrayList;

public class Ex02_ArrayList {

	public static void main(String[] args) {

		// 생성하기
		// 마지막에 소괄호 꼭 작성하기.
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		// list.get(0); ~ list.get(9);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
