package 배열;

public class Ex01_배열 {

	public static void main(String[] args) {

		// 변수의 선언
		int num;
		// 변수의 할당
		num = 5; // 최초 할당 : 초기화

		// java점수 5개를 담는 배열
		int[] scores; // 배열의 선언
		scores = new int[5]; // 배열의 생성
		// new : 레퍼런스 데이터 자료를 heap 영역에 생성
		// 배열은 생성 시 크기가 지정되어야 한다
		// 배열의 인덱스는 0부터 시작한다
		System.out.println(scores);
		scores[0] = 5;
		scores[1] = 7;
		scores[2] = 9;
		scores[3] = 11;
		scores[4] = 13;
		// 3번쨰 사람의 java점수 출력
		System.out.println(scores[2]);

		// String
//		String name = new String("배미리칸");
		String name = "배미리칸";// <-- java가 compile할 때 자동으로 new 추가!
		System.out.println(name);

//		System.out.println(scores[0]);

	}

}
