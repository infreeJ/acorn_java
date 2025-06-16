package test.name;

public class MainClass06 {
	public static void main(String[] args) {
		String str = "abcd1234";
		int length = str.length();
		
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		boolean constains = str.contains("cd");

		int index = str.indexOf("d");
		System.out.println(index);
		
		
	}
}
