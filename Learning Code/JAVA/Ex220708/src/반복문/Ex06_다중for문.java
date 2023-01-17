package 반복문;

public class Ex06_다중for문 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.print("\t" + i + "단\t");
		}System.out.println();
		
		for (int j = 1; j <= 9; j++) {
//			System.out.print(j + "단 ");
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " * " + j + " = " + (j * i) + "\t");
			} System.out.println();
		}
		
	}

}
