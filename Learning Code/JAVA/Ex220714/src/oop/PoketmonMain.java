package oop;

public class PoketmonMain {

	public static void main(String[] args) {
		
		// PoketmonVO 클래스를 활용해
		// p1 인스턴스(객체)를 생성해주세요
		// 이 때, 포켓몬 이름, 타입, hp, atk, def는
		// 원하는 포켓몬으로!!
		PoketmonVO p1 = new PoketmonVO("메타몽", "노말", 48, 48, 48);
		
		// p2 인스턴스(객체)를 생성해주세요
		// 이 때, 포켓몬 이름, 타입, hp, atk, def는
		// 원하는 포켓몬으로!!
		PoketmonVO p2 = new PoketmonVO("뮤츠", "에스퍼", 100, 100, 100);
		
		// 첫 번째 포켓몬의 정보 출력!!(showInfo())
		// 두 번째 포켓몬의 정보 출력!!(showInfo())
		PoketmonVO p3 = new PoketmonVO("꼬부기", "물", 49, 40, 60);
		PoketmonVO p4 = new PoketmonVO("피죤", "비행", 43, 60, 40);
		PoketmonVO p5 = new PoketmonVO("파이리", "불", 50, 60, 45);
		PoketmonVO p6 = new PoketmonVO("버터풀", "곤충", 48, 60, 30);
		
		// 배열
		// 같은 data type을 다룰 수 있게 해주는 자료 구조
		PoketmonVO[] poketmon = new PoketmonVO[] {p1, p2, p3, p4, p5, p6}; // 객체 배열
		
		// 1. 모든 포켓몬의 이름 출력!
		for(int i = 0; i < poketmon.length; i++) {
			System.out.print(poketmon[i].getName() + "  ");
		}
		System.out.println();
		
		// 2. 모든 포켓몬의 hp를 1000으로 바꿔주세요
		for(int i = 0; i < poketmon.length; i++) {
			poketmon[i].setHp(1000);
		}
		
		// 3. 모든 포켓몬의 정보를 츨력해주세요(showInfo)
		for(int i = 0; i < poketmon.length; i++) {
			poketmon[i].showInfo();
		}
		
	}

}
