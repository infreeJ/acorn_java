package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;


/*
 *  Java에서 객체는 여러 개의 type을 가질 수 있다.
 *  지역변수나 필드 앞에 선언하는 data type은(참조데이터 type)
 *  그 안에 들어있는 참조값의 사용 설명서라고 생각하면 된다.
 *  그렇기 때문에 그 지역변수나 필드에 .을 찍으면 사용 설명서에 명시된 기능만 사용할 수 있다.
 *  java의 모든 객체는 다형성을 가질 수 있다.
 *  다형성은 type이 여러개라는 의미이다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		Phone p2 = new HandPhone();
		Object p3 = new HandPhone();
	}
}
