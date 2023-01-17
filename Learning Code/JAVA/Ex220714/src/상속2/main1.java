package 상속2;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {

		사자 사자1 = new 사자();
		독수리 독수리1 = new 독수리();
		늑대 늑대1 = new 늑대();

		// 모든 클래스의 최상위 클래스는 Object!!
		// 3클래스의 공통적인 부모클래스 : WildAnimal

		야생동물[] 동물원 = { 사자1, 독수리1, 늑대1 };
		// 자식클래스 -> 부모클래스
		// 자동 형변환
		// UpCasting
		// 1) 상위클래스의 속성과 메소드만 접근 가능
		// 단, 부모클래스의 메소드를 재정의(Overriding)했을떄는
		// 호출 가능
//		for(int i = 0; i < zoo.length; i++) {
//			zoo[i].hunt();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("보고싶은 동물은?");
		System.out.print("[1]사자 [2]독수리 [3]늑대");
		int input = sc.nextInt();

		// DownCasting
		// UpCasting 되어 있는 것을 강제로 원래 타입으로 돌리는 것
		if (input == 1) {
			((사자) 동물원[0]).모든걸사자();
		} else if (input == 2) {
			((독수리)동물원[1]).날기();
		} else if (input == 3) {
			((늑대) 동물원[2]).하울링();;
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

}
