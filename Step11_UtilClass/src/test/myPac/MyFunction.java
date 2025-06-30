package test.myPac;

/*
 *  인터페이스에서 메서드의 접근 지정자를 생략하면 기본은 public
 */

@FunctionalInterface
public interface MyFunction {
	
	// 추상 메서드
	public void execute();
	
	// Java 9 부터 추가된 문법 default 메서드 (참조값에 . 찍어서 호출)
	public default void log() {
		System.out.println("실행 로그 출력");
	}
	// Java 9 부터 추가된 문법 static 메서드 (인터페이스명에 . 찍어서 호출)
	public static void help() {
		System.out.println("도움말");
	}
}