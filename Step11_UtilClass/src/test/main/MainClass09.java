package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
 * HashSet은 Set 인터페이스를 구현한 클래스이다.
 *  - 순서가 없다.
 *  - 값이 없다.
 *  - 중복을 허용하지 않는다.
 *  어떤 data를 묶음으로 관리하고자할 때 사용한다.
 */

public class MainClass09 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역변수에 담기
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(4);
		set1.add(5);
		
		set1.forEach((item) -> {
			System.out.println(item);
		});
		
		System.out.println("----------------");
		
		Set<String> set2 = new HashSet<>();
		set2.add("hi");
		set2.add("hello");
		set2.add("good");
		set2.add("good");
		
		set2.forEach((item) -> {
			System.out.println(item);
		});
		

		System.out.println("----------------");
		
		// Iterator
		Iterator<String> it = set2.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
