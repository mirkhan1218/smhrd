package model;

public class Student {

	// 학생정보를 담아놓고 관리
	// 필드
	private String stdnum;
	private String name;
	private int age;
	private String tel;
	private String email;

	// 생성자, getter / setter
	public Student(String stdnum, String name, int age, String tel, String email) {
		// super();
		this.stdnum = stdnum;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}

	public String getStdnum() {
		return stdnum;
	}

	public void setStdnum(String stdnum) {
		this.stdnum = stdnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String select(Student s1) {
		// TODO Auto-generated method stub
		return null;
	}

}
