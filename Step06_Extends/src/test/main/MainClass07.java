package test.main;

import test.mypac.Circle;
import test.mypac.Ract;
import test.mypac.Shape;


//Shape 클래스를 상속받아서
//rect(정사각형) 클래스를 만들어보세요

/*
* 아래의 코드가 동작할 수 있도록 new Rect(x 좌표, y 좌표, 한 변의 길이)
* Rect r1 = new Rect(100, 200, 50);
* r1.printArea(); // 사각형의 넓이가 출력되면 된다.
* r1.printInfo(); // 사각형의 좌표, 한 변의 길이가 출력되면 된다.
*/

public class MainClass07 {
	public static void main(String[] args) {
//		Shape s1 = new Shape(100, 200);
//		s1.printInfo();
//		
//		Circle c1 = new Circle(10, 20, 50);
//		c1.printInfo();
		
		Ract r1 = new Ract(100, 200, 50);
		r1.printArea();
		r1.printInfo();
	}
}
