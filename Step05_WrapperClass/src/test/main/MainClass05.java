package test.main;

import java.util.Scanner;

/*
 * 1. 콘솔창으로부터 입력받을 수 있는 Scanner 객체를 생성해서 그 참조값을 scan이라는 지역변수에 담아보세요
 * 2. scan에 담겨있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받으세요
 * 3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요
 * 4. 두 수의 합을 구해서 콘솔창에 이쁘게 출력해보세요
 */

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 : ");
		int result1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("두 번째 숫자 입력 : ");
		int result2 = Integer.parseInt(scan.nextLine());
		
		int sum = result1 + result2;
		
//		System.out.println("결과 : " + sum);
		String info = String.format(" %f과의 %f합은 %f" , result1, result2, sum);
		System.out.println(info);
	}
}
