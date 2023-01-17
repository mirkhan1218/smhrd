package oop;

public class PersonMain {

	public static void main(String[] args) {
		
		// Person 설계도(Class)를 만듦!!
		
		Person p1 = new Person("배미리칸", 36, "남");
//		p1.think();
//		p1.breathe();
//		p1.talk();
		p1.showInfo();
		
		Person p2 = new Person("임보미", 35, "여");
//		p2.name = "임보미";
//		p2.age = 35;
//		p2.gender = "여";
		p2.showInfo();
	}

}
