package test.main;

import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 *  List<String> names = new ArrayList<>();
		 *  names.add("kim");
		 *  names.add("lee");
		 *  names.add("park");
		 *  이 코드를 아래의 코드 한 줄로 대체할 수 있다.
		 */
		
		List<String> names = List.of("kim", "lee", "park"); 
		
		names.add("son");
	}
}