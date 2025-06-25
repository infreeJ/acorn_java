package test.main;

import test.mypac.Person;
import test.mypac.Student;
import test.mypac.Teacher;

public class Practice01 {
	public static void main(String[] args) {
		Person p1 = new Person("kim", 25);
		p1.introduce();
			
		System.out.println("-----------------");
		
		Student s1 = new Student("lee", 22, "Overwatch");
		s1.introduce();
		s1.study();
		
		System.out.println("-----------------");
		
		Teacher t1 = new Teacher("park", 43, "lol");
		t1.introduce();
		t1.teach();
	}
}
