package test.mypac;


public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("이름 : " + name + "  나이 : " + age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
