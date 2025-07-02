package test.frame02;


/*
 * Thread 만드는 방법 2
 * 
 * 1. Runnable 인터페이스를 구현한 클래스를 정의한다
 * 2. run() 메서드를 강제 오버라이드한다.
 * 3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 * 4. Thread 클래스로 만든 객체의 start() 메서드를 호출하여 스레드를 시작시킨다.
 * 
 */

public class WorkRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("10초 걸리는 작업 시작");
		try {
			Thread.sleep(1000*10);
		} catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업 종료");
	}
}
