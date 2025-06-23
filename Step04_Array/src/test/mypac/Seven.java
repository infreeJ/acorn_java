package test.mypac;

import java.util.Random;

public class Seven {
	String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
	
	Random ran = new Random();
	int ranNum = ran.nextInt(5);

	private String a, b, c;
	
	public String gameA() {
		a = data[ran.nextInt(5)];
		System.out.println(a);
		return this.a;
	}
	
	public String gameB() {
		b = data[ran.nextInt(5)];
		System.out.println(b);
		return this.b;
	}
	
	public String gameC() {
		c = data[ran.nextInt(5)];
		System.out.println(c);
		return this.c;
	}
}
