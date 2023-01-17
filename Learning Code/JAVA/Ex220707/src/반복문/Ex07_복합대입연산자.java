package 반복문;

public class Ex07_복합대입연산자 {

	public static void main(String[] args) {

		// +=, -+, *=, ..., /=
		int a = 1;
		a += 1; // a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		a += a;
		System.out.println(a);
		a -= a;
		System.out.println(a);

		String name = "배";
		for (int i = 1; i <= 3; i++) {
			name += "배";
		}
		System.out.println(name);
	}

}
