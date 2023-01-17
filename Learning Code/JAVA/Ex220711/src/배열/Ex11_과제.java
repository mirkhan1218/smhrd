package 배열;

import java.util.Random;

public class Ex11_과제 {

	public static void main(String[] args) {
		// 랜덤 함수 불러오기
		Random rd = new Random();
		// 추출한 숫자를 저장하는 "arr"배열 생성
		int[] arr = new int[5];
		
		// 시작 문구 출력
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!");
		
		// 숫자 추출 - 중복값 제거
		for (int j = 0; j < arr.length; j++) {
			arr[j] = rd.nextInt(10) + 1;
			
			// 중복값 확인
			// 중복값이 있으면 다시 생성
			// 중복값이 없으면 다음 진행
			if (j > 0) {
				int i = 0;
				while (i < j)
					if (arr[j] == arr[i]) {
						arr[j] = rd.nextInt(10) + 1;
						i = 0;
					} else {
						i++;
					}

			}
			// 결과 출력
			System.out.print(arr[j] + " ");
		}

	}

}
