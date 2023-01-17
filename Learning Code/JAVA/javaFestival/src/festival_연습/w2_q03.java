package festival_연습;

public class w2_q03 { // 걸린 시간 : 09분 32초

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");

		String[] grade = { "A", "B", "C", "D", "F" };

		int[] count = new int[grade.length];
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < grade.length; i++) {
				if(arr[j].equalsIgnoreCase(grade[i])) {
					count[i]++;
				}

			}

		}
		for(int i = 0 ; i < grade.length; i++) {
			System.out.print(grade[i] + " : ");
			System.out.println(count[i] + "명");
		}

	}

}
