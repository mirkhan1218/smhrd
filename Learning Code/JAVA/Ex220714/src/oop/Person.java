package oop;

// 사람을 만들기 위한 설계도
// 멤버(member)
// 1) 멤버 변수 : 속성(field), 특성, 특징
// 2) 멤버 함수 : 메소드(method), 기능, 행위, 동작
public class Person {
	// Class바로 밑에서 만들어져서
	// 모든곳에서 쓸 수 있음!! : 번역 변수(global variable)
	String name;
	int age;
	String gender;
	
	// 기본 생성자 : 만약, 생성자가 하나도 없을 ㅅ
	// compile할 때, 자동으로 만들어진다
//	public Person() {
//		
//	}
	
	// 생성자 메소드(Constructor)(메소드 형식을 따른다)
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 생각하다
	// 숨쉰다
	// 말한다
	
	public void think() {
		System.out.println("생각 생각 생각중");
	}
	public void breathe() {
		System.out.println("습하 습하");
	}
	public void talk() {
		System.out.println("안녕 세계");
	}
	public void showInfo() {
		System.out.printf("이름 : %s%n나이 : %d세%n성별 : %s%n", name, age, gender);
	}
}
