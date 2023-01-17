
public class Ex01_배열 {

	public static void main(String[] args) {

		// 변수 선언
		int a;

		// 변수 생성(초기화=최초의 할당)
		a = 10; // int a = 10;

		// 배열 선언 및 생성
		// 데이터타입[] 배열이름 = new 데이터타입[배열 크기];
		// int[] array = new int[10];

		// 기본데이터타입
		// boolean, int, short, long...

		// 레퍼런스타입(new) : Scanner, Random, String, 배열, 클래스...
		String name = new String("이주희");

		int[] array;

		array = new int[5];

		System.out.println(a);
		System.out.println(array);

		// 배열의 인덱스에 접근
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		// 인덱스 데이터 수정
		array[0] = 5;
		array[1] = 45;
		array[2] = 6;
		array[3] = 7;
		array[4] = 23;

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// 배열의 크기(length)
		System.out.println("배열의 크기 : " + array.length);

		// 배열을 생성하는 방법 2가지
		// 1. new라는 키워드 사용해서 생성
		// new 데이터타입[배열크기];

		// 2. 배열의 데이터 값을 명확하게 알고있을 때
		int[] array2 = { 1, 2, 3, 4, 5, 6 };

		System.out.println(array2.length);

	}
}
