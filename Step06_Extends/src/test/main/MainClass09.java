package test.main;

import test.company.Department;
import test.company.Employee;
import test.company.Manager;

/*
 *  사원이름 : KING
 *  급여 : 5000
 *  부서명 : 기획부
 *  부서의 위치 : 서울
 * 
 *  위의 정보를 가지는 Manager 객체를 생성해서
 *  그 참조값을 m1이라는 변수에 담고
 *  m1.setPosition() 메서드를 활용해서
 *  직위 : 이사 정보를 Manager 객체에 넣어보세요 
 */

public class MainClass09 {
	public static void main(String[] args) {
		
		Department dept3 = new Department("기획부", "서울");
		Manager m1 = new Manager("KING", 5000, dept3);
		
		m1.setPosition("이사");
		m1.printInfo();
		
		Employee m2 = new Manager("KING2", 5000, dept3);
		m2.printInfo();
		Manager m3 = (Manager)m2;
		m3.setPosition("이사");
	}
}
