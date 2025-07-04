package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass_Set {
	public static void main(String[] args) {
		List<String> animals = List.of("dog", "cat", "dog", "bird", "cat", "lion");
		
		Set<String> setAnimals = new HashSet<>(animals);
		
		setAnimals.forEach((item) -> {
			System.out.println(item);
		});
		
		
		System.out.println("----------");
		System.out.println("----------");
		
		
		
		Set<Integer> ranNum = new HashSet<>();
		Random ran = new Random();
		
		while (ranNum.size() <= 10) {
			ranNum.add(ran.nextInt(100) + 1);
		}
		
		
		List<Integer> numList = new ArrayList<Integer>(ranNum);
		
		Collections.sort(numList);
		
		numList.forEach((item) -> {
			System.out.println(item);
		});
		

		System.out.println("----------");
		System.out.println("----------");
		
		
		Set<String> set = new HashSet<>();
		set.add("javascript");
		set.add("sql");
		set.add("java");
		set.add("node.js");
		set.add("react");
		set.add("html");
		set.add("css");
		
		
		List<String> setList = new ArrayList<>(set);
		
		Collections.reverse(setList);
		
		Iterator<String> it = setList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}























