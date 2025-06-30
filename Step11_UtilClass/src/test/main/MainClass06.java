package test.main;

import test.myPac.MyFunction;

public class MainClass06 {
	public static void main(String[] args) {
		MyFunction f1 = () -> {System.out.println("hi");};
		
		
		f1.execute();
		f1.log();
		MyFunction.help();
	}
}
