package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		ArrayList<String> a1 = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			a1.add(scan.nextLine());
		}
		
		for(String tmp : a1) {
			System.out.println(tmp);
		}
	}
}