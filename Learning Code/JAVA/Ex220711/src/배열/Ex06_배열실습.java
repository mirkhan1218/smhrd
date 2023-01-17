package 배열;

public class Ex06_배열실습 {

	public static void main(String[] args) {

		// 5명의 java점수
		int[] array = { 23, 75, 67, 58, 49 };

		int sum = 0; // 점수의 총합을 저장하는 변수
		double avg = 0; // 평균을 저장하는 변수

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = (double)sum / array.length;

		// 예상 출력 결과
		System.out.printf("점수의 총합은 : %d 점%n", sum);
		System.out.printf("평균 점수 : %f 점", avg);

	}

}
