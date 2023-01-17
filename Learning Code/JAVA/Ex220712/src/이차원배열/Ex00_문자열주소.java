package 이차원배열;

public class Ex00_문자열주소 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// for-each문
		for(int num : array) {
			System.out.print(num + " ");
		}
		
	}

}
