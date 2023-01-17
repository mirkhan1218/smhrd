package twoWeek;

public class q03 {

	public static void main(String[] args) {
		// 입력부
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		// 입력된 score를 ","로 나누고 String 타입 arrScore배열로 저장
		String[] arrScore = score.split(",");
		
		// arrGrade -> String 타입, 크기 5 배열 생성
		// "arrCount" -> int 타입. 크기 5 배열 생성 
		String[] arrGrade = {"A", "B", "C", "D", "F"};
		int[] arrCount = new int[arrGrade.length];
		
		// score[i]와 arrGrade[i]를 비교해서 같으면 arrCount[i]에 1씩 누적 
		for (int i = 0; i < arrScore.length; i++) {
			if (arrScore[i].equals(arrGrade[0])) { // score[i] 와 "A" 비교
				arrCount[0]++;
			} else if (arrScore[i].equals(arrGrade[1])) { // score[i] 와 "B" 비교
				arrCount[1]++;
			}else if (arrScore[i].equals(arrGrade[2])) { // score[i] 와 "C" 비교
				arrCount[2]++;
			}else if (arrScore[i].equals(arrGrade[3])) { // score[i] 와 "D" 비교
				arrCount[3]++;
			}else if (arrScore[i].equals(arrGrade[4])) { // score[i] 와 "F" 비교
				arrCount[4]++;
			}

		}
		// 출력부
		for (int i = 0; i < arrCount.length; i++) {
			System.out.printf("%s : %d명%n", arrGrade[i], arrCount[i]);
		}

	}

}
