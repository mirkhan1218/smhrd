package 상속;

public class 스마트폰 extends 전화 {
	// Method Overriding
	// 자식(=sub) 클래스에서 부모(=super) 클래스의 method를 재정의
	
	@Override
	public void 전화받기() {
		System.out.println("스팸전화라면 안받기");
		System.out.println("엄마 전화는 받기");
	}
	
	public void 음악재생() {
		System.out.println("Girls");
	}
	
	public void 넷플릭스보기() {
		System.out.println("우영우");
	}
	
}
