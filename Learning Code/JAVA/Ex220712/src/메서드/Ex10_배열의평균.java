package 메서드;

public class Ex10_배열의평균 {

	public static void main(String[] args) {
		
		int[] array = {15, 10, 2, 8, 23};
		float result = average(array);
		System.out.println("평균 값은 : " + result);
		
		
		System.out.println("평균 값은 : " + average(new int[] {3, 6, 9}));
	}

	public static float average(int[] array) {
		float result = 0;
		
		for(int i = 0; i < array.length; i++) {
			result += array[i];
		}
		result /= array.length;
		
		return result;
	}

}
