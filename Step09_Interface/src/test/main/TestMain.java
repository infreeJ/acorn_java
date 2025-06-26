package test.main; // 클래스가 속해있는 패키지 명시

// 클래스 안에서 사용하는 다른 클래스나 인터페이스 import

public class TestMain { // 클래스의 범위를 나타내는 중괄호
	public int age = 22;
	public static String name = "kim";
	
	public TestMain() {
		System.out.println("TestMain 객체 생성");
	}
	
	public void test() {
		System.out.println("test 메서드 호출");
	}
	
	public static int i = 5;
	public static void a() {
		System.out.println("static 메서드 호출");
	}
	public static void main(String[] args) {
		System.out.println(TestMain.i);
		TestMain.a();
	}
}
