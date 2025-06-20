package test.main;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "포르쉐";
//		c1.price = 20000;
		c1.drive();
		
		Car c2 = new Car();
		c2.name = "레이";
//		c2.price = 1800;
		c2.drive();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
