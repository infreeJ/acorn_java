package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어지는 수 입력");
		String inputNum2 = scan.nextLine();
		
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result = num2 / num1;
			int result2 = num2 % num1;
			System.out.println(num2 + "를 " + num1 + "으로 나는 몫 : " +result);
			System.out.println(num2 + "를 " + num1 + "으로 나는 나머지 : " +result2);
		} catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("숫자 형식으로 입력하세요");
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("main 메서드 종료");
	}
}
