package 이차원배열;

public class Ex01_이차원배열 {

	public static void main(String[] args) {

		String[] team1 = { "김은총", "김경철", "김다운", "선경주", "신현범" };
		String[] team2 = { "노건희", "지연우", "김대웅", "정연승", "김태오" };
		String[] team3 = { "양진이", "김호전", "정한빛", "배미리칸", "오준기" };
		String[] team4 = { "김현성", "공주희", "박근성", "장해라", "주영관" };
		String[] team5 = { "김소정", "정용우", "문지훈", "박종규", "박진영" };

		// 2차원 배열
		// 배열 : 같은 data type을 효율적으로 다루는 자료 구조
		String[][] names = new String[5][5];

		names[0] = team1;
		names[1] = team2;
		names[2] = team3;
		names[3] = team4;
		names[4] = team5;

		for (int j = 0; j < names.length; j++) {
			for (int i = 0; i < names[j].length; i++) {
				System.out.print(names[j][i] + " ");
			}
			System.out.println();
		}

	}

}
