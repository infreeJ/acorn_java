package test.frame01;

/* 
 * 새로운 스레드 만드는 방법
 * 
 * 1. Thread 클래스를 상속받은 클래스를 정의한다.
 * 2. run() 메서드를 오버라이드 한다.
 * 3. run() 메서드 안에서 새로운 스레드에서 해야할 작업을 코딩한다.
 * 4. 만든 클래스로 객체를 생성한다.
 * 5. 해당 객체의 start() 메서드를 호출하면 새로운 스레드가 시작된다.
 */

public class WorkThread extends Thread{
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
