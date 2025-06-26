package tset.main;

public class MainClass03 {
	public static void main(String[] args) {
		printSum(5, 10);
		printSum(250, 130);
		printSum(26, 62);
	}
	
	public static void printSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + " = " + result);
	}
}
