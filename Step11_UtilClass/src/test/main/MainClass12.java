package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass12 {
	public static void main(String[] args) {
		
		// 1. 로또 번호를 담을 HashSet 객체를 생성해서 참조값을 Set type set1 이라는 지역 변수에 담아보세요
		Set<Integer> set1 = new HashSet<>();
		
		// 2. Random 객체를 생성해서 참조값을 ran이라는 지역 변수에 담아보세요
		Random ran = new Random();
		
		
		/*
		 *  3. While 문을 이용해서 랜덤한 로또 번호를 set1에 반복적으로 담아보세요
		 *  무한 루프로 만들고, 탈출 조건은 set1.size()가 6이 되면 탈출
		 *  ran.nextInt(45) + 1은 1~45 사이에 랜덤한 정수를 얻어낼 수 있다.
		 *  로또 번호는 총 6개
		 */ 
		while(true) {
			set1.add(ran.nextInt(45) + 1);
			if (set1.size() <= 6) {
				break;
			}
		}
		
		
		// 4. set1에 담긴 번호를 모두 하나씩 콘솔창에 출력
		set1.forEach((item) -> {
			System.out.println(item);
		});
		
		
		// 5. AI에 물어봐서 set1에 담긴 내용을 List에 담은 다음 오름차순 정렬해보세요
		List<Integer> setList = new ArrayList<>(set1);
		
		Collections.sort(setList);
		
		
		// 6. 오름차순 정렬된 번호를 하나씩 순서대로 콘솔창에 출력해 보세요
		System.out.println("----------------");
		System.out.println(setList);
		
	}
}













