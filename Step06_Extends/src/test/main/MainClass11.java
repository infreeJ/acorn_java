package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
		// Item 객체 생성
		Item item1 = new Item();
		item1.setName("냄비");
		item1.setPrice(2000);
		item1.setMadeBy("차이나");
		
		System.out.println(item1.getName());
		System.out.println(item1.getPrice());
		System.out.println(item1.getMadeBy());
		
		System.out.println("------------------");
		
		Item item2 = new Item();
		item2.setItem("마우스", 40000, "프랑스");
		
		System.out.println(item2.getName());
		System.out.println(item2.getPrice());
		System.out.println(item2.getMadeBy());
	}
}
