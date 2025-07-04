package test.main;

import test.myPac.Calculator;

public class MainClass_calculator {
	public static void main(String[] args) {
		
		Calculator add = (int a, int b) -> {
			System.out.println(a+b);
			return a+b;
		};
		add.calculate(1, 2);
		
		Calculator subtract = (a, b) -> {
			System.out.println(a-b);
			return a-b;
		};
		subtract.calculate(5, 3);
		
		Calculator multiply = (a, b) -> {
			System.out.println(a*b);
			return a*b;
		};
		multiply.calculate(2, 4);
		
		useCalculator((a, b) -> {
			System.out.println(a+b);
			return a+b;
		});
	}
	
	public static void useCalculator(Calculator c) {
		c.calculate(5, 10);
	}
}
