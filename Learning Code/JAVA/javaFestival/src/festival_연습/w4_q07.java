package festival_연습;

public class w4_q07 {

	public static void main(String[] args) {

		String str = "00101000";
		int[] arr = new int[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}

		int mul = 0;
		int binary = 1;
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			mul = arr[arr.length - 1 - i] * binary;
			binary *= 2;
			ans += mul;
		}
		System.out.printf("%s(2) = %d(10)", str, ans);

	}

}
