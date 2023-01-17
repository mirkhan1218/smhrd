package 상속Game;

public class Main {

	public static void main(String[] args) {
		
		// 닌텐도 기계하나 만들기
		Machine machine = new Machine();
		
		// 칩을 하나 만들어서 닌텐도에 넣어주자
		// Game game = new Game();
		// machine.start(game);
		
		// 마리오 칩을 하나 만들자
		MarioGame mg = new MarioGame();
		machine.start(mg);
		
		// 동물의 숲 칩을 하나 만들자
		DongGame dg = new DongGame();
		machine.start(dg);
		
		// 단, Main에는 손대지 않기!!!!
		
		// MarioGame mario = (MarioGame) new Game();
		// Exception(예외상황)
		// : 실행을 시켜야 확인을 할 수 있는 오류
		// : 몇 번째 라인에 오류가 났는지 알 수는 있다.
		// Syntax Error(문법오류)
		// : 문법적인 오류 ---> 빨간줄이 깜빡거립니다.
		
		// 포켓몬게임 칩 만들기
		PokeGame pg = new PokeGame();
		machine.start(pg);
	}

}
