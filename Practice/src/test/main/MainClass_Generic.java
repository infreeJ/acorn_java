package test.main;

import test.myPac.Triple;

public class MainClass_Generic {
	public static void main(String[] args) {
		
		Triple<String, Integer, Boolean> t1 = new Triple<>();
		
		t1.setFirst("Hello");
		t1.setSecond(100);
		t1.setThird(true);
		
		System.out.println(t1.getFirst());
		System.out.println(t1.getSecond());
		System.out.println(t1.getThird());
		
	}
}
