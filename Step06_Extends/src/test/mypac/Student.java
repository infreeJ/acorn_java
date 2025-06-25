package test.mypac;

public class Student extends Person {
	public String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("전공 : " + major);
	}
	
	public void study() {
		System.out.println("공부 중..");
	}
}
