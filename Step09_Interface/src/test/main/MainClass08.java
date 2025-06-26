package test.main;

import test.myPac.Person;
import test.myPac.Programmer;
import test.myPac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		// Person 객체를 생성해서 Person type으로 받으면 모든 메서드를 다 사용할 수 있다.
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develop();
		
		System.out.println("--------------");
		
		Singer p2 = new Person();
		p2.sing();
		
		System.out.println("--------------");
		
		Programmer p3 = new Person();
		p3.develop();
	}
}
