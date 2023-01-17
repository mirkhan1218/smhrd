package 상속2;

public class main2 {

	public static void main(String[] args) {
		
		야생동물[] 동물원 = {new 사자(), new 독수리(), new 늑대(), new 독수리(), new 늑대(), new 사자()};
		
		for(int i = 0; i < 동물원.length; i++) {
			// 만약, 사자라면
			// 모든걸사자() 호출
			if(동물원[i] instanceof 사자 ) {
				((사자)동물원[i]).모든걸사자();
			}else if(동물원[i] instanceof 독수리) {
				((독수리)동물원[i]).날기();
			}else if(동물원[i] instanceof 늑대) {
				((늑대)동물원[i]).하울링();
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		// 모든 동물의 고유 메소드를 다 호출!!
		
	}

}
