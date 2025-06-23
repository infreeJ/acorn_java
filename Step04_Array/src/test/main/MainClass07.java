package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(5, 190);
		System.out.println(a);
	}
}
