
package test.main;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		Car c1 = MyUtil.car; // c1은 null
		MyUtil.car = new Car(); // Car 객체를 생성해서 MyUtil의 car 필드에 넣기
		Car c2 = MyUtil.car; // c2는 위에서 생성한 Car 객체의 참조값이 들어있다.
		
		MyUtil.car.drive(); // MyUtil의 car 필드를 참조해서 Car 클래스의 메서드 호출
		
		System s = null;
	}
}
