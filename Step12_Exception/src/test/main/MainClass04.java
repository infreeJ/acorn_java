package test.main;

/*
 *  run 버튼을 누르면 Java Virtual Machine이 main() 메서드를 호출하면서 main thread가 시작된다
 *  따라서 여기서 발생하는 예외를 우리가 처리하지 않으면 JVM이 대신 처리해준다.
 */

public class MainClass04 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("main 메서드가 시작됩니다.");
		
		/*
		 *  Exception을 try~catch로 묶지 않으면 예외처리의 주체는 메서드를 호출한 곳에서 처리한다.
		 */
		Thread.sleep(5000);
		
		System.out.println("main 메서드가 종료됩니다.");
	}
}
