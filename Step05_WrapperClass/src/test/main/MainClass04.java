package test.main;

import java.io.InputStream;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메서드가 시작됩니다.");
		
		// 콘솔창으로부터 입력받을 수 있는 Scanner 객체 생성
//		
		InputStream is = System.in;
		
		Scanner scan1 = new Scanner(is);
		Scanner scan2 = new Scanner(System.in);
		String str = scan2.nextLine();
		
		System.out.println("main 메서드가 종료됩니다."+str);
	}
}
