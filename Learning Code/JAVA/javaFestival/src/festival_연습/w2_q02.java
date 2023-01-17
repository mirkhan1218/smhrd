package festival_연습;

public class w2_q02 { // 걸린 시간 : 14분 05초

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("power"));

	}

	public static String getMiddle(String str) {
		
		String result = null;

		if (str.length() % 2 == 1) {
			result = str.substring(str.length() / 2, str.length() / 2 + 1);

		} else {
			result = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
		}
		return result;
	}

}
