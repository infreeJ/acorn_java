package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		Department d1 = new Department("영업부", "대전");
		
		/*
		 *  위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서
		 *  그 참조값 3개를 배열에 순서대로 담아보세요.
		 */
		
		Employee emp1 = new Employee("kim", 1200, d1);
		Employee emp2 = new Employee("lee", 1500, d1);
		Employee emp3 = new Employee("park", 1700, d1);
		
		Employee[] empArray = {emp1, emp2, emp3};
		
		
		// for문을 이용해서 Employee[]에 담긴 Employee 객체의 .printInfo() 메서드를 순서대로 호출하기
		for(int i = 0; i < empArray.length; i++) {
			empArray[i].printInfo();
		}
		
		System.out.println("-----------------");
		
		for(Employee tmp : empArray) {
			tmp.printInfo();
		}
	}
}
