package 배열;

public class Ex03_배열실습 {

	public static void main(String[] args) {

		// 1. 100칸짜리 정수형 배열 array를 생성!!
		int[] array = new int[100];
		// 2. 1번째 data 공간(array[0])에는 1대입
		// 2번쨰 data 공간(array[1]}에는 2대입
		// ...
		// 99번쨰 data 공간(array[98]}에는 99대입
		// 100번쨰 data 공간(array[99]}에는 100대입
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;

			// 3. array[0] ~ array[99]까지 한 칸 띄어서 가로로 출력
			System.out.printf("%d ", array[i]);
		}

	}

}
