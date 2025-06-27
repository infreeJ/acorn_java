package test.main;

import test.fruit.Apple;
import test.myPac.Pair;

public class MainClass03 {
	public static void main(String[] args) {
		Pair<String, Object> p1 = null;
		Pair<Integer, String> p2 = null;
		
		
		Pair<String, Apple> p3 = new Pair<>("Hello", new Apple());
		String a = p3.getKey();
		Apple b = p3.getValue();
	}
}