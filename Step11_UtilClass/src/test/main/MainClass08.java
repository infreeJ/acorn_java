package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  HashMap<key type, value type>
		 *  
		 *  key type은 일반적으로 String type을 가장 많이 사용한다.
		 *  value type은 담고 싶은 데이터의 type을 고려해서 지정하면 된다.
		 *  value type을 Object로 지정하면 어떤 data type이던지 다 담을 수 있다.
		 *  순서가 없는 데이터를 다룰 때 사용하면 된다.
		 *  dto 클래스 대신에 사용하기도 한다.
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		
		int num = (int)map.get("num");
		String name = (String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		
		Map<String, Object> map2 = Map.of(
			"num", 2,
			"name", "해골",
			"isMan", false
		);
	}
}
