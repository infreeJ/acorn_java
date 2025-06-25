package test.mypac;

public class Teacher extends Person{
	
	public String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("과목 : " + subject);
	}
	
	public void teach() {
		System.out.println("수업 중..");
	}
}
