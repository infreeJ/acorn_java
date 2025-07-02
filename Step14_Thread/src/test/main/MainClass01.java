package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		test();
		
		System.out.println("main 메서드 종료");
		
	}
	
	public static void test() {
		System.out.println("test 메서드 호출");
	}
}
