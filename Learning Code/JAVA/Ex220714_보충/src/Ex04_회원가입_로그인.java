import java.util.Scanner;

public class Ex04_회원가입_로그인 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		// 프로그램 실행하면

		// [1]회원가입 [2]로그인 [3]종료 >>

		// 입력받은 정수를
		// menu 변수에 담아주고,
		// 조건문을 사용해서

		// menu == 1이라면
		// ====회원가입====
		// menu == 2이라면
		// ====로그인====
		// menu == 3이라면
		// ====프로그램 종료====

		// while문을 통해
		// 프로그램을 계속 동작시켜
		// menu가 3일 때, while문이 끝나게 만들어주세요

		// String 배열을 만들건데 배열이름 : id, 크기 : 3칸
		// String 배열을 만들건데 배열이름 : pw, 크기 : 3칸
		String[] id = new String[3];
		String[] pw = new String[3];

		String inputId = " ";
		String inputPw = " ";

		id[0] = "배미리칸";
		pw[0] = "1234";

		id[1] = "인공지능";
		pw[1] = "0704";

		boolean check = true; // 전체 while 판단 변수
		while (check) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("====회원가입====");
				System.out.print("ID를 입력해주세요 >> ");
				id[2] = sc.next();
				System.out.print("PW를 입력해주세요 >> ");
				pw[2] = sc.next();
				System.out.println("회원가입 성공!");

			} else if (menu == 2) {
				System.out.println("====로그인====");
				
				boolean check2 = true; // 로그인 성공 or 실패 판단 변수
				
				while (check2) {
					System.out.print("ID를 입력해주세요 >> ");
					inputId = sc.next();
					System.out.print("PW를 입력해주세요 >> ");
					inputPw = sc.next();

					for (int i = 0; i < id.length-1; i++) {
						if (id[i].equals(inputId) && pw[i].equals(inputPw)) {
							System.out.println("로그인 성공");
							check = false; // 전체 while을 빠저나오기 위해 할당
							check2 = false; // 로그인 페이지를 빠저나오기 위해 할당
							break;
						}
					}
					if(check) {
						System.out.println("로그인 실패");
					}
				}

			} else if (menu == 3) {
				System.out.println("====프로그램 종료===");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");

			}

		}

	}

}
