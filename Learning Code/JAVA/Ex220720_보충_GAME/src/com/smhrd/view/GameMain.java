package com.smhrd.view;

import java.util.Scanner;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 내 캐릭터 저장 공간(변수)
		Charac myC = null;

		while (true) {
			System.out.println("[1]내캐릭터 생성 [2]게임모드 [3]내캐릭터 확인 [4]종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (myC == null) {
					System.out.println("내 캐릭터 생성하기!");
					System.out.println("[1]라이언 [2]춘식이");
					int select = sc.nextInt();

					if (select == 1) { // 라이언
						Ryan ryan = new Ryan();
						myC = ryan;

					} else { // 춘식이
						Chunsik cs = new Chunsik();
						myC = cs;
					}

				}else {
					System.out.println("이미 생성된 캐릭터가 있습니다!");
					
				}

			} else if (menu == 2) {
				System.out.println("게임모드!");
				
				// 상대 캐릭터 변수
				Charac opp = null;
				// instanceof : 원래 어떤 타입이었는지 확인
				// 나 라이언 - 상대 춘식 / 나 춘식 - 상대 라이언
				if(myC instanceof Ryan) { // 나 라이언
					Chunsik cs = new Chunsik();
					opp = cs;
					
				}else {
					Ryan ryan = new Ryan();
					opp = ryan;
					
				}
				
				while(true) {
					System.out.println("[1]공격 [2]방어");
					int select = sc.nextInt();
					
					if(select == 1) {
						// 내캐릭터 공격
						myC.attack(opp);
						
						// 상대방 방어
						opp.defence();
						// 상대방 데미지 = 내캐릭터 공격력 - 상대방 방어력
					}else { // 2
						myC.defence();
						opp.attack(myC);
					}
					System.out.println("내 hp : " + myC.getHp());
					System.out.println("상대방 hp : " + opp.getHp());
					
				}
				
			} else if (menu == 3) {

			} else { // 4
				System.out.println("게임종료");
				break;
			}
		}

	}

}
