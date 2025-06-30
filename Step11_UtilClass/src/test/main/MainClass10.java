package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> set1 = Set.of("A", "B", "C", "D");
		Set<String> set2 = Set.of("C", "D", "E", "F");
		
		// 중복된 데이터가 있는 List 객체
		List<String> names = List.of("kim", "lee", "lee", "park");
		
		// List는 Collection type이기도 하다.(Collection은 List의 상위 인터페이스)
		Collection<String> collec = names;
		
		// List 객체를 Set에 전달하여 중복 제거
		Set<String> namesSet = new HashSet<>(names);
		
		// ArrayList 객체의 생성자에 Set을 전달해서 ArrayList 객체 생성(인덱스로 관리 가능)
		List<String> names2 = new ArrayList<>(namesSet);
	}
}
