package 반복문;

import java.util.Scanner;

public class Ex05_Login프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id = "Hello";
		int pass = 1234;
		int i = 0;

		while (true) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String tid = sc.next();

			System.out.print("비밀번호를 입력해 주세요 >> ");
			int pw = sc.nextInt();

			if (tid.equals(id) && pass == pw) {
				System.out.println("로그인 성공!");

				break;
			} else {
				i++;

				if (i == 3) {
					System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
					System.out.println("본인인증을 해주세요");
					break;
				} else if (i < 3) {
					System.out.println("아이디와 비밀번호가 " + i + "회 잘못되었습니다.");

					String yes = "Y";
					String no = "N";

					String select;

					do {
						System.out.print("계속 하시겠습니까? (Y/N)");
						select = sc.next();

						if (select.equalsIgnoreCase(yes) || select.equalsIgnoreCase(no)) {
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}

					} while (true);

					if (select.equalsIgnoreCase(no)) {

						System.out.println("종료합니다");
						break;

					}

				}

			}

		}

	}

}
