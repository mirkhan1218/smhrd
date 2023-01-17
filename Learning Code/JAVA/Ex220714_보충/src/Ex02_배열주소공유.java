
public class Ex02_배열주소공유 {

	public static void main(String[] args) {

		// 배열 -> 레퍼런스 변수 -> 주소값을 담는다
		// 주소를 공유 -> 공간을 공유 -> 같은 배열을 공유

		int[] intArray = new int[5];
		int[] myArray = intArray;

		intArray[1] = 2;

		System.out.println(intArray[1]);
		System.out.println(myArray[1]);

		myArray[1] = 8;
		System.out.println(intArray[1]);
		System.out.println(myArray[1]);
	}

}
