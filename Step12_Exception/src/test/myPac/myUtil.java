package test.myPac;

import java.util.Random;

public class myUtil {
	
	public static void generate() {
		Random ran = new Random();
		int ranNum = ran.nextInt(10);
		
		// 만약 우연히 7이라는 숫자가 나오면
		if(ranNum == 7) {
			throw new WowException("wow! 행운의 7번");
		}
		System.out.println(ranNum+ " 숫자가 나왔습니다.");
	}
	
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	
	// 5초가 걸리는 가상의 전송을 하는 메서드
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송을 해요");
		Thread.sleep(5000);
		System.out.println("전송 완료!");
	}
}
