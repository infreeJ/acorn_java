package test.main;

import test.myPac.Operator;

public class MainClass07 {
	public static void main(String[] args) {
		
		Operator plus = (num1, num2) -> {
			return num1+num2;
		};
		
		Operator minus = (num1, num2) -> {
			return num1-num2;
		};
		
		// 메서드에서 실행할 코드는 없고 값만 리턴한다면?
		// 메서드의 {} 중괄호를 생략하고 return 예약어 없이 리턴할 값만 -> 우측에 작성해도 된다.
		Operator multiply = (num1, num2) -> num1*num2;
		
		
		
		System.out.println(plus.execute(10, 10));
		System.out.println(minus.execute(10, 10));
		System.out.println(multiply.execute(10, 10));
	}
}
