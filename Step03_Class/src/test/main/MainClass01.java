package test.main;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		String name = "kim";
		name.length();
		
		
//		Random ran = null;
//		ran = new Random();
		Random ran = new Random();
		
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt());
		
		
		File f = new File ("C:/palyground/memo.txt");
		f.createNewFile();
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println("main 메소드가 종료됩니다.");
	}
}
