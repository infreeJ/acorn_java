package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList();
		
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String item) {
				System.out.println(item);
			}
		};
		greets.forEach(con);
		
		
		greets.forEach(item -> {
			System.out.println(item);
		});
		
		greets.forEach(item -> System.out.println(item));
	}
}