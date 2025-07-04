package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 10; i < 60; i += 10) {
			numbers.add(i);
		}
		
		numbers.remove(2);
		
		
		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer item) {
				System.out.println(item);
			}
		};
		numbers.forEach(con);
		
		// 축약형
		numbers.forEach((Integer item) -> {
			System.out.println(item);
		});
	}
}
