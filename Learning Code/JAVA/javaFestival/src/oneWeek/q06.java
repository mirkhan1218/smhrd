package oneWeek;

public class q06 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 77; i++) {
			sum += ((78 - i) * i);
		}
		System.out.print(sum);
	}

}
