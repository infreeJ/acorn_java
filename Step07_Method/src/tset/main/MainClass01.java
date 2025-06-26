package tset.main;

public class MainClass01 {
	
	// static 영역에 만들어지는 main() 메서드
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		
		test();
		
		System.out.println("main 메서드 종료");
	}
	
	public static void test() {
		System.out.println("test() 메서드 호출");
	}
}