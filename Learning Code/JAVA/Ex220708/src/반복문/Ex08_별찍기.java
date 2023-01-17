package 반복문;

public class Ex08_별찍기 {

	public static void main(String[] args) {
		
		// *****
		// ****
		// ***
		// **
		// *
		
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
