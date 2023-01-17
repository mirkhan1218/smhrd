package twoWeek;

public class q02 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String word) {

		// 입력받은 String 데이터형을 char 데이터형 배열로 변환
		char[] arr = word.toCharArray();
		// char[]의 길이를 나눠 짝수인지 홀수 인지 판단
		int i = arr.length / 2;

		// 입력받은 단어가 홀수이면 가운데 글자 String 데이터형으로 리턴
		if (arr.length % 2 == 1) {
			return String.valueOf(arr[i]);
			// 입력받은 단어가 짝수이면 가운데 두글자 String 데이터형으로 리턴
		} else {
			return String.valueOf(arr[i - 1]) + String.valueOf(arr[i]);
		}

	}

}
