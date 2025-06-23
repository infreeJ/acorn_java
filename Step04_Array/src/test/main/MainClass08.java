package test.main;

import java.util.Random;

import test.mypac.Seven;

public class MainClass08 {
	
	public static void main(String[] args) {
		Seven sev = new Seven();
		
		String a = sev.gameA();
		String b = sev.gameB();
		String c = sev.gameC();
		
		if (a == b && a == c) {
			System.out.println("성공!");
		}
	}
}